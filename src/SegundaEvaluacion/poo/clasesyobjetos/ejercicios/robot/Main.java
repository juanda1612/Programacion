package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.robot;

public class Main {
    public static void main(String[] args) {
        // con este llamo al constructor sin parametros
        Robot robot1 = new Robot();
        System.out.println(robot1);

        // con este llamo al constructor que tiene todos los paramemtros
        Robot robot2 = new Robot("Mazinger", "Z", 2000);
        System.out.println(robot2);

        // con este llamo al constructor que tiene dos paramemtros
        Robot robot3 = new Robot("Afrodita", "A");
        System.out.println(robot3);
    }
}
