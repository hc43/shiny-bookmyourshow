package m;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class Payment extends JFrame implements ActionListener{
	 JButton b1,b5,b6,b7;
	 JTextField t3,t4,t5,t6,t7;
	 JLabel l3,l4,l5,l6,l7;

public Payment(){
	super("payment details");
	super.setBounds(150, 10, 900, 568);
	super.setResizable(false );
	 l3= new JLabel("name ");
	 l3.setBounds(30, 130, 80, 30);
	 super.add(l3);
	 t3=new JTextField();
	 t3.setBounds(80, 135, 110, 20);
	 super.add(t3);
	 l4= new JLabel("mob.");
	 l4.setBounds(30, 160, 80, 30);
	 super.add(l4);
	 t4=new JTextField();
	 t4.setBounds(80, 165, 110, 20);
	 super.add(t4);
	 l5= new JLabel("email");
	 l5.setBounds(30, 190, 80, 30);
	 super.add(l5);
	 t5=new JTextField();
	 t5.setBounds(80, 195, 110, 20);
	 super.add(t5);
	 l6= new JLabel("no.of seats");
	 l6.setBounds(30, 220, 80, 30);
	 super.add(l6);
	 t6=new JTextField();
	 t6.setBounds(100, 225, 110, 20);
	 super.add(t6);
	  b1=new JButton("back");
	  b1.setBounds(450, 350, 150, 150);
	  ImageIcon e=new ImageIcon("C:/Users/Harshitt/Desktop/New folder/home.jpg");
	  b1.setIcon(e);
	  super.add(b1);
	  b1.addActionListener(this);
	 
	  b6=new JButton("snacks");
	  b6.setBounds(30, 250, 80, 30);
	  super.add(b6);
	  b6.addActionListener(this);
	  b7=new JButton("pay");
	  b7.setBounds(120, 250, 80, 30);
	  super.add(b7);
	  b7.addActionListener(this);
	 setLayout(null);
	  setVisible(true);
	}
public static void main(String[] args) {
	Payment p = new Payment();
	
}
@Override
public void actionPerformed(ActionEvent e) {
	try{
		String q=t3.getText();
		String w=t4.getText();
		String t=t5.getText();
		String r=t6.getText();
		
		if (t6.getText().isEmpty()) {
		    JOptionPane.showMessageDialog(t6, "please enter the number of seats ");
		  BookMyShow bms =new BookMyShow();
		    super.dispose();
		}
		 if (b7==e.getSource()){
			
			 FinalConfirmation fc =new FinalConfirmation();
		//	 Details  d=new Details();
			 fc.t3.setText(q);
			 fc.t4.setText(w);
			 fc.t5.setText(t);
			 fc.t6.setText(r);
			 System.out.println(">>>>>>>>>>>>"+Ticket.ticket_type);
			 fc.t8.setText(Integer.parseInt(r)*MovieCost.silver_cost+"");
		//	 d.dispose();
			//if (b6.isEnabled()){
		//		fc.t8.setText("snacks are ordered");
			//}
			if(b6.getModel().isPressed())
				fc.t8.setText("snacks are not ordered");
			 super.dispose();
			
		}

			 			 
		 
		 if (b1==e.getSource()){
			 BookMyShow bms =new BookMyShow();
			 super.dispose();
		 }
	
	}
	catch(Exception e1){
		System.out.println("error in code "+e1);
	}
	
		
	}
}

