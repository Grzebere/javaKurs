package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie2;

public abstract class Person {
    String name;
    String address;


    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    public Person() {
        name = null;
        address = null;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return name + " -> " + address;
    }
}
