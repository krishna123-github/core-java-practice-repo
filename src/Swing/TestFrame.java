package Swing;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class HelloFrame extends Frame {

    JTextField textField;
    JButton button;

    public HelloFrame() {
        textField = new JTextField(15);
        button = new JButton("Hello");

        button.addActionListener(new MyListener());
        this.setLayout(new FlowLayout());
        add(textField);
        add(button);
    }

    class MyListener implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            String n = textField.getName();
            JOptionPane.showMessageDialog(null, "Hello " + n);
        }
    }
}

public class TestFrame {

    public static void main(String[] args) {
        HelloFrame frame = new HelloFrame();
        frame.setSize(200, 200);
        frame.setVisible(true);
    }

}
