import java.util.Random;

public class RockPaperScissors {

    public String computerChooses(String cChoice) {


        return cChoice;
    }

    public String humanChooses(String hChoice) {

        return hChoice;
    }

    public String chooseWinner(String human, String computer) {

        String winner = null;

        if((human.equals("rock")&&computer.equals("scissors"))||(human.equals("scissors")&&computer.equals("rock"))){
            winner="Rock";
        }
        else if((human.equals("rock")&&computer.equals("paper"))||(human.equals("paper")&&computer.equals("rock"))){
            winner="Paper";
        }
        else if((human.equals("scissors")&&computer.equals("paper"))||(human.equals("paper")&&computer.equals("scissors"))){
            winner="Scissors";
        }
        else {
            winner="tie";
        }
        return winner;
    }
}
