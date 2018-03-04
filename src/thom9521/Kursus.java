package thom9521;
//Klasse som opretter kursuser

import java.util.ArrayList;

public class Kursus {

    ArrayList<String> elever = new ArrayList<String>();
    private Elever elev;
    private Ugedage ugedage;
    private Lokale lokale;
    private Undervisere undervisere;
    private Deltagere deltagere;
    private Tidspunkt tidspunkt;
    private String navn;


    public Kursus(){
    }

    public Kursus(String navn) {
        this.navn = navn;

    }


    public void tilføjElev(Elever elev){
        System.out.println(elev.getNavn() + " er tilføjet til " + navn + ".");
        this.elev = elev;
        elever.add(elev.getNavn());
    }


//Metode til at få informationen for det givende kursus
    public void info() {
        System.out.println(navn + " består af følgende elever: " + elever + " og har " + undervisere.getNavn()
        + " som underviser. Undervisningen foregår "+ ugedage + " i lokale " + lokale + " klokken " + tidspunkt.getTidspunkt()
        + ", og varer " + tidspunkt.getTid() + " minutter.");
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

    public Tidspunkt getTidspunkt() {
        return tidspunkt;
    }

    public void setTidspunkt(Tidspunkt tidspunkt) {
        this.tidspunkt = tidspunkt;
    }

    public Elever getElev() {
        return elev;
    }




    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }
}
