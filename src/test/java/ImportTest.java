import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImportTest
{
    Course course = new Course("Electronic and Computer Engineering", new LocalDate(2019, 9, 5), new LocalDate(2024, 5, 31));
    Lecturer lecturer = new Lecturer("Michael", new LocalDate(1980, 1, 1));
    Module module = new Module("Software Engineering 3", "CT417");
    Student student = new Student("Timothy", new LocalDate(2000, 12, 31), 19417576);

    /** Part A Import Tests **/

    @Test
    public void testCourseImport()
    {
        assertTrue(course.getModules().isEmpty());
        assertTrue(course.getStudents().isEmpty());
        assertEquals(course.getName(), "Electronic and Computer Engineering");
        assertEquals(course.getStartDate(), new LocalDate(2019, 9, 5));
        assertEquals(course.getEndDate(), new LocalDate(2024, 5, 31));
    }

    @Test
    public void testLecturerImport()
    {
        assertTrue(lecturer.getModules().isEmpty());
        assertEquals(lecturer.getUsername(), "Michael42");
        assertEquals(lecturer.getName(), "Michael");
        assertEquals(lecturer.getDateOfBirth(), new LocalDate(1980, 1, 1));
        assertEquals(lecturer.getAge(), 42);
    }

    @Test
    public void testModuleImport()
    {
        assertTrue(module.getStudents().isEmpty());
        assertTrue(module.getCourses().isEmpty());
        assertNull(module.getLecturer());
        module.setLecturer(lecturer);
        assertEquals(module.getLecturer(), lecturer);
        assertEquals(module.getName(), "Software Engineering 3");
        assertEquals(module.getCode(), "CT417");
    }

    @Test
    public void testStudentImport()
    {
        assertTrue(student.getCourses().isEmpty());
        assertTrue(student.getModules().isEmpty());
        assertEquals(student.getName(), "Timothy");
        assertEquals(student.getDateOfBirth(), new LocalDate(2000, 12, 31));
        assertEquals(student.getAge(), 21);
        assertEquals(student.getId(), 19417576);
        assertEquals(student.getUsername(), "Timothy21");
    }
}
