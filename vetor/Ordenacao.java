package vetor;
import java.util.Date;
import java.util.Scanner;

public class Ordenacao {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        NossoVetor v;
        System.out.print("Digite o tamanho do vetor, 0 encerrará: ");
        //dar o controle ao controlador
        int n = sc.nextInt();

        while (n > 0) {

            v = new NossoVetor(n);
            v.preencheVetor();
            //System.out.println("Vetor gerado: " + v); //toString já configura a saída num formato definido
            //int iteracoes  = v.selectionSort(); //captura o retorno do método no rip da memória
            //System.out.println("n: " + n + ", iteracoes: " + iteracoes);
            long inicio = new Date().getTime(); //long int (8 bytes, 64 bits) //classe de datas (antigo) para retornar os milissegundos desde 1 Janeiro de 1970
            v.selectionSort();
            long fim = new Date().getTime();
            //System.out.println("Vetor ordenado pelo Selection: " + v);
            System.out.println("n: " + n + ", Selection demorou " + (fim - inicio) + "ms");
            inicio = new Date().getTime(); //long int (8 bytes, 64 bits) //classe de datas (antigo) para retornar os milissegundos desde 1 Janeiro de 1970
            v.insertionSort();
            fim = new Date().getTime();
            //System.out.println("Vetor ordenado pelo Insertion: " + v);
            System.out.println("n: " + n + ", Insertion demorou " + (fim - inicio) + "ms");
            inicio = new Date().getTime(); //long int (8 bytes, 64 bits) //classe de datas (antigo) para retornar os milissegundos desde 1 Janeiro de 1970
            v.bubbleSort();
            fim = new Date().getTime();
            System.out.println("n: " + n + ", Bubble demorou " + (fim - inicio) + "ms");
            System.out.print("Digite o tamanho do vetor, 0 encerrará: ");
            n = sc.nextInt();
        }

        sc.close();
    }
    
}
