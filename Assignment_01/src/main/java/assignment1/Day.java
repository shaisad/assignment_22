package assignment1;

public class Day {
    int day;

    public Day(int day) {

        this.day = day;
    }

    public boolean thirtyFirstDay() {

        return day == 31;
    }

    public boolean thirtiethDay() {

        return day == 30;
    }

    public boolean twentyNinthDay() {

        return day == 29;
    }

    public boolean twentyEighthDay() {

        return day == 28;
    }
}
