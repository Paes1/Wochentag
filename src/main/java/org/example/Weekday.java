package org.example;

import java.util.Arrays;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public enum Weekday {
  MONDAY("montag") {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  TUESDAY("dienstag") {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  WEDNESDAY("mittwoch") {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  THURSDAY("donnerstag") {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  FRIDAY("freitag") {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  SATURDAY("samstag") {
    @Override
    public boolean isWeekday() {
      return false;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  SUNDAY("sonntag") {
    @Override
    public boolean isWeekday() {
      return false;
    }

    @Override
    public boolean isLaborday() {
      return false;
    }
  };
  private static final Map<String, Weekday> weekdays =
      Arrays.stream(Weekday.values())
          .collect(
              Collectors.toUnmodifiableMap(weekday -> weekday.displayName, Function.identity()));

  private final String displayName;

  Weekday(String displayName) {
    this.displayName = displayName;
  }

  public static Optional<Weekday> parse(String weekday) {
    try {
      return Optional.of(Weekday.valueOf(weekday.toUpperCase()));
    } catch (IllegalArgumentException e) {
      return Optional.ofNullable(weekdays.get(weekday.toLowerCase()));
    }
  }

  public abstract boolean isWeekday();

  public abstract boolean isLaborday();
}
