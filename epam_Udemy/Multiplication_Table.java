package epam_Udemy;

public class Multiplication_Table {
	public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                //System.out.print(i*j + " ");
                System.out.printf("%3d", i*j);
            }
            System.out.println();
        }
    }
}
