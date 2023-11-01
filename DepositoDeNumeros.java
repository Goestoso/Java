//Imagine um cenário onde  você vai ser um administrador de estoque e que irá escolher com atenção uma quantidade limitada de caixas para armazenar seus produtos. Nesse sentido, suponha que a posição de cada uma das caixas vai ser definida por você, e nelas deverão ser guardadas os seus respectivos produtos, sendo assim, você deverá informar a quantidade de cada produto que será guardada em cada uma delas. Entretanto, lembre-se que é ruim abrir uma caixa que já foi fechada, por isso, é importante saber quais caixas já foram usadas e saber quais ainda estão disponíveis para gerenciar da melhor forma o seu estoque de produtos, além de cuidar para não deixar produtos sobrando ou caixas vazias.  

//1) Depósito de números inteiros: Crie um programa que pergunte ao usuário a quantidade de números e o tamanho do vetor que ele quer, faça o usuário inserir algo que seja um número inteiro válido para quantidades e arrays (lembre-se dos erros de que os tamanhos dos arrays não podem ser negativos). Dessa forma, para caso ele digite um valor do tipo flutuante, converter o valor flutuante para inteiro, ou caso ele digite num formato string com '.',  verifique se é possível transformar a string em um tipo double se o formato for válido para conversões. Em seguida, o usuário  poderá  guardar os números em posições do vetor que ele definir, se ele digitar uma posição que estoure os limites do vetor, informe-o e peça para ele digitar a posição novamente (até ele inserir um valor dentro dos limites do vetor). No caso de acessar os índices do vetor, o usuário deve digitar apenas valores do tipo inteiro, ou seja, sem conversões do tipo flutuante, mas, no caso de guardar os números dentro dos índices, faça a conversão dos números do tipo flutuante para inteiro (se ele digitar números do tipo flutuante). Se a quantidade de números que ele pediu zerar, encerre o programa, avise que ele usou toda a quantidade de números e mostre como ficou o seu vetor. Caso ele informe uma posição que já foi informada antes, avise que aquela posição já tem números e solicite outra até ele preencher todos os campos do vetor. Por fim, quando o usuário terminar de guardar os números, imprima-os na tela, tanto a quantidade de números que sobraram quanto o vetor que ele  preencheu. 

//Opcional: se o usuário digitar 0 para tamanho do vetor ou quantidade de números, encerre o programa com um RuntimeException, o qual enviará uma mensagem de fechamento abrupto, além disso, crie uma exceção que trate quantidades negativas, forçando o usuário a digitar valores positivos no momento de guardar os números.

import java.util.Scanner;

public class DepositoDeNumeros {

    public static void main(String[] args) throws NegativeQuantityException {

        Scanner sc = new Scanner(System.in);

        int v[], index[], t = 0, n = 0, i = 0, value = 0, qtd = 0;

        System.out.println("\nDEPÓSITO DE NÚMEROS");

        try {

            qtd = QuantidadeMetodos.metodoQuantidadePositiva(sc);

            t = QuantidadeMetodos.metodoTamanho(sc);

        } catch (RuntimeException e) {

            System.err.println(e.getMessage());

        }

        v = new int[t];
        index = new int[t];

        for (int j = 0; j < t; ++j) {

            index[j] = -1;

        }

        try {

            while (i < v.length) {

                System.out.println("\nSuas caixinhas: \n");

                for (int element : v) {

                    System.out.print("[" + element + "]");
                }

                System.out.println();

                n = QuantidadeMetodos.metodoPosicaoVetor(sc, t, index);

                index[i] = n;

                ++i;

                v[n] = QuantidadeMetodos.metodoValorVetor(sc,n);

                value = v[n];

                if (i < v.length) {

                    qtd -= value;

                    if (qtd <= 0)

                        System.out.println("\nATENÇÃO | ! |\n");

                    else

                        System.out.print("\nVocê tem no total: " + qtd + "\n");
                }

                if (qtd <= 0 && i < v.length || qtd < 0) {

                    throw new RuntimeException("Você já usou todos os números!");
                }

            }

        } catch (RuntimeException e) {

            System.err.println(e.getMessage());

            int total = value - (-qtd);

            qtd = 0;

            v[n] = total;

            System.out.print((value == total) ? "" : "\nVocê digitou um valor que supera a sua quantidade total, portanto, os números que sobraram serão alocados para a caixinha nº " + 
                               + (n + 1)  + "\n\nVocê tinha no total: " + total + "\n");

            System.out.println("\nSuas caixinhas:\n");

            for (int element : v) {

                System.out.print("[" + element + "]");
            }

        }

        if (qtd > 0 && t > 0) {

            qtd -= value;

            if (qtd < 0) {

                System.out.println(
                        "\nVocê digitou um valor que supera a sua quantidade total, portanto, os números que sobraram serão alocados para a caixinha nº "
                                + (n + 1) + ".");

                System.out.print("\nVocê ficou com: " + (qtd * 0) + "\n");

                System.out.println("\nATENÇÃO | ! |");

                System.out.println("\nTodas as suas caixinhas já foram usadas!");

                int total = value - (-qtd);

                v[n] = total;

                System.out.println("\nAqui estão as suas caixinhas: \n");

                for (int element : v) {

                    System.out.print("[" + element + "]");
                }

            } else {

                System.out.println("\nATENÇÃO | ! |");

                System.out.println("\nTodas as suas caixinhas já foram usadas!");

                System.out.println("\nVocê ficou com: " + qtd);

                System.out.println("\nAqui estão as suas caixinhas: \n");

                for (int element : v) {

                    System.out.print("[" + element + "]");

                }

            }

        }

        sc.close();

    }

}