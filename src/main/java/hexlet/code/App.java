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
            0 - Exit""");
    System.out.print("Your choice: ");
    var choice = scanner.nextInt();
    scanner.skip("\n");

    if (choice == 1) {
      Cli.greet(scanner);
    }

    if (choice == 2) {
      Even.isEven(scanner);
    }

    scanner.close();
  }
}
