package thom9521;

public class Elever {

    private String navn;
    private String efternavn;
    private int telefonnummer;

    public Elever() {
    }

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


}
