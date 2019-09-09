public class Arac {

    private String isim; /* Aracın ismi. */

    private int tip; /* Aracın tipi. */

    private int hacim; /* Aracın kapladığı alan. */

    public Arac(int tip){
        this.tip = tip;
    }

    public int getTip(){return tip;}

    public void setTip(int newTip){tip = newTip;}

    public String getIsim(){return isim;}

    public void setIsim(String newIsim){isim = newIsim;}

    public int getHacim(){return hacim;}

    public void setHacim(int newHacim){hacim = newHacim;}

    /**public Arac getArac(int tip, String isim, int hacim) {
        Arac indexArac = new Arac(tip,isim,hacim);
        return indexArac;
    } */

    public String toString() {

     return  "name";
    }
}
