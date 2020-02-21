package de.mayflower.java101;

import org.junit.Test;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

import static org.junit.Assert.*;

public class AppFrameTest
{
    @Test public void testFrameTitle()
    {
        JFrame frame = AppFrame.show();
        assertEquals( "java101", frame.getTitle() );
        assertTrue(frame.isVisible());
        assertEquals(1000, frame.getWidth());
        assertEquals(200, frame.getHeight());

        JRootPane rootComponent = (JRootPane) frame.getComponent(0);
        JLayeredPane layerdPanel = (JLayeredPane) rootComponent.getComponent(1);
        JPanel somePanel = (JPanel)  layerdPanel.getComponent(0);
        JPanel panel = (JPanel)  somePanel.getComponent(0);

        assertNotNull(panel);

        JButton button = (JButton)  panel.getComponent(0);
        assertEquals("Request a Joke",  button.getText());
        JTextField textField = (JTextField)  panel.getComponent(1);
        assertEquals("",  textField.getText());
        assertFalse(textField.isEditable());

        button.getActionListeners()[0].actionPerformed(null);
        String expected = "When Steven Seagal kills a ninja, he only takes its hide. When Chuck Norris kills a ninja, he uses every part.";
        assertEquals(expected,  textField.getText());
    }
}
