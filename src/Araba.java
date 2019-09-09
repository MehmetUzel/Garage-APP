public class Araba extends Arac {

    private int arabaHacim;

    private String arabaIsim;

    public Araba(int tip, String arabaIsim, int arabaHacim){
        super(tip);
        this.arabaIsim = arabaIsim;
        this.arabaHacim = arabaHacim;
    }

    public String toString() {

        return  arabaIsim;
    }

}
