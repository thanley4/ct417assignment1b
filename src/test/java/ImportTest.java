import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ImportTest
{
    Student student = new Student("Timothy", new LocalDate(2000, 12, 31), 19417576);
    Lecturer lecturer = new Lecturer("Michael", new LocalDate(1980, 1, 1));

    /** Part A Import Tests **/

    @Test
    public void testPartAImportStudent()
    {
        assertEquals(student.getUsername(), "Timothy21");
    }

    @Test
    public void testPartAImportLecturer()
    {
        assertEquals(lecturer.getUsername(), "Michael42");
    }
}
