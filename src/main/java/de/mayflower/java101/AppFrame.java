package de.mayflower.java101;

import javax.swing.*;

public class AppFrame
{
    public static JFrame show()
    {
        JFrame frame = new JFrame( "java101" );
        JPanel panel = new JPanel();
        JButton button = new JButton("Request a Joke");
        JTextField textField = new JTextField();

        frame.add( panel );
        panel.add(button);
        panel.add(textField);

        return frame;
    }
}
