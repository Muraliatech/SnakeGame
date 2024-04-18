import javax.swing.JFrame;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
public class Main {

    public static void main(String args[])
    {
        JFrame frame = new JFrame("MyFrame");
        frame.setTitle("My JFrame");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.setResizable(false);
        frame.setVisible(true);
        JLabel label = new JLabel();
        frame.setSize(420,420);
        ImageIcon  image = new ImageIcon("pic.jpeg");
        // frame.setIconImage(image.getImage());
         // frame.getContentPane().setBackground(new Color(1,12,123));
          label.setText("Bro, do you even code?");
          label.setVerticalTextPosition(JLabel.TOP);

          frame.add(label);
          label.setIcon(image);
          label.setHorizontalTextPosition(JLabel.CENTER);
            label.setVerticalTextPosition(JLabel.TOP);
            label.setForeground(new Color(0x00ff00));
            label.setFont(new Font("MV Boli",Font.PLAIN,20));
            label.setIconTextGap(100);
            label.setBackground(Color.BLACK);
            label.setOpaque(true);
    }
}
