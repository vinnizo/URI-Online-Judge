import java.util.Scanner;

public class URI1010 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        int cod1, cod2, qnt1, qnt2;
        double valor1, valor2, valor_total; 

        cod1 = entrada.nextInt();
        qnt1 = entrada.nextInt();
        valor1 = entrada.nextDouble();

        cod2 = entrada.nextInt();
        qnt2 = entrada.nextInt();
        valor2 = entrada.nextDouble();

        valor_total = qnt1 * valor1 + qnt2 * valor2;

        System.out.println(String.format("VALOR A PAGAR: R$ %.2f", valor_total));
    }
}
