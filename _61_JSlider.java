import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;
import java.awt.FlowLayout;

public class _61_JSlider {
    public static void main(String[] args) {
        JFrame frame = new JFrame();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400,200);
        frame.setLayout(new FlowLayout());

        JSlider slider = new JSlider(JSlider.HORIZONTAL,0,100,50);
        slider.setMajorTickSpacing(20);
        slider.setMinorTickSpacing(5);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        JLabel valueLabel = new JLabel("Value : 50");
        slider.addChangeListener(e ->{
            valueLabel.setText("Value: "+ slider.getValue());
        });

        frame.add(slider);
        frame.add(valueLabel);
        frame.setVisible(true);
    }
}
