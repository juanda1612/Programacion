package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.superheroes;

public class Main {
    public static void main(String[] args) {
        SuperHeroe superHeroe = new SuperHeroe("pepito");
        System.out.println(superHeroe);

        System.out.println("**********");
        Dimension dimension = new Dimension();
        System.out.println(dimension);
        System.out.println("**********");
        dimension.setAlto(3);
        dimension.setAncho(1);
        dimension.setProfundidad(3);
        System.out.println(dimension);
        System.out.println("************");
        Figura figura = new Figura("3135", 10, superHeroe, dimension);
        System.out.println(figura);
        figura.subirPrecio(20);
        System.out.println("*********");
        System.out.println(figura);
    }
}
