package PrimeraEvaluacion.Tema01.Tarea02.Ejercicios2;
import java.util.Scanner;
public class Ejercicio10Casa2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una cifra de euros");
        int num = teclado.nextInt();
        int b500 = 500;
        int b200 = 200;
        int b100 = 100;
        int b50 = 50;
        int b20 = 20;
        int b10 = 10;
        int b5 = 5;
        int e2 = 2;
        int e1 = 1;
        int resto = num;
        int cociente;

        System.out.print("Tengo ");

        cociente = resto / b500;

            System.out.print(cociente + " billete de 500, ");

        resto = resto % b500;

        cociente = resto / b200;
        System.out.print(cociente + " billete de 200, ");
        resto = resto % b200;

        cociente = resto / b100;
        System.out.print(cociente + " billete de 100, ");
        resto = resto % b100;

        cociente = resto / b50;
        System.out.print(cociente + " billete de 50, ");
        resto = resto % b50;

        cociente = resto / b20;
        System.out.print(cociente + " billete de 20, ");
        resto = resto % b20;

        cociente = resto / b10;
        System.out.print(cociente + " billete de 10, ");
        resto = resto % b10;

        cociente = resto / b5;
        System.out.print(cociente + " billete de 5, ");
        resto = resto % b5;

        cociente = resto / e2;
        System.out.print(cociente + " moneda de 2, ");
        resto = resto % e2;

        cociente = resto / e1;
        System.out.print(cociente + " moneda de 1 ");

    }
}
