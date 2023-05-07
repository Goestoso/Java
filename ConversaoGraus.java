import javax.swing.JOptionPane;
//Converter graus Celsisus para Farenheit
public class ConversaoGraus {
    public static void main (String [] args) {

        String auxiliar = JOptionPane.showInputDialog("Digite a temperatura em Celsius: ");
        // String auxiliar2 = JOptionPane.showInputDialog("Digite o segundo número: ");
        
        double celsius = Double.parseDouble(auxiliar);
        //leitura modo 2
        //double num2 = Double.parseDouble (auxiliar2);
        //processamento
        double conversaoF = celsius * 9/5 + 32;
        //saída
        JOptionPane.showMessageDialog(null, celsius + "° Celsius correspondem a " + conversaoF + "°Farenheit");
    }
    
}
