package GuessGame;

import java.util.Random;
import java.util.Scanner;

public class Guess {

    public static void Adivinhar(){

        Scanner sc = new Scanner(System.in);
        Random rm = new Random();

        int secretNumber = 1 + rm.nextInt(10);
        int lives = 5;

        while(lives > 0){

            System.out.println("Tente adivinhar o número entre 1 e 10(Vidas restantes "+ lives +"): ");
            int guess = sc.nextInt();

            if(guess < secretNumber){
                System.out.println("O número secreto é maior que: "+guess);
            } else if (guess > secretNumber) {
                System.out.println("O número secreto é menor que: "+guess);
            } else {
                System.out.println("Parabéns! Você acertou. O número secreto era: "+secretNumber);
                break;
            }
        lives--;
        }
        if(lives == 0) {
            System.out.println("GameOver!");
        }
    }
}
