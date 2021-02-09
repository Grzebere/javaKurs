package pl.sda.domowe.obiekty;

public class Main {
    public static void main(String[] args) {
        SalaLekcyjna salaLekcyjna1 = new SalaLekcyjna("Matematyka", 12);
        SalaLekcyjna salaLekcyjna2 = new SalaLekcyjna("Chemia", 16);
        SalaLekcyjna salaLekcyjna3 = new SalaLekcyjna("Biologia", 32);

        salaLekcyjna1.wypiszDaneSali();
        salaLekcyjna2.wypiszDaneSali();
        salaLekcyjna3.wypiszDaneSali();
    }
}
