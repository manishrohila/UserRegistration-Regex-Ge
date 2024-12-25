import java.util.regex.Pattern;

public class EmailSamplesValidation {
    public static boolean validate(String email) {
        String pattern = "^[a-zA-Z0-9]+([._+-]?[a-zA-Z0-9]+)*@[a-zA-Z0-9]+\\.[a-zA-Z]{2,}(\\.[a-zA-Z]{2,})?$";
        return Pattern.matches(pattern, email);
    }
}
