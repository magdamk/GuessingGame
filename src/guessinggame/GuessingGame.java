package guessinggame;
import java.io.*; 
/**
 *
 * @author mmroziuk
 */
public class GuessingGame {

    public static void main(String[] args)throws Exception 
    {
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);
        int computerNumber = (int)(Math.random()*100 + 1);
        int userAnswer = 0;
        int attemptCount = 1;
       // System.out.println("The correct guess would be " + computerNumber);
        System.out.println("What's your name?");
        String name = "";
        name = br.readLine();
        System.out.println("Hello " + name + "!");
        System.out.println("Guess the number I'm thinking of, not smaller than 1, not bigger than 100");
        while (userAnswer != computerNumber){
           userAnswer = Integer.parseInt(br.readLine()) ;
           System.out.println("You guessed: " + userAnswer + " " + determineGuess(userAnswer,computerNumber,attemptCount));
           attemptCount++;
        }
        br.close();
        r.close();
    }
    
    public static String determineGuess (int userAnswer, int computerNumber, int attemptCount) {
        if (userAnswer <=0 || userAnswer > 100){
            return "Invalid guess";
        }
        else if (userAnswer == computerNumber){
            return "Correct!\nTotal Guesses: " + attemptCount;
        }
        else if (userAnswer > computerNumber){
            return "Your guess is too high, try again.\nTry number: " + attemptCount;
        }
        else if (userAnswer < computerNumber){
            return "Your guess is too low, try again.\nTry number: " + attemptCount;
        }
        else {
            return "Your guess is incorrect, try again.\nTry number: " + attemptCount;
        }
        
    }
}
