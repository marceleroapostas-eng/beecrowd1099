
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        int n = leitor.nextInt();

        for (int i = 0; i < n; i++) {
            int x = leitor.nextInt();
            int y = leitor.nextInt();

            int menor = Math.min(x, y);
            int maior = Math.max(x, y);
            int soma = 0;

            for (int j = menor + 1; j < maior; j++) {
                if (j % 2 != 0) {
                    soma += j;
                }
            }
            System.out.println(soma);
        }
        leitor.close();
    }
}
