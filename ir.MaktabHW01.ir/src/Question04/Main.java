package Question04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter at least 2 numbers (type 'done' to finish input):");

        int maxLength = Integer.MIN_VALUE;
        int maxCount = 0;
        int minLength = Integer.MAX_VALUE;
        int minCount = 0;

        int prevNum = Integer.MAX_VALUE;

        while (true) {
            if (scanner.hasNextInt()) {
                int num = scanner.nextInt();

                if (num != prevNum) {
                    if (num < minLength) {
                        minLength = num;
                        minCount = 1;
                    } else if (num == minLength) {
                        minCount++;
                    }

                    if (maxLength < 2) {
                        maxLength = 2;
                        maxCount = 1;
                    }

                    prevNum = num;
                }
            } else if (scanner.hasNext("done")) {
                break;
            } else {
                System.out.println("Invalid input. Please enter a number or type 'done' to finish.");
                scanner.next();
            }
        }

        System.out.println("Max length of subsequence: " + maxLength);
        System.out.println("Number of subsequences with max length: " + maxCount);
        System.out.println("Length of min of subsequence: " + minLength);
        System.out.println("Number of subsequences with min length: " + minCount);

        scanner.close();
    }
}
