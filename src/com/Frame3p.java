package com;

import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame3p extends JFrame implements ActionListener,MouseListener
{
    JLabel label,bgimg,searchGuestLabel,employeeImgLabel,guestImgLabel;
    ImageIcon img,searchIcon,employeeImage,guestImage;
    JPanel panel;
	JTextField insertTextField,removeTextField,searchtTextField;
    JButton logOut,insertButton,removebButton,searchButton,employeebButton,guesButton;

    Frame3p() {

        super("Frame3p Management System");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		panel = new JPanel();
		panel.setLayout(null);
       
        img=new ImageIcon(this.getClass().getResource("Frame3p.jpg"));
        bgimg=new JLabel(img);
        bgimg.setSize(this.getSize());
        panel.add(bgimg);

        label=new JLabel("Welcome To Management");
        label.setBounds(180,45,500,30);
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Script MT Bold",Font.PLAIN,40));
		bgimg.add(label);

        employeeImage=new ImageIcon(this.getClass().getResource("employeeImage.png"));
		employeeImgLabel=new JLabel(employeeImage);
		employeeImgLabel.setBounds(210,170,150,130);
		bgimg.add(employeeImgLabel);

		employeebButton=new JButton("Employee");
        employeebButton.setBounds(230,310,110,35);
        employeebButton.addActionListener(this);
        employeebButton.addMouseListener(this);
		employeebButton.setFocusable(false);
        bgimg.add(employeebButton);

		guestImage=new ImageIcon(this.getClass().getResource("guestImage.png"));
		guestImgLabel=new JLabel(guestImage);
		guestImgLabel.setBounds(450,177,150,130);
		bgimg.add(guestImgLabel);

		guesButton=new JButton("Guest");
        guesButton.setBounds(480,310,90,35);
        guesButton.addActionListener(this);
        guesButton.addMouseListener(this);
		guesButton.setFocusable(false);
        bgimg.add(guesButton);
		
        logOut=new JButton("Log Out");
        logOut.setBounds(20,395,80,35);
        logOut.addActionListener(this);
        logOut.addMouseListener(this);
		logOut.setFocusable(false);
        bgimg.add(logOut);

         this.add(panel);     
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==logOut) 
        {
                Frame1 f1 = new Frame1();
                f1.setVisible(true);
                this.setVisible(false);

				showMessageDialog(null,"Successfully Logged Out");
        }
		else if(ae.getSource()==guesButton) 
        {
                Frame6 f6 = new Frame6();
                f6.setVisible(true);
                this.setVisible(false);
        }
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == logOut)
		{
			logOut.setBackground(Color.black);
			logOut.setForeground(Color.red);
		}
		else if(me.getSource() == employeebButton)
		{
			employeebButton.setBackground(Color.black);
			employeebButton.setForeground(Color.yellow);
		}
		else if(me.getSource() == guesButton)
		{
			guesButton.setBackground(Color.black);
			guesButton.setForeground(Color.yellow);
		}

	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == logOut)
		{
			logOut.setBackground(Color.WHITE);
			logOut.setForeground(Color.BLACK);
		}
		else if(me.getSource() == employeebButton)
		{
			employeebButton.setBackground(Color.white);
			employeebButton.setForeground(Color.black);
		}
		else if(me.getSource() == guesButton)
		{
			guesButton.setBackground(Color.white);
			guesButton.setForeground(Color.black);
		}
	
	}
}