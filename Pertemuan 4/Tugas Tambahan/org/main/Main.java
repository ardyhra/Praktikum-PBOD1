public class Main {
    public static void main(String[] args) {
      
        Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
        Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);


        Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
        Student dani = new Student("Dani", 20, "123 Oak St", 734621);
        Student edi = new Student("Edi", 20, "789 Pine St", 733451);


        Course cs101 = new Course("CS101", "Intro to Computer Science");
        Course cs102 = new Course("CS102", "Data Structures");
        Course cs103 = new Course("CS103", "Algorithms");

        agus.teachCourse(cs101);
        agus.teachCourse(cs102);
        bambang.teachCourse(cs103);

        cs101.addStudent(cahyo);
        cs101.addStudent(dani);
        cs101.addStudent(edi);

        cs102.addStudent(cahyo);
        cs102.addStudent(dani);
        cs103.addStudent(cahyo);

        cahyo.viewEnrolledCourses();
        agus.viewTaughtCourses();

        cs101.viewEnrolledStudents();
        System.out.println("=============Menghapus mahasiswa dari course=============");
        cs101.removeStudent(edi);
        cs101.viewEnrolledStudents();

        cahyo.viewEnrolledCourses();
        System.out.println("=============Menghapus course dari mahasiswa=============");
        cahyo.removeCourse(cs103);
        cahyo.viewEnrolledCourses();

        // Periksa apakah ada pengampu untuk course sebelum mencetak detailnya
        if(cs101.getLecture() != null) {
            System.out.println("Dosen pengampu untuk course " + cs101.getCourseCode() + ":");
            cs101.getLecture().getDetails();
        } 
        else {
            System.out.println("Tidak ada pengampu untuk course " + cs101.getCourseCode());
        }
        System.out.println("=============Menghapus dosen dari course=============");
        cs101.removeLecture();
        // Periksa apakah ada pengampu untuk course sebelum mencetak detailnya
        if(cs101.getLecture() != null) {
        cs101.getLecture().getDetails();
        } 
        else {
            System.out.println("Tidak ada pengampu untuk course " + cs101.getCourseCode()+"\n");
        }

        
        bambang.teachCourse(cs101);
        bambang.viewTaughtCourses();
        System.out.println("=============Menghapus course dari dosen=============");
        bambang.unteachCourse(cs103);
        bambang.viewTaughtCourses();
    }
}
  