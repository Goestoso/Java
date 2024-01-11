package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class IMC {

	private JFrame frame;
	private JTextField NOME;
	private JTextField PESO;
	private JTextField ALTURA;
	private JTextField MSG;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					IMC window = new IMC();
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
	public IMC() {
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
		
		JLabel lblNewLabel = new JLabel("IMC");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblNewLabel.setBounds(187, 11, 54, 22);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Peso:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1.setBounds(20, 91, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Nome:");
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_1.setBounds(20, 50, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_2 = new JLabel("Altura:");
		lblNewLabel_1_2.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2.setBounds(20, 134, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_2);
		
		JLabel lblNewLabel_1_2_1 = new JLabel("Mensagem:");
		lblNewLabel_1_2_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblNewLabel_1_2_1.setBounds(20, 189, 70, 19);
		frame.getContentPane().add(lblNewLabel_1_2_1);
		
		NOME = new JTextField();
		NOME.setBounds(78, 49, 267, 20);
		frame.getContentPane().add(NOME);
		NOME.setColumns(10);
		
		PESO = new JTextField();
		PESO.setColumns(10);
		PESO.setBounds(76, 90, 86, 20);
		frame.getContentPane().add(PESO);
		
		ALTURA = new JTextField();
		ALTURA.setColumns(10);
		ALTURA.setBounds(76, 133, 86, 20);
		frame.getContentPane().add(ALTURA);
		
		MSG = new JTextField();
		MSG.setEditable(false);
		MSG.setColumns(10);
		MSG.setBounds(100, 188, 324, 20);
		frame.getContentPane().add(MSG);
		
		JButton btnNewButton = new JButton("Calcular");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = NOME.getText();
				double peso = Double.valueOf(PESO.getText());
				double altura = Double.valueOf(ALTURA.getText());
				double imc = peso / (altura * altura);
				MSG.setText("Olá " + nome + ", o seu imc é " + String.valueOf(String.format("%.2f", imc)) + ".");
			}
		});
		btnNewButton.setBounds(20, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NOME.setText("");
				PESO.setText("");
				ALTURA.setText("");
				MSG.setText("");
			}
		});
		btnLimpar.setBounds(152, 227, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(293, 227, 89, 23);
		frame.getContentPane().add(btnSair);
	}

}
