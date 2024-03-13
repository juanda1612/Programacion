package batallaDeLasAlmas;

public class Angel extends Incorporeo{
    private int bondad;
    private int maldad;

    public Angel(int bondad, int maldad) {
        this.bondad = bondad;
        this.maldad = maldad;
    }

    @Override
    public void mostrar() {
        System.out.println(bondad);
    }
}
