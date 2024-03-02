import java.util.List;
import java.util.ArrayList;

public class Student {

    private String name;
    private int age;
    private String address;
    private int studentID;
    public List<Course> coursesEnrolled;

    Student(String name, int age, String address, int studentID) {
        this.coursesEnrolled = new ArrayList<>();
        setName(name);
        setAge(age);
        setAddress(address);
        setStudentID(studentID);
    }
    
    public String getName() { 
        return name; 
    }
    private void setName(String n) { 
        if(!n.isEmpty()) 
            name = n;
        else 
            System.out.println("Nama tidak boleh kosong");
    }
    public int getAge() { 
        return age; 
    }
    private void setAge(int a) { 
        if (a >= 0) 
            age = a;
        else 
            System.out.println("Umur tidak valid");
    }
    public String getAddress() { 
        return address;  
    }
    private void setAddress(String adr) {
        address = adr;
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
        } else {
            System.out.println("Mahasiswa tidak terdaftar dalam kursus ini.");
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
