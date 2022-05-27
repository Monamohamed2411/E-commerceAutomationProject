package org.example.Pages;

import java.util.Random;

public class data {
    public static String FirstName = "mona";
    public static String SecondName = "mohamed";
    public static String CompanyName = "test";

    static Random random = new Random();
    static int randomInt  = random.nextInt(800)+100;
    public static String Email = "user"+randomInt +"@gmail.com";

    public static String Password = "12345678";
    public static String DayDOB = "24";
    public static String MonthDOB = "11";
    public static String YearDOB = "1997";



}
