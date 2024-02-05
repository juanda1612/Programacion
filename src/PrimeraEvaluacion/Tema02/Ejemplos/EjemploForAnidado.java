package PrimeraEvaluacion.Tema02.Ejemplos;

public class EjemploForAnidado {
    public static void main(String[] args) {
        // un for dentro de otro for sirve para trabajar con tablas, tableros, arrays bidimensionales, etc
        // es decir, cualquier estructura que se organice en filas y columnas
        for (int i = 0; i < 5; i++) { //en el bucle de fuera llevamos las "filas" -> i
            for (int j = 0; j < 5; j++) {// en el bucle de dentro llevamos las "columnas" -> j
                System.out.print("f" + i + "c" + j + " ");
            }
            System.out.println();
        }
        // Otro ejemplo:
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                System.out.print((i * j) + "\t");
            }
            System.out.println();
        }
    }
}
