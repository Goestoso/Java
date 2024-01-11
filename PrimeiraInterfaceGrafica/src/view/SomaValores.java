package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SomaValores {

	private JFrame frame;
	private JTextField N1;
	private JTextField N2;
	private JTextField Res;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SomaValores window = new SomaValores();
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
	public SomaValores() {
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
		
		JLabel lblNewLabel = new JLabel("Soma Valores");
		lblNewLabel.setBounds(164, 11, 94, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Número 1:");
		lblNewLabel_1.setBounds(10, 54, 59, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Número 2:");
		lblNewLabel_1_1.setBounds(10, 111, 59, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("Resultado:");
		lblNewLabel_1_1_1.setBounds(10, 157, 59, 14);
		frame.getContentPane().add(lblNewLabel_1_1_1);
		
		N1 = new JTextField();
		N1.setText("0.0");
		N1.setBounds(72, 51, 86, 20);
		frame.getContentPane().add(N1);
		N1.setColumns(10);
		
		
		N2 = new JTextField();
		N2.setText("0.0");
		N2.setColumns(10);
		N2.setBounds(72, 108, 86, 20);
		frame.getContentPane().add(N2);
		
		JButton btnNewButton = new JButton("Somar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				float num1, num2, resp;
				num1 = Float.parseFloat(N1.getText());
				num2 = Float.parseFloat(N2.getText());
				resp = num1 + num2;
				Res.setText(String.valueOf(resp));
			}
		});
		btnNewButton.setBounds(24, 199, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				N1.setText("");
				N2.setText("");
				Res.setText("");
			}
		});
		btnLimpar.setBounds(152, 199, 89, 23);
		frame.getContentPane().add(btnLimpar);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnSair.setBounds(283, 199, 89, 23);
		frame.getContentPane().add(btnSair);
		
		Res = new JTextField();
		Res.setEditable(false);
		Res.setBounds(72, 154, 86, 20);
		frame.getContentPane().add(Res);
		Res.setColumns(10);
	}
}
