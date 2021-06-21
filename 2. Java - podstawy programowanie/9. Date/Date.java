package pl.sdacademy;

public class Date {
    private int day;
    private int month;
    private int year;

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public String toString() {
        return day + "." + month + "." + year;
    }

    public boolean isLeapYear() {
        // Jednocześnie: rok dzieli się bez reszty przez 4
        // i (nie dzieli sę przez 100 lub dzieli się przez 400)
        return year % 4 == 0 && (year % 100 != 0 || year % 400 == 0);
    }
}
