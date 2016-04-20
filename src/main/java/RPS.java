public class RPS {
  public static void main(String[] args) {
    String layout = "templates/layout.vtl";
  }
  public Boolean playerValue(String playerOne, String playerTwo) {
    if (playerOne.equals("rock") && playerTwo.equals("scissors")){
      return true;
    } else if (playerOne.equals("paper") && playerTwo.equals("rock")){
      return true;
    } else if (playerOne.equals("scissors") && playerTwo.equals("paper")){
      return true;
    } else if (playerTwo.equals("rock") && playerOne.equals("scissors")){
      return true;
    } else if (playerTwo.equals("paper") && playerOne.equals("rock")){
      return true;
    } else if (playerTwo.equals("scissors") && playerOne.equals("paper")){
      return true;
    // } else if (playerTwo.equals(playerOne)){
    //   return true;
    }
    return false;
  }
}
