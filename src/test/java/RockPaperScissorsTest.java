import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RockPaperScissorsTest {

    @Test
    public void computerChooses_shouldBeAString_true() throws Exception {
        RockPaperScissors testGame = new RockPaperScissors();
        String computerChoice =  testGame.computerChooses("rock");
        assertEquals(true, computerChoice instanceof String);
    }

    @Test
    public void humanChooses_shouldBeAString_true() throws Exception{
        RockPaperScissors testGame= new RockPaperScissors();
        String humanChoice=testGame.humanChooses("rock");
        assertEquals(true,humanChoice instanceof String);
    }

    @Test
    public void chooseWinner_forRockAndScissors_Rock()throws Exception{
        RockPaperScissors testGame=new RockPaperScissors();
        String expectedValue="Rock";
        assertEquals(expectedValue,testGame.chooseWinner("rock","scissors"));
    }

}