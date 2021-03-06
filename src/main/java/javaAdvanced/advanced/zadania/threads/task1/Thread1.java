package javaAdvanced.advanced.zadania.threads.task1;

public class Thread1 implements Runnable{
    @Override
    public void run() {
        for ( int i=1000; i <= 2000; i++ ){
            if (i%2==0) {
                System.out.println(i);
            }
        }
    }
}
