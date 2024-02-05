package PrimeraEvaluacion.Tema03.Ejemplos;

public class EjemplosString {
    public static void main(String[] args) {
       /*
        String str = null;
        System.out.println(str); // null
        str = ""; // Esto es una cadena vacia
        System.out.println(str);
        str = "hola";
        System.out.println(str); // hola


        String cadena = "Esto es una cadena";
        System.out.println(cadena); // imprime “Esto es un string"

        String otraCadena = "Esta\n es\n otra cadena"; // cadena con caracteres de escape
        System.out.println(otraCadena); // imprime el resultado en varias líneas

        // Como obtener la longitud (length) y los caracteres de un String(char at)
        int logitud = cadena.length(); // devuelve  un valor de tipo int
        System.out.println("logitud: " + logitud);
        // 4º caracter
        System.out.println("4º caracter: " + cadena.charAt(3));
        // primer caracter
        System.out.println("primer caracter: " + cadena.charAt(0));
        // último caracter: si el primer caracter esta en la índice 0 y la longitud es length()
        // el ultimo caracter es length() - 1
        System.out.println("ultimo caracter: " + cadena.charAt(cadena.length() - 1));


        */
        //metodos útiles para trabajar con cadenas de texto
        String cadena1 = "Los ordenadores son buenos siguiendo instrucciones, no leyendo tu mente";
        String cadena2 = "";

        //isEmpty() devuelve true si la cadena está vacía; de lo contrario, false;
        boolean b1 = cadena1.isEmpty();
        System.out.println("Esta vacia: " + b1);
        boolean b2 = cadena2.isEmpty();
        System.out.println("Esta vacia: " + b2);


        //toUpperCase() devuelve una nueva cadena en mayúsculas;
         String c1=cadena1.toUpperCase();
         System.out.println(c1);
         String c2=cadena2.toUpperCase();
         System.out.println(c2);

        //toLowerCase() devuelve una nueva cadena en minúsculas;
        c1=cadena1.toLowerCase();
        System.out.println(c1);
        c2=cadena2.toLowerCase();
        System.out.println(c2);


        //startsWith(prefijo) devuelve true si la cadena comienza con el prefijo de cadena dado; de lo contrario, false;
        b1 =cadena1.startsWith("Los");
        System.out.println(b1);
        b2=cadena2.startsWith("Los");
        System.out.println(b2);

        //endsWith(sufijo) devuelve true si la cadena termina con el sufijo dado; de lo contrario, false.
        b1 =cadena1.endsWith("mente");
        System.out.println(b1);
        b2=cadena2.endsWith("mente");
        System.out.println(b2);

        //contains(...) devuelve true si la cadena contiene la cadena o el carácter dados;
        b1 =cadena1.contains("e");
        System.out.println(b1);
        b2=cadena2.contains("e");
        System.out.println(b2);

        //substring(posicionInicial, posicionFinal) devuelve una subcadena de la cadena en el rango: posicionInicial, posicionFinal - 1;
        c1=cadena1.substring(2, 10);
        System.out.println(c1);

        System.out.println(c2);



        //replace(old, new) devuelve una nueva cadena obtenida reemplazando todas las apariciones de old con new que pueden ser caracteres o cadenas.
        c1=cadena1.replace("e","o");
        System.out.println(c1);
        c2=cadena2.replace("e" , "o");
        System.out.println(c2);

        //trim() devuelve una copia de la cadena obtenida al omitir los espacios en blanco iniciales y finales. Ten en cuenta que el espacio en blanco incluye no solo el carácter de espacio, sino principalmente todo lo que parece vacío: tabulación, retorno de carro, carácter de nueva línea, etc.
        String conblancos = "     hola     ";
        System.out.println(conblancos.length());
        String sinblancos = conblancos.trim();
        System.out.println(sinblancos.length());

        String primera1 = "primera";
        String segunda1 = "segunda";

        String primera2 = "primera";
        String segunda2 = "SEGUNDA";

        System.out.println(primera1.equals(segunda1));//“primera”.equals(“segunda”)->false
        System.out.println(primera1.equals(primera2)); //“primera”.equals(“primera”)->true

        System.out.println(segunda1.equals(segunda2));//“segunda”.equals(“SEGUNDA”)->false
        System.out.println(segunda1.equalsIgnoreCase(segunda2)); // true
        // sd
    }
}

