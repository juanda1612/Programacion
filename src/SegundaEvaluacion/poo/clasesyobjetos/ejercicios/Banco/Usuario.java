package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Banco;

public class Usuario {
    private String login;
    private String nombre;
    private String apellidos;

    public Usuario(String login, String nombre, String apellido) {
        this.login = login;
        this.nombre = nombre;
        this.apellidos = apellido;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellidos;
    }

    public void setApellido(String apellido) {
        this.apellidos = apellido;
    }

    @Override
    public String toString() {
        return " nombre= " + nombre +
                ", apellido='" + apellidos + '\'' +
                '}';
    }
}
