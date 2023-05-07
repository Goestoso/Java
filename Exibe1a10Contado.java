//Exibir lentamente o valor de 1 a 10
public class Exibe1a10Contado {
    public static void main (String [] args) throws InterruptedException {
        int cont = 1; //início
        while (cont <= 10){ //fim
            System.out.print(cont + " "); 
            cont++; //passo
            Thread.sleep(1000);
        }
    }
}
