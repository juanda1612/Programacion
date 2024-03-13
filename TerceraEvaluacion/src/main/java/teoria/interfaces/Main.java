package teoria.interfaces;

public class Main {
    public static void main(String[] args) {
        Clase clase = new Clase();
        // probamos el primer metodo abstracto
        clase.metodoAbstracto1();

        // probamos el segundo metodo abstracto
        System.out.println(clase.calcularSuma(2,2));

        clase.metodoPorDefecto(); // este lo tengo en la interfaz y la clase lo aprobecha
        // recordad que podriamos haberlo sobreescrito y modificarlo en la clase
        System.out.println("\n");

        // nos falta por probar el metodo static; este nunca se va a invocar a traves de un objeto de la clase, sino con el nombre / ruta de su ubicacion
        // en este caso: nombreDeLaInterfaz.nombreDelMetodo()
        InterfazConTodoLoQuePuedeTener.metodoEstatico();
    }
}
