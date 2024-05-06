package exepciones.videos.v5excepciones;


import java.util.ArrayList;

// EXCEPCIONES DE USUARIO
public class Video05 {
    public static void main(String[] args) {

        // Podemos crear nuestras propias excepciones de usuario para ello debemos hacer una clase que herede de Exception o RuntimeException. Si queremos que sea verificada heredará de la clase Exception y si no queremos que sea verificada de la clase RuntimeException
        // Añadiremos métodos y propiedades necesarias para almacenar información relativa a nuestro tipo de error. Como constructores utilizados al lanzar la excepción (throw new ...)
        // Si la excepción hereda de Exception será verificada lo que significa que  el copilador verifica que se maneje adecuadamente antes de ejecutar el código. La excepción se debe declarar en la cabecera del método con la clusula throws o capturarla usando el try catch.
        // Si es de tipo no verificada y hereda de RuntimeException el copilador no requiere que se maneje en el código por lo que en este caso no es necesario declarar la excepción en la cabecera del método ni capturarlo con el try-catch pero si no lo hacemos el programa podrá romper.
        //Se recomienda usar excepciónes verificadas

        ArrayList<Cliente> clientes = new ArrayList<>();
        clientes.add(new Cliente("Pep"));
        clientes.add(new Cliente("Tom"));
        clientes.add(new Cliente("Kal"));

        try {
            nuevoCliente("Tom", clientes); // este cliente ya existe por lo que se lanza la excepción
            nuevoCliente("Eddie", clientes); // como se lanza la excepción esto ya no se ejecuta y no añadirá este cliente a la lista
        } catch (ClienteExisteException e){
            System.out.println("Error: " + e); // esta e de aqui es el toString de la clase ClienteExisteException
        } // no se añade ningun cliente si invertimos los dos clientes Eddie si se añadiría y al llegar a Tom lanzaría la excepción. Por eso en este ejemplo vemos que sería mejor tener el try catch en el propio método porque cada cliente tendría su propio try catch y no tendríamos este problema.

        // Al ser una excepción verificada obligatoriamente te obliga a hacer el throw y el try catch

        // si imprimimos es arraylist vemos que no se ha añadido ningún cliente
        System.out.println(clientes);
    }


    public static void nuevoCliente (String nombre, ArrayList<Cliente> clientes) throws ClienteExisteException {
        for (Cliente c : clientes){
            if (c.getNombre().equals(nombre))
                throw new ClienteExisteException(c);
        }
        clientes.add(new Cliente(nombre));
        System.out.println("Cliente dado de alta correctamente");

    }
}
