package anagrams;

import javax.swing.JFrame;
import java.awt.Color;
import javax.swing.ImageIcon;

public class MyFrame extends JFrame {
        // creating an instance of MyFrame
        MyFrame() {
                this.setTitle("Anagram Cheater");
                this.setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE); // closes the window when click exit red button
                this.setVisible(true); // make window visible
                this.setSize(500, 500); // set windom size
                this.setResizable(true); // resize the window or not

                ImageIcon logo = new ImageIcon(
                                "/anagrams_prelim/src/files /ana_logo.png");
                this.setIconImage(logo.getImage()); // set the frame icon . IDK WHY IT'S NOT WORKING??

                this.getContentPane().setBackground(new Color(123, 50, 250));
        };

}
