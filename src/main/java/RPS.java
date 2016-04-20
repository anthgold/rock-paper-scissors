import java.util.Map;
import java.util.HashMap;
import spark.ModelAndView;
import spark.template.velocity.VelocityTemplateEngine;
import static spark.Spark.*;

public class RPS {
  public static void main(String[] args) {
    staticFileLocation("/public");
    String layout = "templates/layout.vtl";

    get("/", (request, response) -> {
      HashMap model = new HashMap();
      model.put("template", "templates/home.vtl");
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());

    get("/result", (request, response) -> {
      Map<String, Object> model = new HashMap<String, Object>();
      model.put("template", "templates/result.vtl");

      String playerOne = request.queryParams("playerOneSelect");
      String playerTwo = request.queryParams("playerTwoSelect");
      Integer playerValue = playerValue(playerOne, playerTwo);

      model.put("result", playerValue);
      model.put("playerOneInput", request.queryParams("playerOneSelect"));
      model.put("playerOneInput", request.queryParams("playerTwoSelect"));
      return new ModelAndView(model, layout);
    }, new VelocityTemplateEngine());
  }


  public static Integer playerValue(String playerOne, String playerTwo) {
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
