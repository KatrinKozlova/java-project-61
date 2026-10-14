package hexlet.code.games;

import hexlet.code.Engine;

public class Even {
  public static void gameEven() {

    String gameRule = "Answer 'yes' if the number is even, otherwise answer 'no'.";

    String[][] questionsAndAnswers = new String[3][2];

    var max = 100;
    var min = 1;

    for (String[] questionAndAnswer : questionsAndAnswers) {
      int number = (int) (Math.random() * max) + min;

      questionAndAnswer[0] = Integer.toString(number);
      questionAndAnswer[1] = isEven(number) ? "yes" : "no";
    }

    Engine.run(gameRule, questionsAndAnswers);
  }

  private static boolean isEven(int number) {

    return number % 2 == 0;
  }
}
