public class Otobus extends Arac {

    private int kamyonetHacim;

    private String kamyonetIsim;

    public Otobus(int tip, String kamyonetIsim, int kamyonetHacim){
        super(tip);
        this.kamyonetHacim = kamyonetHacim;
        this.kamyonetIsim = kamyonetIsim;
    }

    public String toString() {

        return  kamyonetIsim;
    }
}
