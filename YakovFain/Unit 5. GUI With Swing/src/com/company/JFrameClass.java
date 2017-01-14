package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created by Andrei on 014 14.01.17.
 */
public class JFrameClass extends JFrame implements ActionListener {

    public JFrameClass() {

        JPanel jp = new JPanel();
        FlowLayout fl = new FlowLayout();
        JFrame jf = new JFrame("Adding numbers");
        jp.setLayout(fl);

        JLabel num1 = new JLabel("Number 1:");
        JTextField num1f = new JTextField(10);
        JLabel num2 = new JLabel("Number 2:");
        JTextField num2f = new JTextField(10);
        JLabel rez = new JLabel("Result:");
        JTextField rezf = new JTextField(10);
        JButton add = new JButton("Add");

        jp.add(num1);
        jp.add(num1f);
        jp.add(num2);
        jp.add(num2f);
        jp.add(rez);
        jp.add(rezf);

        jf.setContentPane(jp);
        jf.pack();
        jf.setLocationRelativeTo(null);
        jf.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
