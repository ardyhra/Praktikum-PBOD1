import java.util.List;
import java.util.ArrayList;
import org.Person.Person;

public class Student extends Person{
    private int studentID;
    public List<Course> coursesEnrolled;

    public Student(String name, int age, String address, int studentID) {
        super(name,age,address);
        setStudentID(studentID);
        this.coursesEnrolled = new ArrayList<>();
    }
    
    public int getStudentID(){
        return studentID;
    }
    private void setStudentID(int id){
        if(id > 0) 
            studentID=id;
        else 
            System.out.println("ID tidak valid");
    }

    // Overriding getDetails() dari Super Class Person
    public void getDetails() {

        System.out.printf("Nama : %s, Umur : %d tahun, Alamat : %s, ID Siswa : %d\n", getName(), getAge(), getAddress(), getStudentID());
    }

    public void enrollInCourse(Course course) {

        this.coursesEnrolled.add(course);
        if (!course.studentsEnrolled.contains(this)) {
            course.addStudent(this);
        }
    }
    
    public void removeCourse(Course course) {
        if (coursesEnrolled.contains(course)) {
            coursesEnrolled.remove(course);
            course.removeStudent(this);
        } 
    }

    public void viewEnrolledCourses() {

        System.out.printf("Daftar Kursus Yang diikuti mahasiswa bernama %s : \n",getName());
        for (Course c : coursesEnrolled) {
            c.getDetails();
        }
        System.out.println();
    }

}
