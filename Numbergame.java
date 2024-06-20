import java.io.*;
import java.util.Random;

class Numbergame{
    public static void main (String args[]) throws IOException{
        DataInputStream dis = new DataInputStream(System.in);
        boolean playAgain = true;
        
        while (playAgain){
            Random rand = new Random();
            int answer = rand.nextInt(100) + 1;

            while(true){
                System.out.println("Guess a number between 1 and 100 ");
                int guess = Integer.parseInt(dis.readLine());  

                if (guess == answer){
                    System.out.println(guess+" is the correct answer! You win!");
                    break;
                }else if(answer>guess){
                    System.out.println("Too low... Guess again!");
                }else{
                    System.out.println("Too high... Guess again!");
                }
            }
                System.out.print("Do you want to play again? (yes/no): ");
                String play = dis.readLine().trim().toLowerCase();
                if (play.equals("yes")) {
                    break;
                } else if (play.equals("no")) {
                    playAgain = false;
                    break; 
                }
        }
        System.out.println("Thank you for playing!");
    }
}
