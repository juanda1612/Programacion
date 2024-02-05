package SegundaEvaluacion.poo.clasesyobjetos.teoria;
// estoy importando las clases del paquete acceso
import SegundaEvaluacion.poo.clasesyobjetos.teoria.acceso.*;
public class PruebaAcceso {
    public static void main(String[] args) {
        // estoy probando los modificadores de acceso
        Publica objetoPublica = new Publica();
        System.out.println(objetoPublica.atributoPublico);

        ProteccionDePaquete objetoPP = new ProteccionDePaquete();
        //System.out.println(objetoPP.atributoConProteccionDePaquete); -> no deja, porque estamos en otro paquete

        Protegida objetoProtegido = new Protegida();
        //System.out.println(objetoProtegido.); -> no deja, solo para subclases
    }
}
