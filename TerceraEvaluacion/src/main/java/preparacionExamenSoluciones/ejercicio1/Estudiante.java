package preparacionExamenSoluciones.ejercicio1;

class Estudiante {
    private String nombre;
    private int edad;
    private double[] calificaciones;

    public Estudiante(String nombre, int edad, double[] calificaciones) {
        this.nombre = nombre;
        this.edad = edad;
        this.calificaciones = calificaciones;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double[] getCalificaciones() {
        return calificaciones;
    }

    public double calcularMedia() {
        float suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma / calificaciones.length;
    }
}
