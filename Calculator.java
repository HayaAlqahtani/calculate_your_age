import java.util.Calendar;
import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
       
        System.out.println("insert your birth year");
        int birthYear = scanner.nextInt();
        
        System.out.println("insert your birth month");
        int birthMonth = scanner.nextInt();
        
        System.out.print("insert your birth day of the month: ");
        int birthDay = scanner.nextInt();

        Calendar currentDate = Calendar.getInstance();

        Calendar birthDate = Calendar.getInstance();
        birthDate.set(birthYear, birthMonth - 1, birthDay);

        int age = currentDate.get(Calendar.YEAR) - birthDate.get(Calendar.YEAR);

        if (currentDate.get(Calendar.DAY_OF_YEAR) < birthDate.get(Calendar.DAY_OF_YEAR)) {
            age--;
        }

        System.out.println("Your age is: " + age + " years old");

        scanner.close();
    }
}
