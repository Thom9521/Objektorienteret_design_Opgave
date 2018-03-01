package thom9521;

public class Elever {

    private String navn;
    private String efternavn;
    private int telefonnummer;


    public Elever(String navn, String efternavn, int telefonnummer) {
        this.navn = navn;
        this.efternavn = efternavn;
        this.telefonnummer = telefonnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getEfternavn() {
        return efternavn;
    }

    public void setEfternavn(String efternavn) {
        this.efternavn = efternavn;
    }

    public int getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(int telefonnummer) {
        this.telefonnummer = telefonnummer;
    }


    public void parkourKursus(){
        System.out.println(navn + " " +  efternavn + " er tilmeldt til kursuet: parkour.");
    }
    public void selvforsvarKursus(){
        System.out.println(navn + " " +  efternavn + " er tilmeldt til kursuet: selvforsvar.");
    }

    public void værkstedsfagKursus(){
        System.out.println(navn + " " +  efternavn + " er tilmeldt til kursuet: værkstedsfag.");
    }

    public void keramikKursus(){
        System.out.println(navn + " " +  efternavn + " er tilmeldt til kursuet: keramik.");
    }

    public void metalsløjdKursus(){
        System.out.println(navn + " " +  efternavn + " er tilmeldt til kursuet: metalsløjd.");
    }

    public void franskKursus(){
        System.out.println(navn + " " +  efternavn + " er tilmeldt til kursuet: fransk.");
    }
    public void kinesiskKursus(){
        System.out.println(navn + " " +  efternavn + " er tilmeldt til kursuet: kinesisk.");
    }
    public void knallertKursus(){
        System.out.println(navn + " " +  efternavn + " er tilmeldt til kursuet: knallertkursus.");
    }

}
