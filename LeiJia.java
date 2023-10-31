import java.util.Scanner;

public class LeiJia {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int start = scanner.nextInt();
        int end = scanner.nextInt();
        int total = 0;
        if (end < start){
            System.out.println("warning");
        }
        else {
            for (int i = start; i <= end; i++) {
                total += i;
            }
            System.out.print(total);
        }
    }
}
