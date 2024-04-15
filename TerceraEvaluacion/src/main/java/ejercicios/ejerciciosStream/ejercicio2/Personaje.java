package ejercicios.ejerciciosStream.ejercicio2;

public class Personaje {
    private String nombre;
    private Integer edad;
    private Arma arma;
    private boolean humano;

    public Personaje(String nombre, Integer edad, Arma arma, boolean humano) {
        this.nombre = nombre;
        this.edad = edad;
        this.arma = arma;
        this.humano = humano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public Arma getArma() {
        return arma;
    }

    public void setArma(Arma arma) {
        this.arma = arma;
    }

    public boolean isHumano() {
        return humano;
    }

    public void setHumano(boolean humano) {
        this.humano = humano;
    }

    @Override
    public String toString() {
        String humanoT;
        if (humano){
            humanoT = "SI";
        }else {
            humanoT = "NO";
        };

        return    "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", arma=" + arma +
                ", humano=" + humanoT;
    }
}
