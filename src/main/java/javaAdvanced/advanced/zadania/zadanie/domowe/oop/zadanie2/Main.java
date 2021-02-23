package javaAdvanced.advanced.zadania.zadanie.domowe.oop.zadanie2;

public class Main {
    public static void main(String[] args) {
        Student student = new Student("Oobleg", "Moss 2", "Eavnings", 2020, 50000);
        Lecturer lecturer = new Lecturer("Galavant", "Castle 23", "Slaying", 50000 );
        System.out.println(student.toString());
        System.out.println(lecturer.toString());

    }
}
