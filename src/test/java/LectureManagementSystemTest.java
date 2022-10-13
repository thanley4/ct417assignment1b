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
        System.out.println("\ntestAddStudentToCourse");
        lectureManagementSystem.addStudentToCourse(student, course);
        assertTrue(course.getStudents().contains(student));
        assertTrue(student.getCourses().contains(course));
        System.out.println("Course: " + course + "; Students: " + course.getStudents());
        System.out.println("Student: " + student + "; Courses: " + student.getCourses());
    }

    @Test
    public void testRemoveStudentFromCourse()
    {
        System.out.println("\ntestRemoveStudentFromCourse");
        lectureManagementSystem.removeStudentFromCourse(student, course);
        assertFalse(course.getStudents().contains(student));
        assertFalse(student.getCourses().contains(course));
        System.out.println("Course: " + course + "; Students: " + course.getStudents());
        System.out.println("Student: " + student + "; Courses: " + student.getCourses());
    }

    @Test
    public void testAddModuleToCourse()
    {
        System.out.println("\ntestAddModuleToCourse");
        lectureManagementSystem.addModuleToCourse(module, course);
        assertTrue(course.getModules().contains(module));
        assertTrue(module.getCourses().contains(course));
        System.out.println("Course: " + course + "; Modules: " + course.getModules());
        System.out.println("Module: " + module + "; Courses: " + module.getCourses());
    }


    @Test
    public void testRemoveModuleFromCourse()
    {
        System.out.println("\ntestRemoveModuleFromCourse");
        lectureManagementSystem.removeModuleFromCourse(module, course);
        assertFalse(course.getModules().contains(module));
        assertFalse(module.getCourses().contains(course));
        System.out.println("Course: " + course + "; Modules: " + course.getModules());
        System.out.println("Module: " + module + "; Courses: " + module.getCourses());
    }

    /** Module Tests **/

    @Test
    public void testAddStudentToModule()
    {
        System.out.println("\ntestAddStudentToModule");
        lectureManagementSystem.addStudentToModule(student, module);
        assertTrue(student.getModules().contains(module));
        assertTrue(module.getStudents().contains(student));
        System.out.println("Student: " + student + "; Modules: " + student.getModules());
        System.out.println("Module: " + module + "; Students: " + module.getStudents());
    }

    @Test
    public void testRemoveStudentFromModule()
    {
        System.out.println("\ntestRemoveStudentFromModule");
        lectureManagementSystem.removeStudentFromModule(student, module);
        assertFalse(student.getModules().contains(module));
        assertFalse(module.getStudents().contains(student));
        System.out.println("Student: " + student + "; Modules: " + student.getModules());
        System.out.println("Module: " + module + "; Students: " + module.getStudents());
    }

    @Test
    public void testAddLecturerToModule()
    {
        System.out.println("\ntestAddLecturerToModule");
        lectureManagementSystem.addLecturerToModule(lecturer, module);
        assertEquals(lecturer, module.getLecturer());
        assertTrue(lecturer.getModules().contains(module));
        System.out.println("Lecturer: " + lecturer + "; Modules: " + lecturer.getModules());
        System.out.println("Module: " + module + "; Lecturer: " + module.getLecturer());
    }

    @Test
    public void testRemoveLecturerFromModule()
    {
        System.out.println("\ntestRemoveLecturerFromModule");
        lectureManagementSystem.removeLecturerFromModule(lecturer, module);
        assertNull(module.getLecturer());
        assertFalse(lecturer.getModules().contains(module));
        System.out.println("Lecturer: " + lecturer + "; Modules: " + lecturer.getModules());
        System.out.println("Module: " + module + "; Lecturer: " + module.getLecturer());
    }

    /** Lecturer Tests **/

    @Test
    public void testAddModuleToLecturer()
    {
        System.out.println("\ntestAddModuleToLecturer");
        lectureManagementSystem.addModuleToLecturer(module, lecturer);
        assertTrue(lecturer.getModules().contains(module));
        assertEquals(lecturer, module.getLecturer());
        System.out.println("Lecturer: " + lecturer + "; Modules: " + lecturer.getModules());
        System.out.println("Module: " + module + "; Lecturer: " + module.getLecturer());
    }

    @Test
    public void testRemoveModuleFromLecturer()
    {
        System.out.println("\ntestRemoveModuleFromLecturer");
        lectureManagementSystem.removeModuleFromLecturer(module, lecturer);
        assertFalse(lecturer.getModules().contains(module));
        assertNull(module.getLecturer());
        System.out.println("Lecturer: " + lecturer + "; Modules: " + lecturer.getModules());
        System.out.println("Module: " + module + "; Lecturer: " + module.getLecturer());
    }

    /** Student Tests **/

    @Test
    public void testAddCourseToStudent()
    {
        System.out.println("\ntestAddCourseToStudent");
        lectureManagementSystem.addCourseToStudent(course, student);
        assertTrue(student.getCourses().contains(course));
        assertTrue(course.getStudents().contains(student));
        System.out.println("Student: " + student + "; Courses: " + student.getCourses());
        System.out.println("Course: " + course + "; Students: " + course.getStudents());
    }

    @Test
    public void testRemoveCourseFromStudent()
    {
        System.out.println("\ntestRemoveCourseFromStudent");
        lectureManagementSystem.removeCourseFromStudent(course, student);
        assertFalse(student.getCourses().contains(course));
        assertFalse(course.getStudents().contains(student));
        System.out.println("Student: " + student + "; Courses: " + student.getCourses());
        System.out.println("Course: " + course + "; Students: " + course.getStudents());
    }

    @Test
    public void testAddModuleToStudent()
    {
        System.out.println("\ntestAddModuleToStudent");
        lectureManagementSystem.addModuleToStudent(module, student);
        assertTrue(student.getModules().contains(module));
        assertTrue(module.getStudents().contains(student));
        System.out.println("Student: " + student + "; Modules: " + student.getModules());
        System.out.println("Module: " + module + "; Students: " + module.getStudents());
    }

    @Test
    public void testRemoveModuleFromStudent()
    {
        System.out.println("\ntestRemoveModuleFromStudent");
        lectureManagementSystem.removeModuleFromStudent(module, student);
        assertFalse(student.getModules().contains(module));
        assertFalse(module.getStudents().contains(student));
        System.out.println("Student: " + student + "; Modules: " + student.getModules());
        System.out.println("Module: " + module + "; Students: " + module.getStudents());
    }
}