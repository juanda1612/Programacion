package teoria.claseObject;

public class MainObject {
    public static void main(String[] args) {
        EjemploObject eo = new EjemploObject("Objeto", 1);
        System.out.println(eo);

        // puedo saber tmb la ruta de la clase a la que pertenece este objeto
        // con el metodo getClass()
        String rutaClase = String.valueOf(eo.getClass());
        System.out.println("Esta clase esta en: " + rutaClase);
    }
}
