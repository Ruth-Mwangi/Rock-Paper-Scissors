import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Rock Paper or Scissors");



        try {
            String[] choices={"rock","paper","scissors"};
            Random myRandomGenerator=new Random();
            int random=myRandomGenerator.nextInt(3);
            String cChoice=choices[random];
            System.out.println(cChoice);

            String hChoice=bufferedReader.readLine();
            System.out.println(hChoice);
            RockPaperScissors game=new RockPaperScissors();
            game.humanChooses(hChoice);
            game.computerChooses(cChoice);
            String winner=game.chooseWinner(hChoice,cChoice);
            System.out.println("Winner is : " + winner);

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
