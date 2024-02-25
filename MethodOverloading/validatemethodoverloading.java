package MethodOverloading;

public class validatemethodoverloading {

    boolean validate(String name) {
        return name.matches("[a-zA-Z\\s]+");
    }

    boolean validate(int age) {
        return age >= 3 && age <= 15;
    }

    int reverse(int n) {
        int rev = 0;
        while (n > 0) {
            rev = rev * 10 + n % 10;
            n = n / 10;
        }
        return rev;
    }

    int[] reverse(int A[]) {
        int B[] = new int[A.length];
        for (int i = A.length - 1, j = 0; i >= 0; i--, j++) {
            B[j] = A[i];
        }
        return B;
    }

    static double area(double radius) {
        return Math.PI * radius * radius;
    }

    static double area(double length, double breadth) {
        return length * breadth;
    }

    public static void main(String[] args) {
        validatemethodoverloading obj = new validatemethodoverloading();

        // Validate name
        System.out.println("Is 'Cherry' a valid name? " + obj.validate("John Doe"));

        // Validate age
        System.out.println("Is 10 a valid age? " + obj.validate(10));

        // Reverse integer
        System.out.println("Reverse of 1234 is: " + obj.reverse(1234));

        // Reverse array
        int[] array = {1, 2, 3, 4, 5};
        int[] reversedArray = obj.reverse(array);
        System.out.print("Reversed array: ");
        for (int i : reversedArray) {
            System.out.print(i + " ");
        }
        System.out.println(); // New line after printing array

        // Area of circle
        System.out.println("Area of circle with radius 5: " + area(5.0));

        // Area of rectangle
        System.out.println("Area of rectangle with length 4.5 and breadth 2: " + area(4.5, 2.0));
    }
}