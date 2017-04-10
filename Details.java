package m;

import java.awt.Font;
import java.awt.ScrollPane;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Details extends JFrame implements ActionListener{
	JTextArea area;
	JButton b1,b2,b3,b4,b5;
	 int cost=0;
	  public Details(){
		  super("Details");
		  super.setBounds(150, 10, 900, 568);
		  super.setResizable(false );
		  area=new JTextArea();
		  area.setEditable(false);
		  Font f=new Font("roman",Font.BOLD,16);
		  area.setFont(f);
		  JScrollPane pane =new JScrollPane(area);
		  pane.setBounds(70, 10,350,500);
		  super.add(pane);
		  b1=new JButton("silver");
		  b1.setBounds(450, 50, 80, 25);
		  b1.addActionListener(this);
		  super.add(b1);
		  b2=new JButton("gold");
		  b2.setBounds(450, 100, 80, 25);
		  b2.addActionListener(this);
		  super.add(b2);
		  b3=new JButton("platinium");
		  b3.setBounds(650, 50, 150, 25);
		  b3.addActionListener(this);
		  super.add(b3);
		
		  b5=new JButton("back");
		  b5.setBounds(450, 350, 150, 150);
		  ImageIcon e=new ImageIcon("C:/Users/Harshitt/Desktop/New folder/back.png");
		  b5.setIcon(e);
		  super.add(b5);
		  b5.addActionListener(this);
		  setLayout(null);
		  setVisible(true);
	  }	
	  public static void main(String[] args) {
		Details d =new Details();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		try{
		if (b5==e.getSource()){
			BookMyShow bms=new BookMyShow();
			super.dispose();
		}
		else if (b3==e.getSource()){
				Payment p =new Payment();
				Ticket.ticket_type="p";
				super.dispose();
			}
		else if(b2==e.getSource()){
			Payment p = new Payment();
			Ticket.ticket_type="g";
			
			super.dispose();
		}
		else if (b1==e.getSource()){
			Payment p = new Payment();
			Ticket.ticket_type="s";
			
			super.dispose();
		} 
	}
			catch (Exception e1) {
				System.out.println("error"+e1);		
			}
		
	}

}
