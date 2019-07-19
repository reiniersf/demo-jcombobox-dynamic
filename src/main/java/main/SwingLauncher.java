package main;

import java.awt.Dimension;
import java.util.function.Consumer;

import javax.swing.JFrame;
import javax.swing.WindowConstants;

public class SwingLauncher{
    private JFrame root = new JFrame("Swing App");

    public SwingLauncher(){
        root.setSize(new Dimension(400, 600));
        root.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }

    public SwingLauncher(Consumer<JFrame> configurator){
        this();
        configurator.accept(root);
    }

    public void launch(){
        root.setVisible(true);
    }
}