package builder;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

// JUnit 5 tests to verify Builder pattern behavior
class StudentBuilderTest {

    @Test
    // Verify a fully built Student object is not null
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
    // Verify setting only studentId via Builder works
    void testStudentId() {
        Student student = new Student.Builder().studentId(101).build();
        assertEquals(101, student.getStudentId());
    }

    @Test
    // Verify setting only name via Builder works
    void testStudentName() {
        Student student = new Student.Builder().name("Ram").build();
        assertEquals("Ram", student.getName());
    }

    @Test
    // Verify setting only department via Builder works
    void testDepartment() {
        Student student = new Student.Builder().department("BCA").build();
        assertEquals("BCA", student.getDepartment());
    }

    @Test
    // Verify setting only semester via Builder works
    void testSemester() {
        Student student = new Student.Builder().semester(5).build();
        assertEquals(5, student.getSemester());
    }

    @Test
    // Verify setting only email via Builder works
    void testEmail() {
        Student student = new Student.Builder().email("ram@gmail.com").build();
        assertEquals("ram@gmail.com", student.getEmail());
    }

    @Test
    // Verify setting only phoneNumber via Builder works
    void testPhoneNumber() {
        Student student = new Student.Builder().phoneNumber("9800000000").build();
        assertEquals("9800000000", student.getPhoneNumber());
    }

    @Test
    // Verify setting only address via Builder works
    void testAddress() {
        Student student = new Student.Builder().address("Kathmandu").build();
        assertEquals("Kathmandu", student.getAddress());
    }

    @Test
    // Verify setting only guardianName via Builder works
    void testGuardianName() {
        Student student = new Student.Builder().guardianName("Hari").build();
        assertEquals("Hari", student.getGuardianName());
    }
}
