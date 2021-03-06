package javaAdvanced.wzorceProjektowe.fabryka.zadanie.restauracje;

public class RestauracjaFactory {
    public static Restauracje wybierzRestauracje(TypRestauracji typRestauracji){
        switch(typRestauracji){
            case MC_DONALD:
                return new McDonald();
            case KFC:
                return new Kfc();
            case SUBWAY:
                return new Subway();
            default:
                System.out.println("Dana restauracja nie istnieje.");
                throw new RuntimeException();
        }
    }
}
