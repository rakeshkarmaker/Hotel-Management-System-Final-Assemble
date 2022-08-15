package com;

import java.awt.*;
import java.lang.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame7 extends JFrame implements ActionListener, MouseListener
{
    JLabel bgImgLabel,frameLabel,roomCostLabel,serviceCostLabel,vatLabel,discountLabel,grandTotaLabel,paymentTypeLabel,paymentLabel;
    ImageIcon bgImg;
    JButton back,next,confirmButton;
    JComboBox paymentTypeComboBox;
    JTextField roomCostTextField,serviceCostTextField,grandTotalTextField,vatTextField,discountTextField,paymentTextField;
    JPanel panel;

    Frame7()
    {
        super("Frame7 Payment");
		this.setSize(900, 600);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
		panel.setLayout(null);

        bgImg=new ImageIcon(this.getClass().getResource("Frame7.jpg"));
        bgImgLabel=new JLabel(bgImg);
        bgImgLabel.setSize(this.getSize());
        panel.add(bgImgLabel);

        frameLabel=new JLabel("Payment And Checkout");
        frameLabel.setBounds(270,15,700,80);
		frameLabel.setForeground(Color.black);
		frameLabel.setFont(new Font("Script MT Bold",Font.PLAIN,40));
        bgImgLabel.add(frameLabel);

        roomCostLabel=new JLabel("Total Room Cost");
        roomCostLabel.setBounds(120,120,200,35);
		roomCostLabel.setForeground(Color.black);
		roomCostLabel.setFont(new Font("Times New Roman",Font.BOLD,21));
        bgImgLabel.add(roomCostLabel);

        roomCostTextField=new JTextField();
        roomCostTextField.setBounds(320,120,180,30);
        roomCostTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        roomCostTextField.setEditable(false);
        bgImgLabel.add(roomCostTextField);

        serviceCostLabel=new JLabel("Total Servie Cost");
        serviceCostLabel.setBounds(120,170,200,35);
		serviceCostLabel.setForeground(Color.black);
		serviceCostLabel.setFont(new Font("Times New Roman",Font.BOLD,21));
        bgImgLabel.add(serviceCostLabel);

        serviceCostTextField=new JTextField();
        serviceCostTextField.setBounds(320,170,180,30);
        serviceCostTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        serviceCostTextField.setEditable(false);
        bgImgLabel.add(serviceCostTextField);

        vatLabel=new JLabel("15% vat");
        vatLabel.setBounds(120,220,200,35);
		vatLabel.setForeground(Color.black);
		vatLabel.setFont(new Font("Times New Roman",Font.BOLD,21));
        bgImgLabel.add(vatLabel);

        vatTextField=new JTextField();
        vatTextField.setBounds(320,220,180,30);
        vatTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        vatTextField.setEditable(false);
        bgImgLabel.add(vatTextField);

        discountLabel=new JLabel("Discount");
        discountLabel.setBounds(120,270,200,35);
		discountLabel.setForeground(Color.black);
		discountLabel.setFont(new Font("Times New Roman",Font.BOLD,21));
        bgImgLabel.add(discountLabel);

        discountTextField=new JTextField();
        discountTextField.setBounds(320,270,180,30);
        discountTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        discountTextField.setEditable(false);
        bgImgLabel.add(discountTextField);

        grandTotaLabel=new JLabel("Grand Total");
        grandTotaLabel.setBounds(240,335,200,35);
		grandTotaLabel.setForeground(Color.red);
		grandTotaLabel.setFont(new Font("Times New Roman",Font.BOLD,22));
        bgImgLabel.add(grandTotaLabel);

        grandTotalTextField=new JTextField();
        grandTotalTextField.setBounds(385,335,140,30);
        grandTotalTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        grandTotalTextField.setEditable(false);
        bgImgLabel.add(grandTotalTextField);

        paymentTypeLabel=new JLabel("Choose Payment Method");
        paymentTypeLabel.setBounds(120,395,270,35);
		paymentTypeLabel.setForeground(Color.black);
		paymentTypeLabel.setFont(new Font("Times New Roman",Font.BOLD,21));
        bgImgLabel.add(paymentTypeLabel);

        String paymentTypeString[] = { "Cash","BKash", "Credit Card"};
        paymentTypeComboBox=new JComboBox<>(paymentTypeString);
		paymentTypeComboBox.setBounds(380, 395, 120, 30);
        paymentTypeComboBox.setFocusable(false);
		bgImgLabel.add(paymentTypeComboBox);

        paymentLabel=new JLabel("Payment");
        paymentLabel.setBounds(540,395,100,35);
		paymentLabel.setForeground(Color.black);
		paymentLabel.setFont(new Font("Times New Roman",Font.BOLD,21));
        bgImgLabel.add(paymentLabel);

        paymentTextField=new JTextField();
        paymentTextField.setBounds(650,395,130,30);
        paymentTextField.setFont(new Font("Times New Roman",Font.BOLD,17));
        bgImgLabel.add(paymentTextField);

        back=new JButton("Back");
        back.setBounds(50,480,75,40);
        back.addActionListener(this);
        back.addMouseListener(this);
		back.setFocusable(false);
        bgImgLabel.add(back);

        next=new JButton("Confirm");
        next.setBounds(760,480,90,40);
        next.addActionListener(this);
        next.addMouseListener(this);
		next.setFocusable(false);
        bgImgLabel.add(next);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
	{
        if(ae.getSource()==back) 
        {
            Frame5 f5=new Frame5();
            f5.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==next)
        {
            Frame8 f8=new Frame8();
            f8.setVisible(true);
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
}