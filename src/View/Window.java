package View;

import javax.swing.*;
import java.awt.*;

public class Window extends JFrame {
    public Window() throws HeadlessException {
        initialize();
    }


    private void initialize() {

        this.setBounds(100, 100, 515, 475);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
