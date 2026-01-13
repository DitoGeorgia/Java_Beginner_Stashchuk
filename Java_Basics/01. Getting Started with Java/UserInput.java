import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("Enter your name: ");
//        String name = input.nextLine();
//
//        System.out.println("Enter your surname: ");
//        String surname = input.nextLine();
//
//        System.out.println("Enter your age: ");
//        int age = input.nextInt();
//
//        System.out.println("Your name is " + name);
//        System.out.println("Your surname is " + surname);
//        System.out.println("Your age is " + age);

        System.out.println("Enter your name: ");
        String inputName = new Scanner(System.in).nextLine();
        System.out.println("Your name: " + inputName);

        System.out.println("\nEnter your surname: ");
        String inputSurname = new Scanner(System.in).nextLine();
        System.out.println("Your surname: " + inputSurname);

        System.out.println("\nYour age: ");
        int inputAge = new Scanner(System.in).nextInt();
        System.out.println("Your age: " + inputAge);
    }
}
