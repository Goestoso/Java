public class Teste2 {

    public static void main(String[] args) {

        NossoVetor v = new NossoVetor(10);
        int i = 10;

        while (!v.estaCheio()) {

            v.adiciona(i);
            i += 10;
            System.out.println(v);
        }

        while (!v.estaVazio()) {

            v.remove();
            System.out.println(v);
        }
        
    }
}
