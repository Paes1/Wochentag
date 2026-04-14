package org.example;

import java.util.Scanner;

// TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
  static void main() {
    // TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
    // to see how IntelliJ IDEA suggests fixing it.
    try (Scanner scanner = new Scanner(System.in)) {
      System.out.println("Enter in Weekday: ");
      String weekDay = scanner.next();
    }
  }
}
