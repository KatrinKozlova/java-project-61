package hexlet.code.games;

public class Even {

  private static int number;

  public static void rule() {

    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");
  }

  public static String getQuestion() {

    var max = 100;
    var min = 1;

    number = (int) (Math.random() * max) + min;

    return Integer.toString(number);
  }

  public static String getAnswer() {

    if (number % 2 == 0) {
      return "yes";
    } else {
      return "no";
    }
  }
}
