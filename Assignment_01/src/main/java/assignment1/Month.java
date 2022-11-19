package assignment1;

import java.util.Arrays;

public class Month {
    int month;

    public Month(int month) {

        this.month = month;
    }

    private final Integer[] thirtyOneDays = {1, 3, 5, 7, 8, 10};

    private final Integer[] thirtyDays = {4, 6, 9, 11};

    public boolean thirtyOneDaysMonth() {

        return Arrays.asList(thirtyOneDays).contains(month);
    }

    public boolean thirtyDaysMonth() {

        return Arrays.asList(thirtyDays).contains(month);
    }

    public boolean December() {

        return month == 12;
    }

    public boolean February() {

        return month == 2;
    }

}
