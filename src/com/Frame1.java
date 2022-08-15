package com;

import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame1 extends JFrame implements ActionListener,MouseListener
{
    JPanel panel;
    ImageIcon img,userIcon,adminIcon,guestIcon;
    JButton guestB,adminB;
    JLabel label,bgImgLabel;

    Frame1()
    {
        super("Frame1");
        this.setSize(800,500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel=new JPanel();
        panel.setLayout(null);

        img=new ImageIcon(this.getClass().getResource("Frame1.gif"));
        bgImgLabel=new JLabel(img);
        bgImgLabel.setLayout(null);
        bgImgLabel.setSize(this.getSize());
        this.add(bgImgLabel);

        adminIcon=new ImageIcon(this.getClass().getResource("adminIcon.png"));
        adminB=new JButton("Admin Login");
        adminB.setBounds(310,220,180,40);
        adminB.addActionListener(this);
        adminB.addMouseListener(this);
        adminB.setFocusable(false);
        adminB.setFont(new Font("Times New Roman",Font.BOLD,17));
        adminB.setIcon(adminIcon);
        adminB.setHorizontalTextPosition(JButton.RIGHT);
        bgImgLabel.add(adminB);

        guestIcon=new ImageIcon(this.getClass().getResource("guestIcon.png"));
        guestB=new JButton("Book Room");
        guestB.setBounds(310,290,180,40);
        guestB.addActionListener(this);
        guestB.addMouseListener(this);
        guestB.setFocusable(false);
        guestB.setFont(new Font("Times New Roman",Font.BOLD,17));
        guestB.setIcon(guestIcon);
        guestB.setHorizontalTextPosition(JButton.RIGHT);
        bgImgLabel.add(guestB);

         this.add(panel);

    }

    public void actionPerformed(ActionEvent ae) 
    {
        if(ae.getSource()==guestB)
        {
           //showMessageDialog(null, " Work On Progress");
           Frame4 f4=new Frame4();
           f4.setVisible(true);
           this.setVisible(false);
        }
        else if(ae.getSource()==adminB) 
        {
            Frame2 f2=new Frame2();
            f2.setVisible(true);
            this.setVisible(false);
        }
    }
    
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == guestB)
		{
			guestB.setBackground(Color.black);
			guestB.setForeground(Color.green);
		}
		else if(me.getSource() == adminB)
		{
			adminB.setBackground(Color.black);
			adminB.setForeground(Color.GREEN);
		}

	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == guestB)
		{
			guestB.setBackground(Color.WHITE);
			guestB.setForeground(Color.BLACK);
		}
		else if(me.getSource() == adminB)
		{
			adminB.setBackground(Color.WHITE);
			adminB.setForeground(Color.BLACK);
		}
	
	}
}

