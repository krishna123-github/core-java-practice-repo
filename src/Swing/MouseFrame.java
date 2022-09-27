package Swing;

import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.border.Border;

public class MouseFrame extends JFrame {

    JTextField textField = new JTextField();

    public MouseFrame() {
        this.setTitle("Mouse demo");
//        ImageIcon icon = new ImageIcon(getClass().getResource("mouse.gif"));
//        Image img = icon.getImage();
//
//        this.setIconImage(img);

        this.setLayout(new FlowLayout());

        textField.addMouseListener(new MyMouseListener());
        textField.setPreferredSize(new Dimension(200, 50));
        this.add(textField);
    }

    class MyMouseListener implements MouseListener {

        @Override
        public void mouseClicked(MouseEvent e) {
            System.out.println("mouse click---" + e.getX() + "    " + e.getY());
        }

        @Override
        public void mousePressed(MouseEvent e) {
            System.out.println("mouse Pressed---" + e.getX() + "    " + e.getY());

        }

        @Override
        public void mouseReleased(MouseEvent e) {
            System.out.println("mouse Released---" + e.getX() + "    " + e.getY());
        }

        @Override
        public void mouseEntered(MouseEvent e) {
            System.out.println("mouse Enterned---" + e.getX() + "    " + e.getY());

            Border border = BorderFactory.createLineBorder(Color.red);
            textField.setBorder(border);
        }

        @Override
        public void mouseExited(MouseEvent e) {
            System.out.println("mouse click---" + e.getX() + "    " + e.getY());

            Border border = BorderFactory.createLineBorder(Color.pink);
        }

    }

}

 class MouseDemo{
     public static void main(String[] args) {
         JFrame frame = new MouseFrame();
         frame.setSize(400, 300);
         
         frame.setVisible(true);
     }
 }
