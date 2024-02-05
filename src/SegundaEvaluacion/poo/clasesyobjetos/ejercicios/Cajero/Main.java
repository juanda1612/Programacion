package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Cajero;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n\n************ CUENTA CORRIENTE ************");
        CuentaCorriente usuario1 = new CuentaCorriente("335165", "asdasda");
        System.out.println(usuario1);
        usuario1.sacarDinero();
        usuario1.ingresarDinero();
        usuario1.sacarDinero();
        usuario1.actualizarLibreta();

        CuentaCorriente cuentaCorriente2 = new CuentaCorriente("sadasda", 50000);
        System.out.println(cuentaCorriente2);

        CuentaCorriente cuentaCorriente3 = new CuentaCorriente("55555555V","pepito", 50050);
        System.out.println(cuentaCorriente3);

        System.out.println("\n\n*********************** GESTOR ********************");
        Gestor gestor1 = new Gestor("curro", "sadasda");
        System.out.println(gestor1);

        // añadimos este gestor a la cuenta corriente1

        System.out.println("\n\nAñadimos este gestor a la primera cuenta corriente y mostramos los datos de la segunda cuenta");
        usuario1.setGestor(gestor1);
        System.out.println(usuario1);
        System.out.println(cuentaCorriente2);

        usuario1.setNombreBanco("Santander");
        System.out.println(usuario1);


        // comprobamos modificadores de acceso de los atributos de CuentaCorriente
        System.out.println(usuario1.dni); // porque estoy en el mismo paquete
        //System.out.println(usuario1.saldo); -> no, es privado
        System.out.println(usuario1.nombreTitular); // es publico
    }
}
