import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = 4;
        int[] numbers = new int[n];
        for(int i = 0; i < numbers.length; i++) {
            numbers[i] = scan.nextInt();
        }
        System.out.println("backwards");
        for(int i = numbers.length - 1; i >= 0; i--) {
            //System.out.println(i);
            System.out.println(numbers[i]);
        }
    }
}