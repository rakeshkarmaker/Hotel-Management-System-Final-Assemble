package com;

import java.awt.*;
import java.awt.event.*;
import java.lang.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame6 extends JFrame implements ActionListener,MouseListener
{
    JLabel label,bgimg,searchGuestLabel;
    ImageIcon img,searchIcon;
    JPanel panel;
	JTextField insertTextField,removeTextField,searchtTextField;
    JButton backButton,insertButton,removebButton,searchButton;

    Frame6()
    {
        super("Frame6 Guest Management");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
       
        img=new ImageIcon(this.getClass().getResource("Frame6.jpg"));
        bgimg=new JLabel(img);
        bgimg.setSize(this.getSize());
        panel.add(bgimg);

        label=new JLabel("Guest Management");
        label.setBounds(280,30,500,30);
		label.setForeground(Color.white);
		label.setFont(new Font("Script MT Bold",Font.PLAIN,40));
		bgimg.add(label);

		searchGuestLabel=new JLabel("Search Guest: ");
		searchGuestLabel.setBounds(100,125,350,30);
		searchGuestLabel.setForeground(Color.white);
		searchGuestLabel.setFont(new Font("Times New Roman",Font.PLAIN,23));
		bgimg.add(searchGuestLabel);

		searchtTextField=new JTextField();
		searchtTextField.setBounds(250,125,340,30);
        searchtTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        bgimg.add(searchtTextField);

		searchIcon=new ImageIcon(this.getClass().getResource("searchIcon.png"));
		searchButton=new JButton(searchIcon);
		searchButton.setBounds(590,125,50,30);
		searchButton.setOpaque(false);
		searchButton.repaint();
		searchButton.setFocusable(false);
		bgimg.add(searchButton);
	
		insertTextField=new JTextField();
		insertTextField.setBounds(180,220,180,30);
        insertTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        bgimg.add(insertTextField);

		insertButton=new JButton("Check In");
        insertButton.setBounds(220,260,100,35);
        //insertButton.addActionListener(this);
        insertButton.addMouseListener(this);
        insertButton.setFocusable(false);
        bgimg.add(insertButton);

		removeTextField=new JTextField();
		removeTextField.setBounds(450,220,180,30);
        removeTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        bgimg.add(removeTextField);

		removebButton=new JButton("Check Out");
        removebButton.setBounds(490,260,100,35);
        //insertButton.addActionListener(this);
        removebButton.addMouseListener(this);
        removebButton.setFocusable(false);
        bgimg.add(removebButton);
		
        backButton=new JButton("Back");
        backButton.setBounds(675,400,70,35);
        backButton.addActionListener(this);
        backButton.addMouseListener(this);
		backButton.setFocusable(false);
        bgimg.add(backButton);

         this.add(panel);
        
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==backButton) 
        {
                Frame3p f3p = new Frame3p();
                f3p.setVisible(true);
                this.setVisible(false);
        }
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me){
        
		if(me.getSource() == backButton)
		{
			backButton.setBackground(Color.black);
			backButton.setForeground(Color.red);
		}	
        else if(me.getSource() == insertButton)
		{
			insertButton.setBackground(Color.black);
			insertButton.setForeground(Color.GREEN);
		}
		else if(me.getSource() == removebButton)
		{
			removebButton.setBackground(Color.black);
			removebButton.setForeground(Color.red);
		}
    }
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == backButton)
		{
			backButton.setBackground(Color.WHITE);
			backButton.setForeground(Color.BLACK);
		}	
        else if(me.getSource() == insertButton)
		{
			insertButton.setBackground(Color.WHITE);
			insertButton.setForeground(Color.BLACK);
		}
		else if(me.getSource() == removebButton)
		{
			removebButton.setBackground(Color.WHITE);
			removebButton.setForeground(Color.BLACK);
		}
	}
}