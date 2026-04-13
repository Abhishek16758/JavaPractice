public class RectanglePattern {
    public static void main(String[] args) {
        int n = 4; // Rows
        int m = 5; // Columns (Stars in each line)

        // Outer loop: Lines ke liye
        for(int i = 1; i <= n; i++) {
            
            // Inner loop: Stars ke liye
            for(int j = 1; j <= m; j++) { // Yahan 'j' use karein
                System.out.print("*"); // Sirf print, line change nahi
            }
            
            // Ek line ke stars khatam hone ke baad line change karein
            System.out.println(); 
        }
    }
}
