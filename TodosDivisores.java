import java.util.Scanner;

public class TodosDivisores {
    public static void main(String[] args) throws Exception {
       
        Scanner teclado = new Scanner(System.in);

        int x;
        x = teclado.nextInt();

        int v[] = new int[x];

        for (int i = 1; i <= x; i++) {
            if (x % i == 0) {
                v[i - 1] = i;
            }
        }

        for (int i = 0; i < x; i++) {
            if (v[i] != 0) {
                System.out.print(v[i] + " ");
            }
        }
    }
}
