package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Weekday {
  MONDAY("Montag", true, true),
  TUESDAY("Dienstag", true, true),
  WEDNESDAY("Mittwoch", true, true),
  THURSDAY("Donnerstag", true, true),
  FRIDAY("Freitag", true, true),
  SATURDAY("Samstag", false, true),
  SUNDAY("Sonntag", false, false);

  private static final Map<String, Weekday> WEEKDAYS =
      Arrays.stream(Weekday.values())
          .collect(
              Collectors.toUnmodifiableMap(
                  weekday -> weekday.displayName.toUpperCase(), Function.identity()));

  private final String displayName;
  private final boolean weekday;
  private final boolean laborDay;

  Weekday(final String displayName, final boolean weekday, final boolean laborDay) {
    this.displayName = displayName;
    this.weekday = weekday;
    this.laborDay = laborDay;
  }

  public static Optional<Weekday> parse(final String weekday) {
    if (weekday == null) {
      return Optional.empty();
    }
    final String weekDayUpperCase = weekday.toUpperCase();
    try {
      return Optional.of(Weekday.valueOf(weekDayUpperCase));
    } catch (IllegalArgumentException e) {
      return Optional.ofNullable(WEEKDAYS.get(weekDayUpperCase));
    }
  }

  public String getDisplayName() {
    return displayName;
  }

  public boolean isWeekday() {
    return weekday;
  }

  public boolean isLaborDay() {
    return laborDay;
  }
}
