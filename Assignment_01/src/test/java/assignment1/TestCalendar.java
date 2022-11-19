package assignment1;


import org.testng.annotations.Test;

import static org.testng.AssertJUnit.assertEquals;

public class TestCalendar {

    @Test
    public void test1()
    {
        int day = 30;
        int month = 6;
        int year = 2020;

        String expected = "1/7/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if(d.thirtyFirstDay() && m.thirtyOneDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtiethDay() && m.thirtyDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtyFirstDay() && m.December()){

            day = 1;
            month++;
            year++;
        }

        else if(m.February()) {

            if(y.LeapYear()) {

                if(d.twentyNinthDay()){

                    day = 1;
                    month++;
                }

                else{

                    day++;
                }
            }

            else if(!y.LeapYear()){

                if(d.twentyEighthDay()){

                    day = 1;
                    month++;
                }
            }
        }

        else{

            day++;
        }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }

    @Test
    public void test2()
    {
        int day = 31;
        int month = 3;
        int year = 2020;

        String expected = "1/4/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if(d.thirtyFirstDay() && m.thirtyOneDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtiethDay() && m.thirtyDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtyFirstDay() && m.December()){

            day = 1;
            month++;
            year++;
        }

        else if(m.February())
        {
            if(y.LeapYear())
            {
                if(d.twentyNinthDay()){

                    day = 1;
                    month++;
                }
                else{

                    day++;
                }
            }

            else if(!y.LeapYear()){

                if(d.twentyEighthDay()){

                    day=1;
                    month++;
                }
            }
        }

        else{

            day++;
        }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }

    @Test
    public void test3()
    {
        int day = 31;
        int month = 12;
        int year = 2021;

        String expected = "1/1/2022";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if(d.thirtyFirstDay() && m.thirtyDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtiethDay() && m.thirtyDaysMonth()){
            day = 1;
            month++;
        }

        else if(d.thirtyFirstDay() && m.December()){
            day = 1;
            month = 1;
            year++;
        }

        else if(m.February()){

            if(y.LeapYear()){

                if(d.twentyNinthDay()){

                    day = 1;
                    month++;
                }

                else{

                    day++;
                }
            }

            else if(!y.LeapYear()){

                if(d.twentyEighthDay()){

                    day=1;
                    month++;
                }
            }
        }

        else{

            day++;
        }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }

    @Test
    public void test4()
    {
        int day = 28;
        int month = 2;
        int year = 2023;

        String expected = "1/3/2023";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if(d.thirtyFirstDay() && m.thirtyOneDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtiethDay() && m.thirtyDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtyFirstDay() && m.December()){

            day = 1;
            month++;
            year++;
        }

        else if(m.February()){

            if(y.LeapYear()){

                if(d.twentyNinthDay()){

                    day = 1;
                    month++;
                }

                else{

                    day++;
                }
            }

            else if(!y.LeapYear()) {

                if(d.twentyEighthDay()){

                    day = 1;
                    month++;
                }
            }
        }

        else {

            day++;
        }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }

    @Test
    public void test5() {
        int day = 28;
        int month = 2;
        int year = 2024;

        String expected = "29/2/2024";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if(d.thirtyFirstDay() && m.thirtyOneDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtiethDay() && m.thirtyDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtyFirstDay() && m.December()){

            day = 1;
            month++;
            year++;
        }

        else if(m.February()){

            if(y.LeapYear()){

                if(d.twentyNinthDay()){

                    day = 1;
                    month++;
                }

                else{

                    day++;
                }
            }

            else if(!y.LeapYear()){

                if(d.twentyEighthDay()){

                    day=1;
                    month++;
                }
            }
        }

        else{

            day++;
        }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }

    @Test
    public void test6()
    {
        int day = 29;
        int month = 2;
        int year = 2020;

        String expected = "1/3/2020";

        Day d = new Day(day);
        Month m = new Month(month);
        Year y = new Year(year);

        if(d.thirtyFirstDay() && m.thirtyOneDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtiethDay() && m.thirtyDaysMonth()){

            day = 1;
            month++;
        }

        else if(d.thirtyFirstDay() && m.December()){

            day = 1;
            month++;
            year++;
        }

        else if(m.February()){

            if(y.LeapYear()){

                if(d.twentyNinthDay()){

                    day = 1;
                    month++;
                }

                else{

                    day++;
                }
            }

            else if(!y.LeapYear()){

                if(d.twentyEighthDay()){

                    day = 1;
                    month++;
                }
            }
        }

        else{

            day++;
        }

        String actual = day + "/" + month + "/" + year;
        assertEquals(expected, actual);
    }

    


}
