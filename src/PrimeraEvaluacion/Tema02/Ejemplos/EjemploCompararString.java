package PrimeraEvaluacion.Tema02.Ejemplos;

public class EjemploCompararString {
    public static void main(String[] args) {
        //NEW ****OJO**** CUANDO SE TRATA DE STRING, LA COMPARACION NO SE HAVE CON ==
        // SE UTILIZA EL METODO  cadena1.equals(cadena2)
        // POR EJEMPLO, ENE STE CASO , pondriamos user.equals(usuario)
        //
        System.out.println("Adriano" .equals("adriano")); // false
        System.out.println("Adriano" .equals("Adriano"));
    }
}
