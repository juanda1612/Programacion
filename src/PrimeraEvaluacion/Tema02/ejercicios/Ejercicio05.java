package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe el mismo programa anterior, pero indicando exactamente qué es lo que es incorrecto: si el usuario, la contraseña o ambos.
 */

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {

        String user = "dam1";
        String password = "Fernando6";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.println("Contraseña ");
        String contraseña = teclado.nextLine();


        if (usuario.equals(user) && contraseña.equals(password)){
            System.out.println("has accecido al sistema");
        }else if (!usuario.equals(user) && contraseña.equals(password)){
            System.out.println("El usuario es incorrecto");
        } else if (!contraseña.equals(password) && usuario.equals(user)) {
            System.out.println("La contraseña es incorrecta");
        }else {
            System.out.println("ambas son incorrectas");
        }
    }
    }


