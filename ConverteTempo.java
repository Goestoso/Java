//Faça um programa que possua um método chamado verificarTempo que recebe por parâmetro o tempo de duração de uma fábrica expressa em segundos. O método deve efetuar cálculos a fim de imprimir a equivalência do tempo recebido em horas, minutos e segundos


import java.util.Scanner;

public class ConverteTempo {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

        System.out.println("\nFÁBRICA EXPRESSA EM SEGUNDOS ^-^ ");

        System.out.print("\nDigite um valor de tempo (segundos): ");
        int time = sc.nextInt();

        System.out.println("\n" + verificarTempo(time));

         sc.close();

    }

    public static String verificarTempo(int tempo) {

        int hora = tempo / 3600, min = (tempo % 3600)/ 60, seg = tempo % 60;

        //Dividimos o totalSegundos por 3600 para obter o número de horas.
        //Calculamos o resto da divisão por 3600 e, em seguida, dividimos por 60 para obter o número de minutos.
        //O resto da divisão por 60 nos dá o número de segundos restantes.

        return (tempo + " segundo(s) equivalem a " + hora + " hora(s), " + min + " minuto(s) e " + seg +
                " segundo(s).");

    }
}
