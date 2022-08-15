package com;

import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame2 extends JFrame implements ActionListener,MouseListener,KeyListener
{
    JPanel panel;
    ImageIcon img,showPassIcon,showPassIcon2,passKeyIcon,userIcon;
    JLabel name,pass,admin,bgimg,key,passKeyLabel,userLabel;
    JButton logIn,back,showPassButton;
    JTextField txt;
    JPasswordField pf;
	int n;

    Frame2()
    {
        super("Frame2 Admin Login Page");
		n++;
		this.setSize(800, 530);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		panel.setLayout(null);
		panel.addKeyListener(this);
        
        img=new ImageIcon(this.getClass().getResource("Frame2.jpg"));
        bgimg=new JLabel(img);
        bgimg.setSize(this.getSize());
		bgimg.addKeyListener(this);
        panel.add(bgimg);

        admin=new JLabel("Enter Your Name And Password To Log In");
        admin.setBounds(100,60,900,40);
		admin.setForeground(Color.white);
		admin.setFont(new Font("Script MT Bold",Font.BOLD,30));
		bgimg.add(admin);

        name=new JLabel("Username: ");
        name.setBounds(210,180,140,30);
		name.setForeground(Color.white);
		name.setFont(new Font("Times New Roman",Font.PLAIN,24));
		bgimg.add(name);
        
        txt=new JTextField();
        txt.setBounds(400,180,210,30);
		txt.setFont(new Font("Times New Roman",Font.BOLD,20));
		txt.addActionListener(this);
		txt.addKeyListener(this);
        bgimg.add(txt);

		userIcon=new ImageIcon(this.getClass().getResource("userIcon.png"));
		userLabel=new JLabel(userIcon);
		userLabel.setBounds(340,175,60,40);
		bgimg.add(userLabel);

        pass=new JLabel("Password: ");
        pass.setBounds(210,250,140,30);
		pass.setForeground(Color.white);
		pass.setFont(new Font("Times New Roman",Font.PLAIN,24));
		bgimg.add(pass);
        
		pf=new JPasswordField();
		pf.setBounds(400, 250, 160, 30);
		pf.setFont(new Font("Times New Roman",Font.BOLD,20));
		pf.addKeyListener(this);
		pf.setEchoChar('*');
		bgimg.add(pf);

		passKeyIcon=new ImageIcon(this.getClass().getResource("passKey.png"));
		passKeyLabel=new JLabel(passKeyIcon);
		passKeyLabel.setBounds(340,245,60,40);
		bgimg.add(passKeyLabel);

		showPassIcon=new ImageIcon(this.getClass().getResource("showPassIcon.jpg"));
		showPassIcon2=new ImageIcon(this.getClass().getResource("showPass2.jpg"));
		showPassButton=new JButton(showPassIcon);
		showPassButton.setBounds(558,250,50,30);
		showPassButton.addMouseListener(this);
		showPassButton.setFocusable(false);
		bgimg.add(showPassButton);

        logIn=new JButton("Log In");
        logIn.setBounds(490,330,100,35);
        logIn.addActionListener(this);
        logIn.addMouseListener(this);
		logIn.setFocusable(false);
        bgimg.add(logIn);

        back=new JButton("Back");
        back.setBounds(270,330,100,35);
        back.addActionListener(this);
        back.addMouseListener(this);
		back.setFocusable(false);
        bgimg.add(back);

        this.add(panel);

    }

    public void actionPerformed(ActionEvent ae)
	{
		String command = ae.getActionCommand();
		
		if(logIn.getText().equals(command))
		{
			String s1 = txt.getText();
			String s2 = pf.getText();
			//String s2 = new String(pf.getPassword());
            //String s2= pf.getPassword();
			//String s2= String.valueOf(pf.getPassword());
			
			if(s1.equals("a") && s2.equals("a"))
			{
                Frame3p f3p= new Frame3p();
                f3p.setVisible(true);
                this.setVisible(false);
				showMessageDialog(null,"Log In Successful! ");
			}
            else 
            {
				showMessageDialog(null, "Invalid Username or password!");
				txt.setText("");
				pf.setText("");
				txt.requestFocus();
            }         			
		}
        else if(ae.getSource()==back) 
        {
            Frame1 f1=new Frame1();
            f1.setVisible(true);
            this.setVisible(false);
        }
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == back)
		{
			back.setBackground(Color.black);
			back.setForeground(Color.RED);
		}
		else if(me.getSource() == logIn)
		{
			logIn.setBackground(Color.black);
			logIn.setForeground(Color.GREEN);
		}
		else if(me.getSource()==showPassButton)
		{
			pf.setEchoChar((char)0);
			showPassButton.setIcon(showPassIcon2);
		}

	}
	public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == back)
		{
			back.setBackground(Color.WHITE);
			back.setForeground(Color.BLACK);
		}
		else if(me.getSource() == logIn)
		{
			logIn.setBackground(Color.WHITE);
			logIn.setForeground(Color.BLACK);
		}
		else if(me.getSource()==showPassButton)
		{
			pf.setEchoChar('*');
			showPassButton.setIcon(showPassIcon);
		}
	}
	public void keyTyped(KeyEvent k){}
	public void keyPressed(KeyEvent k){

		if(k.getKeyCode()==10 && k.getSource()==txt )
		{			
            pf.requestFocus();		
		}
		else if(k.getKeyCode()==10 && k.getSource()==pf )
		{			
			String s1 = txt.getText();
			String s2 = pf.getText();

			if(s1.equals("a") && s2.equals("a"))
			{
                Frame3p f3p = new Frame3p();
                f3p.setVisible(true);
                this.setVisible(false);
				showMessageDialog(null,"Log In Successful! ");
			}
            else 
            {
				showMessageDialog(null, "Invalid Username or password!");
				txt.setText("");
				pf.setText("");
				txt.requestFocus();
            }      	
		}
	}
	public void keyReleased(KeyEvent k){}
	 
}
