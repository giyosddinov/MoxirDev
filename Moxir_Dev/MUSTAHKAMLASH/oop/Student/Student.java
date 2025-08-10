import java.util.ArrayList;

public class Student {
    private int id;
    private String title;
    private ArrayList<Course> enrolledCourses;

    public Student(int id, String title, ArrayList<Course> enrolledCourses) {
        this.id = id;
        this.title = title;
        this.enrolledCourses = enrolledCourses;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public ArrayList<Course> getEnrolledCourses() {
        return enrolledCourses;
    }

    public void setEnrolledCourses(ArrayList<Course> enrolledCourses) {
        this.enrolledCourses = enrolledCourses;
    }

    public void enrollCourse(Course course){
        System.out.println("Kurs Qo'shildi!");
        getEnrolledCourses().add(course);
    }

}
