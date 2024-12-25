import java.util.regex.Pattern;

public class NameValidation {
    public static boolean validatefirstName(String firstName){
        String pattern= "^[A-Z][a-z]{2,}$";
        return Pattern.matches(pattern,firstName);
    }
    public static boolean validateSecondName(String lastName){
        String pattern = "^[A-Z][a-z]{2,}$";
        return Pattern.matches(pattern,lastName);
    }

}
