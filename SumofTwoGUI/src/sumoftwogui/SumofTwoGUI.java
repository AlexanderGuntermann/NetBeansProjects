/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sumoftwogui;

import java.awt.Color;
import javax.swing.*;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.TextArea;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author alexguntermann
 */
public class SumofTwoGUI extends JFrame {

    static JTextField int1;
    static JTextField int2;
    JTextField displaySum;

    public SumofTwoGUI() {

        this.setTitle("Input 2 Numbers for Sum");        // name of
        this.setSize(400, 100);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setLocationRelativeTo(null); // when you click the X it closes the program

        this.setLayout(new FlowLayout());             //lots of different layout, Border, Flow, etc

        JPanel myPanel = new JPanel();

        myPanel.setBackground(Color.MAGENTA);

        int1 = new JTextField();
        int2 = new JTextField();
        

        JButton myButton1 = new JButton("Click for sum");

        myButton1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int sum = Integer.parseInt(0+int1.getText()) + Integer.parseInt(0+int2.getText());
                displaySum.setText(sum+"");
            }
        });

        displaySum = new JTextField();

        myPanel.add(myButton1, BorderLayout.CENTER);

        int1.setColumns(5);
        int2.setColumns(5);
        displaySum.setColumns(5);
        

        myPanel.add(int1);
        myPanel.add(int2);
        myPanel.add(displaySum);

        this.add(myPanel);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new SumofTwoGUI().setVisible(true);
    }

}