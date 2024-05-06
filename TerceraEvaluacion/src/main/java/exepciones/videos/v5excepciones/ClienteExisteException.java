package exepciones.videos.v5excepciones;

public class ClienteExisteException  extends Exception{

    private Cliente cliente;
    //constructor utilizando en throw
    public ClienteExisteException (Cliente cliente){
        this.cliente = cliente;
    }
    public String toString(){
        return "El cliente de nombre " + this.cliente.getNombre() + " ya existe";
    }
}
