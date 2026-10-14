package hexlet.code;

import java.util.Scanner;

import hexlet.code.games.*;

public class App {
  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);

    System.out.println(
        """
            Please enter the game number and press Enter.
            1 - Greet
            2 - Even
            3 - Calc
            4 - GCD
            5 - Progression
            6 - Prime
            0 - Exit""");
    System.out.print("Your choice: ");
    var choice = scanner.nextLine();

    switch (choice) {
      case "1":
        Cli.greet(scanner);
        break;
      case "2":
        Even.gameEven();
        break;
      case "3":
        Calc.gameCalc();
        break;
      case "4":
        GCD.gameGCD();
        break;
      case "5":
        Progression.gameProgression();
        break;
      case "6":
        Prime.gamePrime();
        break;
      default:
        System.out.println("Incorrect choice, please try again!");
    }

    scanner.close();
  }
}
