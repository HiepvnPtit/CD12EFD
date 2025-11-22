import java.util.Scanner;
public class gcd {
    // Method to calculate GCD using Euclidean algorithm
    public static long findGCD(long a, long b) {
        while (b != 0) {
            long temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

    // Method to calculate LCM using GCD
    public static long findLCM(long a, long b) {
        return Math.abs(a * b) / findGCD(a, b);
    }

    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        int t= sc.nextInt();
        for(int i=0;i<t;i++){
            long a= sc.nextLong();
            long b= sc.nextLong();
            System.out.println(findLCM(a,b) + " " + findGCD(a,b));

            
        }
    }
}
