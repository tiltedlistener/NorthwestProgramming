package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class InClass extends JFrame implements ActionListener {

	public static void main(String[] args) {
		new InClass();
	}
	
	public InClass() {
		JFrame frame = new JFrame("Windowed Application");
		
		// Main Panel
		JPanel panel = new JPanel();
		JLabel label = new JLabel("My Label");
		JTextField text = new JTextField(20);
		JButton button = new JButton("Click");
		
		panel.add(label);
		panel.add(text);
		panel.add(button);
		
		button.addActionListener(this);
	
		// Footer Panel
		JButton saveButton = new JButton("Save");
		JButton cancelButton = new JButton("Cancel");
		JPanel footerPanel = new JPanel();
		
		footerPanel.setLayout(new GridLayout(1,2));
		footerPanel.add(saveButton);
		footerPanel.add(cancelButton);
		
		// Set Up Window
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		frame.getContentPane().add(footerPanel, BorderLayout.SOUTH);
		
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);		
	}

	@Override
	public void actionPerformed(ActionEvent arg) {
		
		System.out.println(arg.getActionCommand());
		
	}

}
