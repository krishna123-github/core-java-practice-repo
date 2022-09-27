package AWT;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

class HelloFrame extends Frame {

    public TextField tfUserName, tfMessage;
    Button setHelloButton;

    public HelloFrame() {

        tfUserName = new TextField(15);
        tfMessage = new TextField(20);
        setHelloButton = new Button("say Hello");

        setHelloButton.addActionListener(new MyListener());

        this.setLayout(new FlowLayout());
        this.add(tfUserName);
        
        add(setHelloButton);
        add(tfMessage);
        
    }

    class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String n = tfUserName.getText();
            tfMessage.setText("Hello " + n);
        }
    }
}

public class TestFrame{
    public static void main(String[] args) {
        HelloFrame frame = new  HelloFrame();
        frame.setSize(400, 300);
        frame.setVisible(true);
    }
}