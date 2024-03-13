package teoria.interfaces;

public class Clase implements InterfazConTodoLoQuePuedeTener {
    @Override
    public void metodoAbstracto1() {
        System.out.println("Este es el metodo abstracto que hemos desarrollado en la clase\n");
    }

    @Override
    public int calcularSuma(int numero1, int numero2) {
        return numero1 + numero2;
    }
}
