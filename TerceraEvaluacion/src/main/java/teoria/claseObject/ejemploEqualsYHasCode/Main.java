package teoria.claseObject.ejemploEqualsYHasCode;

public class Main {
    public static void main(String[] args) {
        // creamos un objeto Usuario
        Usuario usuario1 = new Usuario("pepe", "1234");
        Usuario usuario2 = new Usuario("pepe", "4321");
        System.out.println(usuario1.equals(usuario2));

        // ahora vamos a ver que hace hasCode()
        int hasCode1 = usuario1.hashCode();
        System.out.println("HasCode de usuario1: " + hasCode1);
        int hasCode2 = usuario2.hashCode();
        System.out.println("HasCode de usuario1: " + hasCode2);

        System.out.println("SOn iguales? " + (hasCode1 == hasCode2));

        // como conclusion, para comparar objetos entr si podemos utilizar uno u otro
    }
}
