import java.util.Scanner;

public class SumOfN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Kahan tak ka sum chahiye? (n): ");
        int n = sc.nextInt();
        
        int sum = 0; // Shuruat mein sum zero hoga
        
        // Loop 1 se n tak chalega
        for (int i = 1; i <= n; i++) {
            sum = sum + i; // Purane sum mein naya i jorr rahe hain
        }
        
        System.out.println("1 se " + n + " tak ka total sum hai: " + sum);
        
        sc.close();
    }
}
