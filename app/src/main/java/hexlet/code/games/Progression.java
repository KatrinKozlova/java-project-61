package hexlet.code.games;

import hexlet.code.Engine;

public class Progression {
  public static void gameProgression() {

    String gameRule = "What number is missing in the progression?";

    String[][] questionsAndAnswers = new String[3][2];

    var max = 20;
    var min = 1;

    var maxLength = 10;
    var minLength = 5;

    for (String[] questionAndAnswer : questionsAndAnswers) {
      int start = (int) (Math.random() * max) + min; // начальное число
      int step = (int) (Math.random() * max) + min; // шаг

      int lengthProgression = (int) (Math.random() * maxLength) + minLength; // длина прогрессии
      int index = (int) (Math.random() * lengthProgression); // индекс для ..

      String[] progression = generateProgression(start, step, lengthProgression);

      String answer = progression[index];
      progression[index] = "..";

      questionAndAnswer[0] = String.join(" ", progression);
      questionAndAnswer[1] = answer;
    }

    Engine.run(gameRule, questionsAndAnswers);
  }

  private static String[] generateProgression(int start, int step, int lengthProgression) {

    String[] numbers = new String[lengthProgression]; // массив чисел прогрессии

    for (var i = 0; i < numbers.length; i++) {
      if (i != 0) {
        start += step;
      }
      numbers[i] = Integer.toString(start);
    }

    return numbers;
  }
}
