package SegundaEvaluacion.poo.herencia.ejercicios.electrodomesticos;

public class MainPruebas {
    public static void main(String[] args) {
        Electrodomestico nevera = new Electrodomestico("nevera","teka",1.5);
        System.out.println(nevera);
        System.out.println(nevera.getConsumo(3));
        System.out.println(nevera.getCosteConsumo(3,0.20));

        Lavadora lavadora = new Lavadora("teka", 1.5, 200, true);
        System.out.println(lavadora);
        System.out.println(lavadora.getConsumo(3));
        System.out.println(lavadora.getCosteConsumo(3, 0.20));
    }
}
