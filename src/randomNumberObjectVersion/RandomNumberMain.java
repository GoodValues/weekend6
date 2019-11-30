package randomNumberObjectVersion;

import randomNumber.Game;

public class RandomNumberMain {
    public static void main(String[] args) {
        Game game=new Game();
        game.play();
        game.computerGuess();
    }
}
