import Controller.HomeController;
import View.Home;
import View.Window;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {
        Window window = new Window();
        Home home = new Home(window);
        HomeController homeController = new HomeController(home);
        window.setVisible(true);
    }
}
