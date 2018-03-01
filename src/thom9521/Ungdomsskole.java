package thom9521;


public class Ungdomsskole {

    private Kursus[] kursus = new Kursus[10];


    public Ungdomsskole() {

        Kursus parkour = new Kursus();
        Kursus selvforsvar = new Kursus();
        Kursus værkstedsfag = new Kursus();
        Kursus keramik = new Kursus();
        Kursus metalsløjd = new Kursus();
        Kursus fransk = new Kursus();
        Kursus kinesisk = new Kursus();
        Kursus knallertkursus = new Kursus();

        kursus[0] = parkour;
        kursus[1] = selvforsvar;
        kursus[2] = værkstedsfag;
        kursus[3] = keramik;
        kursus[4] = metalsløjd;
        kursus[5] = fransk;
        kursus[6] = kinesisk;
        kursus[7] = knallertkursus;

        parkour.setLokale(Lokale.L1);
        parkour.setUndervisere(Undervisere.ANDRÁS);
        parkour.setUgedage(Ugedage.MANDAG);
        parkour.setDeltagere(new Deltagere(10));
        parkour.setTidspunkt(new Tidspunkt(45, 8.15));

        selvforsvar.setLokale(Lokale.L2);
        selvforsvar.setUndervisere(Undervisere.KARSTEN);
        selvforsvar.setUgedage(Ugedage.TIRSDAG);
        selvforsvar.setDeltagere(new Deltagere(8));

        værkstedsfag.setLokale(Lokale.L3);
        værkstedsfag.setUndervisere(Undervisere.DOUGLAS);
        værkstedsfag.setUgedage(Ugedage.ONSDAG);
        værkstedsfag.setDeltagere(new Deltagere(12));

        keramik.setLokale(Lokale.L4);
        keramik.setUndervisere(Undervisere.ANNA);
        keramik.setUgedage(Ugedage.TORSDAG);
        keramik.setDeltagere(new Deltagere(14));

        metalsløjd.setLokale(Lokale.L5);
        metalsløjd.setUndervisere(Undervisere.BJARNE);
        metalsløjd.setUgedage(Ugedage.FREDAG);
        metalsløjd.setDeltagere(new Deltagere(8));

        fransk.setLokale(Lokale.L6);
        fransk.setUndervisere(Undervisere.BERTIL);
        fransk.setUgedage(Ugedage.MANDAG);
        fransk.setDeltagere(new Deltagere(20));

        kinesisk.setLokale(Lokale.L7);
        kinesisk.setUndervisere(Undervisere.BODIL);
        kinesisk.setUgedage(Ugedage.TIRSDAG);
        kinesisk.setDeltagere(new Deltagere(20));

        knallertkursus.setLokale(Lokale.L8);
        knallertkursus.setUndervisere(Undervisere.HENRIK);


    }


    }


