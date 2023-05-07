import javax.swing.JOptionPane;

//Tres amigos jogaram na loteria. Caso eles ganhem, o prêmio deve ser repartido proporcionalmente ao valor que cada um deu para a realizacao da aposta. Faça um programa que leia quanto cada apostador investiu, o valor do premio, e imprima quanto cada um ganharia do premio com base no valor investido.

public class Loteria {
    public static void main(String [] args) {
        double premio = Double.parseDouble(
            JOptionPane.showInputDialog("Quanto é o valor do prêmio? \n")
            );
            double amg1 = Double.parseDouble(
                JOptionPane.showInputDialog("Quanto o primeiro amigo investiu? \n")
            );
            double amg2 = Double.parseDouble(
                JOptionPane.showInputDialog("Quanto o segundo amigo investiu? \n")
            );
            double amg3 = Double.parseDouble(
                JOptionPane.showInputDialog("Quanto o terceiro amigo investiu? \n")
            );
            double totalpremio = premio / (amg1 + amg2 + amg3);
            amg1 = totalpremio * amg1;
            amg2 = totalpremio * amg2;
            amg3 = totalpremio * amg3;
            JOptionPane.showMessageDialog(null, "O primeiro amigo vai receber:R$ " + String.format ("%.2f", amg1) + "\nO segundo amigo vai receber:R$ " + String.format("%.2f",  amg2) + "\nO terceiro amigo vai receber:R$ " + String.format("%.2f", amg3));
    }    
}
