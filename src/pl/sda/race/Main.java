package pl.sda.race;

public class Main {
    public static void main(String[] args) {
        Contestant[] contestants = new Contestant[3];
        boolean end = false;

        contestants[0] = new Contestant("Ulf", 14, 12, 18);
        contestants[1] = new Contestant("Olaf", 4, 15, 20);
        contestants[2] = new Contestant("Dan", 18, 10, 22);
        for ( int i = 0; i < contestants.length; i++ ) {
            contestants[i].itroduceYourself();
        }
        System.out.println("START!!!");
        while (true) {
            for ( int i = 0; i < contestants.length; i++ ) {
                contestants[i].runForHour();
                contestants[i].distanceSoFar();

            }
            for ( int i = 0; i < contestants.length; i++ ) {
                if (contestants[i].distanceTraveled >= 50) {
                    end = true;
                    System.out.println("The winner is:" + contestants[i].name);
                }
            }
            if (end == true) {
                break;
            }

        }


    }
}
