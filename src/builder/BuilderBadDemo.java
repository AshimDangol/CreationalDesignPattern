package builder;

// Demo showing the problem: long parameter list is error-prone and hard to read
public class BuilderBadDemo {

    public static void main(String[] args) {
        StudentBad student = new StudentBad(
                101,
                "Ram",
                "ram@gmail.com",
                "9800000000",
                "BCA",
                5,
                "Kathmandu",
                "Hari"
        );

        System.out.println(student);
    }
}
