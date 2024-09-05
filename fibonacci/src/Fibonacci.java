import java.util.Scanner;

public class Fibonacci {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite um número para verificar se pertence à sequência de Fibonacci: ");
        int num = scanner.nextInt();

        if (verificaFibonacci(num)) {
            System.out.println("O número " + num + " pertence à sequência de Fibonacci.");
        } else {
            System.out.println("O número " + num + " não pertence à sequência de Fibonacci.");
        }
        scanner.close();
    }

    public static boolean verificaFibonacci(int num) {

        int a = 0, b = 1, next = 0;

        if (num == 0 || num == 1) {
            return true;
        }

        while (next < num) {
            next = a + b;
            a = b;
            b = next;
        }

        return next == num;
    }

}