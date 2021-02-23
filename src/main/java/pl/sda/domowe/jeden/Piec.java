package pl.sda.domowe.jeden;
/*Zadanie 5.1
Zadanie wraz ze sprawdzeniem
 */

public class Piec {
    public static void main(String[] args) {
        boolean jest_ciepło = false, wieje_wiatr = true, swieci_slonce = false;
        boolean ubieram_sie_cieplo = false, biore_parasol = false, ubieram_kurtke = false;
        if (!jest_ciepło || wieje_wiatr) {
            ubieram_sie_cieplo = true;
        }
        if (!swieci_slonce && !wieje_wiatr) {
            biore_parasol = true;
        }
        if (wieje_wiatr && !swieci_slonce && !jest_ciepło) {
            ubieram_kurtke = true;
        }
        System.out.println(ubieram_sie_cieplo);
        System.out.println(biore_parasol);
        System.out.println(ubieram_kurtke);
    }
}
