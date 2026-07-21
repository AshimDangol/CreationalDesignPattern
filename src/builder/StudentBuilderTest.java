package builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Builder pattern behavior
class StudentBuilderTest {

    @Test
    void testStudentCreatedSuccessfully() {
        Student student = new Student.Builder()
                .studentId(101)
                .name("Ram")
                .email("ram@gmail.com")
                .phoneNumber("9800000000")
                .department("BCA")
                .semester(5)
                .address("Kathmandu")
                .guardianName("Hari")
                .build();
        assertNotNull(student);
    }

    @Test
    void testStudentId() {
        Student student = new Student.Builder().studentId(101).build();
        assertEquals(101, student.getStudentId());
    }

    @Test
    void testStudentName() {
        Student student = new Student.Builder().name("Ram").build();
        assertEquals("Ram", student.getName());
    }

    @Test
    void testDepartment() {
        Student student = new Student.Builder().department("BCA").build();
        assertEquals("BCA", student.getDepartment());
    }

    @Test
    void testSemester() {
        Student student = new Student.Builder().semester(5).build();
        assertEquals(5, student.getSemester());
    }

    @Test
    void testEmail() {
        Student student = new Student.Builder().email("ram@gmail.com").build();
        assertEquals("ram@gmail.com", student.getEmail());
    }

    @Test
    void testPhoneNumber() {
        Student student = new Student.Builder().phoneNumber("9800000000").build();
        assertEquals("9800000000", student.getPhoneNumber());
    }

    @Test
    void testAddress() {
        Student student = new Student.Builder().address("Kathmandu").build();
        assertEquals("Kathmandu", student.getAddress());
    }

    @Test
    void testGuardianName() {
        Student student = new Student.Builder().guardianName("Hari").build();
        assertEquals("Hari", student.getGuardianName());
    }
}
