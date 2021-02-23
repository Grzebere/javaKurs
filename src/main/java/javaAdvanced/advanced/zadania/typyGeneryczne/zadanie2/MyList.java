package javaAdvanced.advanced.zadania.typyGeneryczne.zadanie2;

import java.util.Arrays;

public class MyList<E> {
    protected int n;
    E[] list;


    public MyList(int n) {
        this.n = n;
        this.list = (E[]) new Object[n];

    }

    public boolean includes(E element) {
        for ( E e : list ) {
            if (e.equals(element)) {
                return true;
            }
        }
        return false;
    }

    public int size() {
        int count = 0;
        for ( E elements : list ) {
            if (!elements.equals(null)) {
                count++;
            }
        }
        return count;
    }

    public boolean addElement(E element) {
        for ( int i = 0; i < list.length; i++ ) {
            if (list[i]==(null)) {
                list[i] = element;
                return true;
            }
        }
        return false;
    }


    @Override
    public String toString() {
        return Arrays.toString(list);
    }
}
