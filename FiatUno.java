import javax.swing.JOptionPane;

//Leia a distancia em Km e a quantidade de litros de gasolina consumidos por um carro em um percurso, calcule o consumo em Km/l e escreva uma mensagem de acordo com a tabela abaixo:
//CONSUMO (Km/l) MENSAGEM
//menor que 8 Venda o carro!
//entre 8 e 14 Economico! 
//maior que 12 Super economico!

public class FiatUno {
    public static void main(String[] args) {
        JOptionPane.showMessageDialog(null, "Tabela consumo de gasolina do carro: \n \nmenor que 8Km/L -> Venda o carro! \n \nentre 8Km/L e 14Km/L -> Econômico! \n \nmaior que 14Km/L -> Super Econômico!");
        double percurso = Double.parseDouble(
                (JOptionPane.showInputDialog("Me informe o percurso (Km):  "))
                );
        double gasosa = Double.parseDouble(
                (JOptionPane.showInputDialog("Me informe o quanto de gasolina você usou (L): "))
                );
        double kml = percurso / gasosa;
        if (kml < 8) {
            JOptionPane.showMessageDialog(null, "Venda o carro!");
        } else {
            if (kml >= 8 && kml <= 14) {
                JOptionPane.showMessageDialog(null, "Econômico!");
            } else {
                JOptionPane.showMessageDialog(null, "Super econômico!");
            }
        }
    }
}
