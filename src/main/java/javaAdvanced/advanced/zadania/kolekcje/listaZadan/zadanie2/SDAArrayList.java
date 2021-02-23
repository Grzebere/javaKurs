package javaAdvanced.advanced.zadania.kolekcje.listaZadan.zadanie2;

import java.util.Arrays;

public class SDAArrayList<T> {

    T[] elemnts;
    int size;

    public SDAArrayList() {
        this.elemnts = (T[]) new Object[10];
    }

    public SDAArrayList(int initializeSize) {
        this.elemnts = (T[]) new Object[initializeSize];
    }

    public boolean add(T eleemntToAdd) {
        if (elemnts.length == size) {
            doubleCapacity();
        }
        elemnts[size++] = eleemntToAdd;
        return true;

    }

    private void doubleCapacity() {
        elemnts = Arrays.copyOf(this.elemnts, this.elemnts.length * 2);
    }

    public T remove(int index) {
        T toBeRemoved = elemnts[index];
        for ( int i = index; i < size - 1; i++ ) {
            elemnts[i] = elemnts[i + 1];
        }
        size--;
        return toBeRemoved;

    }

    public T get(int index) {
        return elemnts[index];

    }

    public void display() {
        for ( T element : elemnts
        ) {
            element.toString();

        }

    }
}
