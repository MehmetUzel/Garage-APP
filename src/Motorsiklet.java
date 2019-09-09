public class Motorsiklet extends Arac {

    private String motorsikletIsim;

    private int motorsikletHacim;

    public Motorsiklet(int tip, String motorsikletIsim, int motorsikletHacim){
        super(tip);
        this.motorsikletHacim = motorsikletHacim;
        this.motorsikletIsim = motorsikletIsim;
    }

    public String toString() {

        return  motorsikletIsim;
    }
}
