package thom9521;

public class Main {
    public static void main(String[] args) {

        Ungdomsskole kursus = new Ungdomsskole();

        Elever elev1 = new Elever("Thomas", "Christensen", 1234456778);
        elev1.parkourKursus();
        elev1.keramikKursus();

    }
}
