package pl.sda.domowe.poziomytrudnosci;

public class GameLevel {
    String name;
    int noOfMonsters;
    GameDifficulty gameDifficulty;
    int levelLeanght;
    int timeLimit;
    int pointsForComplition;

    public GameLevel(String name, int noOfMonsters, GameDifficulty gameDifficulty, int levelLeanght, int timeLimit, int pointsForComplition) {
        setName(name);
        setGameDifficulty(gameDifficulty);
        setLevelLeanght(levelLeanght);
        setNoOfMonsters(noOfMonsters);
        setTimeLimit(timeLimit);
        setPointsForComplition(pointsForComplition);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLevelLeanght() {
        return levelLeanght;
    }

    public void setLevelLeanght(int levelLeanght) {
        this.levelLeanght = levelLeanght;
    }

    public int getNoOfMonsters() {
        return noOfMonsters;
    }

    public void setNoOfMonsters(int noOfMonsters) {
        this.noOfMonsters = noOfMonsters;
    }

    public int getPointsForComplition() {
        return pointsForComplition;
    }

    public void setPointsForComplition(int pointsForComplition) {
        this.pointsForComplition = pointsForComplition;
    }

    public int getTimeLimit() {
        return timeLimit;
    }

    public void setTimeLimit(int timeLimit) {
        this.timeLimit = timeLimit;
    }

    public GameDifficulty getGameDifficulty() {
        return gameDifficulty;
    }

    public void setGameDifficulty(GameDifficulty gameDifficulty) {
        this.gameDifficulty = gameDifficulty;
    }
}
