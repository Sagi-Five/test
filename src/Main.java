import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


  Scanner sc = new Scanner(System.in);
        int [] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("Enter any number Matok :) : ");
        arr[i] = sc.nextInt();
        }
        int result = (int) Math.pow(arr[0], arr[1]);

        System.out.println(result);
    }
}