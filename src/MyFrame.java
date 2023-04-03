import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class MyFrame extends JFrame implements ActionListener{

    JButton button1 = new JButton();
    JButton button2 = new JButton();
    JButton button3 = new JButton();
    JButton button4 = new JButton();
    MyFrame() {

        button1.setBounds(100, 100, 250, 50);
        button1.addActionListener(this);
        button1.setText("USD");
        button1.setFocusable(false);
        button1.setForeground(Color.black);
        button1.setBackground(Color.WHITE);

        button2.setBounds(100, 170, 250, 50);
        button2.addActionListener(this);
        button2.setText("CAD");
        button2.setFocusable(false);
        button2.setForeground(Color.black);
        button2.setBackground(Color.WHITE);

        button3.setBounds(100, 240, 250, 50);
        button3.addActionListener(this);
        button3.setText("EURO");
        button3.setFocusable(false);
        button3.setForeground(Color.black);
        button3.setBackground(Color.WHITE);

        button4.setBounds(100, 310, 250, 50);
        button4.addActionListener(this);
        button4.setText("CNY");
        button4.setFocusable(false);
        button4.setForeground(Color.black);
        button4.setBackground(Color.WHITE);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(null);
        this.setSize(500,500);
        this.setVisible(true);
        this.add(button1);
        this.add(button2);
        this.add(button3);
        this.add(button4);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button1) {
            System.out.println("USD");
        }
        if(e.getSource()==button2) {
            System.out.println("CAD");
        }
        if(e.getSource()==button3) {
            System.out.println("EURO");
        }
        if(e.getSource()==button4) {
            System.out.println("CNY");
        }
    }
}
