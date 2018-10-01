package students;

public class Student {
    private final String firstName, surname;
    private final Time time;

    public Student(final String firstName, final String surname,
                   final Time time) {
        this.firstName = firstName;
        this.surname = surname;
        this.time = time;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getSurname() {
        return surname;
    }

    public Time getTime() {
        return time;
    }
    public String fullName() {
        return getFirstName() + " " + getSurname();
    }
}
