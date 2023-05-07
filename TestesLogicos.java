public class TestesLogicos {
//Analisar as variações lógicas true - false
    public static void main(String[] args) {
        //Testes com a lógica de Boolean
        boolean p = true;
        boolean q = false;

        //Teste com método da negação 
        System.out.print("\nTeste Lógico (método da negação): \np -> V \nq -> F " + "\np = " + p + "\nq = " + q);
        //Negação em linguagem de programação (!), pois ¬V = F 
        System.out.print("\n¬p -> F" + "\np = " + !p);
        System.out.print("\n¬q -> V " + "\nq = " + !q);

        //Teste com método da conjunção
        System.out.print ("\n\nTeste Lógico (método da conjunção): \np -> V \nq -> F " + "\np = " + p + "\nq = " + q);

        //Condição para conjunção na programação (&&), pois V e F = F
        boolean E = p && q;
        System.out.print ("\np E q = F");
        System.out.print ("\np E q = " + E);

        //Teste com método da disjunção
        System.out.print ("\n\nTeste Lógico (método da disjunção): \np -> V \nq -> F " + "\np = " + p + "\nq = " + q);

        //Condição para disjunção na programação (||), pois V ou F = V
        boolean OU = p || q;
        System.out.print ("\np OU q = V");
        System.out.print ("\np OU q = " + OU);

        //Teste com método da implicação
        System.out.print ("\n\nTeste Lógico (método da implicação): \np -> V \nq -> F " + "\np = " + p + "\nq = " + q);
        //Condição para implicação na programação (if), pois se p = V, então q = V também; toda implicação é verdadeira quando resulta em uma conslusão verdadeira, exceto quando false implica true, quando a implicação não é verdadeira. 
        if (p) {
            q = true;
            System.out.print ("\n\n se p = " + p);
            System.out.print ("\n então q = " + q);
            System.out.print ("\np -> q = V");
            System.out.print ("\np -> q = " + q);
        }
        p = false;
        q = false;
        //Teste com método da bicondição
        System.out.print ("\n\nTeste Lógico (método da bicondição): \np -> F \nq -> F " + "\np = " + p + "\nq = " + q);
        //Condição para bicondicional na programação (==), pois V implica V, ou F implica F, nesse caso false implica false resultando em true
        if (p == q) {
            p = true;
            q = true;
            System.out.print ("\np <-> q = V");
            System.out.print ("\np <-> q = " + p); 
        }
    }
}