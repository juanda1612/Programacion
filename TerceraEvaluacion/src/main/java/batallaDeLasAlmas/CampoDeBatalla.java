package batallaDeLasAlmas;

public class CampoDeBatalla {
    public static void main(String[] args) {
        Humano humano1 = new Humano(50);
        humano1.mostrar();
        luchar(humano1);
        humano1.rezar();
        humano1.rezar();
        humano1.pecar();
        System.out.println("\nTras rezar dos veces y pecar una vez");
        humano1.mostrar();
        System.out.println("\nSegunda Lucha");
        luchar(humano1);
    }

    public static void luchar(Humano humano){
        int bondadAngel = 0;
        double maldadDemonio = 0.0;

        for (Angel angel : humano.angeles){
            bondadAngel = bondadAngel + angel.bondad;
        }

        for (Demonio demonio : humano.demonios){
            maldadDemonio = maldadDemonio + demonio.getMaldad();
        }

        System.out.println("\nCombate entre angeles y demonios");
        System.out.println("================================");
        System.out.println("Bondad de los angeles: " + bondadAngel);
        System.out.println("Maldad de los demonios: " + maldadDemonio);

        if (bondadAngel > maldadDemonio){
            humano.rezar();
            System.out.println(bondadAngel + " > "+ maldadDemonio +" El humano reza, por lo que tiene un angel mas y la fe de del humano aumenta");
        }else {
            humano.pecar();
            System.out.println(bondadAngel + " > "+ maldadDemonio +" El humano peca, por lo que tiene un demonio mas y la fe disminuye");
        }
        System.out.println();
        humano.mostrar();
    }
}
