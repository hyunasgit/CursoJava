import java.util.Scanner;

public class calculadora {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int primeiro, segundo, opcao = -1;
        int resultado;
        double resDiv;
        
        while (opcao != 0) {
            // Exibir o menu de opções
            System.out.println("Escolha a operação:");
            System.out.println("1. Soma");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("0. Sair");
            
            // Ler a opção do usuário
            opcao = entrada.nextInt();

            // Se a opção for 0, sair do loop
            if (opcao == 0) {
                System.out.println("Saindo...");
                break;
            }

            // Ler os números do usuário
            System.out.println("Insira o primeiro número:");
            primeiro = entrada.nextInt();
            System.out.println("Insira o segundo número:");
            segundo = entrada.nextInt();

            // Realizar a operação escolhida
            switch (opcao) {
                case 1: // Soma
                    resultado = primeiro + segundo;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 2: // Subtração
                    resultado = primeiro - segundo;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 3: // Multiplicação
                    resultado = primeiro * segundo;
                    System.out.println("Resultado: " + resultado);
                    break;

                case 4: // Divisão
                    if (segundo != 0) {
                        resDiv = (double) primeiro / segundo;
                        System.out.println("Resultado: " + resDiv);
                    } else {
                        System.out.println("Erro: Não é possível dividir por zero.");
                    }
                    break;

                default:
                    System.out.println("Opção inválida. Por favor, tente novamente.");
                    break;
            }
        }

        entrada.close();
    }
}
