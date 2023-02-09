import java.util.Scanner;

public class Main {
    public static PhoneNumberExample phoneNumberExample;
    public static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        phoneNumberExample = new PhoneNumberExample();
        while (true) {
            System.out.println("Enter phone number: ");
            String phoneNumber = input.nextLine();
            if (phoneNumberExample.validate(phoneNumber)) {
                System.out.println(phoneNumber + " is true.");
                break;
            } else {
                System.out.println(phoneNumber + " is false.");
            }
        }
    }
}