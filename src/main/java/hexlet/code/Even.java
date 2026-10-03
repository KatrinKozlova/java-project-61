package hexlet.code;

import java.util.Scanner;

public class Even {
  public static void isEven(Scanner scanner) {

    var name = Cli.greet(scanner);

    System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

    var max = 100;
    var min = 1;

    int[] numbers = {
      (int) (Math.random() * max) + min,
      (int) (Math.random() * max) + min,
      (int) (Math.random() * max) + min
    };

    for (var number : numbers) {

      System.out.println("Question: " + number);
      System.out.print("Your answer: ");
      var answer = scanner.nextLine();

      if (number % 2 == 0) {
        if (answer.equals("yes")) {
          System.out.println("Correct!");
        } else {
          System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'yes'.");
          System.out.println("Let's try again, " + name + "!");
          return;
        }
      } else {
        if (answer.equals("no")) {
          System.out.println("Correct!");
        } else {
          System.out.println("'" + answer + "'" + " is wrong answer ;(. Correct answer was 'no'.");
          System.out.println("Let's try again, " + name + "!");
          return;
        }
      }
    }

    System.out.println("Congratulations, " + name + "!");

  }
}
