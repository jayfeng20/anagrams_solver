package anagrams;

import javax.swing.JLabel;
import javax.swing.ImageIcon;

public class MyLabel extends JLabel {
    MyLabel() {
        this.setText("Input your text here");
        ImageIcon image = new ImageIcon("src/files /wingedSylas.png");
        this.setIcon(image);
        this.setHorizontalAlignment(JLabel.RIGHT);
        this.setVerticalTextPosition(JLabel.TOP);

    }
}
