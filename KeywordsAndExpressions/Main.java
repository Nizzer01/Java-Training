package KeywordsAndExpressions;

public class Main {
    public static void main(String[] args) {
        //miles to km
        double kilometers = (100 * 1.609344);

        int highScore = 50;
        if (highScore > 25) {
           highScore = 100 + highScore; //add bonus points
        }

        int health = 100;
        if ((health < 25) && (highScore > 1000)) {
            highScore = highScore - 1000;
        }

       // boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

        if (score < 5000 && score > 1000) {
            System.out.println("Your score was less than 5000 but greater than 1000");
        } else if (score < 1000) {
            System.out.println("Your score was less than 1000");
        } else {
            System.out.println("Got here");
        }

    }
}
