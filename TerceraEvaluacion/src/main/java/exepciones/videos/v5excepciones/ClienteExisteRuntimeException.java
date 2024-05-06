package exepciones.videos.v5excepciones;

public class ClienteExisteRuntimeException extends RuntimeException {
    private Cliente cliente;
    //constructor utilizando en throw
    public ClienteExisteRuntimeException (Cliente cliente){
        this.cliente = cliente;
    }
    public String toString(){
        return "El cliente de nombre " + this.cliente.getNombre() + " ya existe";
    }
}
