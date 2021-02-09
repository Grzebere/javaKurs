package pl.sda.domowe.jeden;

//    6. Zadeklaruj dwie zmienne - 'waga' oraz 'wzrost'. Przypisz do nich jakieś wartości.
//    Stwórz instrukcję warunkową ('if') który sprawdza czy osoba (np. taka która na
//    kolejkę/rollercoaster) jest wyższa niż 150 cm wzrostu i nie przekracza wagą 180 kg.
public class Szesc {
    public static void main(String[] args) {
        //Rozwiązanie dokładne do zadanego

        /*int waga= 55, wzrost = 160;
        if (wzrost> 160 || waga >180){
            System.out.println("Nie możesz wejść");
        }
        else {
            System.out.println("Zaprazamy");
        }*/

        // Wersja bardziej rozbudowana
        int waga = 55, wzrost = 160;
        if (wzrost < 150 && waga > 180) {
            System.out.println("Jesteś za niski/a i za cieżki/a,  nie możesz wejść");
        } else if (wzrost < 150) {
            System.out.println("Jesteś za niski/a,  nie możesz wejść");
        } else if (waga > 160) {
            System.out.println("Jesteś za cieżki/a,  nie możesz wejść");
        } else {
            System.out.println("Zapraszamy");


        }
    }
}
