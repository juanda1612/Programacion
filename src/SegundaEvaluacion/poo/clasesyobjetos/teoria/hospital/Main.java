package SegundaEvaluacion.poo.clasesyobjetos.teoria.hospital;

public class Main {
    public static void main(String[] args) {
        // probamos el primer constructor: sin parametros
        Paciente paciente1 = new Paciente();
        // como no le hemos puesto constructor a la clase, utiliza el constructor por defecto, es decir, el constructor "invisible" que crea Java si tu no le pones ninguno

        System.out.println(paciente1);
        // si quiero añadir datos, lo tengo que hacer a trabes de metodos
        paciente1.setNombre("Jota");
        paciente1.setEdad(25);
        paciente1.setSintomas(new String[]{"Tos", "Cansancio", "Fiebre"}); // creamos un array sobre la marcha, sin necesidad de meterlo en una variable
        System.out.println(paciente1);


        // probamos el segundo constructor: inicializamos el objeto con los valores para los tres parametros
        Paciente paciente2 = new Paciente("Efe", 58, new String[]{"Dolor de cabeza", "Ansiedad"});
        System.out.println(paciente2);



        // Probamos el tercer constructor: Solo sabemos el nombre
        Paciente paciente3 = new Paciente("Jota");
        System.out.println(paciente3);
    }
}
