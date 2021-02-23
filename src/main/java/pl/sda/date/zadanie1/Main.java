package pl.sda.date.zadanie1;

import java.time.LocalDate;
import java.util.Random;
import java.util.Scanner;

/*Napisz aplikację która po odpowiedzi użytkownika na pytania:
1) Podaj datę urodzenia w formacie: yyyy-MM-dd":
2) Kobieta, czy mężczyzna (k/m) - mężczyźni żyją średnio o 10 lat krócej
3) Czy palisz papierosy? y/n (palący żyją średnio 9 lat i 3 miesiące krócej)
4) Czy żyjesz w stresie? (jeśli tak, istnieje 10% prawdopodobieństwo, że umrzesz na zawał serca w wieku 60 lat)
​
​
Wskazówka dot. ‘prawdopodobieństwa’:
​
Random generator = new Random();
int losowaLiczba = generator.nextInt(100);
if (losowaLiczba < 10) {
// 10 %
}
​
...poda użytkownikowi przybliżoną datę śmierci. Załóż, że "startowa" długość życia to 100 lat. Aplikacja ma podawać datę z dokładnością do miesiąca. Możesz dodać dodatkowe warunki. Możesz użyc klasy java.time.Period
​
*/
public class Main {
    public static void main(String[] args) {
        System.out.println(howLongDoIHave(getBirtday(), getSex(), isSmoking(), isStressed()));


    }

    public static LocalDate getBirtday() {
        System.out.println("When is yours birthday (yyyy-MM-dd)");
        Scanner scanner = new Scanner(System.in);
        return LocalDate.parse(scanner.nextLine());
    }

    public static char getSex() {
        System.out.println("Whats your sex? (f/m)");
        Scanner scanner = new Scanner(System.in);
        char sex = scanner.next().charAt(0);
        scanner.nextLine();
        return sex;
    }

    public static boolean isSmoking() {
        System.out.println("Are you smoking?");
        Scanner scanner = new Scanner(System.in);
        char smokingChar = scanner.next().charAt(0);
        boolean smoking = false;
        if (smokingChar == 'y') {
            smoking = true;
        } else if (smokingChar == 'n') {
            smoking = false;
        }
        scanner.nextLine();
        return smoking;
    }

    public static boolean isStressed() {
        System.out.println("Are you stressed?");
        Scanner scanner = new Scanner(System.in);
        char stressedChar = scanner.next().charAt(0);
        boolean stressed = false;
        if (stressedChar == 'y') {
            stressed = true;
        } else if (stressedChar == 'n') {
            stressed = false;
        }
        scanner.nextLine();
        return stressed;
    }

    public static LocalDate howLongDoIHave(LocalDate birthday, char sex, boolean smoking, boolean stressed) {
        LocalDate timeOfDeath = birthday.plusYears(100);
        if (sex == 'm') {
            timeOfDeath = timeOfDeath.minusYears(10);
        }
        if (smoking == true) {
            timeOfDeath = timeOfDeath.minusYears(9).minusMonths(3);
        }
        if (stressed == true) {
            Random generator = new Random();
            int losowaLiczba = generator.nextInt(100);
            if (losowaLiczba < 10) {
                timeOfDeath = birthday.plusYears(60);
            }
        }

        return timeOfDeath;

    }


}
