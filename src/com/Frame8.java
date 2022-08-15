package com;

import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame8 extends JFrame implements ActionListener, MouseListener
{
    JLabel bgImgLabel,frameLabel,nameLabel,phnNumberLabel,genderLabel,addressLabel,totalBillLabel,changeLabel,billNoLabel,roomNumberLabel;
    ImageIcon bgImg;
    JButton returnHomeButton;
    JComboBox paymentTypeComboBox;
    JTextField nameTextField,phnNumberTextField,addressTextField,totalBillTextField,billNoTextField,genderTextField,changTextField,roomNumberTextField;
    JPanel panel;

    Frame8()
    {
        super("Frame8 Bill");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
		panel.setLayout(null);

        bgImg=new ImageIcon(this.getClass().getResource("Frame8.jpg"));
        bgImgLabel=new JLabel(bgImg);
        bgImgLabel.setSize(this.getSize());
        panel.add(bgImgLabel);

        frameLabel=new JLabel("Billing Information");
        frameLabel.setBounds(230,10,700,80);
		frameLabel.setForeground(Color.red);
		frameLabel.setFont(new Font("Script MT Bold",Font.PLAIN,40));
        bgImgLabel.add(frameLabel);

        nameLabel=new JLabel("Name: ");
        nameLabel.setBounds(140,100,80,30);
		nameLabel.setForeground(Color.WHITE);
		nameLabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        bgImgLabel.add(nameLabel);

        nameTextField=new JTextField();
        nameTextField.setBounds(300,100,180,30);
        nameTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        nameTextField.setEditable(false);
        bgImgLabel.add(nameTextField);
        
        phnNumberLabel=new JLabel("Phone Number: ");
        phnNumberLabel.setBounds(140,150,250,40);
		phnNumberLabel.setForeground(Color.WHITE);
		phnNumberLabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        bgImgLabel.add(phnNumberLabel);

        phnNumberTextField=new JTextField();
        phnNumberTextField.setBounds(300,150,180,30);
        phnNumberTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        phnNumberTextField.setEditable(false);
        bgImgLabel.add(phnNumberTextField);

        genderLabel=new JLabel("Gender: ");
        genderLabel.setBounds(140,200,150,40);
		genderLabel.setForeground(Color.WHITE);
        genderLabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        bgImgLabel.add(genderLabel);

        nameTextField=new JTextField();
        nameTextField.setBounds(300,200,180,30);
        nameTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        nameTextField.setEditable(false);
        bgImgLabel.add(nameTextField);

        addressLabel=new JLabel("Address: ");
        addressLabel.setBounds(140,250,100,40);
		addressLabel.setForeground(Color.WHITE);
		addressLabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        bgImgLabel.add(addressLabel);

        addressTextField=new JTextField();
        addressTextField.setBounds(300,250,180,30);
        addressTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        addressTextField.setEditable(false);
        bgImgLabel.add(addressTextField);

        roomNumberLabel=new JLabel("Room No: ");
        roomNumberLabel.setBounds(140,300,200,30);
		roomNumberLabel.setForeground(Color.WHITE);
		roomNumberLabel.setFont(new Font("Times New Roman",Font.PLAIN,20));
        bgImgLabel.add(roomNumberLabel);

        roomNumberTextField=new JTextField();
        roomNumberTextField.setBounds(300,300,140,30);
        roomNumberTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        roomNumberTextField.setEditable(false);
        bgImgLabel.add(roomNumberTextField);

        totalBillLabel=new JLabel("Total Bill: ");
        totalBillLabel.setBounds(140,350,200,35);
		totalBillLabel.setForeground(Color.green);
		totalBillLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        bgImgLabel.add(totalBillLabel);

        totalBillTextField=new JTextField();
        totalBillTextField.setBounds(300,350,140,30);
        totalBillTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        totalBillTextField.setEditable(false);
        totalBillTextField.setEditable(false);
        bgImgLabel.add(totalBillTextField);

        
        billNoLabel=new JLabel("Bill No: ");
        billNoLabel.setBounds(490,350,200,35);
		billNoLabel.setForeground(Color.MAGENTA);
		billNoLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        bgImgLabel.add(billNoLabel);

        billNoTextField=new JTextField();
        billNoTextField.setBounds(590,350,180,30);
        billNoTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        billNoTextField.setEditable(false);
        billNoTextField.setEditable(false);
        bgImgLabel.add(billNoTextField);

        changeLabel=new JLabel("Change: ");
        changeLabel.setBounds(140,400,200,35);
		changeLabel.setForeground(Color.orange);
		changeLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        bgImgLabel.add(changeLabel);

        changTextField=new JTextField();
        changTextField.setBounds(300,400,140,30);
        changTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        changTextField.setEditable(false);
        changTextField.setEditable(false);
        bgImgLabel.add(changTextField);

        returnHomeButton=new JButton("Return Home");
        returnHomeButton.setBounds(350,480,110,40);
        returnHomeButton.addActionListener(this);
        returnHomeButton.addMouseListener(this);
		returnHomeButton.setFocusable(false);
        bgImgLabel.add(returnHomeButton);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
	{
        if(ae.getSource()==returnHomeButton) 
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
		if(me.getSource() == returnHomeButton)
		{
			returnHomeButton.setBackground(Color.black);
			returnHomeButton.setForeground(Color.green);
		}
	}
    public void mouseExited(MouseEvent me)
	{
		if(me.getSource() ==returnHomeButton )
		{
			returnHomeButton.setBackground(Color.WHITE);
			returnHomeButton.setForeground(Color.BLACK);
		}
	}
}
