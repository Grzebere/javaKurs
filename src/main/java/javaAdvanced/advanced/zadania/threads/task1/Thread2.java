package javaAdvanced.advanced.zadania.threads.task1;

public class Thread2 implements Runnable{
    @Override
    public void run() {
        for ( int i=14300; i <= 17800; i++ ){
            if (i%2==0) {
                System.out.println(i);
            }
        }

    }
}
