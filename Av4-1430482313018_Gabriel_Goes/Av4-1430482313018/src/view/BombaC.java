package view;

import java.awt.EventQueue;
import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JRadioButton;
import javax.swing.JToggleButton;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.awt.event.ActionEvent;
import javax.swing.JProgressBar;

import javax.swing.Timer;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineEvent;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ButtonGroup;
import java.util.Random;
import javax.swing.JCheckBox;
import javax.swing.SwingConstants;

public class BombaC {

	public JFrame frame;
	private JPasswordField campoCodigo;
	private Timer timer;
    private int tempoRestante;
    
    public static int x;
    public static int y;
    public static int i;
    public static boolean pause;
    
    public static boolean randomBoolean1, randomBoolean2, randomBoolean3, randomBoolean4, on, off;
    
    public static Clip clipAtual;
    public static Clip clipMusica;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					BombaC window = new BombaC();
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
	public BombaC() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		String caminhoDoArquivo = obterCaminhoDoArquivo("resources/Hip-Hop-Corporate.wav");
		
		
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("BOMBA");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(151, 11, 100, 42);
		frame.getContentPane().add(lblNewLabel);
		
		ButtonGroup buttonGroup = new ButtonGroup(); //Agrupar os JRadioButton
		
		JRadioButton rdOn = new JRadioButton("on");
		rdOn.setEnabled(false);
		rdOn.setFont(new Font("Arial", Font.PLAIN, 18));
		rdOn.setBounds(206, 64, 48, 37);
		frame.getContentPane().add(rdOn);
		
		JRadioButton rdOff = new JRadioButton("off");
		rdOff.setEnabled(false);
		rdOff.setFont(new Font("Arial", Font.PLAIN, 18));
		rdOff.setBounds(286, 64, 55, 37);
		frame.getContentPane().add(rdOff);
		
		buttonGroup.add(rdOn);
		buttonGroup.add(rdOff);
		
		Random r = new Random();
		
		//gerar valores booleanos aleatórios para as travas
				randomBoolean1 = r.nextBoolean();
				randomBoolean2 = r.nextBoolean();
				randomBoolean3 = r.nextBoolean();
				randomBoolean4 = r.nextBoolean();
				
				while (randomBoolean1 && randomBoolean2 && randomBoolean3 && randomBoolean4 || !randomBoolean1 && !randomBoolean2 && !randomBoolean3 && !randomBoolean4) { //impede que todas as travas sejam ao mesmo tempo verdadeiras ou falsas
					
					randomBoolean1 = r.nextBoolean();
					randomBoolean2 = r.nextBoolean();
					randomBoolean3 = r.nextBoolean();
					randomBoolean4 = r.nextBoolean();
					
				}
				
		JToggleButton TravaAzul = new JToggleButton("Trava Azul");
		TravaAzul.setEnabled(false);
		TravaAzul.setBackground(new Color(128, 128, 128));
		TravaAzul.setFont(new Font("Arial Black", Font.PLAIN, 12));
		TravaAzul.setForeground(new Color(0, 0, 128));
		TravaAzul.setBounds(10, 64, 143, 23);
		frame.getContentPane().add(TravaAzul);
		
		JToggleButton TravaVerde = new JToggleButton("Trava Verde");
		TravaVerde.setEnabled(false);
		TravaVerde.setForeground(new Color(0, 64, 0));
		TravaVerde.setFont(new Font("Arial Black", Font.PLAIN, 12));
		TravaVerde.setBackground(new Color(128, 128, 128));
		TravaVerde.setBounds(10, 116, 143, 23);
		frame.getContentPane().add(TravaVerde);
		
		JToggleButton TravaVermelha = new JToggleButton("Trava Vermelha");
		TravaVermelha.setEnabled(false);
		TravaVermelha.setForeground(new Color(255, 0, 0));
		TravaVermelha.setFont(new Font("Arial Black", Font.PLAIN, 12));
		TravaVermelha.setBackground(new Color(128, 128, 128));
		TravaVermelha.setBounds(10, 168, 143, 23);
		frame.getContentPane().add(TravaVermelha);
		
