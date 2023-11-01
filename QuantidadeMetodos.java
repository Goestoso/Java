import java.util.InputMismatchException;
import java.util.Scanner;

public class QuantidadeMetodos {
    
    public static int metodoQuantidadePositiva(Scanner sc) { 

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

                    throw new NegativeQuantityException("não pode quantidade negativa :) ");

                }

                break;

            } catch (InputMismatchException e) {

                if (sc.hasNextDouble()) {

                    double converte = sc.nextDouble();

                    qtd = (int) Math.round(converte);

                    System.err.println(
                            "\nAviso: o valor digitado é um ponto flutuante, será convertido para um valor inteiro mais próximo ("
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

    public static int metodoTamanho(Scanner sc) {

        int t = 0;

        double d = 0.0;

        while (true) {

            try {

                System.out.println("\nQuantas caixinhas [] você quer? (Informe um valor do tipo inteiro).");
                t = sc.nextInt();

                if (t == 0) {

                    System.out.println();
                    throw new RuntimeException("Entendi, você não quer caixinhas :(");

                } else if (t < 0) {

                    metodoVerificaTamanhoVetor(t);

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

        return t;

    }

    public static int metodoPosicaoVetor(Scanner sc, int tamanho, int[] index) {

        int n = 0;

        double d = 0.0;

        boolean exist;

        while (true) {

            try {

                System.out.println("\nEm qual caixinha você quer guardar números agora?");

                if (sc.hasNextInt()) {

                    n = sc.nextInt();
                    metodoVerificaPosicaoVetor(tamanho, n);

                    if (n <= tamanho) {

                        --n;

                        for (int element : index) {

                            exist = (element == n) ? true : false;

                            if (exist) {

                                while (n == element || n > tamanho || n < 0 || exist) {

                                    System.out.print("\nOops, essa posição já foi inserida! Digite outra: ");
                                    n = sc.nextInt();
                                    metodoVerificaPosicaoVetor(tamanho, n);
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

                System.err.println("Erro: " + e.getMessage());
                ;

            }

        }

        return n;
    } 

    public static int metodoValorVetor(Scanner sc, int posicao) {

        int value = 0;

        double d = 0.0;

        while (true) {

            try {

                System.out.println("\nQual valor você quer guardar aqui na caixinha nº " + (posicao + 1) + " ? ");
                value = sc.nextInt();

                if (value < 0) {

                    throw new NegativeQuantityException("não pode quantidade negativa :) ");

                } else {

                    break;

                }

            } catch (NegativeQuantityException e) {

                System.err.println("Erro! " + e);

            } catch (InputMismatchException e) {

                if (sc.hasNextDouble()) {

                    double converte = sc.nextDouble();

                    value = (int) Math.round(converte);

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

        return value;
    }

    public static void metodoVerificaTamanhoVetor(int tamanho) throws NegativeArraySizeException {

        if (tamanho < 0) {

            throw new NegativeArraySizeException("não existe " + tamanho + " caixinhas <3");

        }
    }

    public static void metodoVerificaPosicaoVetor(int tamanho, int posicao) {

        if (posicao > tamanho)

            throw new IndexOutOfBoundsException(
                    "valor " + posicao + " não corresponde a quantidade máxima de caixinhas.");

        else if (posicao == 0)

            throw new IndexOutOfBoundsException(
                    "valor " + posicao + " não corresponde a quantidade mínima de caixinhas.");

        else if (posicao < 0)

            throw new NegativeArraySizeException("não existe " + posicao + " caixinhas <3");

    }

} 

