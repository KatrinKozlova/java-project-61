package hexlet.code.games;

import hexlet.code.Engine;

public class GCD {
  public static void gameGCD() {

    String gameRule = "Find the greatest common divisor of given numbers.";

    String[][] questionsAndAnswers = new String[3][2];

    var max = 100;
    var min = 0;

    for (String[] questionAndAnswer : questionsAndAnswers) {
      int number1 = (int) (Math.random() * max) + min;
      int number2 = (int) (Math.random() * max) + min;

      questionAndAnswer[0] = number1 + " " + number2;
      questionAndAnswer[1] = Integer.toString(resultGCD(number1, number2));
    }

    Engine.run(gameRule, questionsAndAnswers);
  }

  private static int resultGCD(int number1, int number2) {

    while (number2 != 0) {
      var temp = number2;
      number2 = number1 % number2;
      number1 = temp;
    }

    return number1;
  }
}
