package de.mayflower.java101;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class AppFrame
{
    public static JFrame show()
    {
        JFrame frame = new JFrame( "java101" );
        JPanel panel = new JPanel();
        JButton button = new JButton("Request a Joke");
        JTextField textField = new JTextField();
        button.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    textField.setText("Button pressed");
                }
            }
        );
        textField.setEditable(false);

        frame.add( panel );
        panel.add(button);
        panel.add(textField);

        return frame;
    }
}
