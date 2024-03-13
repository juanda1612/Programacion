package teoria.interfaces;

public interface InterfazConTodoLoQuePuedeTener {
    // puede tener constantes
    int CONSTANTE = 0; // si fuera una clase normal habria que poner public static final

    // puede tener metodos abstractos: en vez de desarrollarlos aqui, los tendran que desarrollar las clases no abstractas que implementen esa interfaz
    public void metodoAbstracto1(); // a pesar de no poner la palabra abstract, que aqui es opcional
    public int calcularSuma(int numero1, int numero2); // esto es un corto metodo abstracto

    // puede tener metodos por defecto(default) : Y HAY QUE DESARROLLARLOS AQUI
    public default void metodoPorDefecto(){
        System.out.println("Este es un metodo por defecto normal y corriente que esta desarrollado en la interfaz. Estara disponible en las clases que la implementan");

        System.out.println("Y ahora voy a utilizar el metodo que tengo a continuacion: " + metodoPrivado());
    }

    //metodos estaticos
    public static void metodoEstatico(){
        System.out.println("Esto es un metodo estatico que esta desarrollado en la interfaz. Estara disponible en las clases que la implementan");

    }

    // metodos privados
    private String metodoPrivado(){
        return  "Este metodo privado solo se puede utilizar desde esta misma interfaz";
    }

}
