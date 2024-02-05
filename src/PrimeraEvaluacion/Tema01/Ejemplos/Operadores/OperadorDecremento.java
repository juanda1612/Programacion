package PrimeraEvaluacion.Tema01.Ejemplos.Operadores;

public class OperadorDecremento {
    public static void main(String[] args) {
        //OPERADOR DE DECREMENTO
        // Sirve para añadir una unidad Aplicacion.md una variable de tipo entero
        int variable = 0;
        System.out.println(variable + " antes de decrementarla");
        variable--; // decremento la variable en una unidad con --
        System.out.println(variable + " despues de decrementarla");
        variable--; // decremento la variable en una unidad con --
        System.out.println(variable + " despues de decrementarla otra vez");
        // y asi sucesivamente
        // es lo mismo que hacer variable = variable - 1
        variable = variable -1;
        System.out.println( variable + " despues de restarle 1");
        // tambien se puede poner asi: variable -= 1
        variable -= 1;
        System.out.println(variable + " despues de poner -= 1");


    }
}
