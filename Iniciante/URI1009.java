import java.util.Scanner;

public class URI1009 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);

        String nome;
        double salario, vendas, comissao;

        nome = entrada.nextLine();
        salario = entrada.nextDouble();
        vendas = entrada.nextDouble();
        comissao = salario + (vendas * 0.15);

        System.out.println(String.format("TOTAL = R$ %.2f", comissao));
    }
}
