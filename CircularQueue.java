import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CircularQueue extends JFrame {

	private JPanel contentPane;
	private JTextField sizefield;
	private JTextField element;
	private JTextField displaybox;
	private int cq[];
	private int size;
	private int r=-1;
	private int f=0;
	private int count=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CircularQueue frame = new CircularQueue();
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
	public CircularQueue() {
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setBounds(100, 100, 750, 450);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(250, 235, 215));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBack = new JButton("BACK");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnBack.setFont(new Font("Constantia", Font.BOLD, 13));
		btnBack.setBounds(419, 360, 133, 25);
		contentPane.add(btnBack);
		
		JLabel lblNewLabel_1 = new JLabel("ENTER QUEUE SIZE");
		lblNewLabel_1.setForeground(new Color(128, 0, 128));
		lblNewLabel_1.setFont(new Font("Constantia", Font.BOLD, 16));
		lblNewLabel_1.setBounds(230, 64, 151, 20);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_1_1 = new JLabel("ENTER AN ELEMENT");
		lblNewLabel_1_1.setForeground(new Color(0, 0, 205));
		lblNewLabel_1_1.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel_1_1.setBounds(109, 159, 137, 18);
		contentPane.add(lblNewLabel_1_1);
		
		JLabel lblNewLabel = new JLabel("CIRCULAR DATA STRUCTURE");
		lblNewLabel.setForeground(new Color(0, 64, 128));
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 20));
		lblNewLabel.setBounds(218, 11, 289, 24);
		contentPane.add(lblNewLabel);
		
		sizefield = new JTextField();
		sizefield.setFont(new Font("Constantia", Font.PLAIN, 16));
		sizefield.setBounds(406, 62, 115, 20);
		contentPane.add(sizefield);
		sizefield.setColumns(10);
		
		JButton createcq = new JButton("CREATE QUEUE");
		createcq.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR CIRCULAR QUEUE CREATION
				size=Integer.valueOf(sizefield.getText());
				cq=new int[size];
				String messgae="Circular Queue of size "+size+" is Created";
				JOptionPane.showMessageDialog(contentPane, messgae);
			}
		});
		createcq.setFont(new Font("Constantia", Font.BOLD, 13));
		createcq.setBounds(290, 108, 144, 25);
		contentPane.add(createcq);
		
		element = new JTextField();
		element.setFont(new Font("Constantia", Font.PLAIN, 16));
		element.setColumns(10);
		element.setBounds(279, 156, 155, 20);
		contentPane.add(element);
		
		JButton insertelem = new JButton("INSERT");
		insertelem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR ELEMENT INSERTION TO CIRCULAR QUEUE
				int elem=Integer.valueOf(element.getText());
				if(count==size)
				{
					JOptionPane.showMessageDialog(insertelem, "Insertion Not Possible");
				}
				else
				{
					r=(r+1)%size;
					cq[r]=elem;
					count++;
					JOptionPane.showMessageDialog(contentPane, "Insertion Successful");
				}
				element.setText("");
			}
		});
		insertelem.setFont(new Font("Constantia", Font.BOLD, 13));
		insertelem.setBounds(479, 156, 133, 25);
		contentPane.add(insertelem);
		
		JButton deleteelem = new JButton("DELETE");
		deleteelem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DELETING ELEMENTS FROM THE CIRCULAR QUEUE
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Deletion Not Possible");
				}
				else
				{
					String message="Element Deleted is "+cq[f];
					JOptionPane.showMessageDialog(contentPane, message);
					f=(f+1)%size;
					count--;
				}
			}
		});
		deleteelem.setFont(new Font("Constantia", Font.BOLD, 13));
		deleteelem.setBounds(290, 206, 133, 25);
		contentPane.add(deleteelem);
		
		JButton displayelem = new JButton("DISPLAY");
		displayelem.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				// CODE FOR DISPLAYING THE ELEMENTS OF CIRCULAR QUEUE
				int f1=f;
				String msg="";
				if(count==0)
				{
					JOptionPane.showMessageDialog(contentPane, "Display Not Possible");
					displaybox.setText("");
				}
				else
				{
					for (int i = 1; i <= count; i++) 
					{
						msg=msg+" "+cq[f1];
						f1=(f1+1)%size;
					}
					displaybox.setText(msg);
				}
			}
		});
		displayelem.setForeground(new Color(220, 20, 60));
		displayelem.setBackground(new Color(245, 255, 250));
		displayelem.setFont(new Font("Constantia", Font.BOLD, 13));
		displayelem.setBounds(290, 253, 133, 25);
		contentPane.add(displayelem);
		
		displaybox = new JTextField();
		displaybox.setFont(new Font("Constantia", Font.PLAIN, 16));
		displaybox.setColumns(10);
		displaybox.setBounds(132, 301, 469, 20);
		contentPane.add(displaybox);
		
		/**JLabel bimg = new JLabel("");
		Image img=new ImageIcon(this.getClass().getResource("/arr2.jpg")).getImage();
		bimg.setIcon(new ImageIcon(img));
		bimg.setBounds(0, 0, 734, 411);
		contentPane.add(bimg);
		Image img1=new ImageIcon(this.getClass().getResource("/cq_1.jpg")).getImage();**/
	}
}
