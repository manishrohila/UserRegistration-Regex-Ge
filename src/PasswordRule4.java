import java.util.regex.Pattern;

public class PasswordRule4 {
    public static boolean validate(String password) {
        String pattern = "^(?=.*[!@#$%^&*()_+=\\-{}\\[\\]:;\"'<>,.?]).{8,}$";
        return Pattern.matches(pattern, password);
    }
}
