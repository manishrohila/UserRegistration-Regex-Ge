import java.util.regex.Pattern;

public class PasswordRule2 {
    public static boolean validate(String password)
    {
        String pattern = "^(?=.*[A-Z]).{8,}$";
        return Pattern.matches(pattern,password);
    }
}
