import java.util.Scanner;

public class Calculator {

    private static final Scanner input = new Scanner(System.in);



    public static void main(String[] args){
        Calculator calc = new Calculator();
        System.out.println("----------------------------------------------------------------");
        System.out.println("                       Scientific Calculator");
        System.out.println("----------------------------------------------------------------");
        do {
        System.out.println("Choose an operation :");
        System.out.println("1. Square root");
        System.out.println("5. Exit");

        System.out.println("Enter your choice : ");
        int choice = input.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Enter a positive number to calculate square root : ");
                    double number1 = input.nextDouble();
                    System.out.println("Square root of " + number1 + " is " + calc.squareRoot(number1));
                    System.out.println("-------------------------------------------------------------");
                    break;


                default:
                    return;
            }
        }
        while (true);

    }

    public double squareRoot(double number){
        return Math.pow(number,0.5);
    }




}
