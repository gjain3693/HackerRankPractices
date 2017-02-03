
import java.text.SimpleDateFormat;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

/**
 * Created by gauravp.jain on 1/27/2017.
 */
public class DayOfDate {
    public static void main(String args[]){

        Calendar c=Calendar.getInstance();
        int dayOfWeek=0;
        String day;
        String yourDate;
        String yourMonth;
        String yourYear;

        Scanner scan = new Scanner(System.in);
        yourDate = scan.next();
        yourMonth = scan.next();
        yourYear=scan.next();
        String str=yourDate+" "+yourMonth+" "+yourYear;
        int compareYear;
        int leapYear=0;
        compareYear=Integer.parseInt(yourYear);
        if(compareYear>2000 && compareYear<3000) {
            SimpleDateFormat sdf = new SimpleDateFormat("MM dd yyyy");
            try {
                Date date = sdf.parse(str);
System.out.println(date.toString());
                c.setTime(date);

                System.out.println(c.get(Calendar.DAY_OF_WEEK));
    dayOfWeek = c.get(Calendar.DAY_OF_WEEK) - 1;


            } catch (Exception ex) {
                ex.printStackTrace();
            }
            switch (dayOfWeek) {
                case 1:
                    day = "Monday";
                    break;
                case 2:
                    day = "Tuesday";
                    break;
                case 3:
                    day = "Wednesday";
                    break;
                case 4:
                    day = "Thursday";
                    break;
                case 5:
                    day = "Friday";
                    break;
                case 6:
                    day = "Saturday";
                    break;
                case 0:
                    day = "Sunday";
                    break;
                default:
                    day = "Invalid Day";
                    break;

            }
            System.out.println(day.toUpperCase());

        }
    }
}
