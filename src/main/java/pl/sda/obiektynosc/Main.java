package pl.sda.obiektynosc;

public class Main {
    public static void main(String[] args) {
        Osoba[] osoby = new Osoba[3];
        osoby[0] = new Osoba("Marek", 1950, 'm');
        osoby[1] = new Osoba("Ania", 1955, 'f');
        osoby[2] = new Osoba("Jurek", 1959, 'm');
        System.out.println("Panie:");
        for (int i=0; i< osoby.length; i++){
            if(osoby[i].plec == 'f') {
                osoby[i].przedstawSie();
            }
        }
        System.out.println("Panowie:");
        for (int i=0; i< osoby.length; i++){
            if(osoby[i].plec == 'm') {
                osoby[i].przedstawSie();
            }
        }

    }

}
