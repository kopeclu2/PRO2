package students;

public class Time {
    private final int hour, minute;

    public Time(final int hour, final int minute) {
        this.hour = hour;
        this.minute = minute;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int timeInMinutes() {
        return hour * 60 + minute;
    }
}
