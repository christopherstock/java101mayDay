package de.mayflower.java101;

import com.google.api.client.http.GenericUrl;
import com.google.api.client.http.HttpRequest;
import com.google.api.client.http.HttpResponse;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;
import com.google.api.client.json.JsonObjectParser;
import com.google.api.client.json.jackson.JacksonFactory;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

public class AppFrame
{
    public static JFrame show()
    {
        JFrame frame = new JFrame( "java101" );
        JPanel panel = new JPanel();
        JButton button = new JButton("Request a Joke");
        JTextField textField = new JTextField();
        textField.setColumns(80);
        button.addActionListener(
            new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    HttpTransport httpTransport = new NetHttpTransport();
                    Joke joke;
                    try {
                        HttpRequest httpRequest = httpTransport.createRequestFactory().buildGetRequest(new GenericUrl("http://api.icndb.com/jokes/random"));
                        httpRequest.setParser(new JsonObjectParser(new JacksonFactory()));
                        HttpResponse httpResponse = httpRequest.execute();


                        joke = httpResponse.parseAs(Joke.class);
                        textField.setText(joke.value.joke);
                    } catch (IOException ex) {
                        ex.printStackTrace();
                    }

                }
            }
        );
        textField.setEditable(false);

        frame.add( panel );
        panel.add(button);
        panel.add(textField);

        frame.setVisible(true);
        frame.setSize(1000,200);

        return frame;
    }
}
