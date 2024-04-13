package Question05;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter numbers separated by spaces (type 'done' to finish input):");

        int[] numbers = new int[1];
        int count = 0;

        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                if (count == numbers.length) {
                    int[] newNumbers = new int[numbers.length * 2];
                    System.arraycopy(numbers, 0, newNumbers, 0, numbers.length);
                    numbers = newNumbers;
                }

                numbers[count] = num;
                count++;
            } else if (scanner.hasNext("done")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or type 'done' to finish.");
                scanner.next(); // consume invalid input
            }
        }

        int[] trimmedNumbers = new int[count];
        System.arraycopy(numbers, 0, trimmedNumbers, 0, count);

        if (trimmedNumbers.length < 2) {
            System.out.println("Insufficient numbers entered to calculate differences.");
            return;
        }

        int maxDifference = Integer.MIN_VALUE;
        int minDifference = Integer.MAX_VALUE;

        for (int i = 0; i < trimmedNumbers.length - 1; i++) {
            for (int j = i + 1; j < trimmedNumbers.length; j++) {
                int difference = Math.abs(trimmedNumbers[i] - trimmedNumbers[j]);
                if (difference > maxDifference) {
                    maxDifference = difference;
                }
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }

        System.out.println("Largest difference between numbers: " + maxDifference);
        System.out.println("Smallest difference between numbers: " + minDifference);

        scanner.close();
    }
}
