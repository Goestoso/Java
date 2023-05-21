//Não pode ser multiplo de 7 
public class NaoMultiploDe7 {
    public static void main (String [] args) {
        int [] v = new int [100];
        int runner = 1; //vai percorrer a sequencia de naturais
        int cont = 0; //Vai contar os 100 valores 

        while (cont < 100) {
            if (runner % 7 != 0 || runner % 10 == 7) {
                v[cont++] = runner;
            }
            runner++;
        }
       System.out.println("O vetor:");
       for (cont = 0; cont < 100; cont++) {
        System.out.print (v[cont] + " ");
       }
    }
}
