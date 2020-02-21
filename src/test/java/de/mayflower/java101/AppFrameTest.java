package de.mayflower.java101;

import org.junit.Test;

import javax.swing.*;

import static org.junit.Assert.*;

public class AppFrameTest
{
    @Test public void testFrameTitle()
    {
        JFrame frame = AppFrame.show();
        assertEquals( "java101", frame.getTitle() );



    }
}
