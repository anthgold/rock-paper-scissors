import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {

  @Test
  public void playerValue_rockBeatsScissors_playerOne_1() {
    RPS testGame = new RPS();
    assertEquals((Integer)1, testGame.playerValue("rock", "scissors"));
  }

  @Test
  public void playerValue_rockBeatsPaper_playerOne_1() {
    RPS testGame = new RPS();
    assertEquals((Integer)1, testGame.playerValue("paper", "rock"));
  }
  @Test
  public void playerValue_paperBeatsScissors_playerOne_1() {
    RPS testGame = new RPS();
    assertEquals((Integer)1, testGame.playerValue("scissors", "paper"));
  }

  @Test
  public void playerValue_rockBeatsScissors_playerTwo_2() {
    RPS testGame = new RPS();
    assertEquals((Integer)2, testGame.playerValue("scissors", "rock"));
  }

  @Test
  public void playerValue_paperBeatsRock_playerTwo_2() {
    RPS testGame = new RPS();
    assertEquals((Integer)2, testGame.playerValue("rock", "paper"));
  }

  @Test
  public void playerValue_scissorsBeatsPaper_playerTwo_2() {
    RPS testGame = new RPS();
    assertEquals((Integer)2, testGame.playerValue("paper", "scissors"));
  }

  @Test
  public void playerValue_draw_3(){
    RPS testGame = new RPS();
    assertEquals((Integer)3, testGame.playerValue("scissors", "scissors"));
    assertEquals((Integer)3, testGame.playerValue("paper", "paper"));
    assertEquals((Integer)3, testGame.playerValue("rock", "rock"));
  }
}
