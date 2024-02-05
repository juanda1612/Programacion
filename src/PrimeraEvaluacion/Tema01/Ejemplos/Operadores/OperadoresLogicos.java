package PrimeraEvaluacion.Tema01.Ejemplos.Operadores;

import java.util.Scanner;

/**
 * @see 'https://drive.google.com/file/d/1s_CGmUs3c-rO7o681OArhINztA_VZnze/view
 */

public class OperadoresLogicos {
    public static void main(String[] args) {
        //LOS OPERADORES LOGICOS TRABAJAN CON Y DAN COMO RESULTADO VARIABLES bolean
        // El operador not (!) invierte el valor de la variable Aplicacion.md la que afecta
        System.out.println("**** not ****");
        boolean variable = true;
        System.out.println(variable); // True
        variable = !variable;
        System.out.println(variable); // False

        System.out.println("\n\n**** and y or ****");
        // los operadores binarios and, or y not
        boolean v1 = true;
        boolean v2 = true;
        boolean resultadoAnd = v1 && v2;
        boolean reltadoOr = v1 || v2;
        System.out.println("true\ttrue"); // \t mete una tabulacion en el String o cadena de caracteres
        System.out.println(resultadoAnd); // true
        System.out.println(reltadoOr); // true
        v2 = false;
        System.out.println("\ntrue\tfalse");
        resultadoAnd = v1 && v2;
        reltadoOr = v1 || v2;
        System.out.println(resultadoAnd); // false
        System.out.println(reltadoOr); // true
        v1 = false;
        v2 = true;
        System.out.println("\nfalse\ttrue");
        resultadoAnd = v1 && v2;
        reltadoOr = v1 || v2;
        System.out.println(resultadoAnd); // false
        System.out.println(reltadoOr); // true
        v1 = false;
        v2 = false;
        System.out.println("\nfalse\tfalse");
        resultadoAnd = v1 && v2;
        reltadoOr = v1 || v2;
        System.out.println(resultadoAnd); // false
        System.out.println(reltadoOr); // false



    }
}
