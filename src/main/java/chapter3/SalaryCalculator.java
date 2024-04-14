package chapter3;

import  java.util.Scanner;
public class SalaryCalculator {
  public static void main(String[] arg) {
    int salary = 1000;
    int bonus = 250;

    Scanner scanner = new Scanner(System.in);
    System.out.println("Please enter the number of sales");
    int sales = scanner.nextInt();
    scanner.close();

    if(sales>10) {
      salary = salary + bonus;
    }

    System.out.println("The employee's payment is $" + salary);

  }
}
