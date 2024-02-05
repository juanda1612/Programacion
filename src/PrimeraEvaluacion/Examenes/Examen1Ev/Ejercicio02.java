package PrimeraEvaluacion.Examenes.Examen1Ev;
import java.util.Scanner;

/**
 * @author JuanDaniel
 */
/*
Escribir un programa que calcule el Índice de Masa Corporal de una persona e indique su situación
en función la la tabla que se muestra Aplicacion.md continuación.
El peso y la altura para calcular el correspondiente IMC deben ser introducidos por teclado.
El IMC debe presentarse en pantalla con 2 decimales.
IMC = (peso en kg) / (altura en metros al cuadrado)
IMC
Menor que 18,5 Situación
Bajo peso
[18,5 – 25)
[25 – 30)
[30 – 40)
[40 – 50)
Mayor que 50 (incusive) Normopeso
Sobrepeso
Obesidad
Obesidad mórbida
Obesidad extrema
Nota: los intervalos que se muestran son semiabiertos. Esto significa que incluye al número que va
junto al “[“ pero excluye al número que va junto al “)”.
 */
public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu peso");
        int peso = teclado.nextInt();
        System.out.println("Introduce tu altura");
        double altura = teclado.nextDouble();
        double imc = 0;

        imc = peso / (Math.pow(altura, 2));
        if (imc < 18.5){
            System.out.println("Bajo peso");
        } else if (imc >= 18.5 && imc < 25){
            System.out.println("Normopeso");
        } else if (imc >= 25 && imc < 30) {
            System.out.println("Sobrepeso");
        } else if (imc >= 30 && imc < 40){
            System.out.println("Obesidad");
        } else if (imc >= 40 && imc < 50) {
            System.out.println("Obesidad morbida");
        } else if (imc >= 50) {
            System.out.println("Obesidad extrema");
        }

        System.out.printf("%.2f", imc);
    }
}
