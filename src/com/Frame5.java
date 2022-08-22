package com;

import com.classes.Guest;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Frame5 extends JFrame implements ActionListener, MouseListener,KeyListener
{
    JPanel panel;
    ImageIcon bgimg;
    JLabel bgImgLabel,userLabel,nameLabel,addressLabel,phnNumberLabel,genderLabel,ageTypeLabel,ageWarningLabel;
    JTextField nameTextField,addressTextField,phnNumberTextField;
    JSpinner ageSpinner;
    SpinnerNumberModel ageSpinnerModel;
    JButton next,back;
    JComboBox genderComboBox;

    Frame5()
    {
        super("Frame5 Room Booking");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
		panel.setLayout(null);

        bgimg=new ImageIcon(this.getClass().getResource("Frame5.jpeg"));
        bgImgLabel=new JLabel(bgimg);
        bgImgLabel.setSize(this.getSize());
        panel.add(bgImgLabel);

        userLabel=new JLabel("Please Insert Your Details ");
        userLabel.setBounds(230,15,700,80);
		userLabel.setForeground(Color.yellow);
		userLabel.setFont(new Font("Script MT Bold",Font.PLAIN,40));
        this.add(userLabel);

        back=new JButton("Back");
        back.setBounds(50,480,75,40);
        back.addActionListener(this);
        back.addMouseListener(this);
		back.setFocusable(false);
        bgImgLabel.add(back);

        next=new JButton("Next");
        next.setBounds(770,480,75,40);
        next.addActionListener(this);
        next.addMouseListener(this);
		next.setFocusable(false);
        bgImgLabel.add(next);

        nameLabel=new JLabel("Name: ");
        nameLabel.setBounds(210,120,100,40);
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
        bgImgLabel.add(nameLabel);

        nameTextField=new JTextField();
        nameTextField.setBounds(410,130,180,30);
        nameTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        nameTextField.addKeyListener(this);
        bgImgLabel.add(nameTextField);

        addressLabel=new JLabel("Address: ");
        addressLabel.setBounds(210,175,100,40);
		addressLabel.setForeground(Color.WHITE);
		addressLabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
        bgImgLabel.add(addressLabel);

        addressTextField=new JTextField();
        addressTextField.setBounds(410,185,180,30);
        addressTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        addressTextField.addKeyListener(this);
        bgImgLabel.add(addressTextField);

        phnNumberLabel=new JLabel("Phone Number: ");
        phnNumberLabel.setBounds(210,230,280,40);
		phnNumberLabel.setForeground(Color.WHITE);
		phnNumberLabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
        bgImgLabel.add(phnNumberLabel);

        phnNumberTextField=new JTextField();
        phnNumberTextField.setBounds(410,240,180,30);
        phnNumberTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        bgImgLabel.add(phnNumberTextField);

        genderLabel=new JLabel("Gender: ");
        genderLabel.setBounds(210,285,100,40);
		genderLabel.setForeground(Color.WHITE);
        genderLabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
        bgImgLabel.add(genderLabel);

        String gender[] = {"Male", "Female", "Other"};
		genderComboBox = new JComboBox(gender);
		genderComboBox.setBounds(410, 295, 130, 30);
        genderComboBox.setFocusable(false);
		bgImgLabel.add(genderComboBox);

        ageTypeLabel=new JLabel("Age ");
        ageTypeLabel.setBounds(210,340,160,40);
		ageTypeLabel.setForeground(Color.WHITE);
        ageTypeLabel.setFont(new Font("Times New Roman",Font.PLAIN,25));
        bgImgLabel.add(ageTypeLabel);

        ageSpinnerModel=new SpinnerNumberModel(18,18,150,1);
        ageSpinner=new JSpinner(ageSpinnerModel);
        ageSpinner.setBounds(410,340,50,40);
        bgImgLabel.add(ageSpinner);

        ageWarningLabel=new JLabel("*Must Be An Adult");
        ageWarningLabel.setBounds(475,340,180,40);
        ageWarningLabel.setForeground(Color.yellow);
        ageWarningLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        bgImgLabel.add(ageWarningLabel);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
	{
        String gName = nameTextField.getName();
        String gPhoneNo = phnNumberTextField.getText();
        String gAddress = addressTextField.getText();
        int gAge = genderComboBox.getSelectedIndex();

        if(genderComboBox.getSelectedIndex()==1) {


        }


        Guest guest = new Guest();
        guest.setGuestName( nameTextField.getName() );
        guest.setGuestPhoneNumber ( phnNumberTextField.getText() );
        guest.setGuestAdress(addressTextField.getText());
        guest.setGuestGender("men");

        if(ae.getSource()==back) 
        {
            Frame4 f4=new Frame4();
            f4.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==next)
        {
            Frame7 f7=new Frame7();
            f7.setVisible(true);
            this.setVisible(false);
           // showMessageDialog(null,"Work On Progress! ");
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
        else if(me.getSource() == next)
		{
			next.setBackground(Color.black);
			next.setForeground(Color.green);
		}
	}
    public void mouseExited(MouseEvent me)
	{
		if(me.getSource() == back)
		{
			back.setBackground(Color.WHITE);
			back.setForeground(Color.BLACK);
		}
        else if(me.getSource() == next)
		{
			next.setBackground(Color.WHITE);
			next.setForeground(Color.BLACK);
		}
	}

    public void keyTyped(KeyEvent k){}
	public void keyPressed(KeyEvent k){

		if(k.getKeyCode()==10 && k.getSource()==nameTextField)
		{			
            addressTextField.requestFocus();		
		}
        else if(k.getKeyCode()==10 && k.getSource()==addressTextField)
		{			
            phnNumberTextField.requestFocus();		
		}
    }
    public void keyReleased(KeyEvent k){}
}
