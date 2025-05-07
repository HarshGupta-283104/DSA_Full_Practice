
import java.util.Scanner;

public class LoopProblems {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("This Code is for counting digit in a number.");
 
        int n = sc.nextInt();
        int numberOfDigit = 0;
        while (n>0) {
            n = n/10;
            numberOfDigit++;
                 
        }
        System.out.println(numberOfDigit);

        System.out.println("This is for Adding the digit in a number.");


        int NewNumber = sc.nextInt();
        int AddedNumber = 0;
        
        while(NewNumber > 0){
            AddedNumber += NewNumber % 10;
            NewNumber = NewNumber / 10;


        }
        System.out.println("The Added Number is " + AddedNumber);
    }
}
