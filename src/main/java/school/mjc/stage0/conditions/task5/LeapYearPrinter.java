package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {
        boolean isLeap = false;
        if (year % 4 == 0) {
            if (year % 100 == 0) {
                isLeap = year % 400 == 0;
            } else
                isLeap = true;
        }
        System.out.println(isLeap ?"leap":"not leap");
    }
}
