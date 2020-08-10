import Converter.DayOfYear;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        try{
            DayOfYear[] dayOfYearArray = {
                new DayOfYear(2004, 59),
                new DayOfYear(2004, 60),
                new DayOfYear(2004, 61),
                new DayOfYear(1999, 91),
                new DayOfYear(2000, 1),
                new DayOfYear(2013, 304),
                new DayOfYear(2013, 0),
                new DayOfYear(
                        new Random().ints(1990, 2200).findFirst().getAsInt(),
                        new Random().ints(1, 356).findFirst().getAsInt()
                )
            };

            for (DayOfYear dayOfYear : dayOfYearArray) {
                System.out.println(dayOfYear.convert());
            }
        } catch (Exception exception) {
            System.err.println("Exception: " + exception.getMessage());
            System.err.println(exception.getStackTrace()[0].getClassName());
            System.err.println(exception.getStackTrace()[0].getLineNumber());
//
//            for ( StackTraceElement el:exception.getStackTrace()) {
//                System.out.println(el.toString());
//            }
        }

        //TODO: add ability to show famous facts about asking date.
        //TODO: https://en.wikipedia.org/wiki/April_21 - example
    }
}
