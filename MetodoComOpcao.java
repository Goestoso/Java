//Escreva um programa para:
//- ler o número inteiro e armazenar esse número em uma variável chamada Opcao.
//- armazenar 30 números inteiros positivos em um vetor chamado Vet
//O programa deve possuir quatro métodos denominados f1, f2, f3, e f4, as quais possuirão as seguintes funcionalidades:
//- f1: deverá imprimir o vetor;
//- f2: deverá imprimir os números armazenados nas posições ímpares do vetor;
//- f3: deverá imprimir o quadrado dos números armazenados nas posições pares do vetor; e
//- f4: deverá imprimir a soma dos números divisíveis por 4

import java.util.Scanner;

public class MetodoComOpcao {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int tamanho = 30, vet[] = new int[tamanho];
        String resp = "";

        System.out.println("\nVocê tem um vetor. ");

        vet = VetorComValoresAleatoriosUnicos.gerarVetorComValoresAleatoriosUnicos(tamanho);

        System.out.println("");


        System.out.println("\n\n* Escolha uma opção: \n\n- (f1) imprime o vetor\n\n- (f2) imprime os números nas posições ímpares do vetor\n\n- (f3) imprime o quadrado dos números pares \n\n- (f4) imprime a soma dos números divisíveis por 4");

        do {

        System.out.print("\nSua opção: ");
        String opcao = sc.next();

        boolean valid = false;

        if (
            opcao.equals("f1") || 
            opcao.equals("f2") || 
            opcao.equals("f3") || 
            opcao.equals("f4"))

            valid = true;

        while (!valid) {

            System.out.println("\n\n* Escolha uma opção: \n\n- (f1) imprime o vetor\n\n- (f2) imprime os números nas posições ímpares do vetor\n\n- (f3) imprime o quadrado dos números pares \n\n- (f4) imprime a soma dos números divisíveis por 4");

            System.out.println("\nSua opção: ");
            opcao = sc.next();

            if (
            opcao.equals("f1") || 
            opcao.equals("f2") || 
            opcao.equals("f3") || 
            opcao.equals("f4"))

            valid = true;

        }

        switch (opcao) {

            case "f1": metodoF1(vet);
                
                break;

            case "f2": metodoF2(vet);

                break;

            case "f3": metodoF3(vet);

                break;

            case "f4": metodoF4(vet);

                break;
        
            default: System.out.println("Algo inesperado aconteceu :(");

                break;

            }

            System.out.println("\n\nQuer tentar outra opção? (Sim/sim para continuar).");
            resp = sc.next();

        } while (resp.equals("Sim") || resp.equals("sim"));

        sc.close();
    }

    public static void metodoF1 (int vet[]) {

        int index = 0;

        System.out.println("\nO vetor: ");
        System.out.println("");
         for (int element : vet) {

            System.out.println("Posição " + index + ": [" + element + "]");
            ++index;

        } 
    }

    public static void metodoF2 (int vet[]) {

        System.out.println("\nNúmeros armazenados nas posições ímpares do vetor: ");
        System.out.println("");
        for (int i = 0; i < vet.length; ++i) {

            if (i % 2 != 0)
                System.out.println("Posição " + i + ": [" + vet[i] + "]");
        }
    }

    public static void metodoF3 (int vet[]) {

        System.out.println("\nNúmeros ao quadrado armazenados nas posições pares do vetor: ");
        System.out.println("");
        for (int i = 0; i < vet.length; ++i) {

            double quadrado = 0.0;

            if (i % 2 == 0) {
                
                quadrado = vet[i];
                quadrado = Math.pow(quadrado, 2);
                System.out.println("Posição " + i + ": [" + String.format("%.0f", quadrado) + "]");
            }
        }
    }

    public static void metodoF4 (int vet[]) {

        int soma = 0;
        System.out.println("\nSoma dos números armazenados que são divisíveis por 4 do vetor: ");
        System.out.println("");
        for (int i = 0; i < vet.length; ++i) {

            if (vet[i] % 4 == 0)
                soma += vet[i];    
        }

        System.out.print(soma + " ");
    }
}
