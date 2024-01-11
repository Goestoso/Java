package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import javax.swing.BoxLayout;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class QuestaoA {

	private JFrame frame;
	private JTextField NUM;
	private JTextField RES;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestaoA window = new QuestaoA();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public QuestaoA() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Verificação");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(175, 23, 78, 26);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Digite um número:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(10, 90, 116, 16);
		frame.getContentPane().add(lblNewLabel_1);
		
		NUM = new JTextField();
		NUM.setBounds(136, 88, 86, 20);
		frame.getContentPane().add(NUM);
		NUM.setColumns(10);
		
		JLabel lblNewLabel_1_1 = new JLabel("Resultado: ");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(10, 138, 78, 16);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		RES = new JTextField();
		RES.setEditable(false);
		RES.setColumns(10);
		RES.setBounds(78, 136, 144, 18);
		frame.getContentPane().add(RES);
		
		JButton PERFEITO = new JButton("Perfeito");
		PERFEITO.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RES.setText("");
				
				String textoNumero = NUM.getText();
				
				int numero = metodoNumPerfeito(textoNumero);
				
				if (numero >= 0) {
					
			        int somaDivisores = calcularSomaDivisores(numero);

			        if (somaDivisores == numero) {
			        	
			        	RES.setText("" + somaDivisores);
			        	JOptionPane.showMessageDialog(null, "Número é perfeito!", "Verificando...", JOptionPane.INFORMATION_MESSAGE);
			            
			        } else {
			        	
			        	RES.setText("" + somaDivisores);
			        	JOptionPane.showMessageDialog(null, "Número é imperfeito!", "Verificando...", JOptionPane.INFORMATION_MESSAGE);
			            
			        }
					
				}
				
			}
		});
		PERFEITO.setFont(new Font("Arial", Font.PLAIN, 13));
		PERFEITO.setBounds(10, 196, 89, 23);
		frame.getContentPane().add(PERFEITO);
		
		JButton DSU = new JButton("DSU");
		DSU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				RES.setText("");
				
				String textoNumero = NUM.getText();
				
				int numero = metodoNumDsu(textoNumero);
				
				if (numero > 9 && numero < 100) {
					
					int resultado = calcularDSU(numero);
					RES.setText("" + resultado);
					
				}
				
			}
		});
		DSU.setFont(new Font("Arial", Font.PLAIN, 13));
		DSU.setBounds(109, 196, 89, 23);
		frame.getContentPane().add(DSU);
		
		JButton LIMPAR = new JButton("Limpar");
		LIMPAR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				RES.setText("");
				NUM.setText("");
				
			}
		});
		LIMPAR.setFont(new Font("Arial", Font.PLAIN, 13));
		LIMPAR.setBounds(214, 196, 89, 23);
		frame.getContentPane().add(LIMPAR);
		
		JButton SAIR = new JButton("Sair");
		SAIR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		SAIR.setFont(new Font("Arial", Font.PLAIN, 13));
		SAIR.setBounds(313, 196, 89, 23);
		frame.getContentPane().add(SAIR);
	}
	
	public static int metodoNumPerfeito(String  num) {
		
		int valor = 0;
	
		try {
			
			valor = Integer.valueOf(num);
			
			if (valor < 0)
				
				throw new NumberFormatException();
			
		} catch(NumberFormatException er) {
			
			JOptionPane.showMessageDialog(null, "Valor inválido, somente valores de números inteiros positivos serão aceitos!", "Erro", JOptionPane.ERROR_MESSAGE);
			valor = -1;
		}
				
		return valor;
	}
	
	public static int calcularSomaDivisores(int numero) {
        if (numero <= 1) {
            return 0; 
        }

        int somaDivisores = 1; 
        
        for (int i = 2; i <= Math.sqrt(numero); i++) {
            if (numero % i == 0) {
                somaDivisores += i;
                if (i != numero / i) {
                    somaDivisores += numero / i;
                }
            }
        }

        return somaDivisores;
    }
	
	public static int metodoNumDsu(String num) {
		
		int valor = 0;
		
		try {
			
			valor = Integer.valueOf(num);
			
			if (valor < 10 || valor > 99) 
				
				JOptionPane.showMessageDialog(null, "Número inteiro deve estar no intervalo de 10 a 99!", "Atenção ao DSU", JOptionPane.WARNING_MESSAGE);
			
		} catch (NumberFormatException er) {
			
			JOptionPane.showMessageDialog(null, "Valor inválido, somente valores de números inteiros positivos serão aceitos!", "Erro", JOptionPane.ERROR_MESSAGE);
		}
		
		return valor;
	}
	
	public static int calcularDSU(int numero) {
		
		 int dezena = numero / 10;
	     int unidade = numero % 10;
	     int soma = dezena + unidade;
	     
	     JPanel panel = new JPanel();
	        panel.setLayout(new BoxLayout(panel, BoxLayout.Y_AXIS));

	        panel.add(new JLabel("Número: " + numero));
	        panel.add(new JLabel("Dígito da dezena: " + dezena));
	        panel.add(new JLabel("Soma da dezena com unidade: " + soma));
	        panel.add(new JLabel("Dígito da unidade: " + unidade));
	        
	        JOptionPane.showMessageDialog(null, panel, "DSU", JOptionPane.INFORMATION_MESSAGE);

	     return Integer.parseInt("" + dezena + soma + unidade); // Constrói e retorna o número DSU
	}
}
