package SegundaEvaluacion.poo.clasesyobjetos.teoria;

public class MiClase {
    // atributos
    int atributo;
    boolean otroAtributo;

    String nombre;

    // constructor -> podemos no ponerlo y java utilizara el constructor por defecto, es decir un constructor "invisible" que no recibe parametros, solo crea el objeto vacio

    // si queremos, getters y setters -> podemos no ponerlo

    // toString() -> podemos no ponerlo

    // métodos de usuario (normalmente son metodos de instancia -> solo podran llmarse a partir de objetos que hayamos creado de esta clase)

    // metodo que imprime el atributo
    public void imprimirAtributo(){
        System.out.println("Valor del atributo: " + atributo);
        System.out.println("Valor de otro atributo: " + otroAtributo);
        System.out.println("Nombre: " + nombre);
    }
}
