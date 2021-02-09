package pl.sda.obiekty.zuper;

public class Superhero {
    private String name, superpower;

    public Superhero(String name, String superpower) {
        this.name = name;
        this.superpower = superpower;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSuperpower() {
        return superpower;
    }

    public void setSuperpower(String superpower) {
        this.superpower = superpower;
    }

    public void speak() {
        System.out.println("I'm " + this.name + " and my power is " + this.superpower);
    }

}
