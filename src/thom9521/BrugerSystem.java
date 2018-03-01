package thom9521;

public class BrugerSystem {

    private String navn;
    private int alder;
    private String skole;
    private String klasse;
    private String telefonnummer;


    public BrugerSystem(String navn, int alder, String skole, String klasse, String telefonnummer) {
        this.navn = navn;
        this.alder = alder;
        this.skole = skole;
        this.klasse = klasse;
        this.telefonnummer = telefonnummer;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public int getAlder() {
        return alder;
    }

    public void setAlder(int alder) {
        this.alder = alder;
    }

    public String getSkole() {
        return skole;
    }

    public void setSkole(String skole) {
        this.skole = skole;
    }

    public String getKlasse() {
        return klasse;
    }

    public void setKlasse(String klasse) {
        this.klasse = klasse;
    }

    public String getTelefonnummer() {
        return telefonnummer;
    }

    public void setTelefonnummer(String telefonnummer) {
        this.telefonnummer = telefonnummer;
    }
}
