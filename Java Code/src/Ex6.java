import java.util.ArrayList;
import java.util.Scanner;

//Write a program that constructs an arraylist containing the numbers 1 to 100, and prints them out.
//The program ask the user for a number and remove all multiples of that number (except for the number itself) from the list.
//Print the list again.
//For example, if the user selects 5, it will remove 10, 15, 20, 25, 30, etc from the list.
public class Ex6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            numbers.add(i+1);
        }
        System.out.println(numbers);
        System.out.println("Number to remove multipliers of:");
        int choice = scanner.nextInt();

        for (int i = 0; i < numbers.size(); i++) {
            if((numbers.get(i) % choice == 0) && numbers.get(i) != choice){
                numbers.remove(i);
            }
        }
        System.out.println(numbers);
    }
}
