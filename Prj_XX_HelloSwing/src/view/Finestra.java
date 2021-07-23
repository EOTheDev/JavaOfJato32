package view;



import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;

public class Finestra extends JFrame{
	private JTextArea textArea;
	private JButton btn;
	
	public Finestra() {		
		super("la finestra di Edoardo");
		
		this.setLayout(new BorderLayout());
		textArea= new JTextArea();
		btn= new JButton("Cliccami");
		this.add(textArea, BorderLayout.CENTER);
		this.add(btn, BorderLayout.SOUTH);
		
		this.btn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				textArea.append("Hello World!");
			}
		});
		this.setSize(476, 818);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setVisible(true);
	}

}
