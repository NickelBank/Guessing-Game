import java.util.Scanner;

class Main {
  public static void main(String[] args) {
    int answer;
    int guess;
    Scanner scan = new Scanner(System.in);

    answer = (int) (Math.random() * 100);

    System.out.println("Guess a number from 1 to 100");

    guess = scan.nextInt();

    while (guess != answer) {
      if (guess < answer) {
        System.out.println("Too low");
        guess = scan.nextInt();
      }
      else if (guess > answer) {
        System.out.println("Too high");
        guess = scan.nextInt();
      }
    }
    System.out.println("You got it!");

    scan.close();
  }
}