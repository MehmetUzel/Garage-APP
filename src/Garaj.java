import java.util.ArrayList;
import java.util.List;

public class Garaj {

    private List<Arac> garaj = new ArrayList<>(); /* Garajdaki araçlarımızı burada tutuyoruz.*/

    private int garajBoyutu;

    public Garaj(int garajBoyutu, List<Arac> garaj){
        this.garajBoyutu = garajBoyutu;
        garaj = garaj;
    }

    public  List<Arac> getGaraj() { return garaj; }

    public void  setGaraj(List<Arac> newGaraj) {garaj = newGaraj;}

    public int findAracByTip(int tip) {
        for (Arac a : this.garaj){
            if (a.getTip() == tip){
               return this.garaj.indexOf(a);
            }
        }
        return -1;
    }

    public int getGarajBoyutu() {return garajBoyutu;}

    public void setGarajBoyutu(int newBoyut) {garajBoyutu = newBoyut;}

}
