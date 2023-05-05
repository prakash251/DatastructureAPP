import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SingleLinkedList extends JFrame {

	private JPanel contentPane;
	private JTextField element;
	private class Node
	{
		int data;
		Node link;
	}
	private Node first;
	private JTextField displaybox;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SingleLinkedList frame = new SingleLinkedList();
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
	public SingleLinkedList() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 670, 454);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.setFont(new Font("Constantia", Font.PLAIN, 11));
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				//CODE FOR INSERT FRONT
				try {
				
				int ele=Integer.valueOf(element.getText());
				Node newNode=new Node();
				newNode.data=ele;
				newNode.link=null;
				if(first==null)
				{
					first=newNode;
				}
				else
				{
					newNode.link=first;
					first=newNode;
					
				}
				JOptionPane.showConfirmDialog(contentPane,"node inserted at first successfully");
				}
				catch(Exception g)
				{
					
				JOptionPane.showConfirmDialog(contentPane,"enter valid input");
	
				}
				
				
				
			}
		});
		insertfront.setBounds(105, 129, 111, 23);
		contentPane.add(insertfront);
		
		JLabel Heading = new JLabel("SINGLE LINKED LIST");
		Heading.setFont(new Font("Algerian", Font.BOLD, 18));
		Heading.setForeground(new Color(255, 0, 128));
		Heading.setBounds(181, 11, 176, 24);
		contentPane.add(Heading);
		
		JLabel ELEMENT = new JLabel("ENTER ELEMENT");
		ELEMENT.setFont(new Font("Constantia", Font.BOLD, 14));
		ELEMENT.setForeground(new Color(128, 0, 64));
		ELEMENT.setBounds(59, 74, 114, 18);
		contentPane.add(ELEMENT);
		
		element = new JTextField();
		element.setBounds(181, 73, 86, 20);
		contentPane.add(element);
		element.setColumns(10);
		
		JButton btnInsertRare = new JButton("INSERT RARE");
		btnInsertRare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR INSERT RARE
				try {
					
					int ele=Integer.valueOf(element.getText());
					Node newNode=new Node();
					newNode.data=ele;
					newNode.link=null;
				    Node temp;
					if(first==null)
					{
						first=newNode;
					}
					else
					{
						temp=first;
					     while(temp.link!=null)
					     { 
					    	temp=temp.link ;
					     }
			            temp.link=newNode;
						
					}
					JOptionPane.showConfirmDialog(contentPane,"node inserted at rare successfully");
					}
					catch(Exception g)
					{
						
					JOptionPane.showConfirmDialog(contentPane,"enter valid input");
		
					}
					
					
				
			}
		});
		btnInsertRare.setFont(new Font("Constantia", Font.PLAIN, 11));
		btnInsertRare.setBounds(105, 197, 111, 23);
		contentPane.add(btnInsertRare);
		
		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//CODE FOR DELETE FRONT
				Node temp;
				if(first==null)
				{
				 JOptionPane.showConfirmDialog(contentPane,"deletion not possible");
				}
				else if(first.link==null)
				{
			   JOptionPane.showConfirmDialog(contentPane,"deleted"+first.data);
				first=null;	
				}
				else
				{
					JOptionPane.showConfirmDialog(contentPane,"deleted at front");

					JOptionPane.showConfirmDialog(contentPane,"deleted"+first.data);
					first=first.link;
				}
				
				
			}
		});
		deletefront.setFont(new Font("Constantia", Font.PLAIN, 11));
		deletefront.setBounds(301, 129, 111, 23);
		contentPane.add(deletefront);
		
		JButton deleterare = new JButton("DELETE RARE");
		deleterare.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) 
			{
				//CODE FOR DELETE RARE
				Node temp;
				if(first==null)
				{
				 JOptionPane.showConfirmDialog(contentPane,"deletion not possible");
				}
				else if(first.link==null)
				{
			   JOptionPane.showConfirmDialog(contentPane,"deleted"+first.data);
				first=null;	
				}
				else
				{
					temp=first;
					JOptionPane.showConfirmDialog(contentPane,"deleted at rare");
					JOptionPane.showConfirmDialog(contentPane,"deleted"+first.data);
					while(temp.link.link!=null)
					{
						temp=temp.link;
					}
					temp.link=null;
				}
				
			}
		});
		deleterare.setFont(new Font("Constantia", Font.PLAIN, 11));
		deleterare.setBounds(301, 197, 111, 23);
		contentPane.add(deleterare);
		
		JButton display = new JButton("DISPLAY");
		display.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e)
			{
				//CODE FOR DISPLAY\
				String msg="";
				Node temp;
				temp=first;
				while(temp!=null)
				{
					msg=msg+temp.data+" ";
					temp=temp.link;
				}
				//JOptionPane.showConfirmDialog(contentPane,msg);
			   displaybox.setText(msg);
				
			}
		});
		display.setFont(new Font("Constantia", Font.PLAIN, 11));
		display.setBounds(216, 283, 111, 38);
		contentPane.add(display);
		
		displaybox = new JTextField();
		displaybox.setBounds(10, 341, 634, 23);
		contentPane.add(displaybox);
		displaybox.setColumns(10);
		
		JButton btnNewButton = new JButton("BACK");
		btnNewButton.setForeground(new Color(244, 11, 75));
		btnNewButton.setBackground(new Color(192, 192, 192));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnNewButton.setBounds(502, 375, 59, 23);
		contentPane.add(btnNewButton);
	}
}
