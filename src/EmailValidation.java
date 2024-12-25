import java.util.regex.Pattern;

public class EmailValidation {
    public static boolean validate(String email)
    {
        String pattern = "^[a-zA-Z0-9_.$]+@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}$";
        return Pattern.matches(pattern,email);
    }
}
