package m;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
public class BookMyShow extends JFrame implements ActionListener {
	JButton b1,b2,b3;
	JLabel l1;

	public BookMyShow(){
		super("book my show ");
		super.setBounds(150, 10, 900, 568);
		super.setResizable(false );
		
		l1 =new JLabel("box office  hits ");
		l1.setBounds(250, 150,300,20);
		super.add(l1);
		b1=new JButton();
		b1.setBounds(150,200,200,200);
		ImageIcon e=new ImageIcon("C:/Users/Harshitt/Desktop/New folder/b.jpg");
		b1.setIcon(e);
		super.add(b1);
		b1.addActionListener(this);
		b2=new JButton();
		b2.setBounds(400,200,220,306);
		ImageIcon icon=new ImageIcon("C:/Users/Harshitt/Desktop/New folder/bdk.jpg");
		b2.setIcon(icon);
		super.add(b2);
		b2.addActionListener(this);
		b3=new JButton();
		b3.setBounds(650,200,220,300);
		ImageIcon icon1=new ImageIcon("C:/Users/Harshitt/Desktop/New folder/ns.jpg");
		b3.setIcon(icon1);
		super.add(b3);
		b3.addActionListener(this);
		
		
		
		super.setLayout(null);
		super.setVisible(true);
	}
	public static void main(String[] args) {
		
	
	BookMyShow bms=new BookMyShow();

}
	@Override
	public void actionPerformed(ActionEvent e) {
		if (b1==e.getSource()){
			Details d =new Details();
			d.area.setText("Story line up: \nIn the kingdom of Mahishmati, while pursuing his love,\nShivudu learns about the conflict-ridden past of his family\nand his legacy. He must now prepare himself \nto face his new-found archenemy.\n\nRelease date: 10 July 2015 (India)\n \nDirector: S. S. Rajamouli\n \nProducers: Shobu Yarlagadda,Prasad Devineni,Kovelamudi Raghavendra Rao\n\nScreenplay: S. S. Rajamouli, K. V. Vijayendra Prasad,");
			 
			super.dispose();
			
		}
		else if (b2==e.getSource()){
			Details d=new Details();
			
			 d.area.setText(" Badrinath's bride is a 2017 Indian romantic comedy film, \ndirected by Shashank Khaitan, and produced by Karan Johar under the Dharma Productions banner.\n Starring Varun Dhawan and Alia Bhatt in the lead, the film marks the second installment of a franchise\n that began with Humpty Sharma Ki Dulhania . Principal photography\n for the film began in May 2016, and the film was released\n on 10 March 2017, on the Holi weekend.A man Varun Dhawan\n and a woman Alia Bhatt fall in love despite their opposing views on gender and life in general.\n\nDirector: Shashank Khaitan\n\n Music director: Amaal Mallik, John Stewart, Tanishk Bagchi\n\ncast:Varun Dhawan as Badrinath Bansal\nAlia Bhatt as Vaidehi Trivedi\nSahil Vaid as Somdev\nAakanksha Singh As Kiran\nGauahar Khan as Laxmi Shankar\nAparshakti Khurana as Bhushan\nShweta Basu Prasad as Urmila\nRituraj Singh as Badrinath's father");
			
			super.dispose();
		}
		else if(b3==e.getSource()){
			Details d=new Details();
			d.area.setText("Naam Shabana is a 2017 Indian action spy-thriller film directed by Shivam Nair and produced by Neeraj Pandey \nand Shital Bhatia under the Friday Filmworks banner. It is a spin-off prequel to the 2015 film Baby with Taapsee Pannu reprising her role as Shabana.\nOther cast includes Akshay Kumar, Manoj Bajpayee, Anupam Kher and Prithviraj Sukumaran play important supporting roles in the film.\n The film is dubbed into Tamil and Telugu languages and was released on 31 March 2017.\n\nDirected by:Shivam Nair\n\nProduced by:Neeraj Pandey,Shital Bhatia\n\nWritten by:Neeraj Pandey\n\nScreenplay by:Neeraj Pandey\n\nStarring:Taapsee Pannu,Akshay Kumar,Prithviraj Sukumaran,Manoj Bajpayee,Anupam Kher\n\nMusic by: Rochak Kohli ,Meet Bros\n\nCinematography:Sudheer Palsane\n\nEdited by:Deepak Seju");
			 
			super.dispose();
		} 
		
	}
}
