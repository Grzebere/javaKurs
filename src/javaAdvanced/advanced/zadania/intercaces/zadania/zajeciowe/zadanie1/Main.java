package javaAdvanced.advanced.zadania.intercaces.zadania.zajeciowe.zadanie1;

public class Main {
    public static void main(String[] args) {

        Drum drum = new Drum();
        Guitar guitar = new Guitar();
        Piano piano = new Piano();
        Instumental[] instumentals = new Instumental[]{drum, guitar, piano};
        instumentals[0].play();
        instumentals[1].play();
        instumentals[2].play();
    }


}
