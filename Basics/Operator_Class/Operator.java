import java.util.Scanner;

public class Operator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Apni percentage enter karein: ");
        double percentage = sc.nextDouble();

        // Agar 60% se zyada hai toh eligible
        if (percentage >= 60.0) {
            System.out.println("Badhai ho! Aap interview ke liye eligible hain.");
        } else if (percentage >= 50.0 && percentage < 60.0) {
            System.out.println("Aap waitlist mein hain.");
        } else {
            System.out.println("Agli baar mehnat karein.");
        }

        sc.close();
    }
}
