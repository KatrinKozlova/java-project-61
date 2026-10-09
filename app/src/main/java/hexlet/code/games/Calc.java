package hexlet.code.games;

public class Calc {

  private static int number1;
  private static int number2;
  private static String symbol;

  public static void rule() {

    System.out.println("What is the result of the expression?");
  }

  public static String getQuestion() {

    var max = 20;
    var min = 1;

    number1 = (int) (Math.random() * max) + min;
    number2 = (int) (Math.random() * max) + min;

    String[] operations = {"+", "-", "*"};
    int index = (int) (Math.random() * operations.length);
    symbol = operations[index];

    return number1 + symbol + number2;
  }

  public static String getAnswer() {

    int correctAnswer =
        switch (symbol) {
          case "+" -> number1 + number2;
          case "-" -> number1 - number2;
          case "*" -> number1 * number2;
          default -> 0;
        };

    return Integer.toString(correctAnswer);
  }
}
