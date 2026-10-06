package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;

public class Engine {
  public static void run(Scanner scanner, String choice) {

    var name = Cli.greet(scanner);

    switch (choice) {
      case "2":
        Even.rule();
        break;
      case "3":
        Calc.rule();
        break;
    }

    var index = 0;
    var rounds = 3;

    while (index < rounds) {

      String question = "";
      String correctAnswer = "";

      switch (choice) {
        case "2":
          question = Even.getQuestion();
          correctAnswer = Even.getAnswer();
          break;
        case "3":
          question = Calc.getQuestion();
          correctAnswer = Calc.getAnswer();
          break;
      }

      System.out.println("Question: " + question);
      System.out.print("Your answer: ");
      var answer = scanner.nextLine();

      if (answer.equals(correctAnswer)) {
        System.out.println("Correct!");
      } else {
        System.out.println(
            "'"
                + answer
                + "'"
                + " is wrong answer ;(. Correct answer was '"
                + correctAnswer
                + "'.");
        System.out.println("Let's try again, " + name + "!");
        return;
      }

      index += 1;
    }

    System.out.println("Congratulations, " + name + "!");
  }
}
