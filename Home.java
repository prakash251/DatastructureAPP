import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Home extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Home frame = new Home();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Home() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 669, 427);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(237, 148, 199));
		contentPane.setForeground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("CHOOSE A DATASTRUCTURE");
		lblNewLabel.setForeground(new Color(255, 128, 0));
		lblNewLabel.setFont(new Font("Constantia", Font.PLAIN, 20));
		lblNewLabel.setBounds(161, 11, 274, 25);
		contentPane.add(lblNewLabel);
		
		JButton array = new JButton("ARRAY");
		array.setFont(new Font("Constantia", Font.BOLD, 14));
		array.setForeground(new Color(128, 128, 192));
		array.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Array().setVisible(true);
			}
		});
		array.setBounds(63, 91, 103, 27);
		contentPane.add(array);
		
		JButton stack = new JButton("STACK");
		stack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR STACK ACCESS
				new Stack().setVisible(true);
			}
			
		});
		stack.setForeground(new Color(128, 128, 192));
		stack.setFont(new Font("Constantia", Font.BOLD, 14));
		stack.setBounds(260, 91, 103, 27);
		contentPane.add(stack);
		
		JButton queue = new JButton("QUEUE");
		queue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new Queue().setVisible(true);
			}
		});
		queue.setForeground(new Color(128, 128, 192));
		queue.setFont(new Font("Constantia", Font.BOLD, 14));
		queue.setBounds(418, 91, 103, 27);
		contentPane.add(queue);
		
		JButton cqueue = new JButton("CIRCULAR  QUEUE");
		cqueue.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR CIRCULAR QUEUE ACCESS
				new CircularQueue().setVisible(true);
			}
		});
		cqueue.setForeground(new Color(128, 128, 192));
		cqueue.setFont(new Font("Constantia", Font.BOLD, 14));
		cqueue.setBounds(231, 202, 179, 27);
		contentPane.add(cqueue);
		
		JButton slinkedlist = new JButton("SINGLE LINKEDLIST");
		slinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR SINGLE LINKED LIST ACCESS
				 new SingleLinkedList().setVisible(true);
			}
		});
		slinkedlist.setForeground(new Color(128, 128, 192));
		slinkedlist.setFont(new Font("Constantia", Font.BOLD, 14));
		slinkedlist.setBounds(38, 299, 181, 27);
		contentPane.add(slinkedlist);
		
		JButton dlinkedlist = new JButton("DOUBLE LINKED LIST");
		dlinkedlist.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DOUBLE LINKED LIST\
			new DoublyLinkedList().setVisible(true);
			}
		});
		dlinkedlist.setForeground(new Color(128, 128, 192));
		dlinkedlist.setFont(new Font("Constantia", Font.BOLD, 14));
		dlinkedlist.setBounds(430, 299, 179, 27);
		contentPane.add(dlinkedlist);
		
		JButton btnNewButton = new JButton("CLOSE");
		btnNewButton.setForeground(new Color(244, 11, 75));
		btnNewButton.setBackground(new Color(141, 114, 130));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(418, 354, 65, 23);
		contentPane.add(btnNewButton);
	}
}
