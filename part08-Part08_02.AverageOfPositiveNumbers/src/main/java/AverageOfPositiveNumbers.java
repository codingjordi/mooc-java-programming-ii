import java.util.Scanner;

public class AverageOfPositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sumOfNumbers = 0;
        int numbers = 0;

        while (true) {

            if (scanner.hasNextInt()) {
                int number = scanner.nextInt();

                if (number == 0) {
                    break;
                }

                if (number > 0) {
                    numbers++;
                    sumOfNumbers += number;
                }

            } else {
                System.out.println("Please enter a valid integer");
                scanner.next(); // limpia el valor inválido
            }
        }

        if (numbers == 0) {
            System.out.println("Cannot calculate the average");
        } else {
            System.out.println((double) sumOfNumbers / numbers);
        }

        scanner.close();
    }
}