public class Fibonacci {
    
    // Método iterativo para calcular Fibonacci
    static long fib(int numero) {
        if (numero <= 1) {
            return numero;
        }
        
        long F = 1;
        long ant = 0;

        for (int i = 2; i <= numero; i++) {
            long temp = F;
            F += ant;
            ant = temp;
        }
        
        return F;
    }

    // Método recursivo para calcular Fibonacci
    static long fibRec(int numero) {
        if (numero < 2) {
            return numero;
        } else {
            return fibRec(numero - 1) + fibRec(numero - 2);
        }
    }

    // Atributos e métodos para o cálculo usando vetor
    private static int[] vetor = new int[50];
    private static int contador;

    static long fibVetor(int numero) {
        contador = 1;
        return vetRec(numero);
    }

    static long vetRec(int numero) {
        if (numero < 0) {
            return vetor[0];
        } else {
            if (contador < 3) {
                vetor[numero] = contador - 1;
                contador++;
            } else {
                vetor[numero] = vetor[numero - 1] + vetor[numero - 2];
            }
            return vetRec(numero - 1);
        }
    }

    // Método principal
    public static void main(String[] args) throws Exception {
        System.out.println("Calculando de maneira interativa:");

        for (int i = 0; i < 47; i++) {
            System.out.println("(" + i + "): " + Fibonacci.fib(i) + "\t");
        }

        System.out.println("\nCalculando de maneira recursiva:");

        for (int i = 0; i < 47; i++) {
            System.out.println("(" + i + "): " + Fibonacci.fibRec(i) + "\t");
        }

        System.out.println("\nCalculando com vetor:");

        for (int i = 0; i < 47; i++) {
            System.out.println("(" + i + "): " + Fibonacci.fibVetor(i) + "\t");
        }
    }
}