package Converter;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        try{
            Converter[] converterArray = {
                new Converter(2004, 59),
                new Converter(2004, 60),
                new Converter(2004, 61),
                new Converter(1999, 91),
                new Converter(2000, 1),
                new Converter(2013, 304),
                new Converter(2013, 0),
                new Converter(
                        new Random().ints(1990, 2200).findFirst().getAsInt(),
                        new Random().ints(1, 356).findFirst().getAsInt()
                )
            };

            for (Converter converter:converterArray) {
                System.out.println(converter.convert());
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
