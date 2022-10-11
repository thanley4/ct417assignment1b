public class LectureManagementSystem
{
    /** Course Methods **/

    public void addStudentToCourse(Student student, Course course)
    {
        course.getStudents().add(student);
        student.getCourses().add(course);
    }

    public void removeStudentFromCourse(Student student, Course course)
    {
        course.getStudents().remove(student);
        student.getCourses().remove(course);
    }

    public void addModuleToCourse(Module module, Course course)
    {
        course.getModules().add(module);
        module.getCourses().add(course);
    }

    public void removeModuleFromCourse(Module module, Course course)
    {
        course.getModules().remove(module);
        module.getCourses().remove(course);
    }

    /** Module Methods **/

    public void addStudentToModule(Student student, Module module)
    {
        module.getStudents().add(student);
        student.getModules().add(module);
    }

    public void removeStudentFromModule(Student student, Module module)
    {
        module.getStudents().remove(student);
        student.getModules().remove(module);
    }

    public void addLecturerToModule(Lecturer lecturer, Module module)
    {
        module.setLecturer(lecturer);
        lecturer.getModules().add(module);
    }

    public void removeLecturerFromModule(Lecturer lecturer, Module module)
    {
        module.setLecturer(null);
        lecturer.getModules().remove(module);
    }

    /** Lecturer Methods **/

    public void addModuleToLecturer(Module module, Lecturer lecturer)
    {
        lecturer.getModules().add(module);
        module.setLecturer(lecturer);
    }

    public void removeModuleFromLecturer(Module module, Lecturer lecturer)
    {
        lecturer.getModules().remove(module);
        module.setLecturer(null);
    }

    /** Student methods **/

    public void addCourseToStudent(Course course, Student student)
    {
        student.getCourses().add(course);
        course.getStudents().add(student);
    }

    public void removeCourseFromStudent(Course course, Student student)
    {
        student.getCourses().remove(course);
        course.getStudents().remove(student);
    }

    public void addModuleToStudent(Module module, Student student)
    {
        student.getModules().add(module);
        module.getStudents().add(student);
    }

    public void removeModuleFromStudent(Module module, Student student)
    {
        student.getModules().remove(module);
        module.getStudents().remove(student);
    }
}