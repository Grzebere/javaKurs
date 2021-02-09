package pl.sda.enumy.zadanie1;

public enum Weekday {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    public boolean isWeekDay() {
        if (this.ordinal() <= 4) {
            return true;
        } else {
            return false;
        }
    }

    public boolean isHoliday() {
        return !isWeekDay();
    }

    public static void whichIsGreater(Weekday weekday1, Weekday weekday2) {
        if (weekday1.compareTo(weekday2) < 0) {
            System.out.println(weekday2 + " iS greater than " + weekday1);
        } else if (weekday1.compareTo(weekday2) > 0) {
            System.out.println(weekday1 + " iS greater than " + weekday2);
        } else {
            System.out.println("Its the same day");
        }

    }
}
