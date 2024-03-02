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
      System.out.printf("(Menghapus mahasiswa %s dari course %s )\n", cahyo.getName(), cs101.getCourseName());
      cs101.removeStudent(cahyo);
      cs101.viewEnrolledStudents();

    //   Scanner scanner = new Scanner(System.in);

    //     System.out.println("Selamat datang di sistem akademik!");
    //     System.out.println("Silakan pilih aksi:");

    //     while (true) {
    //         System.out.println("1. Tambah Mahasiswa");
    //         System.out.println("2. Tambah Dosen");
    //         System.out.println("3. Tambah Kursus");
    //         System.out.println("4. Lihat Detail Mahasiswa");
    //         System.out.println("5. Lihat Detail Dosen");
    //         System.out.println("6. Lihat Detail Kursus");
    //         System.out.println("7. Enroll Mahasiswa ke Kursus");
    //         System.out.println("8. Lihat Mahasiswa yang Terdaftar di Kursus");
    //         System.out.println("9. Keluar");

    //         System.out.print("Pilih aksi (1-9): ");
    //         int choice = scanner.nextInt();

    //         switch (choice) {
    //             case 1:
    //                 System.out.print("Masukkan nama mahasiswa: ");
    //                 String studentName = scanner.next();
    //                 System.out.print("Masukkan umur mahasiswa: ");
    //                 int studentAge = scanner.nextInt();
    //                 System.out.print("Masukkan alamat mahasiswa: ");
    //                 String studentAddress = scanner.next();
    //                 System.out.print("Masukkan ID mahasiswa: ");
    //                 int studentID = scanner.nextInt();
                    
    //                 Student newStudent = new Student(studentName, studentAge, studentAddress, studentID);
    //                 // Logika untuk menambah mahasiswa
    //                 break;
    //             case 2:
    //                 // Logika untuk menambah dosen
    //                 break;
    //             case 3:
    //                 // Logika untuk menambah kursus
    //                 break;
    //             case 4:
    //                 // Logika untuk melihat detail mahasiswa
    //                 break;
    //             case 5:
    //                 // Logika untuk melihat detail dosen
    //                 break;
    //             case 6:
    //                 // Logika untuk melihat detail kursus
    //                 break;
    //             case 7:
    //                 // Logika untuk enroll mahasiswa ke kursus
    //                 break;
    //             case 8:
    //                 // Logika untuk melihat mahasiswa yang terdaftar di kursus
    //                 break;
    //             case 9:
    //                 System.out.println("Terima kasih! Program selesai.");
    //                 scanner.close();
    //                 System.exit(0);
    //                 break;
    //             default:
    //                 System.out.println("Pilihan tidak valid. Silakan pilih lagi.");
    //         }
    //     }
    }
  }
  