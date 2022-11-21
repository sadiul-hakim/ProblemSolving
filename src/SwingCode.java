import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class SwingCode extends JFrame {
    private ImageIcon icon;
    private JLabel label;

    SwingCode() {

        setLayout(null);
        label = new JLabel();
        label.setSize(750, 450);

        setSize(750, 450);

        setLocationRelativeTo(null);
        setBackground(Color.white);

        icon = new ImageIcon("img12.jpg");
        Image image = icon.getImage();
        image.getScaledInstance(750, 450, Image.SCALE_SMOOTH);
        icon = new ImageIcon(image);

        label.setIcon(icon);
        // label.setText("Hello");

        add(label);
    }

    public static void main(String[] args) {
        var frame = new SwingCode();

        frame.setVisible(true);
    }
}
