package teoria.metodoEquals;

public class Empleado extends Persona {
    int direccion;

    public Empleado(String nombre, String dni, int direccion) {
        super(nombre, dni);
        this.direccion = direccion;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Empleado){
            Empleado temp = (Empleado) obj;
            return this.direccion == temp.direccion;
        }else {
            return false;
        }
    }
}
