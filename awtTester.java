import java.awt.*;
import java.awt.event.*;

public class awtTester
{
    static int counter = 0;
    public static void main(String[] args) {
        

        Frame frame = new Frame("Supa Cool Counter!!!");
        Label label = new Label(Integer.toString(counter), Label.CENTER);
        Button button = new Button("Click to Increment");

        
        ActionListener clicks = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                counter++;
                label.setText(Integer.toString(counter));
            }
        };

        button.setBounds(50, 50, 200, 100);
        label.setBounds(200, 200, 100, 100);
        
        button.addActionListener(clicks);
        

        frame.add(label);
        frame.add(button);
        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);

        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}