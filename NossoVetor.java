import java.util.Random;

public class NossoVetor {

    private int ultPos;
    private double[] dados;

    public NossoVetor(int capacidade) {

        ultPos = -1;
        dados = new double[capacidade];
    }

    // métodos de acesso
    public double getUltPos() {

        return ultPos; // omitindo this pois não há ambiguidade
    }

    public double[] getDados() {

        return dados;
    }

    // métodos modificadores
    // public void setUltPos(int pos) {

    // if(pos>=0 && pos < dados.length)

    // ultPos = pos;

    // else

    // ultPos = dados.length - 1;

    // }

    // Polimorfismo de sobrescrita do método toString() da classe Object (classe
    // Pai)
    @Override
    public String toString() { // .\NossoVetor: method does not override or implement a method from a supertype

        String s = ""; // Modelo MVC - Visão e Controle: não usa-se print para retornar Stirng para não
                       // misturar interfaces

        if (estaVazio())

            s = s + "vetor vazio";

        else

            for (int i = 0; i <= ultPos; i++) {

                s = s + String.format("%.0f ", dados[i]);
            }

        return s + "\n";
    }

    public boolean estaCheio() {

        return ultPos == dados.length - 1;

    }

    public boolean estaVazio() {

        return ultPos == -1;

    }

    // cada método deve ter apenas uma única responsabilidade
    private void redimensiona(int novaCapacidade) { // menor privilégio possível (princípio de programação para
                                                    // abstração)

        double[] temp = new double[novaCapacidade];

        for (int i = 0; i <= ultPos; ++i) {

            temp[i] = dados[i];
        }

        dados = temp; // mudando a referência (ponteiro de alocação de memória) do vetor
    }

    public void adiciona(int e) { // abstração de código

        if (estaCheio())
            redimensiona(dados.length * 2);
        dados[++ultPos] = e;

    }

    public void adiciona(double e) { // sobrecarga de método (outro tipo de Polimorfismo) para receber outros
                                     // parâmetros

        if (estaCheio())
            redimensiona(dados.length * 2);
        dados[++ultPos] = e;

    }

    public double remove() {

        if (estaVazio())
            return -1;

        double aux = dados[ultPos--];

        if (dados.length >= 10 && ultPos <= dados.length / 4)

            redimensiona(dados.length / 2); // abstração
        // == é uma verificação ruim na hora de arredondamento para binário, opte por <=
        // ou >=

        return aux;
    }

    // método para inserir valores randômicos no vetor
    public void preencheVetor() {

        Random r = new Random();

        for (int i = 0; i < dados.length; i++) {

            // adiciona(Math.random());
            // adiciona(r.nextDouble());
            adiciona(r.nextInt(dados.length * 10) + 1);
        }
    }

    //Esta seção trata do algoritmo de ordenação por seleção, ou algoritmo Selectionsort.  
    //Ele usa a seguinte estratégia: seleciona o menor elemento do vetor, depois o segundo menor, depois o terceiro menor, e assim por diante.

    public void selectionSort() { 

        // int cont = 0;

        for (int i = 0; i < dados.length - 1; i++) {

            int min = i;

            for (int j = i + 1; j < dados.length; j++) {

                // cont++;
                if (dados[j] < dados[min]) {

                    min = j;
                }
            }

            double temp = dados[min];
            dados[min] = dados[i];
            dados[i] = temp;
        }

        // return cont;
    }

    //O algoritmo de ordenação por inserção (Insertion Sort) é um algoritmo simples e eficiente para ordenar uma lista de elementos. 
    //Ele funciona construindo uma lista ordenada um elemento de cada vez, movendo os elementos não ordenados para a posição correta dentro da lista ordenada.

    public void insertionSort() {
        for (int i = 1; i < dados.length; i++) {
            double chave = dados[i];
            int j = i - 1;
            while (j >= 0 && dados[j] > chave) {
                dados[j + 1] = dados[j];
                j--;
            }
            dados[j + 1] = chave;
        }
    } 
    

    //O Bubble Sort percorre repetidamente a lista, comparando elementos adjacentes e os trocando se estiverem na ordem errada.
    public void bubbleSort() {
        int n = dados.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (dados[j] > dados[j + 1]) {
                    // Troca os elementos dados[j] e dados[j + 1]
                    double temp = dados[j];
                    dados[j] = dados[j + 1];
                    dados[j + 1] = temp;
                }
            }
        }
    }    

}