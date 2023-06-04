package Controlstatement.looping;
import java.util.Scanner;

public class PrimeNumber {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the lower number: ");
        int l = sc.nextInt();
        System.out.print("Enter the upper bound: ");
        int u = sc.nextInt();
        
        for (int i = l; i <= u; i++) {
            if (prime(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean prime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
    
}


