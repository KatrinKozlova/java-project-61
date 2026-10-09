package hexlet.code;

import java.util.Scanner;

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
      case "3":
      case "4":
      case "5":
      case "6":
        var name = Cli.greet(scanner);
        Engine.run(scanner, choice, name);
        break;
      default:
        scanner.close();
    }

    scanner.close();
  }
}
