package OOPS_Concepts;

public class PolymorphismMethodOverloading {


    // Overloaded method to add two integers
    public int add(int a, int b) {
        return a + b;
    }

    // Overloaded method to add three integers
    public int add(int a, int b, int c) {
        return a + b + c;
    }

    // Overloaded method to add two double values
    public double add(double a, double b) {
        return a + b;
    }

    public static void main(String[] args) {
    	PolymorphismMethodOverloading calc = new PolymorphismMethodOverloading();

        // Calling overloaded methods
        System.out.println("Sum of two integers: " + calc.add(10, 20));              // Calls add(int, int)
        System.out.println("Sum of three integers: " + calc.add(10, 20, 30));        // Calls add(int, int, int)
        System.out.println("Sum of two doubles: " + calc.add(5.5, 4.5));            // Calls add(double, double)
    }
}
