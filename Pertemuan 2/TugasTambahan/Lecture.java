import java.util.List;
import java.util.ArrayList;

public class Lecture {

    private String name;
    private int age;
    private String address;
    private int employeeID;
    public List<Course> coursesTaught;

    Lecture(String name, int age, String address, int employeeID) {
        this.coursesTaught = new ArrayList<>();
        setName(name);
        setAge(age);
        setAddress(address);
        setEmployeeID(employeeID);
    }

    private void setName(String n){
        if(!n.isEmpty()) 
            name = n;
        else 
            System.out.println("Nama tidak boleh kosong");
    }
    public String getName(){ return name;}
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
    public int getEmployeeID(){
        return employeeID;
    }
    private void setEmployeeID(int id){
        if(id > 0) 
            employeeID=id;
        else 
            System.out.println("ID tidak valid");
    }
    public void getDetails() {
        System.out.printf("Nama : %s, Umur : %d, Alamat : %s, ID Karyawan : %d\n",getName(),getAge(),getAddress(),getEmployeeID());
    }    

    public void teachCourse(Course course) {
        this.coursesTaught.add(course);
        course.setLecture(this);
    }

    public void viewTaughtCourses() {

        System.out.printf("Course yang diampu dosen %s:\n", getName());
        for (Course c : coursesTaught) {
            c.getDetails();
        }
        System.out.println();
    }

}
