package Ravikumar.Sujatha.SumofNNumbers; /**
 * Created by sujatharavikumar on 9/9/16.
 */
import java.util.Scanner;

public class SumOfNNumbers {

    public static void main(String args[]){

        Calculator calculateSum = new Calculator();
        Input input = new Input();
        int number = input.getInput();
        int result = calculateSum.sum(number);
        System.out.println("The sum of the first "+number+ " numbers is "+result);
    }
}
