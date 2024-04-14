package chapter2;

import  java.util.Scanner;
public class Chapter2Homework {
  public static void main (String[] arg){
    System.out.println("Please enter the season of the year.");
    Scanner scanner = new Scanner(System.in);
    String season = scanner.nextLine();

    System.out.println("Please enter a whole number.");
    int number = scanner.nextInt();
    scanner.nextLine();

    System.out.println("Please enter an adjective.");
    String adjective = scanner.nextLine();

    scanner.close();
    System.out.println("on a " + adjective + " " + season + " day, I drink minimum of " + number + " cups of coffee");

  }
}
