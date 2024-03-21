package teoria.ejemplosLambda;

import teoria.ejemplosLambda.HolaMundo;

public class Main {
    public static void main(String[] args) {
        System.out.println("EJEMPLO1: ES IMPAR?");
        ValidarImpar ejemplo1 = n -> n % 2 != 0;
        boolean resultado1 = ejemplo1.esImpar(21);
        System.out.println(resultado1);

        System.out.println("\nEJEMPLO2: ES UNA Y?");
        Validay ejemplo2 = c -> c == 'y';
        boolean resultado2 = ejemplo2.esy('y');
        System.out.println(resultado2);

        System.out.println("\nEJEMPLO3: SUMA");
        Suma ejemplo3 = (a, b) -> a + b;
        double resultado3 = ejemplo3.sumar(6,4);
        System.out.println(resultado3);

        System.out.println("\nEJEMPLO4: SUMA CUADRADO");
        SumaCuadrados ejemplo4 = (a, b) -> a * a + b * b;
        double resultado4 = ejemplo4.sumarCuadrados(5,2);
        System.out.println(resultado4);

        System.out.println("\nEJEMPLO5: DEVUELVE 42");
        Devuelve42 ejemplo5 = () -> 42;
        int resultado5 = ejemplo5.devolver42();
        System.out.println(resultado5);

        System.out.println("\nEJEMPLO6: DEVUELVE PI");
        DevolverPI ejemplo6 = () -> Math.PI;
        double resultado6 = ejemplo6.devolverPI();
        System.out.println(resultado6);

        System.out.println("\nEJEMPLO7: IMPRIME LA CADENA");
        ImprimirCadena ejemplo7 = s -> System.out.println(s);
        ejemplo7.imprimirCadena("Lambda");

        System.out.println("\nEJEMPLO8: IMPRIME HOLA MUNDO");
        HolaMundo ejemplo8 = () -> System.out.println("Hola mundo");
        ejemplo8.imprimeHolaMundo();
    }
}
