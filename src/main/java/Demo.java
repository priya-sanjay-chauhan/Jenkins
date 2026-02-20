package src.main.java;
// public class Demo{
//    public static void main(String[] args) {
//       System.out.println("Hello Jenkins");
//    }
// }



class Demo {

    // Method to check whether a number is even or odd
    static void checkEvenOdd(int number) {
        if (number % 2 == 0) {
            System.out.println(number + " is Even");
        } else {
            System.out.println(number + " is Odd");
        }
    }

    public static void main(String[] args) {

        System.out.println("Program started");

        int a = 50;
        int b = 91;

        checkEvenOdd(a);
        checkEvenOdd(b);

        System.out.println("Program ended");
    }
}
