import java.util.regex.Pattern;

public class MobileValidation {
    public static boolean validate(String number ){
        String pattern = "^[5-9]\\d{9}$";
        return Pattern.matches(pattern,number);
    }
}
