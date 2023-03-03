import java.util.Scanner;
public class Main {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            int Number = scan.nextInt();
            boolean isdividing = false;
            int i = 0;
            while(Math.pow(i,3) <= Number)
            {
                i++;
                if (Math.pow(i,3) == Number) {
                    isdividing = true;
                    break;
                }
            }
            System.out.println(isdividing);
    }
}