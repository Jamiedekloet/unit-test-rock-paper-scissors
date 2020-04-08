package domain;

import domain.rules.RockPaperScissors;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class RockPaperScissorsTest {
    @Test
    @DisplayName("Rock crushes scissors")
    void rockCrushesScissors() {
        Rules game = new RockPaperScissors();
        Result result = game.decide(Move.ROCK, Move.SCISSORS);

        assertEquals(Result.WIN, result);
    }

    @Test
    @DisplayName("Scissors cuts paper")
    void scissorsCutsPaper() {
        Rules game = new RockPaperScissors();
        Result result = game.decide(Move.SCISSORS, Move.PAPER);

        assertEquals(Result.WIN, result);
    }

    @Test
    @DisplayName("Paper covers rock")
    void paperCoversRock() {
        Rules game = new RockPaperScissors();
        Result result = game.decide(Move.PAPER, Move.ROCK);

        assertEquals(Result.WIN, result);
    }
}
