package SegundaEvaluacion.Colecciones.Ejercicios.ejercicio04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Diccionario miDiccionario = new Diccionario();
        // lo rellenamos
        miDiccionario.nuevoPar("Perro", "Dog");
        miDiccionario.nuevoPar("Gato", "Cat");
        miDiccionario.nuevoPar("Mesa", "Table");
        miDiccionario.nuevoPar("Silla", "Chair");
        miDiccionario.nuevoPar("Programacion", "Programming");
        miDiccionario.nuevoPar("Pelo", "Hair");
        miDiccionario.nuevoPar("Cara", "Face");
        miDiccionario.nuevoPar("Examen", "Exam");
        miDiccionario.nuevoPar("Base de Datos", "Database");
        miDiccionario.nuevoPar("Chaqueta", "Jacket");

        Scanner teclado = new Scanner(System.in);
        String palabra;
        int contadorPreguntas = 0;
        int contadorAciertos = 0;
        int contadorErrores = 0;
        int porcentaje;
        do {

            String palabraAleatoria = miDiccionario.palabraAleatoria();

            System.out.println("\n"+ palabraAleatoria + ": " + miDiccionario.primeraLetraTraduccion(palabraAleatoria) + "...");
            System.out.println("Indique la respuesta: ");
            palabra = teclado.nextLine();

            if (palabra.equalsIgnoreCase("fin")){
                break;
            }else if (palabra.equalsIgnoreCase(miDiccionario.traduce(palabraAleatoria))){
                contadorAciertos++;
                System.out.println("¡CORRECTO!");
            }else {
                contadorErrores++;
                System.out.println("¡NO! La respuesta correcta es " + miDiccionario.traduce(palabraAleatoria));
            }
            contadorPreguntas++;

        }while (!palabra.equals("fin"));

        porcentaje = contadorAciertos/contadorPreguntas * 100;

        System.out.println("FIN DEL PROGRAMA");
        System.out.println("Total preguntas: " + contadorPreguntas);
        System.out.println("Total aciertos: " + contadorAciertos);
        System.out.println("Total errores: " + contadorErrores);
        System.out.println("Aciertos: " + porcentaje + "%");
    }
}
