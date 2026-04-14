package org.example;

import java.util.Scanner;

public class Main {
  private static final Scanner scanner = new Scanner(System.in);

  static void main() {
    while (!parseWeekday()) {
      System.out.println("Invalid input! Try again");
    }
  }

  static boolean parseWeekday() {
    System.out.println("Enter in Weekday: ");
    String weekdayString = scanner.nextLine();
    return Weekday.parse(weekdayString)
        .map(
            weekday -> {
              System.out.println("Weekday: " + weekday.isWeekday());
              System.out.println("Laborday: " + weekday.isLaborday());
              return true;
            })
        .orElse(false);
  }
}
