import java.util.List;
import java.util.ArrayList;

public class Course {
    private String courseCode;
    private String courseName;
    Lecture lecture;
    public List<Student> studentsEnrolled;

    Course(String courseCode, String courseName, Lecture lecture) {
        // TODO: buatlah fungsi konstruktor
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
    public void setLecture(Lecture lecture) {
        this.lecture = lecture;
    }

    public void addStudent(Student student) {
        // TODO: buatlah fungsi untuk menambah seorang mahasiswa
        this.studentsEnrolled.add(student);
        if (!student.coursesEnrolled.contains(this)) {
            student.enrollInCourse(this);
        }
    }

    public void removeStudent(Student student) {
        // TODO: buatlah fungsi untuk menghapus seorang mahasiswa
        int index = this.studentsEnrolled.indexOf(student);
        if (index != -1) {
            this.studentsEnrolled.remove(index);
        } else {
            System.out.println("Mahasiswa tidak ditemukan dalam daftar mahasiswa kursus ini");
        }
    }

    public void viewEnrolledStudents() {
        /* TODO: buatlah fungsi untuk menampilkan seluruh 
           student yang mengambil course. 

           Hint: gunakan loop dan method getDetails dari Student
        */
        System.out.printf("Daftar mahasiswa yang mengikuti course %s : \n",getCourseName());
        for (Student s : studentsEnrolled) {
            s.getDetails();
        }
        System.out.println();
    }

    public void getDetails() {
        /* TODO: buat fungsi untuk print detail dari Course, 
           menampilkan kode course, nama course, dan dosen pengampu
        */ 
        System.out.printf("Kode Kursus : %s, Nama Kursus : %s, Dosen Pengampu : %s\n", getCourseCode(), getCourseName(), this.lecture.getName());
    }      

    // Other methods...
}
