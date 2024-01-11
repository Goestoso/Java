package view;

import java.awt.EventQueue;

import javax.swing.JButton;
import javax.swing.JFrame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.JLabel;
import java.awt.Font;


public class ResolveQuestaoB {

	public JFrame frame;
	
	// Declaração da variável de classe
    private static Clip clipAtual;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ResolveQuestaoB window = new ResolveQuestaoB();
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
	public ResolveQuestaoB() {
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
		
		JLabel lblNewLabel = new JLabel("Botões");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 40));
		lblNewLabel.setBounds(147, 11, 151, 76);
		frame.getContentPane().add(lblNewLabel);
		
		JButton btnNewButton = new JButton(":O)");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoArquivo = obterCaminhoDoArquivo("resources/fart.wav");
				
				reproduzirSom(caminhoDoArquivo);
			}
		});
		btnNewButton.setBounds(33, 105, 89, 41);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSom = new JButton("=/");
		btnSom.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoArquivo = obterCaminhoDoArquivo("resources/pipe.wav");
				
				reproduzirSom(caminhoDoArquivo);
			}
		});
		btnSom.setBounds(166, 98, 89, 41);
		frame.getContentPane().add(btnSom);
		
		JButton btnSom_2 = new JButton("HAHAHA");
		btnSom_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoArquivo = obterCaminhoDoArquivo("resources/sinister-laugh.wav");
				
				reproduzirSom(caminhoDoArquivo);
				
			}
		});
		btnSom_2.setBounds(302, 105, 89, 41);
		frame.getContentPane().add(btnSom_2);
		
		JButton btnSom_1 = new JButton("BOOOM");
		btnSom_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoArquivo = obterCaminhoDoArquivo("resources/hq-explosion.wav");
				
				reproduzirSom(caminhoDoArquivo);
			}
		});
		btnSom_1.setBounds(33, 171, 89, 41);
		frame.getContentPane().add(btnSom_1);
		
		JButton btnSom_2_1 = new JButton("OwO");
		btnSom_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoArquivo = obterCaminhoDoArquivo("resources/waterphone.wav");
				
				reproduzirSom(caminhoDoArquivo);
			}
		});
		btnSom_2_1.setBounds(302, 171, 89, 41);
		frame.getContentPane().add(btnSom_2_1);
		
		JButton btnNewButton_1 = new JButton("Sair");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnNewButton_1.setBounds(166, 227, 89, 23);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnSom_2_1_1 = new JButton("Guitarra");
		btnSom_2_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoArquivo = obterCaminhoDoArquivo("resources/guitar-riff.wav");
				
				reproduzirSom(caminhoDoArquivo);
			}
		});
		btnSom_2_1_1.setBounds(166, 159, 89, 41);
		frame.getContentPane().add(btnSom_2_1_1);
	}
	
	 public static void reproduzirSom(String caminhoDoSom) {
	        try {
	        	
	        	 // Se houver um Clip em reprodução, interrompa-o
	            if (clipAtual != null && clipAtual.isRunning()) {
	                clipAtual.stop();
	            }
	        	
	            File arquivoSom = new File(caminhoDoSom);
	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivoSom);
	            Clip novoClip = AudioSystem.getClip();
	            
	            novoClip.open(audioInputStream);
	            novoClip.start();

	            // Atualiza o Clip atual
	            clipAtual = novoClip;
	        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	            e.printStackTrace();
	        }
	    }
	 
	 public static String obterCaminhoDoArquivo(String nomeArquivo) {
		 
	        try {
	            // Obtém o caminho do diretório que contém o pacote da sua classe
	            String caminhoPacote = ResolveQuestaoB.class.getResource("").getPath();
	            
	            // Constrói o caminho completo para o arquivo de áudio
	            String caminhoCompleto = caminhoPacote + nomeArquivo;
	            
	            // Converte espaços em branco (%20) para espaços simples
	            caminhoCompleto = caminhoCompleto.replace("%20", " ");
	            
	            // Converte para um caminho de arquivo real
	            File arquivo = new File(caminhoCompleto);
	            
	            // Retorna o caminho do arquivo
	            return arquivo.getAbsolutePath();
	            
	        } catch (Exception e) {
	        	
	            e.printStackTrace();
	            
	            return null;
	        }
	    }
}
