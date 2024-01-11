# Graphical Interfaces

<div style="display: flex; justify-content: center; gap: 40px;">
<figure style="margin-right: 20px;">
  <img align="center" alt="Goes-Java" height="100" width="60" src="https://cdn.jsdelivr.net/gh/devicons/devicon/icons/java/java-original-wordmark.svg" >
   <figcaption><b> A summary of studies on graphical interfaces.</b></figcaption>
</figure>
</div>

<h2>WindowBuilder </h2>

WindowBuilder is a visual design tool for creating graphical user interfaces (GUIs) in Java. 

→ It is an extension for popular integrated development environments (IDEs) such as `Eclipse`.

> `Eclipse: ` is an open source integrated development platform (IDE) widely used for developing software in various programming languages, with special emphasis on Java.

<img align="center" alt="Eclipse" height="100" width="100" src="https://icons.iconarchive.com/icons/papirus-team/papirus-apps/512/eclipse-icon.png">  <a href="https://eclipseide.org" target="_blank">Eclipse</a>

<h3>Visual Design</h3>

🖼️ It allows you to create graphical user interfaces by `dragging and dropping` visual components into a visual editor. 

![wb_button](https://github.com/Goestoso/Java/assets/132786474/3a6b39cd-e9a6-4bdc-b001-b8608c64f955)

<h3>Layouts</h3>

🧱 It makes manipulating layouts easy, allowing you to choose and adjust layouts visually to achieve the design you want.

![image-23](https://github.com/Goestoso/Java/assets/132786474/09fd5878-abd0-49b5-a8be-6c9dd1d4e76c)

<h3>Code</h3>

🧑‍💻 WindowBuilder automatically generates code corresponding to the graphical interface you designed. 

```
package view;

import java.awt.EventQueue;
import javax.swing.JOptionPane;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class screen {

	private JFrame frame;
	private JTextField input;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					screen window = new screen();
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
	public screen() {
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
		
		JLabel lblNewLabel = new JLabel("Name: ");
		lblNewLabel.setBounds(58, 104, 44, 14);
		frame.getContentPane().add(lblNewLabel);
		
		entrada = new JTextField();
		entrada.setBounds(97, 101, 174, 20);
		frame.getContentPane().add(screen);
		entrada.setColumns(10);
		
		JButton btnNewButton = new JButton("Show");
		btnNewButton.setBounds(97, 132, 95, 20);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Name " + input.getText());
			}
		});
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Exit");
		btnNewButton_1.setBounds(202, 132, 69, 20);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		frame.getContentPane().add(btnNewButton_1);
	}
}

```

<h3>Extensibility</h3>

🔌 WindowBuilder is extensible, which means you can add support for new components or frameworks including `Swing`, `SWT` (Standard Widget Toolkit), and `GWT` (Google Web Toolkit).

<h4>Swing</h4>

Swing is a set of graphics libraries for creating graphical user interfaces (GUI) in Java applications. 

> It is part of the `Java Foundation Classes (JFC)`, which is a broader set of classes for developing GUI and desktop applications in Java.

![swing-components-in-java](https://github.com/Goestoso/Java/assets/132786474/91b73d69-d161-417c-975c-cb61faf01943)

<h4>SWT</h4>

Unlike Swing, which is built entirely in Java and relies on the Java Virtual Machine (JVM), SWT takes a different approach. 

> It uses widgets native to the underlying operating system (Windows, Linux, macOS), leveraging `native APIs` for GUI rendering. 

→ This can result in user interfaces that integrate more naturally into the operating system environment.

![Eclipse_SWT_Windows_Vista_example](https://github.com/Goestoso/Java/assets/132786474/10404280-ffcd-42ef-ad5b-e4beb475ce93)

<h4>GWT</h4>

GWT (Google Web Toolkit) is a framework developed by Google that allows developers to create interactive web applications using Java. 

> The main feature of GWT is the ability to write code in Java and then `translate it into JavaScript` optimized for running in browsers. 

→ This allows developers to use Java as the primary language for developing web applications, taking advantage of object orientation, static typing, and other features of the Java language.

![java1](https://github.com/Goestoso/Java/assets/132786474/32cef843-bece-47b4-9b8f-7e22a50e248c)

