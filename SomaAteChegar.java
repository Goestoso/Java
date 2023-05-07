//Fazer o usuário alcançar o valor do prêmio aleatório (entre 100 e 1000) através de tentativa e erro//
import java.util.Random;
import java.util.Scanner;

public class SomaAteChegar {
    public static void main (String [] args) {
        Random random = new Random ();
        Scanner scanner = new Scanner (System.in);
        int soma = 0;
        int tentativas = 0;
        int premio = random .nextInt(901) + 100;
        while (soma < premio){
            System.out.print ("Digite um valor para atingir o prêmio: ");
            int n = scanner.nextInt();
            soma = soma + n;
            //int soma = soma + scanner.nextInt();
            //soma += scanner.nextInt();
            System.out.println ("Total somado até agora: " + soma);
            tentativas++;
        }
        System.out.println ("o prêmio é " + premio);
        System.out.println ("você somou: " + soma);
        System.out.println ("n° de tentativas: " + tentativas);
        if (soma != premio) {
            System.out.println("você devolve: " + (soma - premio));
        }
        scanner.close();
    }    
}
