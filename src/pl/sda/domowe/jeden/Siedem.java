package pl.sda.domowe.jeden;

/*7. Rozwinięcie poprzedniego zadania:
        a. Dopisz do poprzedniej aplikacji dodatkową zmienną - wiek. Jeśli osoba jest
        młodsza niż 10 lat, lub starsza niż 80, to nie może wejść na kolejkę.
        b. Dopisz/zmień do/w poprzedniej aplikacji - osoba może wejść na kolejkę jeśli
        jej wzrost jest od 150 do 220 cm wzrostu.
        c. Dopisz deskryptywne wyjasnienia.
        i. Jesli osoba nie moze wejsc na kolejke, to wypisz na konsole
        odpowiedni komunikat dlaczego. np. “Nie możesz wejść na
        kolejkę ponieważ jesteś zbyt ciężki/a”
        ii. Jesli osoba nie moze wejsc z powodu wagi, to powinien sie wypisac
        komunikat ze nie moze wejsc bo przekracza limit wagowy
        iii. Jesli osoba nie moze wejsc z powodu wieku, to powinien sie wypisac
        INNY komunikat o tym ze nie moze wejsc z powodu wieku.*/
public class Siedem {
    public static void main(String[] args) {
        int waga = 55, wzrost = 160, wiek = 92;
        if (wzrost > 220) {
            System.out.println("Nie możesz wejść na kolejkę ponieważ jesteś za wysoki/a");
        } else if (wzrost < 150) {
            System.out.println("Nie możesz wejść na kolejkę ponieważ jesteś za niski/a");
        } else if (waga > 160) {
            System.out.println("Nie możesz wejść na kolejkę bo przekracza limit wagowy");
        } else if (wiek < 10 || wiek > 80) {
            System.out.println("Nie możesz wejść na kolejkę poniważ nie spełniasz wymagań wiekowych");
        } else {
            System.out.println("Zapraszamy");

        }
    }
}
