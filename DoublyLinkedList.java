import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class DoublyLinkedList extends JFrame {

	class Node
	{
		Node prelink;
		int data;
		Node nextlink;
	}

	private Node first;
	private JPanel contentPane;
	private JTextField rearelem;
	private JTextField frontelem;
	private JTextField displaybox;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					DoublyLinkedList frame = new DoublyLinkedList();
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
	public DoublyLinkedList() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(207, 171, 211));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton deletefront_1 = new JButton("BACK");
		deletefront_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		deletefront_1.setForeground(new Color(102, 0, 0));
		deletefront_1.setFont(new Font("Constantia", Font.BOLD, 13));
		deletefront_1.setBounds(438, 348, 135, 25);
		contentPane.add(deletefront_1);

		JLabel lblNewLabel = new JLabel("DOUBLY LINKED LIST");
		lblNewLabel.setForeground(new Color(128, 0, 255));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 18));
		lblNewLabel.setBounds(259, 11, 196, 21);
		contentPane.add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1.setForeground(new Color(170, 145, 85));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1.setBounds(132, 73, 146, 18);
		contentPane.add(lblNewLabel_1);

		JLabel lblNewLabel_1_1 = new JLabel("ENTER THE ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(170, 145, 85));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(132, 123, 146, 18);
		contentPane.add(lblNewLabel_1_1);

		rearelem = new JTextField();
		rearelem.setBounds(287, 70, 168, 20);
		contentPane.add(rearelem);
		rearelem.setColumns(10);

		frontelem = new JTextField();
		frontelem.setColumns(10);
		frontelem.setBounds(288, 120, 168, 20);
		contentPane.add(frontelem);

		JButton insertrear = new JButton("INSERT REAR");
		insertrear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR INSERTING ELEMENT AT REAR END
				Node temp;
				int element=Integer.valueOf(rearelem.getText());
				Node newnode=new Node();
				newnode.data=element;
				newnode.prelink=null;
				newnode.nextlink=null;
				String message="Element "+element+" is Inserted at Rear End";
				JOptionPane.showMessageDialog(contentPane, message);
				rearelem.setText("");
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					temp.nextlink=newnode;
					newnode.prelink=temp;
				}
			}
		});
		insertrear.setForeground(new Color(153, 0, 102));
		insertrear.setFont(new Font("Constantia", Font.BOLD, 13));
		insertrear.setBounds(465, 70, 135, 25);
		contentPane.add(insertrear);

		JButton insertfront = new JButton("INSERT FRONT");
		insertfront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR INSERTING ELEMENT AT FRONT END
				int element=Integer.valueOf(frontelem.getText());
				Node newnode=new Node();
				newnode.data=element;
				newnode.prelink=null;
				newnode.nextlink=null;
				String message="Element "+element+" is Inserted at Front End";
				JOptionPane.showMessageDialog(contentPane, message);
				frontelem.setText("");
				if(first==null)
				{
					first=newnode;
				}
				else
				{
					newnode.nextlink=first;
					first.prelink=newnode;
					first=newnode;
				}
			}
		});
		insertfront.setForeground(new Color(153, 0, 102));
		insertfront.setFont(new Font("Constantia", Font.BOLD, 13));
		insertfront.setBounds(466, 120, 135, 25);
		contentPane.add(insertfront);

		JButton deleterear = new JButton("DELETE REAR");
		deleterear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DELETING ELEMENT AT REAR END
				Node temp;
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is "+first.data);
					first=null;
				}
				else
				{
					temp=first;
					while(temp.nextlink.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					String message="Element deleted is "+temp.nextlink.data;
					JOptionPane.showMessageDialog(contentPane, message);
					temp.nextlink=null;
				}
			}
		});
		deleterear.setForeground(new Color(102, 0, 0));
		deleterear.setFont(new Font("Constantia", Font.BOLD, 13));
		deleterear.setBounds(304, 178, 135, 25);
		contentPane.add(deleterear);

		JButton deletefront = new JButton("DELETE FRONT");
		deletefront.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DELETING ELEMENT AT FRONT END
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else if(first.nextlink==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is "+first.data);
					first=null;
				}
				else
				{
					JOptionPane.showMessageDialog(contentPane, "Element Deleted is "+first.data);
					first=first.nextlink;
					first.prelink=null;
				}
			}
		});
		deletefront.setForeground(new Color(102, 0, 0));
		deletefront.setFont(new Font("Constantia", Font.BOLD, 13));
		deletefront.setBounds(304, 214, 135, 25);
		contentPane.add(deletefront);

		JButton fwddisplay = new JButton(" DISPLAY FORWARD");
		fwddisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DISPLAYING ELEMENTS IN FORWARD
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
					displaybox.setText("");
				}
				else if(first.nextlink==null)
				{
					displaybox.setText(String.valueOf(first.data));
				}
				else
				{
					temp=first;
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.nextlink;
					}
					displaybox.setText(msg);
				}
			}
		});
		fwddisplay.setForeground(new Color(51, 0, 204));
		fwddisplay.setFont(new Font("Constantia", Font.BOLD, 13));
		fwddisplay.setBounds(132, 259, 168, 25);
		contentPane.add(fwddisplay);

		JButton revdisplay = new JButton(" DISPLAY REVERSE");
		revdisplay.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DISPLAYING ELEMENTS IN REVERSE
				Node temp;
				String msg="";
				if(first==null)
				{
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
					displaybox.setText("");
				}
				else if(first.nextlink==null)
				{
					displaybox.setText(String.valueOf(first.data));
				}
				else
				{
					temp=first;
					while(temp.nextlink!=null)
					{
						temp=temp.nextlink;
					}
					while(temp!=null)
					{
						msg=msg+" "+temp.data;
						temp=temp.prelink;
					}
					displaybox.setText(msg);
				}
			}
		});
		revdisplay.setForeground(new Color(51, 0, 204));
		revdisplay.setFont(new Font("Constantia", Font.BOLD, 13));
		revdisplay.setBounds(432, 259, 168, 25);
		contentPane.add(revdisplay);

		displaybox = new JTextField();
		displaybox.setColumns(10);
		displaybox.setBounds(127, 306, 494, 20);
		contentPane.add(displaybox);
		
		/**JLabel bimg = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/Home_Image.png")).getImage();
		bimg.setIcon(new ImageIcon(img));
		bimg.setBounds(0, 0, 734, 411);
		contentPane.add(bimg);**/
	}
}
