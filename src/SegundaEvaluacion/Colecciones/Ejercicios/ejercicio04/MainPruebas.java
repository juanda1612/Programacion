package SegundaEvaluacion.Colecciones.Ejercicios.ejercicio04;

public class MainPruebas {
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

        System.out.println(miDiccionario);

        String palabra = miDiccionario.traduce("Mesa");
        System.out.println(palabra);

        System.out.println("Palabra aleatoria: "+ miDiccionario.palabraAleatoria());

        System.out.println(miDiccionario.primeraLetraTraduccion("Cara"));
    }
}
