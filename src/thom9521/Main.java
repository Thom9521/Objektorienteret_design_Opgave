package thom9521;

public class Main {
    public static void main(String[] args) {

        Elever thomas = new Elever("Thomas", 21, "", "", "", "");
        Elever billy = new Elever("Billy", 23 , "", "", "", "");
        Elever jonny = new Elever("Jonny", 22, "", "", "","");
        Undervisere andras = new Undervisere("Andras", 30, "123456789", "pølse");
        Undervisere karsten = new Undervisere("Karsten", 30, "", "");


        Kursus parkour = new Kursus("Parkour");
        parkour.setUgedage(Ugedage.TIRSDAG);
        parkour.setLokale(Lokale.L5);
        parkour.setDeltagere(new Deltagere(10));
        parkour.setTidspunkt(new Tidspunkt(45, 8.15));
        parkour.setUndervisere(andras);
        parkour.tilføjElev(thomas);
        parkour.tilføjElev(billy);
        parkour.info();

        System.out.println();

        Kursus keramik = new Kursus("Keramik");
        keramik.setUgedage(Ugedage.ONSDAG);
        keramik.setLokale(Lokale.L2);
        keramik.setDeltagere(new Deltagere(15));
        keramik.setTidspunkt(new Tidspunkt(45, 10.35));
        keramik.setUndervisere(karsten);
        keramik.tilføjElev(jonny);
        keramik.info();


    }
}
