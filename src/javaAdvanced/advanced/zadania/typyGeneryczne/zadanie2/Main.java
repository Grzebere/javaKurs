package javaAdvanced.advanced.zadania.typyGeneryczne.zadanie2;

public class Main {
    public static void main(String[] args) {
        MyList<String> list = new MyList(10);
        list.addElement("45");
        list.addElement("25");
        list.addElement("45");
        list.addElement("115");

        System.out.println(list.toString());
    }
}
