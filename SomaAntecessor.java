import javax.swing.JOptionPane;
//. Leia um numero inteiro e imprima a soma do sucessor de seu triplo com o antecessor de seu dobro
public class SomaAntecessor {
    public static void main(String[] args) {
        int num = Integer.parseInt(
            (JOptionPane.showInputDialog("Digite um número: "))
            );
            num = ((num * 3) + 1) + ((num * 2) - 1);
            JOptionPane.showMessageDialog(null, "A soma do sucessor do triplo do número com o antecessor de seu dobro é igual a: " + num);
    }
}
