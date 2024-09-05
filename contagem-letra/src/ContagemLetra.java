import java.util.Scanner;

public class ContagemLetra {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Digite uma string: ");
        String texto = scanner.nextLine();

        int contador = contarLetrasA(texto);

        if (contador > 0) {
            System.out.println("A letra 'a' aparece " + contador + " vezes na string.");
        } else {
            System.out.println("A letra 'a' não foi encontrada na string.");
        }

        scanner.close();
    }

    public static int contarLetrasA(String texto) {
        int contador = 0;

        // Converte todos os caracteres da string para minúsculo para evitar erros de comparação
        texto = texto.toLowerCase();

        for (int i = 0; i < texto.length(); i++) {
            if (texto.charAt(i) == 'a') {
                contador++;
            }
        }

        return contador;
    }
}