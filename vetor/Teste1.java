package vetor;
public class Teste1{

    public static void main (String[] args) {

        int n = 5;
        NossoVetor v = new NossoVetor(n);
        System.out.println("Ultima posicao depois do construtor: " + v.getUltPos());
        System.out.println("dados depois do construtor: " + v);

        //v.setUltPos(10);
        //System.out.println("Ultima posicao depois do set: " + v.getUltPos());
        //v.getDados()[v.getUltPos()] = 23;
        //System.out.println("Nosso vetor v: " + v);

        //if(v.adiciona(100))

            //System.out.println("Valor adicionado!");

       //else 

        //System.out.println("Vetor esta cheio!");

        //System.out.println("Nosso vetor v depois do adiciona: " + v);
    }
}