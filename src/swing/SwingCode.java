package swing;

import java.awt.Color;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JWindow;

public class SwingCode extends JWindow {
    private ImageIcon icon;
    private JLabel label;
    private JPanel panel;

    SwingCode() {

        // setLayout(null);
        label = new JLabel();
        panel = new JPanel();
        label.setSize(750, 450);

        setSize(750, 450);

        icon = new ImageIcon("D:\\java_code\\ProlemSolving\\src\\java.png");
        Image image = icon.getImage();
        image.getScaledInstance(750, 450, Image.SCALE_DEFAULT);
        icon = new ImageIcon(image);

        setLocationRelativeTo(null);
        setBackground(Color.white);

        label.setIcon(icon);
        // label.setText("Hello");

        panel.add(label);

        add(panel);
    }

    public static void main(String[] args) {
        var frame = new SwingCode();
        frame.setVisible(true);
    }
}
