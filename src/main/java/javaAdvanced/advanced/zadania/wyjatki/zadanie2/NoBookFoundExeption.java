package javaAdvanced.advanced.zadania.wyjatki.zadanie2;

public class NoBookFoundExeption extends RuntimeException {
    public NoBookFoundExeption(String message) {
        super(message);
    }
}
