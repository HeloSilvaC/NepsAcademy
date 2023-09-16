import java.util.Scanner;

public class Lampadas {
    
    public static void main(String[] args) {

        Scanner t = new Scanner(System.in);

        int total;
        int x;
        int i1 = 0;
        int i2 = 0;

        total = t.nextInt();

        for (int cont = 0; cont < total; cont++) {

            x = t.nextInt();
            if (x == 1) {
                i1 = 1 - i1;
            } else if (x == 2) {
                i1 = 1 - i1;
                i2 = 1 - i2;
            }
        }

        System.out.println(i1);
        System.out.println(i2);
    }
}
