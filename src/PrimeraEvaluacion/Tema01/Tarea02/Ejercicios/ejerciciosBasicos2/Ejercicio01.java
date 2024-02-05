package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios.ejerciciosBasicos2;
/*
Dados los siguientes identificadores, indicar si son válidos o no. Justificar las respuestas.
mi variable
num_de_cte
____programa
$alguna
3tema
cierto?
númerodeCliente
jose~
año
PI
int

 */

public class Ejercicio01 {
    public static void main(String[] args) {

       //int mi variable = 1;
        //System.out.println(mi variable);

        int num_de_cte = 1;
        System.out.println(num_de_cte); //se admite pero no cumple las convenciones de nomeclatura en java

        int ____programa = 1;
        System.out.println(____programa); //se admite pero no cumple las convenciones de nomeclatura en java

        int $alguna= 1;
        System.out.println($alguna);  //se admite pero no cumple las convenciones de nomeclatura en java

        //int 3tema= 1;
        //System.out.println(3tema);

        //int cierto? = 1;
        //System.out.println(cierto?);

        int númerodeCliente= 2;
        System.out.println(númerodeCliente); //se admite pero no cumple las convenciones de nomeclatura en java

        //int jose~ = 1;
        //System.out.println(jose~);

        int año = 1;
        System.out.println(año);

        int PI = 1;
        System.out.println(PI); //como nombre en cualquier caso compilaria; si fuera una variable tendria que ser minusculas pero al ser una constate, estas se indican en mayusculas

        //int int = 1;
        //System.out.println(int);


    }
}
