package class_15.stream_optional;

public class LoginService {
  public String findUsernameByEmail(String email) {
    if (randomBoolean())
      return "RoqueSosa";
    else
      return null;
  }

  private static boolean randomBoolean() {
    return Math.random() > 0.5;
  }

  public String getDefaultUsername() {
    return "aUsername";
  }

  public boolean authenticate(String username) {
    return randomBoolean();
  }
}
