package hexlet.code.games;

public class GCD {

  private static int number1;
  private static int number2;

  public static void rule() {

    System.out.println("Find the greatest common divisor of given numbers.");
  }

  public static String getQuestion() {

    var max = 100;
    var min = 0;

    number1 = (int) (Math.random() * max) + min;
    number2 = (int) (Math.random() * max) + min;

    return number1 + " " + number2;
  }

  public static String getAnswer() {

    while (number2 != 0) {
      var temp = number2;
      number2 = number1 % number2;
      number1 = temp;
    }

    return Integer.toString(number1);
  }
}
