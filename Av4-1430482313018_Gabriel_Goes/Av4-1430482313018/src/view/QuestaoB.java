package view;

import java.awt.EventQueue;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Checkbox;
import java.awt.event.ItemListener;
import java.awt.event.ItemEvent;

public class QuestaoB {

	public JFrame frame;
	private JTextField LOGIN;
	private JPasswordField SENHA;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestaoB window = new QuestaoB();
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
	public QuestaoB() {
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
		
		JLabel lblNewLabel = new JLabel("Questão B");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 15));
		lblNewLabel.setBounds(147, 34, 100, 18);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Login:");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1.setBounds(14, 108, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("Senha:");
		lblNewLabel_1_1.setFont(new Font("Arial", Font.PLAIN, 13));
		lblNewLabel_1_1.setBounds(14, 144, 46, 14);
		frame.getContentPane().add(lblNewLabel_1_1);
		
		LOGIN = new JTextField();
		LOGIN.setBounds(70, 105, 238, 20);
		frame.getContentPane().add(LOGIN);
		LOGIN.setColumns(10);
		
		JButton Entrar = new JButton("Entrar");
		Entrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String login = LOGIN.getText();
				char[] senhaArray = SENHA.getPassword();
				String senha = new String(senhaArray);
				
				if (login.equals("admin") && senha.equals("123456")) { //ambos certos
					
					// Fecha a janela atual
		            frame.dispose();
					
					ResolveQuestaoB window2 = new ResolveQuestaoB();
					window2.frame.setVisible(true);
					
					
				} else if (login.equals("admin") && !senha.equals("123456")) { //login certo, senha errada
					
					JOptionPane.showMessageDialog(null, "A senha está errada!", "Tente novamente...", JOptionPane.ERROR_MESSAGE);
				
				} else if (!login.equals("admin") && senha.equals("123456")) { //login errado, senha certa
					
					JOptionPane.showMessageDialog(null, "O login está errado!", "Tente novamente...", JOptionPane.ERROR_MESSAGE);
					
				} else { //ambos errados
					
					JOptionPane.showMessageDialog(null, "A senha e o login estão errados!", "Tente novamente...", JOptionPane.ERROR_MESSAGE);
				}
				
				
			}
		});
		Entrar.setBounds(49, 214, 89, 23);
		frame.getContentPane().add(Entrar);
		
		JButton SAIR = new JButton("Sair");
		SAIR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		SAIR.setBounds(244, 214, 89, 23);
		frame.getContentPane().add(SAIR);
		
		SENHA = new JPasswordField();
		SENHA.setBounds(70, 141, 238, 20);
		frame.getContentPane().add(SENHA);
		
		Checkbox cbSenha = new Checkbox("Visualizar senha");
		cbSenha.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
	
				if (cbSenha.getState()) {
		            // Se sim, mostra a senha
		            SENHA.setEchoChar((char) 0); // 0 significa exibir o caractere real
		            
		        } else {
		        	
		            // Se não, oculta a senha com asteriscos
		        	
		            SENHA.setEchoChar('*');
		        }
				
			}
		});
		cbSenha.setFont(new Font("Arial", Font.PLAIN, 11));
		cbSenha.setBounds(319, 139, 105, 22);
		frame.getContentPane().add(cbSenha);
		
		
		
	}
}
