package view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;

import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JRadioButton;

public class QuestaoC {

	public JFrame frame;
	
	private static Clip clipMusica;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					QuestaoC window = new QuestaoC();
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
	public QuestaoC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 320);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		String guia = "<html>Bem vindo! "
				+ "<br> <br>Este é o jogo da BOMBA, onde você terá que seguir as intruções, aproveitar as dicas e ter um pouquinho de sorte (😅)... "
				+ "<br><br>Aqui estão algumas instruções:"
				+ "<br>↪ Primeiro você deve acessar a BOMBA por meio do seu código secreto!"
				+ "<br>↪ Segundo, desative as verdadeiras travas da BOMBA (🔎)..."
				+ "<br>↪ Terceiro, escolha com cuidado a conexão da BOMBA (se é on ou off)!"
				+ "<br>↪ Quarto, você deverá ter sorte, se escolher a conexão errada... ☠"
				+ "<br>↪ Quinto e último, mas não o menos importante, boa sorte e que você consiga desarmar a bomba... e não se esqueça de usar as dicas (😉)!"
				+ "<br><br>⚠ Importante: não deixe a BOMBA carregar até o 100% (💥)!</html>"; 
		
		JLabel lblNewLabel = new JLabel(guia);
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 12));
		lblNewLabel.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel.setBounds(10, 32, 414, 204);
		frame.getContentPane().add(lblNewLabel);
		
		
		JLabel lblNewLabel_1 = new JLabel("MENU");
		lblNewLabel_1.setFont(new Font("Arial", Font.BOLD, 18));
		lblNewLabel_1.setBounds(174, 11, 75, 21);
		frame.getContentPane().add(lblNewLabel_1);
		
		ButtonGroup buttonGroup = new ButtonGroup(); //Agrupar os JRadioButton
		
		String caminhoDoArquivo = obterCaminhoDoArquivo("resources/technology.wav");
		
		JRadioButton rdLigada = new JRadioButton("Ligada");
		rdLigada.setSelected(true);
		rdLigada.setFont(new Font("Arial", Font.PLAIN, 11));
		rdLigada.setBounds(344, 2, 57, 23);
		frame.getContentPane().add(rdLigada);
		
		JRadioButton rdDesligada = new JRadioButton("Desligada");
		
		rdDesligada.setFont(new Font("Arial", Font.PLAIN, 11));
		rdDesligada.setBounds(344, 28, 80, 23);
		frame.getContentPane().add(rdDesligada);
		
		buttonGroup.add(rdLigada);
		buttonGroup.add(rdDesligada);
		
		if (rdLigada.isSelected())
			
			reproduzirMusica(caminhoDoArquivo, rdDesligada);
		
		JButton btnNewButton = new JButton("Jogar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoArquivo = obterCaminhoDoArquivo("resources/start.wav");
				reproduzirSom(caminhoDoArquivo);
				
				clipMusica.close();
				
				// Fecha a janela atual
	            frame.dispose();
	            
	            BombaC window = new BombaC();
				window.frame.setVisible(true);
			
			}
		});
		btnNewButton.setFont(new Font("Arial", Font.PLAIN, 15));
		btnNewButton.setBounds(70, 247, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnSair = new JButton("Sair");
		btnSair.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoArquivo = obterCaminhoDoArquivo("resources/stop.wav");
				reproduzirSom(caminhoDoArquivo);
				System.exit(0);			}
		});
		btnSair.setFont(new Font("Arial", Font.PLAIN, 15));
		btnSair.setBounds(236, 247, 89, 23);
		frame.getContentPane().add(btnSair);
		
		rdLigada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				reproduzirMusica(caminhoDoArquivo, rdDesligada);
			}
		});
		
		rdDesligada.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				desligarMusica(caminhoDoArquivo);
				
			}
		});
		
		JLabel lblNewLabel_2 = new JLabel("Música");
		lblNewLabel_2.setFont(new Font("Arial", Font.BOLD, 11));
		lblNewLabel_2.setBounds(300, 16, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
	}
	
	public static void reproduzirMusica(String caminhoDoSom, JRadioButton rdDesligada) {
        try {
        
                File arquivoSom = new File(caminhoDoSom);
                AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivoSom);
                Clip novoClip = AudioSystem.getClip();
                
                novoClip.open(audioInputStream);
                novoClip.start();

                // Atualiza o Clip atual
                clipMusica = novoClip;
                
                
                // Adicionar um LineListener para detectar quando o áudio termina
                clipMusica.addLineListener(event -> {
                    if (event.getType() == LineEvent.Type.STOP && !rdDesligada.isSelected()) {
                        // Quando o áudio termina, reinicie
                        clipMusica.setMicrosecondPosition(0);
                        clipMusica.start();
                    }
                });
            	
            
        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
            e.printStackTrace();
        }
    }
	
	public static void desligarMusica(String caminho) {
		
		 // Se houver um Clip em reprodução, interrompa-o
        if (clipMusica != null && clipMusica.isRunning()) {
            clipMusica.stop();
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
	 
	 public static void reproduzirSom(String caminhoDoSom) {
	        try {
	        	
	            File arquivoSom = new File(caminhoDoSom);
	            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(arquivoSom);
	            Clip novoClip = AudioSystem.getClip();
	            
	            novoClip.open(audioInputStream);
	            novoClip.start();

	        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
	            e.printStackTrace();
	        }
	    }
}
