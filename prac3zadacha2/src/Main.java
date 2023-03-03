import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[][] matrix = new int[N][M];
        for (int i = 0; i <N; i++)
        {
            for (int j = 0; j < M; j++)
            {
                matrix[i][j] = N;
                System.out.print(matrix[i][j]);
            }
            System.out.println();
        }
    }
}