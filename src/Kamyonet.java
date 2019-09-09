public class Kamyonet extends Arac {

    private int kamyonetHacim;

    private String kamyonetIsim;

    public Kamyonet(int tip, String kamyonetIsim, int kamyonetHacim){
        super(tip);
        this.kamyonetHacim = kamyonetHacim;
        this.kamyonetIsim = kamyonetIsim;
    }

    public String toString() {

        return  kamyonetIsim;
    }
}
