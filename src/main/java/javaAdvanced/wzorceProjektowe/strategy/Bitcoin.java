package javaAdvanced.wzorceProjektowe.strategy;

public class Bitcoin implements Payment{
    @Override
    public void oplac(double cena) {
        System.out.println("Oplacone przez Bitcoin: " + cena);
    }
}