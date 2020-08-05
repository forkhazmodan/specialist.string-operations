package Converter;

public class Converter {

    private final boolean isLeapYear;
    private final int year;
    private final int[] daysInMonths = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
    private final String[] namesMonths = {
            "January",
            "February",
            "March",
            "April",
            "May",
            "June",
            "July",
            "August",
            "September",
            "October",
            "November",
            "December"
    };
    
    private int day;
    private int monthNum;
    private int dayOfMonthNum;
    
    public Converter(int year, int day) throws Exception {

        this.isLeapYear = (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
        int daysInTheYear = this.isLeapYear ? 366 : 365;

        if(year < 1) {
            throw new Exception("Year should be grater than: " + 0);
        }

        if(!(day <= daysInTheYear && day > 0)) {
            throw new Exception("Days should be in range from: " + 0 + " to: " + daysInTheYear);
        }
        
        this.day = day;
        this.year = year;
        this.dayOfMonthNum = day;
    }

    public String convert() {

        if(isLeapYear) {
            ++daysInMonths[1];
        }

        for (int days : daysInMonths) {
            if (dayOfMonthNum <= days) {
                break;
            }
            dayOfMonthNum -= days;
            monthNum++;
        }

        return String.format("%d %d %s %d",
                year,
                day,
                namesMonths[monthNum],
                dayOfMonthNum
        );
    }

    @Override
    public String toString() {
        return "Converter.Converter{" +
                "isLeapYear=" + isLeapYear +
                ", year=" + year +
                ", dayNum=" + day +
                ", monthNum=" + monthNum +
                ", dayOfMonthNum=" + dayOfMonthNum +
                '}';
    }
}
