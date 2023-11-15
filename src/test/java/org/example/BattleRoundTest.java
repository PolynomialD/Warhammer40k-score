package org.example;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BattleRoundTest {

    @Test
    void primary_score_starts_at_zero() {
        BattleRound battleRound = new BattleRound(1);

        assertEquals(0, battleRound.getPrimaryScore());
    }

    @Test
    void addToPrimaryScore_increases_primary_score() {
        BattleRound battleRound = new BattleRound(1);
        battleRound.addToPrimaryScore(2);
        battleRound.addToPrimaryScore(3);

        assertEquals(5, battleRound.getPrimaryScore());
    }
}