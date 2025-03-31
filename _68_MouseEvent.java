import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class _68_MouseEvent extends JFrame implements MouseListener {
JLabel label;
_68_MouseEvent(){
    label= new JLabel("Click me");
    label.setBounds(100,100,200,50);

    add(label);
    addMouseListener(this);
    setSize(300,300);
    setLayout(null);
    setVisible(true);
}
public void mouseClicked(MouseEvent e){
    label.setText("Mouse click at ("+e.getX() + ","+ e.getY()+")");
}
public void mouseEntered(MouseEvent e){}
public void mouseExited(MouseEvent e) {}
public void mousePressed(MouseEvent e) {}
public void mouseReleased(MouseEvent e) {}
    public static void main(String[] args) {
        new _68_MouseEvent();
        
    }
}
