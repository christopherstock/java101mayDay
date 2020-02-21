package de.mayflower.java101;

import org.junit.Test;
import javax.swing.*;
import java.awt.*;
import static org.junit.Assert.*;

public class AppFrameTest
{
    @Test public void testFrameTitle()
    {
        JFrame frame = AppFrame.show();
        assertEquals( "java101", frame.getTitle() );

        JRootPane rootComponent = (JRootPane) frame.getComponent(0);
        JPanel panel = (JPanel) rootComponent.getComponent(0);

        assertNotNull(panel);

    }
}
