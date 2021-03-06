package javaAdvanced.wzorceProjektowe.chainOfResponsibility;

public class ChainOfResponsibilityUzycie {
    public static void main(String[] args) {
        MagazynPolska magazynPolska = new MagazynPolska();
        boolean czyProduktJestDostepny = magazynPolska.sprawdzDostępnośćProduktu(Produkt.TABLET);
        if (czyProduktJestDostepny) {
            System.out.println("Drogi kliencie produkt jest dostepny, zapraszamy do zamówienia.");
        } else {
            System.out.println("Przepraszamy drogi kliencie produkt jest niedostepny");
        }
    }
}