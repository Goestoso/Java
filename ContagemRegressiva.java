import javax.swing.JOptionPane;
//Realizar uma contegem regressiva de 10 até 0
public class ContagemRegressiva {
    public static void main (String [] args) throws InterruptedException {
        int numero = 10;
        System.out.print ("CONTAGEM REGRESSIVA!");
        while (numero >= 0) {            
            System.out.print ("\n" + numero);
            numero--;
            Thread.sleep(1000);
        }
        JOptionPane.showMessageDialog (null, "BOOOOOOOM! 💣", "EXPLOSÃO: ", JOptionPane.WARNING_MESSAGE);
    }    
}
