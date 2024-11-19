import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter a number: ");
        int n = scanner.nextInt();
        int counter = 0;
        if (n == 0)
            counter = 1;
        while (n > 0) {
            if (n % 10 == 0)
                counter++;
            n = n / 10;

        }
        System.out.println("the amount of zero is: "+counter);
    }
}