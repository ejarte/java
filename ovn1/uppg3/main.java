import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        for(int i = 1; i < 100; i++) {
            if(i%n == 0){
                System.out.println("burr");
            }else{
                System.out.println(i);
            }
        }
    }
}