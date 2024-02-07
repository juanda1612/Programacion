package SegundaEvaluacion.poo.ejerciciosuml.eltacondeoro;

public class Pedido {
    private Socio socio;

    public boolean comprobarTarjeta(){
        boolean valida = false;
        if (socio.getTarjeta().equals("12345")){
            valida = true;
        }
        return valida;
    }
}
