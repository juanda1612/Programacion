package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

public class Cliente extends Persona {
    protected String idContrato;
    protected boolean gold;

    public Cliente(String nombre, int añoNacimiento, String dirección, String idContrato, boolean gold) {
        super(nombre, añoNacimiento, dirección);
        this.idContrato = idContrato;
        this.gold = gold;
    }

    public String getIdContrato() {
        return idContrato;
    }

    public void setIdContrato(String idContrato) {
        this.idContrato = idContrato;
    }

    public boolean isGold() {
        return gold;
    }

    public void setGold(boolean gold) {
        this.gold = gold;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "idContrato='" + idContrato + '\'' +
                ", gold=" + gold +
                ", nombre='" + nombre + '\'' +
                ", añoNacimiento=" + añoNacimiento +
                ", dirección='" + dirección + '\'' +
                '}';
    }
}
