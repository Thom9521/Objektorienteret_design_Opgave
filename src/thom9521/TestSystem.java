package thom9521;

public class TestSystem {
    //public static void main(String[] args) {
        public void init() {

            Elever thomas = new Elever("Thomas", 21, "", "", "", "");
            Elever billy = new Elever("Billy", 23, "", "", "", "");
            Elever jonny = new Elever("Jonny", 22, "", "", "", "");
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

            Kursus selvforsvar = new Kursus("Selvforsvar");
            selvforsvar.setUgedage(Ugedage.ONSDAG);
            selvforsvar.setLokale(Lokale.L2);
            selvforsvar.setDeltagere(new Deltagere(15));
            selvforsvar.setTidspunkt(new Tidspunkt(45, 10.35));
            selvforsvar.setUndervisere(karsten);
            selvforsvar.tilføjElev(jonny);
            selvforsvar.info();

            Kursus værkstedsfag = new Kursus("Værkstedsfag");
            Kursus keramik = new Kursus("Keramik");
            Kursus metalsløjd = new Kursus("Metalsløjd");
            Kursus fransk = new Kursus("Fransk");
            Kursus kinesisk = new Kursus("Kinesisk");
            Kursus knallertkursus = new Kursus("Knallertkursus");


        }

}
