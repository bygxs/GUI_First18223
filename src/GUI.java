import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
// https://introcs.cs.princeton.edu/java/15inout/GUI.java.html
// tutorial executed at from Alex Lee @ youtube
// https://piped.sp-codes.de/watch?v=5o3fMLPY7qY

/**
 * issues the GUI doesn't show count unless resized to fit for me. crazy! dumb ass dator!
 * However, I am really satified that Main can be refactor renamed to GUI class. The holy cow is down, Finally.
 * I am understanding software in general interface in particular and getting crazy incisive ideas into
 * architecure via Design patterns Mosh and others
 * today I learned what MVC model( da shit), View (a fancy shitty name for the display), Controller (input output abstracted from dum ass users)
  * nerds, in particular, people in general has a way of obfuscating meaning though language
 */



public class GUI implements ActionListener {

    int count = 0;
    private JLabel label;
    private JFrame frame;
    private JButton button;
    private  JPanel panel;

    public GUI(){
         frame = new JFrame();

        button = new JButton("Click Me!");
        button.addActionListener(this);



         label = new JLabel("Number of Clicks: ");




        // Creating a GUI window with panels, borders and schit.
        panel = new JPanel();
        panel.setBorder(BorderFactory.createEmptyBorder(70,80,70,80));
        panel.setLayout(new GridLayout(0,1));

        panel.add(button);
        panel.add(label);

        frame.add(panel, BorderLayout.CENTER);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setTitle("MY BYG:XS GUI");
        frame.pack();
        frame.setVisible(true);

    }
    public static void main(String[] args) {

        new GUI();


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        count ++;
        label.setText("Number of clicks:" + count);
    }
}