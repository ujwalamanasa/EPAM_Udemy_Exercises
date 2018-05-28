package epam_Udemy;
import java.util.Scanner;
public class Boiling_Exercise {
	public static void main(String[] args) {
        System.out.println("Give in the temperature:");
        Scanner sc = new Scanner(System.in);
        int temp = sc.nextInt();
        if (temp >= 100) {
            System.out.println("The water is boiling.");
        } else {
            System.out.println("The water is not boiling.");
        }
    }
}
