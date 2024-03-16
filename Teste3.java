public class Teste3 {

    public static void main(String[] args) {
     
        NossoVetor v = new NossoVetor(5);
        for (int i = 1; i <= 100; i++) {

            v.adiciona(i);
            System.out.println("inseriu " + i + ", capacidade = " + v.getDados().length); //encadeando objeto v com seu comprimento
        }

        while (!v.estaVazio()) {

            System.out.println(v.remove() + " foi atendido, nova capacidade = " + v.getDados().length);
        }

    }
    
}
