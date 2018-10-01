package students;

import java.util.Objects;

public class ClassroomArray {
    private final Student[] students;

    public ClassroomArray() {
        students = new Student[0];
    }

    private ClassroomArray(final Student[] students) {
        this.students = students;
    }

    public ClassroomArray add(final Student student) {
        Objects.requireNonNull(student);
        final Student[] newStudents = new Student[students.length + 1];
        for (int i = 0; i < students.length; i++)
            newStudents[i] = students[i];
        newStudents[newStudents.length - 1] = student;
        return new ClassroomArray(newStudents);
    }

    public Student get(final int i) throws InvalidIndexException {
        if (i >= 0 && i < students.length)
            return students[i];
        throw new InvalidIndexException();
    }

    private Student getSlowest(final Student currentSlowest, final int i) {
        if (i == students.length)
            return currentSlowest;
        return getSlowest(
                currentSlowest.getTime().timeInMinutes()
                > students[i].getTime().timeInMinutes()
                        ? currentSlowest : students[i]
                ,
                i + 1
        );
    }

    public Student getSlowestStudent() {
        return getSlowest(students[0], 1);
    }

//    public Student getSlowestStudent() {
//        Student slowest = students[0];
//        for (int i = 1; i < students.length; i++)
//            if (slowest.getTime().timeInMinutes()
//                    < students[i].getTime().timeInMinutes())
//                slowest = students[i];
//        return slowest;
//    }
}
