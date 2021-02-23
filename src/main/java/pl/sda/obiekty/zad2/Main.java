package pl.sda.obiekty.zad2;

public class Main {
    public static void main(String[] args) {
        KonaoBankowe konaoBankowe1 = new KonaoBankowe(123L, 1000);
        KonaoBankowe konaoBankowe2 = new KonaoBankowe(555L, 2000);

        konaoBankowe1.displayAccountBalance();
        konaoBankowe2.displayAccountBalance();

        konaoBankowe1.sendMoney(konaoBankowe1, konaoBankowe2, 25);

        konaoBankowe1.displayAccountBalance();
        konaoBankowe2.displayAccountBalance();



    }
}
