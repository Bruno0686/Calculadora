import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args) {
        System.out.println("Bem-vindo à Calculadora!");

        Scanner input = new Scanner(System.in);

        System.out.println("Digite o primeiro número: ");
        int numero1 = input.nextInt();
        System.out.println("     Escolha a operação desejada: ");
        System.out.println("     1 - Adição");
        System.out.println("     2 - Subtração");
        System.out.println("     3 - Multiplicação");
        System.out.println("     4 - Divisão");
        int operacao = input.nextInt();
        if (operacao < 1 || operacao > 4) {
            System.out.println("Operação inválida. Por favor, escolha uma operação válida.");
            return;
        }
    
        if (operacao == 1) {
            System.out.println("Digite o segundo número: ");
            int numero2 = input.nextInt();
            int resultado = numero1 + numero2;
            System.out.println("O resultado da adição é: " + resultado);
        } else if (operacao == 2) {
            System.out.println("Digite o segundo número: ");
            int numero2 = input.nextInt();
            int resultado = numero1 - numero2;
            System.out.println("O resultado da subtração é: " + resultado);
        } else if (operacao == 3) {
            System.out.println("Digite o segundo número: ");
            int numero2 = input.nextInt();
            int resultado = numero1 * numero2;
            System.out.println("O resultado da multiplicação é: " + resultado);
        } else if (operacao == 4) {
            System.out.println("Digite o segundo número: ");
            int numero2 = input.nextInt();
            if (numero2 == 0) {
                System.out.println("Divisão por zero não é permitida.");
                return;
            }
            double resultado = (double) numero1 / numero2;
            System.out.println("O resultado da divisão é: " + resultado);
        }
        
    
    }
}
    
