package javaAdvanced.advanced.zadania.zadanie1;

public class Cabriolet extends Car {
    private boolean roofHidden;

    public Cabriolet(String colour, String brand, int productionYear) {
        super(colour, brand, productionYear);
    }

    @Override
    public void accelerate() {
        if (this.speed + 10 < 180) {
            this.speed += 10;
        } else {
            System.out.println("Too fast. Can't accelerate more.");
        }
    }

    public void hideRoof() {
        roofHidden = true;
    }

    protected boolean isRoofHidden() {
        if (roofHidden) {
            System.out.println("The roof is hidden");
        } else {
            System.out.println("The roof is extended");
        }
        return roofHidden;
    }

    @Override
    public String toString(){
        return super.toString() + " with the extended roof";
    }
}
