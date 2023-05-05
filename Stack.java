import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Stack extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int st[];
	private int top=-1;
	private int size;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Stack frame = new Stack();
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
	public Stack() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 457);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(225, 225, 0));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("STACK DATASTRUCTUR");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setForeground(new Color(255, 0, 0));
		lblNewLabel.setBounds(192, 11, 204, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER STACK SIZE:");
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1.setBounds(46, 77, 128, 18);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(210, 74, 137, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating stack
				try
				{
				size=Integer.valueOf(length.getText());
				st=new int[size];
				JOptionPane.showConfirmDialog(contentPane,"stack is created");
				}
				catch(Exception a)
				{
					JOptionPane.showConfirmDialog(contentPane,"pls enter element");
				}
			}
				
		});
		create.setBounds(394, 73, 128, 23);
		contentPane.add(create);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER INTEGER TO INSERT:");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(37, 135, 191, 18);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(227, 132, 139, 20);
		contentPane.add(element);
		
		JButton push = new JButton("PUSH");
		push.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//push element in stack
				try {
				int ele=Integer.valueOf(element.getText());
				 if(top==size-1)
				 {
					 JOptionPane.showConfirmDialog(contentPane,"stack is ful");
				 }
				 else
				 {
					 top++;
					 st[top]=ele;
					 JOptionPane.showConfirmDialog(contentPane,"pushing is successfull");
	 
				 }
				}
				catch(Exception d)
				{
					 JOptionPane.showConfirmDialog(contentPane,"enter valid input");

				}
				element.setText("");

			}

		});
		push.setFont(new Font("Constantia", Font.BOLD, 14));
		push.setForeground(new Color(255, 128, 192));
		push.setBounds(88, 177, 86, 27);
		contentPane.add(push);
		
		JButton pop = new JButton("POP");
		pop.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//pop operation
				if(top==-1)
				{
			     JOptionPane.showConfirmDialog(contentPane,"stack is empty");

				}
				else
				{
					String message=st[top]+" is deleted";
					 JOptionPane.showConfirmDialog(contentPane,message);
                       top--;
				}
			}
				
			
		});
		pop.setForeground(new Color(255, 128, 192));
		pop.setFont(new Font("Constantia", Font.BOLD, 14));
		pop.setBounds(394, 162, 95, 27);
		contentPane.add(pop);
		
		JButton display = new JButton("DISPLAY:");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//display operation
				String msg="";
				if(top==-1)
				{
					 JOptionPane.showConfirmDialog(contentPane,"display not possible");

				}
				else
				{
				for(int i=0;i<=top;i++)
				{
					msg +=st[i]+" ";
				}
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(255, 128, 192));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(252, 283, 95, 27);
		contentPane.add(display);
		displaybox = new JTextField();
		displaybox.setBounds(21, 344, 534, 27);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setForeground(new Color(244, 11, 75));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.setBounds(502, 382, 59, 23);
		contentPane.add(btnNewButton);
	}
}
