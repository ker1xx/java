import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int N = scan.nextInt();
        int[] array = new int[N];
        Random random = new Random();
        for (int i = 0; i<N; i++)
            array[i] = random.nextInt();
        System.out.println("Введите первый индекс");
        int K = scan.nextInt();
        System.out.println("Введите второй индекс");
        int L = scan.nextInt();
        int sum=0;
        for (int i = 0; i < K; i++)
            sum += i;
        for (int i = L+1; i<N;i++)
            sum += i;
        System.out.println(sum);
    }
}