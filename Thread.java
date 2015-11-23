package main;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Main extends JFrame implements Runnable, ActionListener {
	
	private int seconds = 0;
	private Thread thread = new Thread(this);
	private JLabel secondsCounter = new JLabel();
	private JButton showSecondsButton = new JButton("Show Seconds");

	public static void main(String[] args) {
		Main main = new Main();
	}
	
	public Main() {
		JPanel panel = new JPanel();
		panel.setLayout(new GridLayout(1, 2));
		
		showSecondsButton.addActionListener(this);
		panel.add(showSecondsButton);
		panel.add(secondsCounter);
		
		getContentPane().add(panel, BorderLayout.NORTH);

		thread.setName("Seconds Counter");
		thread.start();		
		
		setSize(640, 200);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
	}

	@Override
	public void run() {
		Thread current = Thread.currentThread();
		while (current == thread) {
			try {
				Thread.sleep(1000);
				seconds++;
				System.out.println(seconds);
				
				if (seconds == 10) {
					stop();
				}
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void stop() {
		thread = null;
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		secondsCounter.setText(String.valueOf(seconds));
	}

}
