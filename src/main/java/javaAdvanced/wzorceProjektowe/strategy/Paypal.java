package javaAdvanced.wzorceProjektowe.strategy;

public class Paypal implements Payment{
    @Override
    public void oplac(double cena) {
        System.out.println("Oplacone przez portal paylpal: " + cena);
    }
}