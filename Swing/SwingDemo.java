package Swing;

import java.awt.FlowLayout;
import javax.swing.*;

public class SwingDemo
{
  public static void main(String[] args) {
    JFrame f = new JFrame("User Form");
    f.setVisible(true);
    f.setSize(800, 400);
    f.setLayout(new FlowLayout());

    JLabel label1 = new JLabel("User Name:");
    f.add(label1);
    JTextField text1 = new JTextField(20);
    f.add(text1);
    JLabel label2 = new JLabel("User Name:");
    f.add(label2);
    JTextField text2 = new JTextField(20);
    f.add(text2);

    JButton b = new JButton("Submit");
    f.add(b);
  }
}