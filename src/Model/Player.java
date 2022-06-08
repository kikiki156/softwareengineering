package Model;

import Controller.card;
import Controller.gameMap;
import Controller.player;
import java.util.Random;

import java.util.Random;

public class Player implements card, player, gameMap {
    Random random = new Random();
    private int score = 0;
    private int bridgeCard = 0;
    private int movement = 0;
    @Override
    public void getBridgeCard() {
        this.bridgeCard += 1;
    }

    @Override
    public void rest() {
        this.bridgeCard -= 1;
        this.movement = 0;
    }

    @Override
    public void getScore(int score) {
        this.score += score;
    }

    @Override
    public void rollAndRun() {
        this.movement += random.nextInt(5) + 1 - this.bridgeCard;
    }

}
