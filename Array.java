import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Array extends JFrame {

	private JPanel contentPane;
	private JTextField length;
	private JTextField element;
	private JLabel lblNewLabel_1_1;
	private JTextField elementposition;
	private JTextField deleteposition;
	private JTextField displaybox;
	private int arr[];

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Array frame = new Array();
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
	public Array() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 648, 436);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ARRAY DATASTRUCUTURE");
		lblNewLabel.setForeground(new Color(255, 0, 128));
		lblNewLabel.setFont(new Font("Algerian", Font.BOLD, 18));
		lblNewLabel.setBounds(114, 11, 233, 24);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER ARRAY LENGTH :");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1.setBounds(30, 69, 172, 17);
		contentPane.add(lblNewLabel_1);
		
		length = new JTextField();
		length.setBounds(208, 69, 95, 20);
		contentPane.add(length);
		length.setColumns(10);
		
		JButton btnNewButton = new JButton("CREATE ARRAY");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//creating array
			arr=new int[Integer.valueOf(length.getText())];
			String message="created arry of  size "+length.getText();
			JOptionPane.showConfirmDialog(contentPane, message);
			length.setText("");
			
			}
		});
		btnNewButton.setFont(new Font("Constantia", Font.BOLD, 14));
		btnNewButton.setForeground(new Color(0, 128, 64));
		btnNewButton.setBounds(322, 68, 135, 27);
		contentPane.add(btnNewButton);
		
		lblNewLabel_1_1 = new JLabel("ENTER INTEEGER ELEMENT:");
		lblNewLabel_1_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(0, 136, 202, 17);
		contentPane.add(lblNewLabel_1_1);
		
		element = new JTextField();
		element.setColumns(10);
		element.setBounds(208, 136, 106, 20);
		contentPane.add(element);
		
		JLabel lblNewLabel_1_1_1 = new JLabel("INSERT POSITION:");
		lblNewLabel_1_1_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1.setBounds(10, 192, 138, 17);
		contentPane.add(lblNewLabel_1_1_1);
		
		elementposition = new JTextField();
		elementposition.setColumns(10);
		elementposition.setBounds(158, 192, 63, 20);
		contentPane.add(elementposition);
		
		JButton insert = new JButton("INSERT");
		insert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//inserting array element in given position
			try {
			int	p=Integer.valueOf(elementposition.getText());
			
			int ele=Integer.valueOf(element.getText());
			arr[p]=ele;
			String message="inserted element "+ele+" on index "+p;
			JOptionPane.showConfirmDialog(contentPane, message);
			}
			catch(Exception g)
			{
			String message="out of bound index";
			JOptionPane.showConfirmDialog(contentPane, message);
			}
			elementposition.setText("");
			}
		});
		insert.setForeground(new Color(0, 128, 64));
		insert.setFont(new Font("Constantia", Font.BOLD, 14));
		insert.setBounds(264, 191, 83, 27);
		contentPane.add(insert);
		
		JLabel lblNewLabel_1_1_1_1 = new JLabel("DELETE POSITION:");
		lblNewLabel_1_1_1_1.setForeground(new Color(0, 128, 192));
		lblNewLabel_1_1_1_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNewLabel_1_1_1_1.setBounds(10, 235, 137, 17);
		contentPane.add(lblNewLabel_1_1_1_1);
		
		deleteposition = new JTextField();
		deleteposition.setColumns(10);
		deleteposition.setBounds(157, 235, 63, 20);
		contentPane.add(deleteposition);
		
		JButton delete = new JButton("DELETE");
		delete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DELETE ARRYA IN GIVEN POSITION
			try {
				int index=Integer.valueOf(deleteposition.getText());
				arr[index]=0;
				String message="element deleted at positio"+index;
				JOptionPane.showConfirmDialog(contentPane, message);
			}
				catch(Exception f)
				{
					String message="enter integer value less than"+length.getText();
					JOptionPane.showConfirmDialog(contentPane, message);
				}
		
			deleteposition.setText("");
				
			}
			
		});
		delete.setForeground(new Color(0, 128, 64));
		delete.setFont(new Font("Constantia", Font.BOLD, 14));
		delete.setBounds(262, 229, 85, 27);
		contentPane.add(delete);
		
		JButton display = new JButton("DISPLAY:");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//DISPLYA ARRAY
				String msg="";
				for(int i=0;i<arr.length-1;i++)
				{
				msg=msg+" "+arr[i] ;
				}
				displaybox.setText(msg);
			}
		});
		display.setForeground(new Color(0, 128, 64));
		display.setFont(new Font("Constantia", Font.BOLD, 14));
		display.setBounds(241, 359, 95, 27);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBackground(new Color(255, 255, 255));
		displaybox.setColumns(10);
		displaybox.setBounds(32, 322, 554, 26);
		contentPane.add(displaybox);
		
		JButton btnNewButton_1 = new JButton("BACK");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton_1.setBackground(new Color(247, 9, 74));
		btnNewButton_1.setBounds(456, 359, 72, 23);
		contentPane.add(btnNewButton_1);
	}
}
