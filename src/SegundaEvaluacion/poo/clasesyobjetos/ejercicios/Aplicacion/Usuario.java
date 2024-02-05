package SegundaEvaluacion.poo.clasesyobjetos.ejercicios.Aplicacion;

import com.sun.source.tree.IfTree;

import java.util.Scanner;

public class Usuario {
    private String username;
    private String email;
    private String password;
    private Estado estado;


    public Usuario(String username, String email, String password, Estado estado) {
        this.username = username;
        this.email = email;
        this.password = password;
        this.estado = Estado.Pendiente;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Estado getEstado() {
        return estado;
    }

    public void setEstado(Estado estado) {
        this.estado = estado;
    }


    @Override
    public String toString() {
        return "Usuario =" +
                " username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", estado=" + estado;
    }
    public void mensajeEstado(){
        System.out.println("1:Activo, 2:Pendiente, 3:Bloqueado");
        Estado estado = cambioMensaje();
        if (estado.equals(Estado.Pendiente)){
            System.out.println("Tienes que esperar un poco");
        } else if (estado.equals(Estado.Activo)) {
            System.out.println("Todo ok, vía libre");
        } else if (estado.equals(Estado.Bloqueado)) {
            System.out.println("Usuario bloqueado. Algo habrás hecho");
        } else {
            System.out.println("Estado desconocido");
        }
    }

    public Estado cambioMensaje(){
        Scanner teclado = new Scanner(System.in);
        String cambiar = teclado.nextLine();
        if (cambiar.equals("1")){
            estado = Estado.Activo;
        } else if (cambiar.equals("2")) {
            estado = Estado.Pendiente;
        } else if (cambiar.equals("3")){
            estado = Estado.Bloqueado;
        }
        return estado;
    }
}
