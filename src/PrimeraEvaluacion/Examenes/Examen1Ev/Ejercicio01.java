package PrimeraEvaluacion.Examenes.Examen1Ev;
import java.util.Scanner;

/**
 * @author JuanDaniel
 */
/*
Escribe un programa que pida el número de alumnos de una clase y el número de sillas disponibles
en el aula. Como mínimo hay que introducir un alumno y una silla. En caso contrario se seguirá
pidiendo hasta introducir un número correcto de sillas y alumnos.
El programa debe calcular y mostrar cuántos alumnos se quedarán de pie y cuántas sillas quedarán
vacías.
 */
public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dePie = 0;
        int sobra = 0;
        int alumno;
        int silla;
        do {
            System.out.println("Cuantos alumnos hay");
            alumno = teclado.nextInt();
            if (alumno >= 1) {
                do {
                    System.out.println("Cuantas sillas hay");
                    silla = teclado.nextInt();
                    if (silla >= 1) {
                        if (alumno > silla) {
                            dePie = alumno - silla;
                            System.out.println("No hay sillas, se quedaran de pie " + dePie + " alumnos");
                            break;
                        } else {
                            sobra = silla - alumno;
                            System.out.println("Sobran " + sobra + " sillas, Todos se sientan");
                            break;
                        }
                    } else {
                        System.out.println("No puede haber "+ silla + " sillas, intentalo de nuevo");
                    }
                }while (silla < 1);
            }else {
                System.out.println("No puede haber "+ alumno + " alumnos, intentalo de nuevo");
            }
        }while (alumno < 1);
    }
}
