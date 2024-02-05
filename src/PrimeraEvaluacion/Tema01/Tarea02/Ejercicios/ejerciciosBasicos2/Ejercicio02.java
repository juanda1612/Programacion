package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios.ejerciciosBasicos2;
/*
Declara variables con el tipo de dato de menos bits posibles que puedan representar el valor. Justifica tu elección.
Si un empleado está casado o no.
Valor máximo no modificable: 999999.
Día de la semana
Día del año.
Sexo: con dos valores posibles 'H' o 'M'
Milisegundos transcurridos desde el 01/01/1970 hasta nuestros días.
Almacenar el total de una factura.
Población mundial del planeta tierra.

Usando sólo la orden println:
----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
El valor de la variable casado es true
El valor de la variable MAXIMO es 999999
El valor de la variable diasem es 1
El valor de la variable diaanual es 300
El valor de la variable miliseg es 1298332800000
El valor de la variable totalfactura es 10350.678
El valor de la variable poblacion es 6775235741
El valor de la variable sexo es M
Usando sólo la orden print:
----- EJERCICIO DE VARIABLES Y TIPOS DE DATOS -----
El valor de la variable casado es true
El valor de la variable MAXIMO es 999999
El valor de la variable diasem es 1
El valor de la variable diaanual es 300
El valor de la variable miliseg es 1298332800000
El valor de la variable totalfactura es 10350.678
El valor de la variable poblacion es 6775235741
El valor de la variable sexo es M


 */

public class Ejercicio02 {
    public static void main(String[] args) {
        System.out.println("Usando sólo la orden println");
        System.out.println();
       /*
       boolean casado = true;
        System.out.println("El valor de la variable casado es " + casado + "");
        int valor = 999999;
        System.out.println("El valor de la variable MAXIMO es "+ valor +"");
        byte dia = 1;
        System.out.println("El valor de la variable diasem es " + dia +"");
        short diaanual = 300;
        System.out.println("El valor de la variable diaanual es " + diaanual +"");
        long miliseg = 1298332800000l;
        System.out.println("El valor de la variable miliseg es " + miliseg +"");
        double totalfactura = 10350.678;
        System.out.println("El valor de la variable totalfactura es " +totalfactura +"");
        long poblacion = 6775235741l;
        System.out.println("El valor de la variable poblacion es " +poblacion +"");
        char sexo = 'H';
        System.out.println("El valor de la variable sexo es "+ sexo +"");

        */
        /*
        System.out.println();
        System.out.print("Usando sólo la orden print\n");
        boolean casado = true;
        System.out.print("El valor de la variable casado es " + casado + "\n");
        int valor = 999999;
        System.out.print("El valor de la variable MAXIMO es "+ valor +"\n");
        byte dia = 1;
        System.out.print("El valor de la variable diasem es " + dia +"\n");
        short diaanual = 300;
        System.out.print("El valor de la variable diaanual es " + diaanual +"\n");
        long miliseg = 1298332800000l;
        System.out.print("El valor de la variable miliseg es " + miliseg +"\n");
        double totalfactura = 10350.678;
        System.out.print("El valor de la variable totalfactura es " +totalfactura +"\n");
        long poblacion = 6775235741l;
        System.out.print("El valor de la variable poblacion es " +poblacion +"\n");
        char sexo = 'H';
        System.out.print("El valor de la variable sexo es "+ sexo +"\n");

         */
        boolean casado = true;
        System.out.printf("El valor de la variable casado es %s\n" , casado);
        int valor = 999999;
        System.out.printf("El valor de la variable MAXIMO es %d\n" , valor);
        byte dia = 1;
        System.out.printf("El valor de la variable diasem es %d\n" , dia);
        short diaanual = 300;
        System.out.printf("El valor de la variable diaanual es %d\n" , diaanual);
        long miliseg = 1298332800000l;
        System.out.printf("El valor de la variable miliseg es ½d\n" , miliseg);
        double totalfactura = 10350.678;
        System.out.printf("El valor de la variable totalfactura es %f\n" , totalfactura);
        long poblacion = 6775235741l;
        System.out.printf("El valor de la variable %d\n" , poblacion);
        char sexo = 'H';
        System.out.printf("El valor de la variable sexo es %s\n" , sexo);






    }
}
