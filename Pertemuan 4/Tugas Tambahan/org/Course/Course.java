import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    Lecture lecture;
    public List<Student> studentsEnrolled;

    Course(String courseCode, String courseName, Lecture lecture) {
        this.studentsEnrolled = new ArrayList<>();
        this.courseCode = courseCode;
        this.courseName = courseName;
        this.lecture = lecture;
    }

    Course(String courseCode, String courseName) {
        this.studentsEnrolled = new ArrayList<>();
        this.courseCode = courseCode;
        this.courseName = courseName;
    }

    public String getCourseCode() { 
        return courseCode; }

    public String getCourseName() {
        return courseName;
    }
    public Lecture getLecture() {
        return lecture;
    }
    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }
    public void removeLecture() {
        this.lecture = null;
    }
    public void addStudent(Student student) {
        this.studentsEnrolled.add(student);
        if (!student.coursesEnrolled.contains(this)) {
            student.enrollInCourse(this);
        }
    }

    public void removeStudent(Student student) {
        int index = this.studentsEnrolled.indexOf(student);
        if (index != -1) {
            this.studentsEnrolled.remove(index);
            student.removeCourse(this);
        }
        
    }

    public void viewEnrolledStudents() {

        System.out.printf("Daftar mahasiswa yang mengikuti course %s : \n",getCourseName());
        for (Student s : studentsEnrolled) {
            s.getDetails();
        }
        System.out.println();
    }

    public void getDetails() {

        System.out.printf("Kode Kursus : %s, Nama Kursus : %s, Dosen Pengampu : %s\n", getCourseCode(), getCourseName(), this.lecture.getName());
    }      


}
