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

//    Wersja 1:
//    public int getCurrentMonthDayCount() {
//        if (month == 1 || month == 3 || month == 5 || month == 7
//                || month == 8 || month == 10 || month == 12) {
//            return 31;
//        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
//            return 30;
//        } else if (month == 2) {
//            return isLeapYear() ? 29 : 28;
//        } else {
//            // Niepoprawny miesiąc (wartość mniejsza od 1 lub większa od 12).
//            // Umówimy się, że zwracamy -1
//            return -1;
//        }
//    }

//    Wersja 2:
    public int getCurrentMonthDayCount() {
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            case 2:
                return isLeapYear() ? 29 : 28;
            default:
                return -1; // gdy miesiąc jest niepoprawny
        }
    }
}
