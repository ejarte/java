import java.util.Random;

public class main {
    public static void main(String[] args) {
        boolean[] bool = new boolean[35+1];
        int[] row = new int[7];
        int temp;
        int i = 0;
        Random rand = new Random();

        while(i < 7){
            temp = rand.nextInt(35)+1;
            if(!bool[temp]){
                bool[temp] = true;
                row[i] = temp;
                i++;
            }
        }

        for (int y : row) {
            System.out.println(y);
        }
    }
}
