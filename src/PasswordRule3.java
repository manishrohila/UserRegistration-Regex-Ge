import java.util.regex.Pattern;

public class PasswordRule3 {
    public static boolean validate(String password) {
        String pattern = "^(?=.*[0-9]).{8,}$";
        return Pattern.matches(pattern, password);
    }
}
