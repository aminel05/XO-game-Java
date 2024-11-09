package xo;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.Border;

public class first extends JFrame implements MouseListener{
	
	
	JFrame frame;
	JLabel[][] label;
	JLabel labeltext;
	JPanel headingpanel;
	JPanel feildpanel;
	
	boolean turn = true;
	int Xwin=0, Owin=0 ,draw=0;
	first(){
		frame = new JFrame();
		frame.setSize(600,750);
		frame.setResizable(false);
		//frame.setLayout(new BorderLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);

		ImageIcon icon = new ImageIcon(getClass().getResource("XO.jpg"));
		frame.setIconImage(icon.getImage());
		frame.setTitle("XO (by amine)");
		
		labeltext = new JLabel();
		labeltext.setText("'X' 'O' Game :D");
		labeltext.setFont(new Font(".",Font.PLAIN,50));
		labeltext.setForeground(Color.white);
		labeltext.setHorizontalAlignment(JLabel.CENTER);
		labeltext.setVerticalAlignment(JLabel.CENTER);
		
		
		headingpanel = new JPanel(new FlowLayout());
		headingpanel.setPreferredSize(new Dimension(600, 150));
		headingpanel.setBackground(Color.black);
		headingpanel.setLayout(new BorderLayout());
		headingpanel.add(labeltext);
		frame.add(headingpanel, BorderLayout.NORTH);
		
		
		
		
		label = new JLabel[3][3];
		Border border = BorderFactory.createLineBorder(Color.black,2);
		
		
		

        


		feildpanel = new JPanel();
		//feildpanel.setSize(600,600);
		feildpanel.setBackground(Color.white);
		feildpanel.setLayout(new GridLayout(3,3));
		
		frame.add(feildpanel);
		 
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				label[i][j] = new JLabel();
				label[i][j].setBorder(border);
				label[i][j].setOpaque(true);
				label[i][j].setBackground(Color.white);
				label[i][j].addMouseListener(this);
				label[i][j].setFont(new Font(".",Font.PLAIN,100));
				label[i][j].setHorizontalAlignment(JLabel.CENTER);
				label[i][j].setVerticalAlignment(JLabel.CENTER);
				feildpanel.add(label[i][j]);
			}
		}
		
		
		
		frame.setVisible(true);
		
	}
	boolean win = false;
	public  void winner(){
		
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				
				
				
				 if(label[i][0].getText()=="X" && label[i][1].getText()=="X" && label[i][2].getText()=="X") {
					label[i][0].setForeground(new Color(152,251,152));
					label[i][1].setForeground(new Color(152,251,152));
					label[i][2].setForeground(new Color(152,251,152));
					win=true;
					labeltext.setText("'X' wins XD");
					labeltext.setForeground(new Color(152,251,152));
				}
				 if(label[0][j].getText()=="X" && label[1][j].getText()=="X" && label[2][j].getText()=="X") {
					label[0][j].setForeground(new Color(152,251,152));
					label[1][j].setForeground(new Color(152,251,152));
					label[2][j].setForeground(new Color(152,251,152));
					win=true;
					labeltext.setText("'X' wins XD");
					labeltext.setForeground(new Color(152,251,152));
				}
				 if(label[0][0].getText()=="X" && label[1][1].getText()=="X" && label[2][2].getText()=="X") {
					label[0][0].setForeground(new Color(152,251,152));
					label[1][1].setForeground(new Color(152,251,152));
					label[2][2].setForeground(new Color(152,251,152));
					win=true;
					labeltext.setText("'X' wins XD");
					labeltext.setForeground(new Color(152,251,152));
				}
				 if(label[0][2].getText()=="X" && label[1][1].getText()=="X" && label[2][0].getText()=="X") {
					label[0][2].setForeground(new Color(152,251,152));
					label[1][1].setForeground(new Color(152,251,152));
					label[2][0].setForeground(new Color(152,251,152));
					win=true;
					labeltext.setText("'X' wins XD");
					labeltext.setForeground(new Color(152,251,152));
				}
				 if(label[i][0].getText()=="O" && label[i][1].getText()=="O" && label[i][2].getText()=="O") {
					label[i][0].setForeground(new Color(152,251,152));
					label[i][1].setForeground(new Color(152,251,152));
					label[i][2].setForeground(new Color(152,251,152));
					win=true;
					labeltext.setText("'O' wins :o");
					labeltext.setForeground(new Color(152,251,152));
				}
				 if(label[0][j].getText()=="O" && label[1][j].getText()=="O" && label[2][j].getText()=="O") {
					label[0][j].setForeground(new Color(152,251,152));
					label[1][j].setForeground(new Color(152,251,152));
					label[2][j].setForeground(new Color(152,251,152));
					win=true;
					labeltext.setText("'O' wins :o");
					labeltext.setForeground(new Color(152,251,152));
				}
				 if(label[0][0].getText()=="O" && label[1][1].getText()=="O" && label[2][2].getText()=="O") {
					label[0][0].setForeground(new Color(152,251,152));
					label[1][1].setForeground(new Color(152,251,152));
					label[2][2].setForeground(new Color(152,251,152));
					win=true;
					labeltext.setText("'O' wins :o");
					labeltext.setForeground(new Color(152,251,152));
				}
				 if(label[0][2].getText()=="O" && label[1][1].getText()=="O" && label[2][0].getText()=="O") {
					label[0][2].setForeground(new Color(152,251,152));
					label[1][1].setForeground(new Color(152,251,152));
					label[2][0].setForeground(new Color(152,251,152));
					win=true;
					labeltext.setText("'O' wins :o");
					labeltext.setForeground(new Color(152,251,152));
				}
				for(int x = 0 ; x < 3 ; x++ ) {
					for(int z = 0 ; z < 3 ; z++ ) {
						if(label[i][j].getText()=="") {
							draw++;
						}
					}
				}
				
				
				
			}
		}
		
	}
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
		
		for (int i = 0 ; i < 3 ; i++) {
			for (int j = 0 ; j < 3 ; j++) {
				
				if (e.getSource().equals(label[i][j]) &&  win==true) {
					new first();
					frame.dispose();
					win=false;
				}
				if (e.getSource().equals(label[i][j]) && label[i][j].getText()==""&& win==false) {
					
					
					if(turn) {
						label[i][j].setText("X");
						labeltext.setText("it is 'O' turn");
						
						
						
						turn=false;
					}
					else if(turn==false) {
						label[i][j].setText("O");
						labeltext.setText("it is 'X' turn");
						turn= true;
					}
					if(draw==9) {
						win=true;
						labeltext.setText("Its a Draw");
						labeltext.setForeground(new Color(200,251,200));
					}
					else {
						draw=0;
					}
					winner();
				}
				
			}
		}
				
				
			
	}
	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
