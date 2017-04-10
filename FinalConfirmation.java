package m;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class FinalConfirmation extends JFrame {
	 JButton b1,b5,b6,b7;
	 JTextField t3,t4,t5,t6,t7,t8;
	 JLabel l3,l4,l5,l6,l7,l8;

public FinalConfirmation(){
	super("payment details");
	super.setBounds(450, 10, 500, 568);
	super.setResizable(false );
	 l3= new JLabel("name ");
	 l3.setBounds(30, 130, 80, 30);
	 super.add(l3);
	 t3=new JTextField();
	 t3.setBounds(80, 135, 110, 20);
	 t3.setEditable(false);
	 super.add(t3);
	 l4= new JLabel("mob.");
	 l4.setBounds(30, 160, 80, 30);
	 super.add(l4);
	 t4=new JTextField();
	 t4.setBounds(80, 165, 110, 20);
	 t4.setEditable(false);
	 super.add(t4);
	 l5= new JLabel("email");
	 l5.setBounds(30, 190, 80, 30);
	 super.add(l5);
	 t5=new JTextField();
	 t5.setBounds(80, 195, 110, 20);
	 t5.setEditable(false);
	 super.add(t5);
	 l6= new JLabel("no.of seats");
	 l6.setBounds(30, 220, 80, 30);
	 super.add(l6);
	 t6=new JTextField();
	 t6.setBounds(100, 225, 110, 20);
	 t6.setEditable(false);
	 super.add(t6);
	 
	 l7= new JLabel("tax");
	 l7.setBounds(30, 250, 80, 30);
	 super.add(l7);
	 t7=new JTextField();
	 t7.setBounds(120, 255, 110, 20);
	 t7.setEditable(false);
	 super.add(t7);
	 l8= new JLabel("cost");
	 l8.setBounds(30, 280, 80, 30);
	 super.add(l8);
	 t8=new JTextField();
	 t8.setBounds(100, 285, 190, 20);
	 t8.setEditable(false);
	 super.add(t8);
	 super.setLayout(null);
	 super.setVisible(true);
}
public static void main(String[] args) {
	FinalConfirmation fc=new FinalConfirmation();
}

		
		
}