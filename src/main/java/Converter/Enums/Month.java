package Converter.Enums;

public enum Month {

    JANUARY("January", 1),
    FEBRUARY("February", 2),
    MARCH("March", 3),
    APRIL("April", 4),
    MAY("May", 5),
    JUNE("June", 6),
    JULY("July", 7),
    AUGUST("August", 8),
    SEPTEMBER("September", 9),
    OCTOBER("October", 10),
    NOVEMBER("November", 11),
    DECEMBER("December", 12);

    private final String monthName;
    private final int monthNum;

    Month(String monthName, int monthNum) {
        this.monthName = monthName;
        this.monthNum = monthNum;
    }

    public String getMonthName() {
        return monthName;
    }

    public int getMonthNum() {
        return monthNum;
    }

    public static Month getByMonthNum(int order) {

        for (Month month : Month.values()) {
            if (month.getMonthNum() == order) {
                return month;
            }
        }

        return JANUARY;
    }
}
