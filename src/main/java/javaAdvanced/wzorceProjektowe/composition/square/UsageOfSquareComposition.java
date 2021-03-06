package javaAdvanced.wzorceProjektowe.composition.square;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class UsageOfSquareComposition {
    public static void main(String[] args) {
        List<Square> squares = new ArrayList();
        Square redSquare = new RedSquare();
        Square redSquare2 = new RedSquare();
        Square greenSquare = new GreenSquare();
        Square greenSquare2 = new GreenSquare();

        SquareComposition redSquareComposition = new SquareComposition(Arrays.asList(redSquare, redSquare2));
        SquareComposition greenSquareComposition = new SquareComposition(Arrays.asList(greenSquare, greenSquare2));
        SquareComposition SquareComposition = new SquareComposition(Arrays.<Square>asList(redSquareComposition, greenSquareComposition));

    }
}
