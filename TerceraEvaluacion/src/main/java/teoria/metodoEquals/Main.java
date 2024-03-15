package teoria.metodoEquals;

public class Main {

    public static void main(String[] args) {
        Empleado empleado1 = new Empleado("pepito", "55555", 1);
        Empleado empleado2 = new Empleado("pepito", "55555", 1);
        Empleado empleado3 = new Empleado("pepito", "55555", 2);

        System.out.println("empleado1 = empleado2? " + empleado1.equals(empleado2));
        System.out.println("\nempleado1 = empleado3? " + empleado1.equals(empleado3));



    }
}
