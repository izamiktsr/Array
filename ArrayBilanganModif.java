import java.util.Scanner;

public class ArrayBilanganModif {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Change the array type to double to accommodate floating-point numbers
        double[] bil = new double[4];
        bil[0] = 5.0;      // This is now valid
        bil[1] = 12867;    // This is valid as well
        bil[2] = 7.5;      // This is now valid
        bil[3] = 2000000;  // This is valid as well
        
        for (int i = 0; i <= 4; i++) {
            System.out.println(bil[i]);
       
    }
}
}