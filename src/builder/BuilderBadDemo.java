package builder;

// Demo showing the problem: long parameter list is error-prone and hard to read
// Without named parameters, it's easy to swap arguments like phone and email
public class BuilderBadDemo {

    public static void main(String[] args) {
        // Which argument is which? Easy to make mistakes with positional params
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
