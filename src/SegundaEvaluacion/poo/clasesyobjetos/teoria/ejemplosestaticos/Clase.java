package SegundaEvaluacion.poo.clasesyobjetos.teoria.ejemplosestaticos;

public class Clase {
    private String nombre;
    // esto no es una variable estatica, con lo cual, solamente la podemos modificar en cada objeto concreto
    int otraVariable;

    // añadimos una variable estatica; no la hacemos private

    static int contarObjetos;

    public Clase(String nombre) {
        this.nombre = nombre;
        // como queremos contar los objetos que vamos creando, incrementamos la variable contarObjetos
        contarObjetos++;
        otraVariable++;
    }

    @Override
    public String toString() {
        return "Clase{" +
                "nombre='" + nombre + '\'' +
                ", otraVariable=" + otraVariable +
                '}';
    }

    // metodo de instancia
    public void imprimirCosas(){
        System.out.println(toString());
    }

    public static void imprimirOtrasCosas(){
        System.out.println(contarObjetos);
    }
}
