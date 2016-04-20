public class RPS {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
  }
  public Integer playerValue(String playerOne, String playerTwo) {
      Integer result = 0;
      Integer winnerPlayer1 = 1;
      Integer winnerPlayer2 = 2;
      Integer draw = 3;

    if (playerOne.equals(playerTwo)){
      result = draw;
    } else if (playerOne.equals("rock") && playerTwo.equals("scissors")) {
      result = winnerPlayer1;
    } else if (playerOne.equals("paper") && playerTwo.equals("rock")) {
      result = winnerPlayer1;
    } else if (playerOne.equals("scissors") && playerTwo.equals("paper")) {
      result = winnerPlayer1;
    } else if (playerTwo.equals("rock") && playerOne.equals("scissors")) {
      result = winnerPlayer2;
    } else if (playerTwo.equals("paper") && playerOne.equals("rock")) {
      result = winnerPlayer2;
    } else if (playerTwo.equals("scissors") && playerOne.equals("paper")) {
      result = winnerPlayer2;
    }
    return result;
  }
}
