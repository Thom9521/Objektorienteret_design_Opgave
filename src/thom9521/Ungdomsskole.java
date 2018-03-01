package thom9521;

public class Ungdomsskole {

private Kursus[] kursus = new Kursus[20];

public Ungdomsskole(){

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

}

}
