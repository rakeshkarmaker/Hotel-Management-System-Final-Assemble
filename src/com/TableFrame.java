package com;
import javax.swing.*;
import com.classes.*;

public class TableFrame extends HotelManagementSystem {

        JFrame f;
          TableFrame(){
            f=new JFrame();
            String data[][]={ {"101","Amit","670000"},
                    {"102","Jai","780000"},
                    {"101","Sachin","700000"}};
            String column[]={"Guest Name","Guest ","SALARY"};
            JTable jt=new JTable(data,column);
            jt.setBounds(30,40,200,300);
            JScrollPane sp=new JScrollPane(jt);
            f.add(sp);
            f.setSize(400,600);
            f.setVisible(true);
        }

    public static void main(String[] args) {
        new TableFrame();
    }
}
