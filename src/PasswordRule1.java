import java.util.regex.Pattern;

public class PasswordRule1 {
    public static boolean validate(String password)
    {
        String pattern = ".{8,}$";
        return Pattern.matches(pattern,password);
    }
}
