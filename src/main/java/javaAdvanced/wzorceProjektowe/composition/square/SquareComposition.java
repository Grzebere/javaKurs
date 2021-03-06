package javaAdvanced.wzorceProjektowe.composition.square;

import java.util.ArrayList;
import java.util.List;

public class SquareComposition implements Square {
    List<Square> squares = new ArrayList<>();

    public SquareComposition(List<Square> squares) {
        this.squares = squares;
    }

    @Override
    public void draw() {
        for ( Square sq : squares
        ) {
            sq.draw();

        }
    }
}
