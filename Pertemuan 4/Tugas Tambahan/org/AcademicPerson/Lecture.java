import java.util.List;
import java.util.ArrayList;
import org.Person.Person;

public class Lecture extends Person {
    private int employeeID;
    public List<Course> coursesTaught;

    Lecture(String name, int age, String address, int employeeID) {
        super(name,age,address);
        setEmployeeID(employeeID);
        this.coursesTaught = new ArrayList<>();
    }

    public int getEmployeeID(){
        return employeeID;
    }
    private void setEmployeeID(int id){
        if(id > 0) 
            employeeID=id;
        else 
            System.out.println("ID tidak valid");
    }

    // Overriding getDetails() dari Super Class Person
    public void getDetails() {
        System.out.printf("Nama : %s, Umur : %d, Alamat : %s, ID Karyawan : %d\n",getName(),getAge(),getAddress(),getEmployeeID());
    }    

    public void teachCourse(Course course) {
        this.coursesTaught.add(course);
        course.setLecture(this);
    }

    public void unteachCourse(Course course){
        if (coursesTaught.contains(course)) {
            coursesTaught.remove(course);
            course.removeLecture();
        } else {
            System.out.println("Dosen tidak mengajar kursus ini.");
        }
    }
    
    public void viewTaughtCourses() {

        System.out.printf("Course yang diampu dosen %s:\n", getName());
        for (Course c : coursesTaught) {
            c.getDetails();
        }
        System.out.println();
    }

}