		JToggleButton TravaRoxa = new JToggleButton("Trava Roxa");
		TravaRoxa.setEnabled(false);
		TravaRoxa.setForeground(new Color(64, 0, 128));
		TravaRoxa.setFont(new Font("Arial Black", Font.PLAIN, 12));
		TravaRoxa.setBackground(new Color(128, 128, 128));
		TravaRoxa.setBounds(10, 214, 143, 23);
		frame.getContentPane().add(TravaRoxa);
		
		//Habilitar as conexões on/off
		TravaAzul.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				
				String caminhoDoSom = obterCaminhoDoArquivo("resources/ambient-metal-whoosh.wav");
				
				if (TravaAzul.isSelected() == randomBoolean1 
						&& TravaVerde.isSelected() == randomBoolean2
						&& TravaVermelha.isSelected() == randomBoolean3
						&& TravaRoxa.isSelected() == randomBoolean4) {
					
		            reproduzirSom(caminhoDoSom);
					
					JOptionPane.showMessageDialog(frame, "Bomba destravada!", "🎛", JOptionPane.INFORMATION_MESSAGE);
					
					TravaAzul.setEnabled(false);
					TravaVerde.setEnabled(false);
					TravaVermelha.setEnabled(false);
					TravaRoxa.setEnabled(false);
					rdOn.setEnabled(true);
					rdOff.setEnabled(true);
					
					
						
				}
			
			}
		});
		
		TravaVerde.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				
				String caminhoDoSom = obterCaminhoDoArquivo("resources/ambient-metal-whoosh.wav");
				
				if (TravaAzul.isSelected() == randomBoolean1 
						&& TravaVerde.isSelected() == randomBoolean2
						&& TravaVermelha.isSelected() == randomBoolean3
						&& TravaRoxa.isSelected() == randomBoolean4) {
					
					reproduzirSom(caminhoDoSom);
					
					JOptionPane.showMessageDialog(frame, "Bomba destravada!", "🎛", JOptionPane.INFORMATION_MESSAGE);
					
					TravaAzul.setEnabled(false);
					TravaVerde.setEnabled(false);
					TravaVermelha.setEnabled(false);
					TravaRoxa.setEnabled(false);
					rdOn.setEnabled(true);
					rdOff.setEnabled(true);
						
				}
				
			}
			
		});
		
		TravaVermelha.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoSom = obterCaminhoDoArquivo("resources/ambient-metal-whoosh.wav");
				
				if (TravaAzul.isSelected() == randomBoolean1 
						&& TravaVerde.isSelected() == randomBoolean2
						&& TravaVermelha.isSelected() == randomBoolean3
						&& TravaRoxa.isSelected() == randomBoolean4) {
					
					reproduzirSom(caminhoDoSom);
					
					JOptionPane.showMessageDialog(frame, "Bomba destravada!", "🎛", JOptionPane.INFORMATION_MESSAGE);
					
					TravaAzul.setEnabled(false);
					TravaVerde.setEnabled(false);
					TravaVermelha.setEnabled(false);
					TravaRoxa.setEnabled(false);
					rdOn.setEnabled(true);
					rdOff.setEnabled(true);
						
				}
				
			}
			
		});
		
		TravaRoxa.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)  {
				
				String caminhoDoSom = obterCaminhoDoArquivo("resources/ambient-metal-whoosh.wav");
				
				if (TravaAzul.isSelected() == randomBoolean1 
						&& TravaVerde.isSelected() == randomBoolean2
						&& TravaVermelha.isSelected() == randomBoolean3
						&& TravaRoxa.isSelected() == randomBoolean4) {
					
					reproduzirSom(caminhoDoSom);
					JOptionPane.showMessageDialog(frame, "Bomba destravada!", "🎛", JOptionPane.INFORMATION_MESSAGE);
					TravaAzul.setEnabled(false);
					TravaVerde.setEnabled(false);
					TravaVermelha.setEnabled(false);
					TravaRoxa.setEnabled(false);
					rdOn.setEnabled(true);
					rdOff.setEnabled(true);
						
				}
				
			}
			
		});
		
		JProgressBar progressBar = new JProgressBar();
		progressBar.setBackground(Color.ORANGE);
		progressBar.setFont(new Font("Tahoma", Font.BOLD, 12));
		progressBar.setForeground(Color.DARK_GRAY);
		progressBar.setStringPainted(true);
		progressBar.setBounds(262, 21, 146, 30);
		frame.getContentPane().add(progressBar);
		
		x = r.nextInt(100) + 1;
		y = r.nextInt(100) + 1;
		
		on = r.nextBoolean();
		off = r.nextBoolean();
		
		while (on && off || !on && !off) {
			
			on = r.nextBoolean();
			off = r.nextBoolean();
		}
		
		String vezes = x * y + "";
		
		JButton Voltar = new JButton("Voltar");
		Voltar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String caminhoDoSom = obterCaminhoDoArquivo("resources/stop.wav");
	            reproduzirSom(caminhoDoSom);
				
				timer.stop(); //fecha a execução do timer
				i = 0; //zera o valor da iteração do progressBar
				desligarMusica(caminhoDoArquivo); //encerra a música
				
				// Fecha a janela atual
	            frame.dispose();
				
	            QuestaoC window = new QuestaoC();
				window.frame.setVisible(true);
				
				
			}
		});
		
		JCheckBox checkBox = new JCheckBox("");
		checkBox.setEnabled(false);
		checkBox.setHorizontalAlignment(SwingConstants.RIGHT);
		checkBox.setBounds(165, 146, 48, 23);
		frame.getContentPane().add(checkBox);
		
		JButton Desarmar = new JButton("Desarmar");
		Desarmar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] codigoArray = campoCodigo.getPassword();
				String codigo = new String(codigoArray);
				
				String caminhoDoSomErrado = obterCaminhoDoArquivo("resources/error.wav");
				String caminhoDoSomCerto = obterCaminhoDoArquivo("resources/success-fanfare-trumpets.wav");
				
				//Para caso queira acessar os conteúdos, descomente o código abaixo:
				//JOptionPane.showMessageDialog(frame, "Azul " + randomBoolean1 + " Verde " + randomBoolean2 + " Vermelho " + randomBoolean3 + " Roxo " + randomBoolean4 + " on/off " + on + " " + off + " cod " + vezes);
				
				if (checkBox.isSelected()) {
					
					//Verificar a ordem das travas
					if (TravaAzul.isSelected() == randomBoolean1 
							&& TravaVerde.isSelected() == randomBoolean2
							&& TravaVermelha.isSelected() == randomBoolean3
							&& TravaRoxa.isSelected() == randomBoolean4) {
						
						if (rdOn.isSelected() && on) {
							
							desligarMusica(caminhoDoArquivo); //encerra música
							reproduzirSom(caminhoDoSomCerto);
							timer.stop(); //fecha a execução do timer
							i = 0; //zera o valor da iteração do progressBar
							JOptionPane.showMessageDialog(frame, "Bomba desarmada!", "UFA! 😥", JOptionPane.PLAIN_MESSAGE);
							
							// Fecha a janela atual
				            frame.dispose();
							
				            QuestaoC window = new QuestaoC();
							window.frame.setVisible(true);
							
						} else if (rdOff.isSelected() && off) {
							
							desligarMusica(caminhoDoArquivo); //encerra música
							reproduzirSom(caminhoDoSomCerto);
							timer.stop(); //fecha a execução do timer
							i = 0; //zera o valor da iteração do progressBar
							JOptionPane.showMessageDialog(frame, "Bomba desarmada!", "UFA! 😥", JOptionPane.PLAIN_MESSAGE);
							
							// Fecha a janela atual
				            frame.dispose();
							
				            QuestaoC window = new QuestaoC();
							window.frame.setVisible(true);
						
						} else if (rdOn.isSelected() == false && rdOff.isSelected() == false){
							
							reproduzirSom(caminhoDoSomErrado);
							JOptionPane.showMessageDialog(frame, "Ainda falta ativar ou desativar as conexões da bomba...", "Atenção!", JOptionPane.WARNING_MESSAGE);
							
						} else {
							
							tempoRestante = 0; //... explosão 
							atualizarTempo(progressBar);
						}
						
						
					} else {
						
						reproduzirSom(caminhoDoSomErrado);
						JOptionPane.showMessageDialog(frame, "As travas estão impedindo o desarmamento da bomba!", "Ooops...", JOptionPane.ERROR_MESSAGE);
					}
						
					
				} else if (codigo.equals(vezes)){
					
					reproduzirSom(caminhoDoSomErrado);
					JOptionPane.showMessageDialog(frame, "Pressione 'Enter' no campo do código, pois ele está correto!", "Aviso!", JOptionPane.WARNING_MESSAGE);
					
				} else {
					
					reproduzirSom(caminhoDoSomErrado);
					JOptionPane.showMessageDialog(frame, "Código errado!", "Ooops...", JOptionPane.ERROR_MESSAGE);
					
				}
				
			}
		});
		Desarmar.setFont(new Font("Arial", Font.PLAIN, 14));
		Desarmar.setBounds(308, 196, 100, 42);
		frame.getContentPane().add(Desarmar);
		
		
		Voltar.setFont(new Font("Arial", Font.PLAIN, 13));
		Voltar.setBounds(10, 11, 73, 23);
		frame.getContentPane().add(Voltar);
		
		campoCodigo = new JPasswordField();
		campoCodigo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				char[] codigoArray = campoCodigo.getPassword();
				String codigo = new String(codigoArray);
				
				if (codigo.equals(vezes)) {
					
					String caminhoDoSom = obterCaminhoDoArquivo("resources/message-incoming.wav");
					reproduzirSom(caminhoDoSom);
					
					checkBox.setSelected(true);
					JOptionPane.showMessageDialog(frame, "Bomba desbloqueada!", "🔐", JOptionPane.INFORMATION_MESSAGE);
					campoCodigo.setEnabled(false);
					TravaAzul.setEnabled(true);
					TravaVerde.setEnabled(true);
					TravaVermelha.setEnabled(true);
					TravaRoxa.setEnabled(true);
					
				} else {
					
					String caminhoDoSom = obterCaminhoDoArquivo("resources/error.wav");
					reproduzirSom(caminhoDoSom);
					JOptionPane.showMessageDialog(frame, "Bomba bloqueada!", "🔒", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		campoCodigo.setBounds(219, 149, 189, 20);
		frame.getContentPane().add(campoCodigo);
		
		JLabel lblNewLabel_1 = new JLabel("Código");
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 16));
		lblNewLabel_1.setBounds(280, 116, 73, 23);
		frame.getContentPane().add(lblNewLabel_1);
		
		int [] vetor = VetorComValoresUnicosAleatorios.gerarVetorComValoresAleatoriosUnicos(4);
		
		JButton btnDica = new JButton("Dicas");
		btnDica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				pause = pausarTempo();
				
				String caminhoDoSom = obterCaminhoDoArquivo("resources/achive-sound.wav");
	            reproduzirSom(caminhoDoSom);
				
				JOptionPane.showConfirmDialog(null, "On/Off → Referem-se ao tipo de conexão da bomba com o sistema "
						+ "\nde segurança..."
						+ "\nOn → sinaliza que arrisca deixar a conexão ligada!"
						+ "\nOff → sinaliza que você arrisca deixar a conexão desligada!"
						+ "\n\n⚠  O sistema de segurança é variável, depende do tipo de bomba..."
						+ "\n⚠  Algumas bombas são desarmadas com o sistema de segurança "
						+ "\nligado, porém existem aquelas que podem explodir na mesma "
						+ "\nsituação!"
						+ "\n\n🔎 Pistas:"
						+ "\nCódigo: multiplicação entre " + x + " e " + y + ", depois pressione 'Enter'."
						+ "\nTravas: [" + ordemTravas(vetor, randomBoolean1, randomBoolean2, randomBoolean3, randomBoolean4) + "]"
						+"\n\nAperte qualquer opção abaixo para continuar: ", "Dicas 💡", JOptionPane.INFORMATION_MESSAGE);
				
				
				pause = continuarTempo();
				
			}
		});
		btnDica.setFont(new Font("Arial", Font.PLAIN, 14));
		btnDica.setBounds(194, 196, 100, 42);
		frame.getContentPane().add(btnDica);
		
		JCheckBox cbMusica = new JCheckBox("Música");
		cbMusica.setSelected(true);
		
		if (cbMusica.isSelected()) {
			
			 reproduzirMusica(caminhoDoArquivo, cbMusica);
			 
		}
		
		cbMusica.addItemListener(new ItemListener() {
			 @Override
	            public void itemStateChanged(ItemEvent e) {
	                if (e.getStateChange() == ItemEvent.SELECTED) {
	                    // Checkbox foi marcado, ativar música
	                    reproduzirMusica(caminhoDoArquivo, cbMusica);
	                    
	                } else if (e.getStateChange() == ItemEvent.DESELECTED) {
	                	
	                    // Checkbox foi desmarcado, desativar música
	                    desligarMusica(caminhoDoArquivo);
	                    
	                }
	            }
	        });
		cbMusica.setFont(new Font("Arial", Font.PLAIN, 11));
		cbMusica.setBounds(10, 34, 97, 23);
		frame.getContentPane().add(cbMusica);
		
		 tempoRestante = 100;

	        // Cria um Timer que chama o método atualizarTempo a cada segundo
	        timer = new Timer(1000, new ActionListener() {
	            @Override
	            public void actionPerformed(ActionEvent e) {
	                atualizarTempo(progressBar);
	            }
	        });
	        timer.start();
	}
	
	 private void atualizarTempo(JProgressBar progressBar) {
	        if (tempoRestante > 0 && !pause) {
	            tempoRestante--;
	            if (tempoRestante %1 == 0) {
	            	++i;
	            }
	            progressBar.setValue(i); // Ajusta o valor do ProgressBar
	        } else if (tempoRestante == 0) {
	            timer.stop();
	            clipMusica.stop();
	            String caminhoDoSom = obterCaminhoDoArquivo("resources/hq-explosion.wav");
	            reproduzirSom(caminhoDoSom);
	            JOptionPane.showMessageDialog(frame, "BOOOOOOOOOOOOOOOOOOM 💣", "GAME OVER ☠", JOptionPane.ERROR_MESSAGE);
	            
	            String caminhoDoArquivo = obterCaminhoDoArquivo("resources/Hip-Hop-Corporate.wav");
	            
				i = 0; //zera o valor da iteração do progressBar
				desligarMusica(caminhoDoArquivo); //encerra a música
				
				// Fecha a janela atual
	            frame.dispose();
				
	            QuestaoC window = new QuestaoC();
				window.frame.setVisible(true);
	            
	        }
	    }
	 
	 public static boolean pausarTempo() {
		 
		 return true;
	 }
	 
	 public static boolean continuarTempo() {
		 
		 return false;
	 }
	 
	 public static String ordemTravas(int [] vetor, boolean randomBoolean1, boolean randomBoolean2, boolean randomBoolean3, boolean randomBoolean4) {
		 
		 Random r = new Random();
		 
		 int n = r.nextInt(1);
		 
		 String travaAzul = (randomBoolean1) ? "- Verdadeiro -" : "- Falso -";
		 String travaVerde = (randomBoolean2) ? "- Verdadeiro -" : "- Falso -";
		 String travaVermelha = (randomBoolean3) ? "- Verdadeiro -" : "- Falso -";
		 String travaRoxa = (randomBoolean4) ? "- Verdadeiro -" : "- Falso -";
		 
		//criar ordem aleatória das travas para dar dica
		 String [] listaTravas = new String[4];
		 
		 if (n == 0) {
			
			 listaTravas[vetor[0]] = travaAzul;
			 listaTravas[vetor[1]] = travaVerde;
			 listaTravas[vetor[2]] = "";
			 listaTravas[vetor[3]] = "";
			  
		 } else {
			 
			 listaTravas[vetor[0]] = "";
			 listaTravas[vetor[1]] = "";
			 listaTravas[vetor[2]] = travaVermelha;
			 listaTravas[vetor[3]] = travaRoxa;
			 
		 }
		  
		 
		 String ordemTravas = String.join("", listaTravas);
		 
		 return ordemTravas;
	 }
	 
	 public static void reproduzirMusica(String caminhoDoSom, JCheckBox cbMusica) {
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
	                    if (event.getType() == LineEvent.Type.STOP && !cbMusica.isSelected()) {
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
	            clipMusica.close();
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

		            // Atualiza o Clip atual
		            clipAtual = novoClip;
		        } catch (UnsupportedAudioFileException | IOException | LineUnavailableException e) {
		            e.printStackTrace();
		        }
		    }
}
