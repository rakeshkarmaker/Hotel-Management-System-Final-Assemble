import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class Frame3 extends JFrame implements ActionListener,MouseListener
{
    JLabel label,bgimg,searchGuestLabel;
    ImageIcon img,searchIcon;
    Frame2 f2;
    JPanel panel;
	JTextField insertTextField,removeTextField,searchtTextField;
    JButton logOut,insertButton,removebButton,searchButton;

    Frame3(String s1,String s2,Frame2 f2)
    {
        super("Frame3 Management System");
		this.setSize(800, 500);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		this.f2 = f2;
		
		panel = new JPanel();
		panel.setLayout(null);
       
        img=new ImageIcon(this.getClass().getResource("Frame3.png"));
        bgimg=new JLabel(img);
        bgimg.setSize(this.getSize());
        panel.add(bgimg);

        label=new JLabel("Welcome To Management");
        label.setBounds(180,30,500,30);
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Script MT Bold",Font.PLAIN,40));
		bgimg.add(label);

		searchGuestLabel=new JLabel("Search Guest: ");
		searchGuestLabel.setBounds(100,120,350,30);
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
        insertTextField.setFont(new Font("Times New Roman",Font.BOLD,16));
        bgimg.add(insertTextField);

		insertButton=new JButton("Insert");
        insertButton.setBounds(230,260,70,35);
        //insertButton.addActionListener(this);
        insertButton.addMouseListener(this);
        insertButton.setFocusable(false);
        bgimg.add(insertButton);

		removeTextField=new JTextField();
		removeTextField.setBounds(450,220,180,30);
        removeTextField.setFont(new Font("Times New Roman",Font.BOLD,16));
        bgimg.add(removeTextField);

		removebButton=new JButton("Remove");
        removebButton.setBounds(495,260,85,35);
        //insertButton.addActionListener(this);
        removebButton.addMouseListener(this);
        removebButton.setFocusable(false);
        bgimg.add(removebButton);
		
        logOut=new JButton("Log Out");
        logOut.setBounds(670,390,80,35);
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
    }
    public void mouseClicked(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mouseEntered(MouseEvent me)
	{
		if(me.getSource() == logOut)
		{
			logOut.setBackground(Color.black);
			logOut.setForeground(Color.green);
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
		if(me.getSource() == logOut)
		{
			logOut.setBackground(Color.WHITE);
			logOut.setForeground(Color.BLACK);
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
