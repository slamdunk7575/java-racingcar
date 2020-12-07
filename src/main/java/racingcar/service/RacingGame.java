package racingcar.service;

import racingcar.domain.MoveRule;
import racingcar.domain.RacingCars;
import racingcar.domain.RacingRound;
import racingcar.domain.RacingRule;

import java.util.ArrayList;
import java.util.List;

public class RacingGame {

    private int countOfRound;
    private RacingCars racingCars;
    private List<RacingRound> racingRounds = new ArrayList<>();

    public RacingGame(int countOfCar, int countOfRound) {
        this.racingCars = new RacingCars(countOfCar);
        this.countOfRound = countOfRound;
    }

    public List<RacingRound> start() {
        for (int i = 0; i < countOfRound; i++) {
            racingRounds.add(racingCars.racing(adjustRule()));
        }
        return racingRounds;
    }

    public List<RacingRound> getRacingResult() {
        return this.racingRounds;
    }

    public MoveRule adjustRule() {
        return new RacingRule();
    }

}
