import org.junit.*;
import static org.junit.Assert.*;

public class RPSTest {

  @Test
  public void playerValue_rockBeatsScissors_playerOne_1() {
    RPS testGame = new RPS();
    assertEquals(true, testGame.playerValue("rock", "scissors"));
  }

  @Test
  public void playerValue_rockBeatsPaper_playerOne_1() {
    RPS testGame = new RPS();
    assertEquals(true, testGame.playerValue("paper", "rock"));
  }
  @Test
  public void playerValue_paperBeatsScissors_playerOne_1() {
    RPS testGame = new RPS();
    assertEquals(true, testGame.playerValue("scissors", "paper"));
  }

  @Test
  public void playerValue_rockBeatsScissors_playerTwo_2() {
    RPS testGame = new RPS();
    assertEquals(true, testGame.playerValue("rock", "scissors"));
  }

  @Test
  public void playerValue_paperBeatsrock_playerTwo_2() {
    RPS testGame = new RPS();
    assertEquals(true, testGame.playerValue("paper", "rock"));
  }
  @Test
  public void playerValue_scissorsBeatspaper_playerTwo_2() {
    RPS testGame = new RPS();
    assertEquals(true, testGame.playerValue("scissors", "paper"));
  }
}
