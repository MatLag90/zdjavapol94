package pl.sdacademy.enumerative.part2;

public enum WeekDay {
    MONDAY("Poniedziałek"),
    TUESDAY("Wtorek"),
    WEDNESDAY("Środa"),
    THURSDAY("Czwartek"),
    FRIDAY("Piątek"),
    SATURDAY("Sobota"),
    SUNDAY("Niedziela");

    private String plName;

    WeekDay(String plName) {
        System.out.println("Tworzę instancję o polu plName o wartości: " + plName);
        this.plName = plName;
    }

    public String getPlName() {
        return plName;
    }
}
