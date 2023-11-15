package org.example;

public class BattleRound {

    private final int roundNumber;
    private int secondaryScore;
    private int primaryScore;

    public BattleRound(int roundNumber) {
        this.roundNumber = roundNumber;
        this.primaryScore = 0;
        this.secondaryScore = 0;
    }

    public int getRoundNumber() {
        return roundNumber;
    }

    public int getPrimaryScore() {
        return primaryScore;
    }

    public int getSecondaryScore() {
        return secondaryScore;
    }

    public void addToPrimaryScore(int points) {
        primaryScore += points;
    }

    public void addToSecondaryScore(int points) {
        secondaryScore += points;
    }

}
