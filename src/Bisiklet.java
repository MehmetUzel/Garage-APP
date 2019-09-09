public class Bisiklet extends Arac {

    private int bisikletHacim;

    private String bisikletIsim;

    public Bisiklet(int tip, String bisikletIsim, int bisikletHacim){
        super(tip);
        this.bisikletIsim = bisikletIsim;
        this.bisikletHacim = bisikletHacim;
    }
    public String toString() {

        return  bisikletIsim;
    }
}
