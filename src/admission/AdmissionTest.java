package admission;

import static org.junit.jupiter.api.Assertions.*;

import builder.Student;
import org.junit.jupiter.api.Test;

class AdmissionTest {

    @Test
    void testAdmitStudentReturnsNonNull() {
        AdmissionService service = new AdmissionService();
        Student student = service.admitStudent(
                101, "Ram", "ram@gmail.com", "9800000000",
                "BCA", 5, "Kathmandu", "Hari"
        );
        assertNotNull(student);
    }

    @Test
    void testAdmitStudentCorrectId() {
        AdmissionService service = new AdmissionService();
        Student student = service.admitStudent(
                101, "Ram", "ram@gmail.com", "9800000000",
                "BCA", 5, "Kathmandu", "Hari"
        );
        assertEquals(101, student.getStudentId());
    }

    @Test
    void testAdmitStudentCorrectName() {
        AdmissionService service = new AdmissionService();
        Student student = service.admitStudent(
                101, "Ram", "ram@gmail.com", "9800000000",
                "BCA", 5, "Kathmandu", "Hari"
        );
        assertEquals("Ram", student.getName());
    }

    @Test
    void testAdmitStudentCorrectDepartment() {
        AdmissionService service = new AdmissionService();
        Student student = service.admitStudent(
                101, "Ram", "ram@gmail.com", "9800000000",
                "BCA", 5, "Kathmandu", "Hari"
        );
        assertEquals("BCA", student.getDepartment());
    }

    @Test
    void testAdmitStudentCorrectSemester() {
        AdmissionService service = new AdmissionService();
        Student student = service.admitStudent(
                101, "Ram", "ram@gmail.com", "9800000000",
                "BCA", 5, "Kathmandu", "Hari"
        );
        assertEquals(5, student.getSemester());
    }
}
