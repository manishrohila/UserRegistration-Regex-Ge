import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("First Name Validation: " + NameValidation.validatefirstName("Joh")); // True
        System.out.println("Last Name Validation: " + NameValidation.validateSecondName("Doe")); // True
        System.out.println("Email Validation: " + EmailValidation.validate("abc.xyz@bl.co.in")); // True
        System.out.println("Mobile Validation: " + MobileValidation.validate("91 9919819801")); // True
        System.out.println("Password Rule 1 Validation: " + PasswordRule1.validate("Password1@")); // True
        System.out.println("Password Rule 2 Validation: " + PasswordRule2.validate("passWord1@")); // True
        System.out.println("Password Rule 3 Validation: " + PasswordRule3.validate("Password1@")); // True
        System.out.println("Password Rule 4 Validation: " + PasswordRule4.validate("Password1@")); // True
        System.out.println("Email Samples Validation: " + EmailSamplesValidation.validate("abc.xyz@bl.co.in")); // True
    }
}