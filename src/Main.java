import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scam = new Scanner(System.in);

            System.out.print("Digite um número: ");
            int num = scam.nextInt();
            boolean resultado = verificador.verificando(num);

            if (resultado) {
                System.out.print("O valor digitado é PAR");
                System.out.println();
            } else {
                System.out.print("O valor digitado é IMPAR");
                System.out.println();
            }
    }
}
