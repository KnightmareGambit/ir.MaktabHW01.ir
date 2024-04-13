import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the salary: ");
        double salary = input.nextDouble();
        double tax;

        if (salary < 3000000) {
            tax = 0.05 * salary;
        } else if (salary < 6000000) {
            tax = 0.10 * salary;
        } else {
            tax = 0.24 * salary;
        }

        double finalSalary = salary - tax;
        System.out.println("Salary after tax: " + finalSalary);

        input.close();


    }
}
