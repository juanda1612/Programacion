package teoria.biblioteca;

import java.time.LocalDate;

public class Socio implements Comparable{
    // atributos
    private String nombre;
    private String apellidos;
    private LocalDate fechaNac;

    public Socio(String nombre, String apellidos, LocalDate fechaNac) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.fechaNac = fechaNac;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public LocalDate getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(LocalDate fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Socio{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", fechaNac=" + fechaNac +
                '}';
    }

    @Override
    public int compareTo(Object o) {
        // el objeto que entrara por parametro sera de tipo Socio, por loq ue teemos que hacer la conversion
        Socio s = (Socio) o; // de esta forma el objeto Object pasa a ser un objeto Socio.
        // vamos a comparar los socios segun su fecha de nacimiento
        if (this.fechaNac.isBefore(s.fechaNac)){
            return 1; // es decir, si este objeto ("this") es mayor (su fecha de nacimiento va antes) que el socio pasando por parametro al metodo compareTo, el metodo devuelve 1(valdria cualquier numero positivo, pero suele ponerse 1)
        } else if (this.fechaNac.isAfter(s.fechaNac)) {
            return -1;
        }else {
            return 0;
        }
    }
}
