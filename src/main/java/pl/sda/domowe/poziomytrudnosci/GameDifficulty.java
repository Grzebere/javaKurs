package pl.sda.domowe.poziomytrudnosci;

public enum GameDifficulty {
    LOW(1),
    SEMI_MEDIUM(2),
    MEDIUM(3),
    SEMI_PRO(4),
    PRO(5),
    ADVANCED(6),
    CHUCK_NORRIS(69);

    private int difficultyLevel;

    GameDifficulty (int difficultyLevel){
        this.difficultyLevel = difficultyLevel;
    }

}
