package hexlet.code.games;

import hexlet.code.Engine;

public class Calc {
  public static void gameCalc() {

    String gameRule = "What is the result of the expression?";

    String[] operations = {"+", "-", "*"};
    String[][] questionsAndAnswers = new String[3][2];

    var max = 20;
    var min = 1;

    for (String[] questionAndAnswer : questionsAndAnswers) {
      int number1 = (int) (Math.random() * max) + min;
      int number2 = (int) (Math.random() * max) + min;
      int index = (int) (Math.random() * operations.length);
      String operator = operations[index];

      questionAndAnswer[0] = number1 + " " + operator + " " + number2;
      questionAndAnswer[1] = Integer.toString(resultCalc(operator, number1, number2));
    }

    Engine.run(gameRule, questionsAndAnswers);
  }

  private static int resultCalc(String operator, int number1, int number2) {

    return switch (operator) {
      case "+" -> number1 + number2;
      case "-" -> number1 - number2;
      case "*" -> number1 * number2;
      default -> throw new RuntimeException("Unknown operator " + operator);
    };
  }
}
