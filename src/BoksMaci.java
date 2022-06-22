public class BoksMaci {
    public static void main(String[] args) {


        Fighter Nadal = new Fighter("Nadal", 15, 100, 90, 17);
        Fighter Federer = new Fighter("Federer", 10, 95, 100, 23);

        Ring r = new Ring(Nadal,Federer , 90 , 100);
        r.run();



    }
}
