import java.util.Scanner;
//Scanner usa a classe System com método 
//Exibir qual é o peso ideal baseado na altura e no gênero 
//Usar a função if/else para separar os valores lógicos
public class PesoIdeal {

    public static void main (String [] args) {
        //entradas
        Scanner scanner = new Scanner(System.in);
        double h, pI;
        char sexo;

        System.out.print ("Digite sua altura: ");
        h = scanner.nextDouble();

        System.out.print ("Digite m/M para masculino ou f/F para feminino: ");
        sexo = scanner.next().charAt(0);
        //processamento
        if (sexo == 'm' || sexo == 'M'){
            pI = h * 72.7 - 58;
        }
        else {
            pI = h * 62.1  - 44.7; 
        }
        //saída
        System.out.println("Seu peso ideal é: " + pI);
        scanner.close();
    }    
}
