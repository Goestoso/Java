//Realizar testes com os incrementos ++a e a++
public class TesteIncremento {
    public static void main (String [] args) {
        int a = 10;
        System.out.println ("a = " + a);
        a++;
        //a++ primeiro usa o valor atual da variável na expressão e, em seguida, incrementa o valor em 1. Ou seja, o valor é atualizado após ser usado. 
        System.out.println("a++ = " + a);
        ++a; 
        //++a primeiro incrementa o valor da variável em 1 e, em seguida, usa o novo valor na expressão. Ou seja, o valor é atualizado antes de ser usado.
        System.out.println ("++a = " + a);

        a = a++;
        //A expressão "a = a++" não tem efeito em alterar o valor de "a", uma vez que a atribuição sobrescreve o valor atualizado pelo operador pós-incremento, fazendo com que "a" mantenha seu valor anterior (12).
        System.out.println ("a = a++ : " + a);

        a = ++a;
        //A expressão "a = ++a" não tem efeito em alterar o valor de "a" porque a atribuição sobrescreve o valor atualizado, fazendo com que "a" mantenha seu valor anterior (13).
        System.out.println ("a = ++a : " + a);
    } 
}
