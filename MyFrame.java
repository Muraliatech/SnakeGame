import javax.swing.JFrame;

import java.awt.Color;

import javax.swing.ImageIcon;

public class MyFrame extends JFrame{

     MyFrame(){
       this.setTitle("My JFrame");
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.setResizable(false);
       this.setVisible(true);
       this.setSize(420,420);
        ImageIcon  image = new ImageIcon("pic.jpeg");
       this.setIconImage(image.getImage());
       this.getContentPane().setBackground(new Color(1,12,123));
   
     }
}
