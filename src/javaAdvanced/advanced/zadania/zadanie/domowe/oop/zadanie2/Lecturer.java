package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie2;

public class Lecturer extends Person {
    String specialization;
    double pay;

    public Lecturer(String specialization, double pay) {
        this.specialization = specialization;
        this.pay = pay;
    }

    public Lecturer(String name, String address, String specialization, double pay) {
        super(name, address);
        this.specialization = specialization;
        this.pay = pay;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }

    public double getPay() {
        return pay;
    }

    public void setPay(double pay) {
        this.pay = pay;
    }

    @Override
    public String toString() {
        return "Lecturer{" +
                "specialization='" + specialization + '\'' +
                ", pay=" + pay +
                ", name='" + name + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
}
