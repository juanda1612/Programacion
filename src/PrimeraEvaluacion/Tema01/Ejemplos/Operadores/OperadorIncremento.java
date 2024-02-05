package PrimeraEvaluacion.Tema01.Ejemplos.Operadores;

public class OperadorIncremento {
    public static void main(String[] args) {
        //OPERADOR DE INCREMENTO
        // Sirve para añadir una unidad Aplicacion.md una variable de tipo entero
        int variable = 0;
        System.out.println(variable + " antes de incrementarla");
        variable++; // incremento la variable en una unidad con ++
        System.out.println(variable + " despues de incrementarla");
        variable++; // incremento la variable en una unidad con ++
        System.out.println(variable + " despues de incrementarla otra vez");
        // y asi sucesivamente
        // es lo mismo que hacer variable = variable + 1
        variable = variable +1;
        System.out.println( variable + " despues de sumarle 1");
        // tambien se puede poner asi: variable += 1
        variable += 1;
        System.out.println(variable + " despues de poner += 1");


    }
}
