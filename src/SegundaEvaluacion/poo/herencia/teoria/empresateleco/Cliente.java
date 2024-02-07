package SegundaEvaluacion.poo.herencia.teoria.empresateleco;

public class Cliente extends Persona {
    protected String idContrato;
    protected boolean gold;

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
}
