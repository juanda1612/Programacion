package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Banco;

public class Main {

    public static void main(String[] args) {

        // Instancia = objeto
        Usuario propietario = new Usuario("demo", "Ale" , "Chim Pom");

        Cuenta cuenta = new Cuenta("123456", 1000, propietario);

        mostrarCuenta(cuenta);

    }

    public static void mostrarCuenta(Cuenta cuenta){
        System.out.println(cuenta);
    }
}
