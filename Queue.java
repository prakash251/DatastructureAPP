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
import javax.swing.JComboBox;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Queue extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JTextField displaybox;
	private int f=0;
	private int r=-1;
	private int size;
	private int q[];
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Queue frame = new Queue();
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
	public Queue() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 672, 453);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(192, 192, 192));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("QUEUE DATA STRUCTURE");
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(102, 11, 220, 24);
		contentPane.add(lblNewLabel);
		
		length = new JTextField();
		length.setBounds(189, 55, 86, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JLabel lblEnterQueueSize = new JLabel("ENTER QUEUE SIZE:");
		lblEnterQueueSize.setForeground(new Color(0, 0, 255));
		lblEnterQueueSize.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterQueueSize.setBounds(24, 55, 172, 24);
		contentPane.add(lblEnterQueueSize);
		
		JButton create = new JButton("CREATE STACK");
		create.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for create queue
				try {
				 size=Integer.valueOf(length.getText());
				q=new int[size];
				JOptionPane.showConfirmDialog(contentPane,size+" size Queue created successfully");
				}
				catch(Exception e1)
				{
					JOptionPane.showConfirmDialog(contentPane,"pls enter integer element");
	
				}
			}
		});
		create.setFont(new Font("Constantia", Font.BOLD, 14));
		create.setForeground(new Color(0, 157, 157));
		create.setBounds(392, 89, 205, 27);
		contentPane.add(create);
		
		JLabel lblEnterElement = new JLabel("ENTER ELEMENT :");
		lblEnterElement.setForeground(Color.BLUE);
		lblEnterElement.setFont(new Font("Constantia", Font.BOLD, 16));
		lblEnterElement.setBounds(24, 143, 172, 24);
		contentPane.add(lblEnterElement);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(173, 143, 86, 20);
		contentPane.add(element);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for insert
				try
				{
				int ele=Integer.valueOf(element.getText());
				if(r==size-1)
				{
					JOptionPane.showConfirmDialog(contentPane,"Queue is full");
				}
				else
				{
				r++;
				q[r]=ele;
				JOptionPane.showConfirmDialog(contentPane,ele+" is inserted successfully ");
				}
				}
				
				catch(Exception b)
				{
					JOptionPane.showConfirmDialog(contentPane,"invalid inputs");

				}
			    element.setText("");
				}
			
		});
		insert.setForeground(new Color(0, 157, 157));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(333, 174, 83, 27);
		contentPane.add(insert);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for delete
				try {
				
				if(r==-1||f>r)
				{
					JOptionPane.showConfirmDialog(contentPane,"Queue is empty");

				}
				else
				{
					
					JOptionPane.showConfirmDialog(contentPane,q[f]+" is deleted successfully");
                       f++;
				}
				}
				catch(Exception d)
				{
					JOptionPane.showConfirmDialog(contentPane,"pls give inputs");

				}
			}
		});
		delete.setForeground(new Color(0, 157, 157));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(525, 174, 85, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//code for display
				String msg="";
				try
				{
				if(r==-1||f>r)
				{
					JOptionPane.showConfirmDialog(contentPane,"Queue is empty");

				}
				else
				{
					for(int i=f;i<=r;i++)
					{
						msg +=q[i]+" ";
					}
					displaybox.setText(msg);
				}
				}
				catch(Exception c)
				{
					JOptionPane.showConfirmDialog(contentPane,"pls give inputs");

				}
					
			}
		});
		display.setForeground(new Color(0, 157, 157));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(202, 306, 91, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(24, 344, 622, 20);
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
		btnNewButton.setBounds(463, 375, 59, 23);
		contentPane.add(btnNewButton);
	}
}
