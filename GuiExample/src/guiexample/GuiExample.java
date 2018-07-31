package guiexample;

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
public class GuiExample extends JFrame implements ActionListener {
    static int d = 25;
    static int b = 23;
    static TextArea sumOf;

    public GuiExample() {

        this.setTitle("The Sum of Two Numbers");
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setSize(800, 600);
        this.setLocationRelativeTo(null);
//        this.setLayout(new FlowLayout());
        this.setLayout(new BorderLayout());

        JPanel myPanel = new JPanel();

        myPanel.setBackground(Color.CYAN);

        this.add(myPanel);

        sumOf = new TextArea("The two numbers are: " + d + " & "+ b);
        sumOf.setFont(new Font("Serif", Font.ITALIC, 25));
        
JScrollPane scroller = new JScrollPane(sumOf);
        myPanel.add(scroller, BorderLayout.PAGE_END);

        JButton myButton1 = new JButton("Click for sum");
//        JButton myButton2 = new JButton("Click to cancel");
        
        myButton1.addActionListener(this);
//        myButton2.addActionListener(this);
//        myButton1.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                helloWorld.setText(helloWorld.getText() + "\nThe button got clicked!!!!");
//            }
//        });
        myPanel.add(myButton1, BorderLayout.CENTER);
//        myPanel.add(myButton2, BorderLayout.SOUTH);
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        new GuiExample().setVisible(true);

    }
    

    @Override
    public void actionPerformed(ActionEvent e) {

        sumOf.setText(sumOf.getText() + "\nThe sum of the two numbers is: "+(d+b));
// tied to the CLASS and no longer to the button
    }

}
