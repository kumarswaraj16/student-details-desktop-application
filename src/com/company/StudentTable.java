package com.company;

//This file creates Student Table for storing data whenever we need!

import javax.swing.*;
import javax.swing.table.JTableHeader;
import java.awt.*;

public class StudentTable extends JFrame {
    JTableHeader header;
    StudentTable(JTable jTable,String title){
        super(title);
        super.setVisible(true);
        super.setSize(500,400);
        super.setLocation(400,400);
        super.setDefaultCloseOperation(HIDE_ON_CLOSE);
        header = jTable.getTableHeader();
        Container c = getContentPane();
        c.setLayout(new BorderLayout());
        jTable.setBorder(BorderFactory.createLineBorder(Color.BLACK));
        jTable.setGridColor(Color.BLACK);
        c.add("North",header);
        c.add("Center",jTable);
    }
}
