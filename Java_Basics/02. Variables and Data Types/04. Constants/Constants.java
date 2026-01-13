public class Constants {
    public static void main(String[] args) {

        // Declaring a constant using "final" keyword
        // Once assigned, the value of a "final" variable cannot be changed
        final int houseNumber = 45;

        final boolean isAvailable;
        isAvailable = true;

        // Print the value of the constant
        System.out.println(houseNumber);
        System.out.println(isAvailable);

        // isAvailable = false;  // variable isAvailable might already have been assigned

        // Uncomment the following line to see the error
        // It will cause a compile-time error because "houseNumber" is a constant
        // houseNumber = 50; // error - cannot assign a value to final variable
    }
}
