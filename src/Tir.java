public class Tir extends Arac {

    private int tirHacim;

    private String tirIsim;

    public Tir(int tip, String tirIsim, int tirHacim){
        super(tip);
        this.tirHacim = tirHacim;
        this.tirIsim = tirIsim;
    }
    public String toString() {

        return  tirIsim;
    }
}
