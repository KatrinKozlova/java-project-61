package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;

public class Engine {
  public static void run(String gameRule, String[][] rounds) {

    Scanner scanner = new Scanner(System.in);

    System.out.println("\nWelcome to the Brain Games!");
    System.out.print("May I have your name? ");
    var name = scanner.nextLine();
    System.out.println("Hello, " + name + "!");

    System.out.println(gameRule);

    for (String[] round : rounds) {
      System.out.println("Question: " + round[0]);
      System.out.print("Your answer: ");
      var answer = scanner.nextLine();

      if (answer.equals(round[1])) {
        System.out.println("Correct!");
      } else {
        System.out.println(
            "'" + answer + "'" + " is wrong answer ;(. Correct answer was '" + round[1] + "'.");
        System.out.println("Let's try again, " + name + "!");
        return;
      }
    }

    System.out.println("Congratulations, " + name + "!");
  }
}
