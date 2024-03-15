package teoria.metodoEquals;

public class java511 {
    int miDato;

    // Constructor parametrizado
    java511( int dato ) {
        miDato = dato;
    }

    public static void main(String args[] ) {
        // Se instancian los objetos que se van a testear
        java511 obj1 = new java511( 2 );
        java511 obj2 = new java511( 2 );
        java511 obj3 = new java511( 3 );
        String obj4 = "Un objeto String";

        // Se realizan las comprobaciones y se presenta por pantalla
        // el resultado de cada una de ellas
        System.out.println( "obj1 equals obj1: " +
                obj1.equals( obj1 ) );
        System.out.println( "obj1 equals obj2: " +
                obj1.equals( obj2 ) );
        System.out.println( "obj1 equals obj3: " +
                obj1.equals( obj3 ) );
        System.out.println( "obj1 equals obj4: " +
                obj1.equals( obj4 ) );
    }

    // Se sobreescribe el metodo equals()
    public boolean equals( Object arg ) {
        // Se comprueba que el argumento es del tipo adecuado y
        // que no es nulo. Si lo anterior se cumple se realiza
        // la comprobacion de equivalencia de los datos.
        // Observese que se ha empleado el operador instanceof
        if( (arg != null) && (arg instanceof java511) ) {
            // Hacemos un moldeado del Object general a tipo java511
            java511 temp = (java511)arg;

            // Se realiza la comparacion y se devuelve el resultado
            return( this.miDato == temp.miDato );
        }
        else {
            // No es del tipo esperado
            return( false );
        }
    }
}
