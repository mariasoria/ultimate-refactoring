package presentationPatterns;

import javax.swing.*;
import java.awt.*;

public class DesktopApp {
    private static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("DesktopApp");
        CreateProductForm form = new CreateProductForm();
        frame.setContentPane(form.mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocation(300, 300);
        frame.setMinimumSize(new Dimension(500, 500));
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                createAndShowGUI();
            }
        });
    }
}
