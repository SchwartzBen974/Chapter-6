package ProgramTwelve;

import java.util.Random;

public class Coin {
    
    private String sideUp;
    private Random Randomizer = new Random();
    private int flipSide;

    public Coin() {
        sideUp = (flipSide == 0) ? "Heads" : "Tails";
    }

    public void toss() {
        flipSide = Randomizer.nextInt(1);
    }

    public String getSideUp() {
        return sideUp;
    }
}