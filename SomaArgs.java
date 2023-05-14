public class SomaArgs {
    public static void main (String [] args) {
        // Inicializa a variável soma com o valor 0
        int soma = 0;

        // Percorre os argumentos passados na linha de comando (terminal)
        for (int i = 0; i < args.length; i++) {
            // Converte cada argumento para um número inteiro e adiciona à variável soma
            soma += Integer.parseInt(args[i]);
        }
        // Imprime a soma total dos argumentos
        System.out.println (soma);
    }
}