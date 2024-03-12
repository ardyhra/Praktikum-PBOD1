public class UserInputValidator {
  public static void validateUsername(String username) {
    String regex = "^[A-Za-z][a-zA-Z0-9_]+$";
    assert(username.length()>=5):"username minimal memiliki panjang 5 karakter";
    assert(username.length()<=20):"username maksimal memiliki panjang 20 karakter";
    assert(username.matches(regex)):"username tidak valid";
  }

  public static void validateEmail(String email) {
    String regex = "[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}";
    assert(email.matches(regex)):"email tidak valid";

  }

  public static void validateAge(int age) {
    assert(age>=17 && age<=99):"umur harus di antara 17 hingga 99 tahun";
  }
}
