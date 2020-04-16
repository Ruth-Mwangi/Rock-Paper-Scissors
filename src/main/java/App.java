import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class App {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Rock Paper or Scissors");



        try {
            String input=bufferedReader.readLine();
            RockPaperScissors game=new RockPaperScissors();
            game.humanChooses(input);
            game.computerChooses();

        }
        catch (IOException e){
            e.printStackTrace();
        }
    }
}
