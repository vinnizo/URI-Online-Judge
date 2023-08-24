import java.util.Scanner;

public class URI1008 {
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int funcionario, horas;
        double valor, valor_hora;

        funcionario = entrada.nextInt();
        horas = entrada.nextInt();
        valor = entrada.nextDouble();

        valor_hora = valor * horas;

        System.out.println("NUMBER = " + funcionario);
        System.out.println(String.format("SALARY = U$ %.2f", valor_hora));

        entrada.close();
    }
}
