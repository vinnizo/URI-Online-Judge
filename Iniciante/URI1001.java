import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int A;
        int B;
        Scanner leitor = new Scanner(System.in);
        A = leitor.nextInt();
        B = leitor.nextInt();
        int x = A + B;
        System.out.println("X = " + x);
    }
}
