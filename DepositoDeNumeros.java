//Imagine um cenário onde  você vai ser um administrador de estoque e que irá escolher com atenção uma quantidade limitada de caixas para armazenar seus produtos. Nesse sentido, suponha que a posição de cada uma das caixas vai ser definida por você, e nelas deverão ser guardadas os seus respectivos produtos, sendo assim, você deverá informar a quantidade de cada produto que será guardada em cada uma delas. Entretanto, lembre-se que é ruim abrir uma caixa que já foi fechada, por isso, é importante saber quais caixas já foram usadas e saber quais ainda estão disponíveis para gerenciar da melhor forma o seu estoque de produtos, além de cuidar para não deixar produtos sobrando ou caixas vazias.  
 
//1) Depósito de números inteiros: Crie um programa que pergunte ao usuário a quantidade de números e o tamanho do vetor que ele quer, faça o usuário inserir algo que seja um número inteiro válido para quantidades e arrays (lembre-se dos erros de que os tamanhos dos arrays não podem ser negativos). Dessa forma, para caso ele digite um valor do tipo flutuante, converter o valor flutuante para inteiro, ou caso ele digite num formato string com '.',  verifique se é possível transformar a string em um tipo double se o formato for válido para conversões. Em seguida, o usuário  poderá  guardar os números em posições do vetor que ele definir, se ele digitar uma posição que estoure os limites do vetor, informe-o e peça para ele digitar a posição novamente (até ele inserir um valor dentro dos limites do vetor). No caso de acessar os índices do vetor, o usuário deve digitar apenas valores do tipo inteiro, ou seja, sem conversões do tipo flutuante, mas, no caso de guardar os números dentro dos índices, faça a conversão dos números do tipo flutuante para inteiro (se ele digitar números do tipo flutuante). Se a quantidade de números que ele pediu zerar, encerre o programa, avise que ele usou toda a quantidade de números e mostre como ficou o seu vetor. Caso ele informe uma posição que já foi informada antes, avise que aquela posição já tem números e solicite outra até ele preencher todos os campos do vetor. Por fim, quando o usuário terminar de guardar os números, imprima-os na tela, tanto a quantidade de números que sobraram quanto o vetor que ele  preencheu. 
 
//Opcional: se o usuário digitar 0 para tamanho do vetor ou quantidade de números, encerre o programa com um RuntimeException, o qual enviará uma mensagem de fechamento abrupto, além disso, crie uma exceção que trate quantidades negativas, forçando o usuário a digitar valores positivos no momento de guardar os números.

import java.util.Scanner;

import java.util.InputMismatchException;

public class DepositoDeNumeros {

    public static int metodoQuantidade(Scanner sc) {

        int qtd = 0;

        double d;

        while (true) {

            try {

                System.out.println("\nQuantos números você quer?");
                qtd = sc.nextInt();

                if (qtd == 0) {

                    System.out.println();
                    throw new RuntimeException("Entendi, você não quer números :(");

                } else if (qtd < 0) {

                    throw new NegativeQuantityException("não pode quantidade negativa :) .");

                }

                break;

            } catch (InputMismatchException e) {

                if (sc.hasNextDouble()) {

                    double converte = sc.nextDouble();

                    qtd = (int) Math.round(converte);

                    System.err.println(
                            "Aviso: o valor digitado é um ponto flutuante, será convertido para um valor inteiro mais próximo ("
                                    + qtd + ").");

                    break;

                } else {

                    String input = sc.next();

                    if (input.contains(".")) {

                        try {

                            d = Double.parseDouble(input);

                            qtd = (int) Math.round(d);

                            System.err.println(
                                    "\nAviso: o valor digitado é um ponto flutuante, será convertido para um valor inteiro mais próximo ("
                                            + qtd + ").");

                            break;

                        } catch (NumberFormatException e2) {

                            System.err.println("\nErro: valor " + input + " é inválido!");

                        }

                    } else

                        System.err.println("\nErro: o valor não pode ser uma string.");

                }

                sc.nextLine(); // Limpa o Buffer

            } catch (NegativeQuantityException e) {

                System.err.println("\nErro: " + e.getMessage());
            }
        }

        return qtd;
    }

