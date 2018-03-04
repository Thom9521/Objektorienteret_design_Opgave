package thom9521;
//Klasse som hjælper med at sætte tidspunktet for hvornår kursuserne begynder og hvor længe de varer.

public class Tidspunkt {

    private int tid;
    private double tidspunkt;


    public Tidspunkt(int tid, double tidspunkt) {
        this.tid = tid;
        this.tidspunkt = tidspunkt;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public double getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(double tidspunkt) {
        this.tidspunkt = tidspunkt;
    }
}
