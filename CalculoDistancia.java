import javax.swing.JOptionPane;
//Calcular a distãncia entre os pontos, hipotenusa
public class CalculoDistancia {
   public static void main (String [] args) {
    //entradas
    String auxiliarx1 = JOptionPane.showInputDialog("Digite x1");
    double x1 = Double.parseDouble (auxiliarx1);
    String auxiliary1 = JOptionPane.showInputDialog ("Digite y1");
    double y1 = Double.parseDouble (auxiliary1);
    String auxiliarx2 = JOptionPane.showInputDialog ("Digite x2");
    double x2 = Double.parseDouble (auxiliarx2);
    String auxiliary2 = JOptionPane.showInputDialog ("Digite y2");
    double y2 = Double.parseDouble (auxiliary2);
    //processamento
    double hipotenusa = Math.sqrt(
        (x1-x2) * (x1-x2) + (y1-y2) * (y1-y2)
    );
    //saída
    JOptionPane.showMessageDialog(null, "A distância entre os pontos é de " + hipotenusa);
   }
}
