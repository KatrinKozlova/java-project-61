package hexlet.code.games;

public class Prime {

  private static int number;

  public static void rule() {

    System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
  }

  public static String getQuestion() {

    var max = 100;
    var min = 1;

    number = (int) (Math.random() * max) + min;

    return Integer.toString(number);
  }

  public static String getAnswer() {

    if (number <= 1) {
      return "no"; // Числа <= 1 не являются простыми
    }
    if (number == 2) {
      return "yes"; // 2 — единственное чётное простое число
    }
    if (number % 2 == 0) {
      return "no"; // Проверяем только нечётные числа
    }

    int sqrtN = (int) Math.sqrt(number);
    for (int i = 3; i <= sqrtN; i += 2) {
      if (number % i == 0) {
        return "no"; // Найден делитель, число составное
      }
    }
    return "yes";
  }
}
