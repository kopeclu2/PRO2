package students;

import java.util.Objects;

public class ClassroomLinked{

    private class Node {
        private final Student student;
        private final Node next;
        public Node(Student student, Node next) {
            this.student = student;
            this.next = next;
        }
        public Student getStudent() {
            return student;
        }
        public Node getNext() {
            return next;
        }
    }

    private final Node head;
    private final int size;

    public ClassroomLinked() {
        head = null;
        size = 0;
    }

    private ClassroomLinked(final Node head, final int size) {
        this.head = head;
        this.size = size;
    }

    public ClassroomLinked add(final Student student) {
        Objects.requireNonNull(student);
        return new ClassroomLinked(new Node(student, head), size + 1 );
    }

    private Student get(final Node currentNode, final int j) {
        if (j == 0)
            return currentNode.getStudent();
        return get(currentNode.getNext(), j - 1);
    }

    public Student get(final int i) throws InvalidIndexException {
        if (i >= 0 && i < size)
        return get(head, size - 1 - i);
        throw new InvalidIndexException();
    }


    private Student getSlowest(final Student currentSlowest,
                               final Node currentNode) {
        if (currentNode == null)
            return currentSlowest;
        return getSlowest(
                currentSlowest.getTime().timeInMinutes()
                > currentNode.getStudent().getTime().timeInMinutes()
                ? currentSlowest : currentNode.getStudent(),
                currentNode.getNext()
        );
    }

    public Student getSlowestStudent() {
        return getSlowest(head.getStudent(), head.getNext());
    }
}
