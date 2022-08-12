package com.gui;


import java.lang.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Frame4 extends JFrame implements ActionListener,MouseListener
{
    JPanel panel;
    ImageIcon img,royalSuiteImg,kingBedImg,twinBedImg,standardImg;
    JLabel label,bgImg,royalSuiteL,kingBedImgl,twinBedImgl,standardImgl,service,roomNumberl,cost,acNonAc,packageLabel,numberOfDaysLabel;
    JButton next,back;
    JRadioButton royalSuite,kingBed,twinBed,standard,ac,nonAc,honeymoonR,corporateR,groupTourR;
    ButtonGroup roomTypeBtnGrp,acTypeBtnGrp,packageBtnGrp;
    JTextField txt,bill,numberOfDaysTextField;
    JCheckBox cbRoom,cbFood,cbLaundry,cbTransport;
    JSpinner roomNumber,numberOfDaysSpinner;
    SpinnerModel spinner,numberOfDaysSpinnerModel;
    JComboBox packageComboBox;

    Frame4()
    {
        super("Frame4 Room Booking");
        this.setSize(930, 650);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        panel = new JPanel();
        panel.setLayout(null);
        //panel.setBackground(Color.lightGray);

        img=new ImageIcon(this.getClass().getResource("Frame4e.jpg"));
        bgImg=new JLabel(img);
        //panel.setSize(950,650);
        bgImg.setSize(this.getSize());
        panel.add(bgImg);

        label=new JLabel("Let's Book a Room! ");
        label.setBounds(330,20,700,80);
        label.setForeground(Color.BLACK);
        label.setFont(new Font("Script MT Bold",Font.PLAIN,40));
        bgImg.add(label);

        back=new JButton("Back");
        back.setBounds(110,530,75,40);
        back.addActionListener(this);
        back.addMouseListener(this);
        back.setFocusable(false);
        bgImg.add(back);

        next=new JButton("Next");
        next.setBounds(760,530,75,40);
        next.addActionListener(this);
        next.addMouseListener(this);
        next.setFocusable(false);
        bgImg.add(next);

        roomNumberl=new JLabel("Number Of Rooms: ");
        roomNumberl.setBounds(100,285,220,35);
        roomNumberl.setFont(new Font("Times New Roman",Font.BOLD,18));
        roomNumberl.setForeground(Color.BLACK);
        bgImg.add(roomNumberl);

        spinner=new SpinnerNumberModel(1,1,10,1);
        roomNumber=new JSpinner(spinner);
        roomNumber.setBounds(260,290,40,35);
        bgImg.add(roomNumber);

        acNonAc=new JLabel("Select Room type: ");
        acNonAc.setBounds(350,285,230,35);
        acNonAc.setFont(new Font("Times New Roman",Font.BOLD,18));
        acNonAc.setForeground(Color.BLACK);
        bgImg.add(acNonAc);

        ac=new JRadioButton("Ac");
        ac.setBounds(500,288,50,35);
        ac.setFont(new Font("Times New Roman",Font.BOLD,18));
        ac.setOpaque(false);
        ac.repaint();
        ac.addActionListener(this);
        ac.setFocusable(false);
        bgImg.add(ac);

        nonAc=new JRadioButton("Non Ac");
        nonAc.setBounds(500,320,90,35);
        nonAc.setFont(new Font("Times New Roman",Font.BOLD,18));
        nonAc.setOpaque(false);
        nonAc.repaint();
        nonAc.addActionListener(this);
        nonAc.setFocusable(false);
        bgImg.add(nonAc);

        acTypeBtnGrp=new ButtonGroup();
        acTypeBtnGrp.add(ac);
        acTypeBtnGrp.add(nonAc);

        royalSuite=new JRadioButton("Royal Suite");
        royalSuite.setBounds(130,225,90,32);
        royalSuite.setOpaque(false);
        royalSuite.repaint();
        royalSuite.addActionListener(this);
        royalSuite.setFocusable(false);
        bgImg.add(royalSuite);

        royalSuiteImg=new ImageIcon(this.getClass().getResource("royalSuiteImg.png"));
        royalSuiteL=new JLabel(royalSuiteImg);
        royalSuiteL.setBounds(110,110,130,110);
        bgImg.add(royalSuiteL);

        kingBed=new JRadioButton("King Bed");
        kingBed.setBounds(330,225,80,32);
        kingBed.setOpaque(false);
        kingBed.repaint();
        kingBed.setFocusable(false);
        kingBed.addActionListener(this);
        bgImg.add(kingBed);

        kingBedImg=new ImageIcon(this.getClass().getResource("kingBedImg.jpg"));
        kingBedImgl=new JLabel(kingBedImg);
        kingBedImgl.setBounds(310,110,130,110);
        bgImg.add(kingBedImgl);

        twinBed=new JRadioButton("Twin Bed");
        twinBed.setBounds(530,225,80,32);
        twinBed.setOpaque(false);
        twinBed.repaint();
        twinBed.setFocusable(false);
        twinBed.addActionListener(this);
        bgImg.add(twinBed);

        twinBedImg=new ImageIcon(this.getClass().getResource("twinBed.png"));
        twinBedImgl=new JLabel(twinBedImg);
        twinBedImgl.setBounds(510,110,130,110);
        bgImg.add(twinBedImgl);

        standard=new JRadioButton("Standard");
        standard.setBounds(730,225,80,32);
        standard.setOpaque(false);
        standard.repaint();
        standard.setFocusable(false);
        bgImg.add(standard);

        standardImg=new ImageIcon(this.getClass().getResource("standard.jpg"));
        standardImgl=new JLabel(standardImg);
        standardImgl.setBounds(710,110,130,110);
        bgImg.add(standardImgl);

        roomTypeBtnGrp=new ButtonGroup();
        roomTypeBtnGrp.add(royalSuite);
        roomTypeBtnGrp.add(kingBed);
        roomTypeBtnGrp.add(twinBed);
        roomTypeBtnGrp.add(standard);

        service=new JLabel("Add Services:  ");
        service.setBounds(630,285,300,40);
        service.setFont(new Font("Times New Roman",Font.BOLD,18));
        service.setForeground(Color.black);
        bgImg.add(service);

        cbRoom=new JCheckBox("Room Service");
        cbRoom.setBounds(750,285,250,35);
        cbRoom.setFont(new Font("Times New Roman",Font.BOLD,16));
        cbRoom.setOpaque(false);
        cbRoom.repaint();
        cbRoom.setForeground(Color.BLACK);

        cbRoom.setFocusable(false);
        cbRoom.addActionListener(this);
        bgImg.add(cbRoom);

        cbFood=new JCheckBox("Food Buffet");
        cbFood.setBounds(750,315,250,35);
        cbFood.setFont(new Font("Times New Roman",Font.BOLD,16));
        cbFood.setOpaque(false);
        cbFood.repaint();
        cbFood.setForeground(Color.black);
        cbFood.addActionListener(this);
        cbFood.setFocusable(false);
        bgImg.add(cbFood);

        cbLaundry=new JCheckBox("Laundry Service");
        cbLaundry.setBounds(750,345,250,35);
        cbLaundry.setFont(new Font("Times New Roman",Font.BOLD,16));
        cbLaundry.setOpaque(false);
        cbLaundry.repaint();
        cbLaundry.setForeground(Color.black);
        cbLaundry.addActionListener(this);
        cbLaundry.setFocusable(false);
        bgImg.add(cbLaundry);

        cbTransport=new JCheckBox("Transportation");
        cbTransport.setBounds(750,375,250,35);
        cbTransport.setFont(new Font("Times New Roman",Font.BOLD,16 ));
        cbTransport.setOpaque(false);
        cbTransport.repaint();
        cbTransport.setForeground(Color.black);
        cbTransport.addActionListener(this);
        cbTransport.setFocusable(false);
        bgImg.add(cbTransport);

        cost=new JLabel("Total Cost:  ");
        cost.setBounds(630,450,280,35);
        cost.setFont(new Font("Times New Roman",Font.BOLD,20));
        cost.setForeground(Color.BLACK);
        bgImg.add(cost);

        bill=new JTextField();
        bill.setBounds(730,450,120,35);
        bgImg.add(bill);

        packageLabel=new JLabel("Do You Want Any package: ");
        packageLabel.setBounds(100,370,250,35);
        packageLabel.setFont(new Font("Times New Roman",Font.BOLD,19));
        bgImg.add(packageLabel);

        honeymoonR=new JRadioButton("Honeymoon");
        honeymoonR.setBounds(340,370,140,35);
        honeymoonR.setFont(new Font("Times New Roman",Font.BOLD,17));
        honeymoonR.setOpaque(false);
        honeymoonR.repaint();
        honeymoonR.setFocusable(false);
        honeymoonR.addActionListener(this);
        bgImg.add(honeymoonR);

        groupTourR=new JRadioButton("Group Tour");
        groupTourR.setBounds(470,370,110,35);
        groupTourR.setFont(new Font("Times New Roman",Font.BOLD,17));
        groupTourR.setOpaque(false);
        groupTourR.repaint();
        groupTourR.setFocusable(false);
        groupTourR.addActionListener(this);
        bgImg.add(groupTourR);

        corporateR=new JRadioButton("Corporate");
        corporateR.setBounds(590,370,110,35);
        corporateR.setFont(new Font("Times New Roman",Font.BOLD,17));
        corporateR.setOpaque(false);
        corporateR.repaint();
        corporateR.addActionListener(this);
        corporateR.setFocusable(false);
        bgImg.add(corporateR);

        packageBtnGrp=new ButtonGroup();
        packageBtnGrp.add(honeymoonR);
        packageBtnGrp.add(groupTourR);
        packageBtnGrp.add(corporateR);

        numberOfDaysLabel=new JLabel("How many days would you like to stay?");
        numberOfDaysLabel.setBounds(100,450,350,35);
        numberOfDaysLabel.setFont(new Font("Times New Roman",Font.BOLD,20));
        bgImg.add(numberOfDaysLabel);

        numberOfDaysSpinnerModel=new SpinnerNumberModel(1,1,30,1);
        numberOfDaysSpinner=new JSpinner(numberOfDaysSpinnerModel);
        numberOfDaysSpinner.setBounds(440,450,40,35);
        bgImg.add(numberOfDaysSpinner);

        this.add(panel);
    }

    public void actionPerformed(ActionEvent ae)
    {
        if(ae.getSource()==back)
        {
            Frame1 f1=new Frame1();
            f1.setVisible(true);
            this.setVisible(false);
        }
        else if(ae.getSource()==next)
        {
            Frame5 f5=new Frame5();
            f5.setVisible(true);
            this.setVisible(false);
        }
        else if(honeymoonR.isSelected()==true)
        {
            royalSuite.setSelected(true);
            ac.setSelected(true);
            cbTransport.setSelected(true);
        }
        else if(royalSuite.isSelected()==true || kingBed.isSelected()==true)
        {
            ac.setSelected(true);
        }
        else if(groupTourR.isSelected()==true)
        {
            twinBed.setSelected(true);
            cbFood.setSelected(true);
            spinner.setValue(5);
        }
        else if(corporateR.isSelected()==true)
        {
            kingBed.setSelected(true);
            ac.setSelected(true);
            cbFood.setSelected(true);
            cbTransport.setSelected(true);
        }

    }

    public void mouseClicked(MouseEvent me)
    {
       /*  if(me.getSource()==cbRoom)
        {
           if(cbRoom.getForeground().equals(Color.black))
           {
            cbRoom.setForeground(Color.GREEN);
           }
           else if(cbRoom.getForeground().equals(Color.GREEN))
           {
            cbRoom.setForeground(Color.black);
           }
        }
       else if(me.getSource()==cbFood)
        {
           if(cbFood.getForeground().equals(Color.black))
           {
            cbFood.setForeground(Color.GREEN);
           }
           else if(cbFood.getForeground().equals(Color.GREEN))
           {
            cbFood.setForeground(Color.black);
           }
        }
        else if(me.getSource()==cbLaundry)
        {
           if(cbLaundry.getForeground().equals(Color.black))
           {
            cbLaundry.setForeground(Color.GREEN);
           }
           else if(cbLaundry.getForeground().equals(Color.GREEN))
           {
            cbLaundry.setForeground(Color.black);
           }
        }
       else if(me.getSource()==cbTransport)
        {
           if(cbTransport.getForeground().equals(Color.black))
           {
            cbTransport.setForeground(Color.GREEN);
           }
           else if(cbTransport.getForeground().equals(Color.GREEN))
           {
            cbTransport.setForeground(Color.black);
           }
        }*/

    }

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