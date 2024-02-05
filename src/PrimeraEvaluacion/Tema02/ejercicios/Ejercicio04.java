package PrimeraEvaluacion.Tema02.ejercicios;
/*
Escribe un programa que pida un nombre de usuario y una contraseña. Esos datos se comparan con dos valores guardados previamente en el programa. Si coinciden, se indica “Has entrado al sistema”, en caso contrario se indica que usuario y/o contraseña son incorrectos.
 */

import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        // tengo que tener previamente un usuario y una contraseña, para comparar luego
        String user = "dam1";
        String password = "Fernando6";

        Scanner teclado = new Scanner(System.in);
        System.out.println("Usuario: ");
        String usuario = teclado.nextLine();
        System.out.println("Contraseña ");
        String contraseña = teclado.nextLine();

        // esos datos se comparar con los valores guardados en ele programa
        //NEW ****OJO**** CUANDO SE TRATA DE STRING, LA COMPARACION NO SE HAVE CON ==
        // SE UTILIZA EL METODO  cadena1.equals(cadena2)
        // POR EJEMPLO, ENE STE CASO , pondriamos user.equals(usuario)
        //
        if (usuario.equals(user) && contraseña.equals(password)){
            System.out.println("has accecido al sistema");
        }else {
            System.out.println("Contraeña incorrecta");
        }
    }
}
