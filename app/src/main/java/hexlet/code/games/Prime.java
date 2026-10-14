package hexlet.code.games;

import hexlet.code.Engine;

public class Prime {
  public static void gamePrime() {

    String gameRule = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    String[][] questionsAndAnswers = new String[3][2];

    var max = 100;
    var min = 1;

    for (String[] questionAndAnswer : questionsAndAnswers) {
      int number = (int) (Math.random() * max) + min;

      questionAndAnswer[0] = Integer.toString(number);
      questionAndAnswer[1] = isPrime(number) ? "yes" : "no";
    }

    Engine.run(gameRule, questionsAndAnswers);
  }

  private static boolean isPrime(int number) {

    if (number <= 1) {
      return false; // Числа <= 1 не являются простыми
    }

    if (number == 2) {
      return true; // 2 — единственное чётное простое число
    }

    if (number % 2 == 0) {
      return false; // Проверяем только нечётные числа
    }

    int sqrtN = (int) Math.sqrt(number);
    for (int i = 3; i <= sqrtN; i += 2) {
      if (number % i == 0) {
        return false; // Найден делитель, число составное
      }
    }

    return true;
  }
}
