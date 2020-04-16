import java.util.Random;

public class RockPaperScissors {

    public String computerChooses() {
        String[] choice={"rock","paper","scissors"};
        Random myRandomGenerator=new Random();

        int random=myRandomGenerator.nextInt(3);
        return choice[random];
    }

    public String humanChooses(String hChoise) {

        hChoise="rock";
        return hChoise;
    }

    public String chooseWinner(String rock, String scissors) {

        String winner = null;

        if(rock.equals("rock")&&scissors.equals("scissors")){
            winner="Rock";
        }
        return winner;
    }
}
