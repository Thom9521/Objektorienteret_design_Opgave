package thom9521;
//Klasse til oprettelse af elever, som extender BrugerSystem

public class Elever extends BrugerSystem{

    public Elever(){}

    public Elever(String navn, int alder, String skole, String klasse, String telefonnummer, String password) {
        super(navn, alder, skole, klasse, telefonnummer, password);
    }

/*
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
*/
}
