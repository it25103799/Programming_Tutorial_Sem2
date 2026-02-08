public class Question4 {
    public static void main(String[] args) {
        
        int i = 0;
        while (i < 4) {
            int j = 0;
            while (j < 5) {
                System.out.print("* ");
                j++;
            }
            System.out.println();
            i++;
        }
        
        int n = 4; 
        for (int row = 1; row <= n; row++) {
           
            for (int space = 1; space <= n - row; space++) {
                System.out.print(" ");
            }
            
            for (int star = 1; star <= row; star++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}