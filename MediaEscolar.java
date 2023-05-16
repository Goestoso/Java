import java.util.Scanner;

//A nota final de um estudante e calculada a partir de tres notas atribuıdas entre o intervalo de 0 ate 10, respectivamente, a um trabalho de laboratorio, a uma avaliacao semestral e a um exame final. A media das tres notas mencionadas anteriormente obedece aos pesos: Trabalho de Laboratorio: 2; Avaliacao Semestral: 3; Exame Final: 5. De acordo com o resultado, mostre na tela se o aluno esta reprovado (media entre 0 e 2,9), de recuperacao (entre 3 e 4,9) ou se foi aprovado. Faca todas as verificacoes necessarias.

public class MediaEscolar {
    public static void main(String [] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.println ("Qual é o seu nome?");
        String name = scanner.next();
        System.out.print ("Digite sua nota de Trabalho de Laboratório (0>=nota<=2): ");
        double lab = scanner.nextDouble();
        System.out.print ("Digite sua nota da Avaliação Semestral (0>=nota<=3): ");
        double sem = scanner.nextDouble();
        System.out.print ("Digite sua nota de Avaliação Final (0>=nota<=5): ");
        double fin = scanner.nextDouble();
        double media = (lab + sem + fin);
        if (media >= 0 && media <= 2.9){
            System.out.println ("Sinto muito " + name + ", você está reprovado! \n~_~ ");
        }
        else {
            if (media >= 3 && media <= 4.9){
                System.out.println (name + ", você está de recuperação! \n:'(");
            }
            else {
                System.out.println ("Parabéns " + name + ", está aprovado!  \n^_~");
            }
        }
        scanner.close();
    }
    
}
