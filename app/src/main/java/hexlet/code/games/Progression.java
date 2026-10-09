package hexlet.code.games;

public class Progression {

  private static String correctAnswer;

  public static void rule() {

    System.out.println("What number is missing in the progression?");
  }

  public static String getQuestion() {

    var max = 20;
    var min = 1;

    int start = (int) (Math.random() * max) + min; // начальное число
    int step = (int) (Math.random() * max) + min; // шаг

    var maxLength = 10;
    var minLength = 5;

    int lengthProgression = (int) (Math.random() * maxLength) + minLength; // длина прогрессии
    int index = (int) (Math.random() * lengthProgression); // индекс для ..
    String[] numbers = new String[lengthProgression]; // массив чисел прогрессии

    for (var i = 0; i < numbers.length; i++) {
      if (i != 0) {
        start += step;
      }
      numbers[i] = Integer.toString(start);
    }

    correctAnswer = numbers[index];
    numbers[index] = "..";

    return String.join(" ", numbers);
  }

  public static String getAnswer() {

    return correctAnswer;
  }
}
