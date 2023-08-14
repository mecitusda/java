package Example;

import java.io.Serializable;

public class Kart implements Serializable {
    private char pick;
    private boolean guess=false;
    public Kart(char pick) {
        this.pick = pick;
        this.guess = guess;
    }

    public char getPick() {
        return pick;
    }

    public void setPick(char pick) {
        this.pick = pick;
    }

    public boolean isGuess() {
        return guess;
    }

    public void setGuess(boolean guess) {
        this.guess = guess;
    }

    public boolean check(Kart kart1) {
        String a = String.valueOf(kart1.getPick());
        String b = String.valueOf(this.getPick());
        if (a.equals(b)) {
            return
                    true;

        } else {
            return false;


        }}
    }