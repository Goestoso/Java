import javax.swing.JOptionPane;

public class DiaSemana {
    public static void main (String [] args){
        int dia = Integer.parseInt(
            JOptionPane.showInputDialog ("Digite um dia da semana (1 a 7): ")
            );
            switch (dia) {
                case 1:
                    JOptionPane.showMessageDialog(null,"Domingo (￣o￣) . z Z"); 
                break;
                case 2:
                    JOptionPane.showMessageDialog(null,"Segunda: (╯°□°）╯︵ ┻━┻"); 
                break;
                case 3:
                    JOptionPane.showMessageDialog(null,"Terça"); 
                break;
                case 4:
                    JOptionPane.showMessageDialog(null,"Quarta-feira meus bacanudos! (☞ﾟヮﾟ)☞ ☜(ﾟヮﾟ☜)"); 
                break;
                case 5:
                    JOptionPane.showMessageDialog(null,"Quinta"); 
                break;
                case 6:
                    JOptionPane.showMessageDialog(null,"Sextooou... (⌐■_■)"); 
                break;
                case 7:
                    JOptionPane.showMessageDialog(null,"Sábado ( ﾉ ﾟｰﾟ)ﾉ "); 
                break;
                default: 
                    JOptionPane.showMessageDialog(null,"Esse dia é inválido!"); 
                break;
            }
    }   
}
