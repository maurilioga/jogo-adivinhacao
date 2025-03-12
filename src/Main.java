import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        int numeroSorteado = new Random().nextInt(100);
        int numeroUsuario = 0;
        boolean palpiteCerto = false;

        System.out.println("Bem vindo ao jogo da adivinhação!");
        System.out.println("Você tem 5 tentativas para tentar acertar o número sorteado pela máquina");
        System.out.println("Insira um número de 0 até 100");

        for (int i = 1; i <= 5; i++) {
            System.out.println(i + "ª tentativa: ");
            numeroUsuario = leitura.nextInt();

            if (numeroSorteado > numeroUsuario) {
                System.out.println("Próxima tentativa! O número sorteado foi maior que o número inserido!");
            } else if (numeroSorteado < numeroUsuario) {
                System.out.println("Próxima tentativa! O número sorteado foi menor que o número inserido!");
            } else {
                System.out.println("PARABÉNS! Você acertou o número sorteado pela máquina!");
                palpiteCerto = true;
                break;
            }
        }

        if (!palpiteCerto) {
            System.out.println("Infelizmente você não conseguiu acertar o número! O número sorteado foi: " + numeroSorteado);
        }
    }
}
