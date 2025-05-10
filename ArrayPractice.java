
import java.util.Scanner;

public class ArrayPractice {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array: ");
        int n = sc.nextInt();
        String[] arr = new String[n]; 
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }
        for (int i = 0; i < n; i++) {
            System.out.println("The Elements present in the array: "+" "+i+" "+arr[i] + " ");
        }
        
    }
}