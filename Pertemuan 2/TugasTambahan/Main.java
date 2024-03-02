import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Main {
  private static List<Student> students = new ArrayList<>();
  private static List<Lecture> lectures = new ArrayList<>();
  private static List<Course> courses = new ArrayList<>();
    public static void main(String[] args) {
      
      Lecture agus = new Lecture("Agus", 35, "Tembalang", 177013);
      Lecture bambang = new Lecture("Bambang", 35, "Banyumanik", 412873);
      lectures.add(agus);
      lectures.add(bambang);

      Student cahyo = new Student("Cahyo", 20, "456 Elm St", 723751);
      Student dani = new Student("Dani", 20, "123 Oak St", 734621);
      Student edi = new Student("Edi", 20, "789 Pine St", 733451);
      students.add(cahyo);
      students.add(dani);
      students.add(edi);

      Course cs101 = new Course("CS101", "Intro to Computer Science");
      Course cs102 = new Course("CS102", "Data Structures");
      Course cs103 = new Course("CS103", "Algorithms");
      courses.add(cs101);
      courses.add(cs102);
      courses.add(cs103);

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
      
      Scanner scanner = new Scanner(System.in);
      
        System.out.println("Selamat datang di sistem akademik!");

        while (true) {
            System.out.println("\nSilakan pilih aksi:");
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Tambah Dosen");
            System.out.println("3. Tambah Kursus");
            System.out.println("4. Lihat Daftar Mahasiswa");
            System.out.println("5. Lihat Daftar Dosen");
            System.out.println("6. Lihat Daftar Kursus");
            System.out.println("7. Enroll Mahasiswa ke Kursus");
            System.out.println("8. Lihat Mahasiswa yang Terdaftar di Kursus");
            System.out.println("9. Lihat Kursus yang Diikuti Mahasiswa");
            System.out.println("10. Unenroll Mahasiswa dari Kursus");
            System.out.println("11. Tambahkan Kursus yang Diajar Dosen");
            System.out.println("12. Lihat Kursus yang Diajar Dosen");
            System.out.println("13. Keluar");

            System.out.print("Pilih aksi (1-13): ");
            int choice = scanner.nextInt();
            System.out.println();
            switch (choice) {
                case 1:
                    System.out.print("Masukkan nama mahasiswa: ");
                    String studentName = scanner.next();
                    System.out.print("Masukkan umur mahasiswa: ");
                    int studentAge = scanner.nextInt();
                    System.out.print("Masukkan alamat mahasiswa: ");
                    String studentAddress = scanner.next();
                    System.out.print("Masukkan ID mahasiswa: ");
                    int studentID = scanner.nextInt();
                    
                    Student newStudent = new Student(studentName, studentAge, studentAddress, studentID);
                    students.add(newStudent);
                    break;
                case 2:
                    System.out.print("Masukkan nama dosen: ");
                    String lectureName = scanner.next();
                    System.out.print("Masukkan umur dosen: ");
                    int lectureAge = scanner.nextInt();
                    System.out.print("Masukkan alamat dosen: ");
                    String lectureAddress = scanner.next();
                    System.out.print("Masukkan ID dosen: ");
                    int lectureID = scanner.nextInt();
                    
                    Lecture newLecture = new Lecture(lectureName, lectureAge, lectureAddress, lectureID);
                    lectures.add(newLecture);
                    break;
                case 3:
                    System.out.print("Masukkan kode kursus : ");
                    String courseCode = scanner.next();
                    System.out.print("Masukkan nama kursus : ");
                    String courseName = scanner.next();
                
                    Course newCourse = new Course(courseCode, courseName);
                    courses.add(newCourse);
                    break;
                case 4:
                    System.out.println("Daftar Mahasiswa:");
                    for (Student student : students) {
                        student.getDetails();
                    }
                    break;
                    
                case 5:
                    System.out.println("Daftar Dosen:");
                    for (Lecture lecture : lectures) {
                        lecture.getDetails();
                    }
                    break;
                case 6:
                    System.out.println("Daftar Kursus:");
                    for (Course course : courses) {
                        course.getDetails();
                    }
                    break;
                case 7:
                    System.out.println("Daftar Mahasiswa:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i + 1) + ". " + students.get(i).getName());
                    }
                    System.out.print("Pilih nomor mahasiswa: ");
                    int studentIndex = scanner.nextInt();
                    Student selectedStudent = students.get(studentIndex - 1);

                    System.out.println("Daftar Kursus:");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
                    }
                    System.out.print("Pilih nomor kursus: ");
                    int courseIndex = scanner.nextInt();
                    Course selectedCourse = courses.get(courseIndex - 1);

                    selectedCourse.addStudent(selectedStudent);
                    System.out.println(selectedStudent.getName() + " berhasil dienroll ke kursus " + selectedCourse.getCourseName());
                    break;
                case 8:
                    System.out.println("Daftar Kursus:");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
                    }
                    System.out.print("Pilih nomor kursus: ");
                    int selectedCourseIndex = scanner.nextInt();
                    Course selectedCourseForStudents = courses.get(selectedCourseIndex - 1);
                    selectedCourseForStudents.viewEnrolledStudents();
                    break;
                case 9:
                    System.out.println("Daftar Mahasiswa:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i + 1) + ". " + students.get(i).getName());
                    }
                    System.out.print("Pilih nomor mahasiswa: ");
                    int selectedStudentIndex = scanner.nextInt();

                    Student selectedStudentForCourses = students.get(selectedStudentIndex - 1);
                    selectedStudentForCourses.viewEnrolledCourses();
                    break;
                case 10:
                    System.out.println("Daftar Mahasiswa:");
                    for (int i = 0; i < students.size(); i++) {
                        System.out.println((i + 1) + ". " + students.get(i).getName());
                    }
                    System.out.print("Pilih nomor mahasiswa: ");
                    int selectedStudentIndexToRemove = scanner.nextInt();
                    Student selectedStudentToRemove = students.get(selectedStudentIndexToRemove - 1);
                    
                    System.out.println("Daftar Kursus:");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
                    }
                    System.out.print("Pilih nomor kursus: ");
                    int courseRemovedIndex = scanner.nextInt();
                    Course selectedRemovedCourse = courses.get(courseRemovedIndex - 1);

                    selectedRemovedCourse.removeStudent(selectedStudentToRemove);
                    System.out.println(selectedStudentToRemove.getName() + " berhasil keluar dari kursus " + selectedRemovedCourse.getCourseName());
                    break;

                case 11:
                    System.out.println("Daftar Dosen:");
                    for (int i = 0; i < lectures.size(); i++) {
                        System.out.println((i + 1) + ". " + lectures.get(i).getName());
                    }
                    System.out.print("Pilih nomor dosen: ");
                    int selectedLectureIndexForCourse = scanner.nextInt();
                    Lecture selectedLectureForCourse = lectures.get(selectedLectureIndexForCourse - 1);

                    System.out.println("Daftar Kursus:");
                    for (int i = 0; i < courses.size(); i++) {
                        System.out.println((i + 1) + ". " + courses.get(i).getCourseName());
                    }
                    System.out.print("Pilih nomor kursus: ");
                    int selectedCourseIndexForLecture = scanner.nextInt();
                    Course selectedCourseForLecture = courses.get(selectedCourseIndexForLecture - 1);

                    selectedLectureForCourse.teachCourse(selectedCourseForLecture);
                    System.out.println(selectedLectureForCourse.getName() + " berhasil diassign ke kursus " + selectedCourseForLecture.getCourseName());
                    break;
                case 12:
                    System.out.println("Daftar Dosen:");
                    for (int i = 0; i < lectures.size(); i++) {
                        System.out.println((i + 1) + ". " + lectures.get(i).getName());
                    }
                    System.out.print("Pilih nomor dosen: ");
                    int selectedLectureIndexForViewCourses = scanner.nextInt();
                    Lecture selectedLectureForViewCourses = lectures.get(selectedLectureIndexForViewCourses - 1);

                    selectedLectureForViewCourses.viewTaughtCourses();
                    break;
                case 13:
                    System.out.println("Terima kasih! Program selesai.");
                    scanner.close();
                    System.exit(0);
                    break;
                default:
                    System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
            }
        }
    }
  }
  