    public static void main(String[] args) throws InputMismatchException, NegativeQuantityException {

        Scanner sc = new Scanner(System.in);

        int v[], index[], t = 0, n = 0, i = 0, value = 0, qtd = 0;

        double d = 0;

        boolean exist;

        System.out.println("\nDEPÓSITO DE NÚMEROS");

        qtd = metodoQuantidade(sc);

        while (true) {

            try {

                System.out.println("\nQuantas caixinhas [] você quer? (Informe um valor do tipo inteiro)");
                t = sc.nextInt();

                if (t == 0) {

                    System.out.println();
                    throw new RuntimeException("Entendi, você não quer caixinhas :(");

                } else if (t < 0) {

                    metodoVerificaVetor(t, n);

                }

                break;

            } catch (InputMismatchException e) {

                if (sc.hasNextDouble()) {

                    double converte = sc.nextDouble();

                    t = (int) Math.round(converte);

                    System.err.println(
                            "Aviso: o valor digitado é um ponto flutuante, será convertido para um valor inteiro mais próximo ("
                                    + t + ").");

                    break;

                } else {

                    String input = sc.next();

                    if (input.contains(".")) {

                        try {

                            d = Double.parseDouble(input);

                            t = (int) Math.round(d);

                            System.err.println(
                                    "\nAviso: o valor digitado é um ponto flutuante, será convertido para um valor inteiro mais próximo ("
                                            + t + ").");

                            break;

                        } catch (NumberFormatException e2) {

                            System.err.println("\nErro: valor " + input + " é inválido!");

                        }

                    } else

                        System.err.println("\nErro: o valor não pode ser uma string.");

                }

                sc.nextLine(); // Limpa o Buffer

            } catch (NegativeArraySizeException e) {

                System.err.println("\nErro: " + e.getMessage());
            }
        }

        v = new int[t];
        index = new int[t];

        for (int j = 0; j < t; ++j) {

            index[j] = -1;

        }

        while (i < v.length) {

            while (true) {

                if (qtd <= 0) {

                    int total = value - (-qtd);

                    v[n] = total;

                    qtd = 0;

                    System.out.println("\nSuas caixinhas:\n");

                    for (int element : v) {

                        System.out.print("[" + element + "]");
                    }

                    System.out.println("\n\nATENÇÃO | ! |\n");

                    throw new RuntimeException("Você já usou todos os números!");

                }

                System.out.println("\nSuas caixinhas: \n");

                try {

                    for (int element : v) {

                        System.out.print("[" + element + "]");
                    }

                    System.out.println("\n\nEm qual caixinha você quer guardar números agora?");

                    if (sc.hasNextInt()) {

                        n = sc.nextInt();
                        metodoVerificaVetor(t, n);

                        if (n <= t) {

                            --n;

                            for (int element : index) {

                                exist = (element == n) ? true : false;

                                if (exist) {

                                    while (n == element || n > t || n < 0 || exist) {

                                        System.out.print("\nOops, essa posição já foi inserida! Digite outra: ");
                                        n = sc.nextInt();
                                        metodoVerificaVetor(t, n);
                                        --n;

                                        for (int num : index) {

                                            exist = (num == n) ? true : false;

                                            if (exist)

                                                break;

                                        }

                                    }

                                    break;

                                }

                            }

                            break;
                        }

                    } else if (sc.hasNextDouble()) {

                        d = sc.nextDouble();

                        throw new InputMismatchException(
                                "o valor " + d + " é um ponto flutuante, não se refere a uma posição inteira.");

                    } else {

                        String input = sc.next();

                        if (input.contains(".")) {

                            try {

                                d = Double.parseDouble(input);

                                System.err.println("\nErro: o valor " + d
                                        + " é um ponto flutuante, não corresponde a uma posição inteira.");

                            } catch (NumberFormatException e) {

                                System.err.println("\nO valor não pode ser uma string.");

                            }

                        } else {

                            throw new InputMismatchException("O valor não pode ser uma string.");
                        }

                    }

                } catch (InputMismatchException e) {

                    System.err.println("\nErro: " + e.getMessage());

                } catch (NegativeArraySizeException | IndexOutOfBoundsException e) {

                    System.out.println();

                    System.err.println("Erro :" + e.getMessage());
                    ;

                }

            }

            index[i] = n;

            while (true) {

                try {

                    System.out.println("\nQual valor você quer guardar aqui na caixinha nº" + (n + 1) + "? ");
                    value = sc.nextInt();

                    if (value < 0) {

                        throw new NegativeQuantityException("não pode quantidade negativa :) .");

                    } else {

                        v[n] = value;
                        ++i;
                        break;

                    }

                } catch (NegativeQuantityException e) {

                    System.err.println("Erro! " + e);

                } catch (InputMismatchException e) {

                    if (sc.hasNextDouble()) {

                        double converte = sc.nextDouble();

                        value = (int) Math.round(converte);
                        v[n] = value;
                        ++i;

                        System.err.println(
                                "\nAviso: o valor digitado é um ponto flutuante, será convertido para um valor inteiro mais próximo ("
                                        + value + ").");

                        break;

                    } else {

                        String input = sc.next();

                        if (input.contains(".")) {

                            try {

                                d = Double.parseDouble(input);

                                value = (int) Math.round(d);
                                v[n] = value;
                                ++i;

                                System.err.println(
                                        "\nAviso: o valor digitado é um ponto flutuante, será convertido para um valor inteiro mais próximo ("
                                                + value + ").");

                                break;

                            } catch (NumberFormatException e2) {

                                System.err.println("\nErro: valor " + input + " é inválido!");

                            }

                        } else

                            System.err.println("\nErro: o valor não pode ser uma string.");

                    }

                    sc.nextLine(); // Limpa o Buffer

                }

            }

            if (i < v.length) {

                qtd -= value;

                if (qtd < 0)

                    System.out.print("\nVocê tem no total: " + (qtd*0) + "\n");

                else 

                    System.out.print("\nVocê tem no total: " + qtd + "\n");
            }
        }

        qtd -= value;

        if (qtd <= 0 && i < v.length || qtd < 0) {

            int total = value - (-qtd);

            qtd = 0;

            v[n] = total;

            System.out.println("\nVocê tem no total: " + qtd);

            System.out.println("\nSuas caixinhas:\n");

            for (int element : v) {

                System.out.print("[" + element + "]");
            }

            System.out.println("\n\nATENÇÃO | ! |\n");

            throw new RuntimeException("Você já usou todos os números!");

        }

        System.out.print("\nVocê ficou com: " + qtd + "\n");

        System.out.println("\nAqui estão as suas caixinhas: \n");

        for (int element : v) {

            System.out.print("[" + element + "]");

        }

        sc.close();

    }

    public static void metodoVerificaVetor(int value1, int value2)
            throws NegativeArraySizeException, IndexOutOfBoundsException {

        if (value1 < 0) {

            throw new NegativeArraySizeException("não existe " + value1 + " caixinhas <3");

        } else if (value2 > value1) {

            throw new IndexOutOfBoundsException(
                    "valor " + value2 + " não corresponde a quantidade máxima de caixinhas.");

        } else if (value2 <= 0)

            throw new IndexOutOfBoundsException(
                    "valor " + value2 + " não corresponde a quantidade mínima de caixinhas.");

    }

    public static class NegativeQuantityException extends Exception {

        public String msg;

        public NegativeQuantityException(String msg) {

            super(msg);
        }

    }

}
