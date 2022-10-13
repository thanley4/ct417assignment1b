import org.joda.time.LocalDate;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class LectureManagementSystemTest
{
    LectureManagementSystem lectureManagementSystem = new LectureManagementSystem();
    Student student = new Student("Timothy", new LocalDate(2000, 12, 31), 19417576);
    Lecturer lecturer = new Lecturer("Michael", new LocalDate(1980, 1, 1));
    Module module = new Module("Software Engineering 3", "CT417");
    Course course = new Course("Electronic and Computer Engineering", new LocalDate(2019, 9, 5), new LocalDate(2024, 5, 31));

    /** Course Tests **/

    @Test
    public void testAddStudentToCourse()
    {
        lectureManagementSystem.addStudentToCourse(student, course);
        assertTrue(course.getStudents().contains(student));
        assertTrue(student.getCourses().contains(course));
        System.out.println(student + "\nCourses: " + student.getCourses() + "\n");
        System.out.println(course + "\nStudents: " + course.getStudents() + "\n");
    }

    @Test
    public void testRemoveStudentFromCourse()
    {
        lectureManagementSystem.removeStudentFromCourse(student, course);
        assertFalse(course.getStudents().contains(student));
        assertFalse(student.getCourses().contains(course));
        System.out.println(student + "\nCourses: " + student.getCourses() + "\n");
        System.out.println(course + "\nStudents: " + course.getStudents() + "\n");
    }

    @Test
    public void testAddModuleToCourse()
    {
        lectureManagementSystem.addModuleToCourse(module, course);
        assertTrue(course.getModules().contains(module));
        assertTrue(module.getCourses().contains(course));
        System.out.println(course + "\nModules: " + course.getModules() + "\n");
        System.out.println(module + "\nCourses: " + module.getCourses() + "\n");
    }


    @Test
    public void testRemoveModuleFromCourse()
    {
        lectureManagementSystem.removeModuleFromCourse(module, course);
        assertFalse(course.getModules().contains(module));
        assertFalse(module.getCourses().contains(course));
        System.out.println(course + "\nModules: " + course.getModules() + "\n");
        System.out.println(module + "\nCourses: " + module.getCourses() + "\n");
    }

    /** Module Tests **/

    @Test
    public void testAddStudentToModule()
    {
        lectureManagementSystem.addStudentToModule(student, module);
        assertTrue(student.getModules().contains(module));
        assertTrue(module.getStudents().contains(student));
        System.out.println(module + "\nStudents: " + module.getStudents() + "\n");
        System.out.println(student + "\nModules: " + student.getModules() + "\n");
    }

    @Test
    public void testRemoveStudentFromModule()
    {
        lectureManagementSystem.removeStudentFromModule(student, module);
        assertFalse(student.getModules().contains(module));
        assertFalse(module.getStudents().contains(student));
        System.out.println(module + "\nStudents: " + module.getStudents() + "\n");
        System.out.println(student + "\nModules: " + student.getModules() + "\n");
    }

    @Test
    public void testAddLecturerToModule()
    {
        lectureManagementSystem.addLecturerToModule(lecturer, module);
        assertEquals(lecturer, module.getLecturer());
        assertTrue(lecturer.getModules().contains(module));
        System.out.println(module + "\nLecturer: " + module.getLecturer() + "\n");
        System.out.println(lecturer + "\nModules: " + lecturer.getModules() + "\n");
    }

    @Test
    public void testRemoveLecturerFromModule()
    {
        lectureManagementSystem.removeLecturerFromModule(lecturer, module);
        assertNull(module.getLecturer());
        assertFalse(lecturer.getModules().contains(module));
        System.out.println(module + "\nLecturer: " + module.getLecturer() + "\n");
        System.out.println(lecturer + "\nModules: " + lecturer.getModules() + "\n");
    }

    /** Lecturer Tests **/

    @Test
    public void testAddModuleToLecturer()
    {
        lectureManagementSystem.addModuleToLecturer(module, lecturer);
        assertTrue(lecturer.getModules().contains(module));
        assertEquals(lecturer, module.getLecturer());
        System.out.println(lecturer + "\nModules: " + lecturer.getModules() + "\n");
        System.out.println(module + "\nLecturer: " + module.getLecturer() + "\n");
    }

    @Test
    public void testRemoveModuleFromLecturer()
    {
        lectureManagementSystem.removeModuleFromLecturer(module, lecturer);
        assertFalse(lecturer.getModules().contains(module));
        assertNull(module.getLecturer());
        System.out.println(lecturer + "\nModules: " + lecturer.getModules() + "\n");
        System.out.println(module + "\nLecturer: " + module.getLecturer() + "\n");
    }

    /** Student Tests **/

    @Test
    public void testAddCourseToStudent()
    {
        lectureManagementSystem.addCourseToStudent(course, student);
        assertTrue(student.getCourses().contains(course));
        assertTrue(course.getStudents().contains(student));
        System.out.println(student + "\nCourses: " + student.getCourses() + "\n");
        System.out.println(course + "\nStudents: " + course.getStudents() + "\n");
    }

    @Test
    public void testRemoveCourseFromStudent()
    {
        lectureManagementSystem.removeCourseFromStudent(course, student);
        assertFalse(student.getCourses().contains(course));
        assertFalse(course.getStudents().contains(student));
        System.out.println(student + "\nCourses: " + student.getCourses() + "\n");
        System.out.println(course + "\nStudents: " + course.getStudents() + "\n");
    }

    @Test
    public void testAddModuleToStudent()
    {
        lectureManagementSystem.addModuleToStudent(module, student);
        assertTrue(student.getModules().contains(module));
        assertTrue(module.getStudents().contains(student));
        System.out.println(student + "\nModules: " + student.getModules() + "\n");
        System.out.println(module + "\nStudents: " + module.getStudents() + "\n");
    }

    @Test
    public void testRemoveModuleFromStudent()
    {
        lectureManagementSystem.removeModuleFromStudent(module, student);
        assertFalse(student.getModules().contains(module));
        assertFalse(module.getStudents().contains(student));
        System.out.println(student + "\nModules: " + student.getModules() + "\n");
        System.out.println(module + "\nStudents: " + module.getStudents() + "\n");
    }
}