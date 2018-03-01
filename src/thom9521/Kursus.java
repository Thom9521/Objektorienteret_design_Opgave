package thom9521;

public class Kursus {

    private Ugedage ugedage;
    private Lokale lokale;
    private Undervisere undervisere;
    private Deltagere deltagere;


    public Kursus(){
    }

    public Kursus(Ugedage ugedage, Lokale lokale, Undervisere undervisere, Deltagere deltagere) {
        this.ugedage = ugedage;
        this.lokale = lokale;
        this.undervisere = undervisere;
        this.deltagere = deltagere;
    }

    public Ugedage getUgedage() {
        return ugedage;
    }

    public void setUgedage(Ugedage ugedage) {
        this.ugedage = ugedage;
    }

    public Lokale getLokale() {
        return lokale;
    }

    public void setLokale(Lokale lokale) {
        this.lokale = lokale;
    }

    public Undervisere getUndervisere() {
        return undervisere;
    }

    public void setUndervisere(Undervisere undervisere) {
        this.undervisere = undervisere;
    }

    public Deltagere getDeltagere() {
        return deltagere;
    }

    public void setDeltagere(Deltagere deltagere) {
        this.deltagere = deltagere;
    }
}
