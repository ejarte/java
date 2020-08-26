import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double x;
        System.out.print("Hur mycket pengar vill du sätta in? ");
        x = scan.nextDouble();

        if(x> 100000){
            x = x * 0.025;
        }else{
            x = x * 0.005;
        }

        System.out.println("Årsräntan " + x);
    scan.close();
    }
}