package org.example;

public enum Weekday {
  MONDAY {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  TUESDAY {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  WEDNESDAY {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  THURSDAY {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  FRIDAY {
    @Override
    public boolean isWeekday() {
      return true;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  SATURDAY {
    @Override
    public boolean isWeekday() {
      return false;
    }

    @Override
    public boolean isLaborday() {
      return true;
    }
  },
  SUNDAY {
    @Override
    public boolean isWeekday() {
      return false;
    }

    @Override
    public boolean isLaborday() {
      return false;
    }
  };

  public abstract boolean isWeekday();

  public abstract boolean isLaborday();
}
