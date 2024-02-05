package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.ejercito;

public class Main {
    public static void main(String[] args) {
        Unidad unidad1 = new Unidad("a");
        Unidad unidad2 = new Unidad("b");
        Unidad unidad3 = new Unidad("c");
        Unidad unidad4 = new Unidad("d");
        Unidad unidad5 = new Unidad("e");

        Caballero caballero1 = new Caballero("a");
        Caballero caballero2 = new Caballero("b");
        Caballero caballero3 = new Caballero("c");

        General general = new General("A");

        Medico medico = new Medico("B");

        // Muestra ejercito
        imprimirEjercito();
    }

    public static void imprimirEjercito(){
        System.out.println("UNIDADES: " + Unidad.unidades + "\nCaballeros: " + Caballero.caballeros + "\nGenerales: " + General.generales + "\nMedicos: " + Medico.medicos);
    }
}
