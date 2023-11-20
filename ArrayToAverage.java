import java.util.ArrayList;
import java.util.Scanner;

public class ArrayToAverage {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a list of numbers separated by spaces:");
        String userInput = scanner.nextLine();
        scanner.close();

        double average = calculateAverage(userInput);
        System.out.println("Average: " + average);
    }

    public static double calculateAverage(String input) {
        String[] numbers = input.split(" ");
        ArrayList<Integer> numList = new ArrayList<>();

        for (String number : numbers) {
            try {
                int num = Integer.parseInt(number);
                numList.add(num);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please enter numeric values separated by spaces.");
                return 0;
            }
        }

        int total = 0;
        for (int num : numList) {
            total += num;
        }

        return (double) total / numList.size();
    }
}
