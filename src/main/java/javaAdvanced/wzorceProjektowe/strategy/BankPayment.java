package javaAdvanced.wzorceProjektowe.strategy;

public class BankPayment implements Payment{
    @Override
    public void oplac(double cena) {
        System.out.println("Oplacone przed system bankowy: " +cena);
    }
}