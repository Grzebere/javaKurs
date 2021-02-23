package pl.sda.obiekty.zuper;

public class Main {
    public static void main(String[] args) {
        Superhero superhero1 = new Superhero("Mossman", "Moss control");
        Superhero superhero2 = new Superhero("Coralwoman", "Coral control");
        Superhero superhero3 = new Superhero("Dentman", "Power to make dents");
        superhero1.speak();
        superhero2.speak();
        superhero3.speak();

        superhero1 = superhero2;
        System.out.println(superhero1.equals(superhero2));
        System.out.println(superhero1 == superhero2);
        superhero1 = null;
        System.out.println(superhero2 == null);
        System.out.println(superhero1 == superhero2);
        System.out.println(superhero1.equals(superhero2));


    }
}
