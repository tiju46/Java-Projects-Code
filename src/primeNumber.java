import java.util.Scanner;

public class primeNumber {

    public static void main(String[] args) {
        System.out.println("Enter number to check Prime number");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        if (number % 2 ==0){
            System.out.println("Even number");
        }else {
            System.out.println("Odd Number");
        }
        boolean flag = false;
        for (int i = 2; i <= number / 2; ++i) {
            // condition for nonprime number
            if (number % i == 0) {
                flag = true;
                break;
            }
        }

        if (!flag)
            System.out.println(number + " is a prime number.");
        else
            System.out.println(number + " is not a prime number.");
    }
    }

