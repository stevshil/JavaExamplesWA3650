public class CodeBlocks {
    public static void main(String[] args) {
        int x = 10;
        if (x > 5) { // Code block
            System.out.println("x is greater than 5");
            int y = x * 2; // Variable y is scoped to this block
            System.out.println("y is: " + y);
        } 
        
        // y is no longer accessible here
        // System.out.println("y out of if is: " + y); // This wil cause compile error
    }
}