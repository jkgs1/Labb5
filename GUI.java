import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.plaf.DimensionUIResource;
import javax.swing.plaf.InsetsUIResource;

import java.awt.GridBagLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridBagConstraints;
import java.awt.GridLayout;
public class GUI extends JFrame{

JFrame frame = new JFrame();
JPanel canvas = new JPanel();
JLabel display = new JLabel();
JPanel keypad = new JPanel();

public GUI(){
    drawKeypad();
    drawDisplay();
    drawBag();
    drawCanvas();
    END();
}

    // frame
    // this.setSize(600, 800); // size of frame 

    // canvas
    private void drawCanvas(){
        canvas.setLayout(new GridBagLayout());
        canvas.setPreferredSize(new DimensionUIResource(400, 500));
        canvas.setBackground(Color.RED);
        frame.setContentPane(canvas); // sets contentpane of frame to be canvas
    }
    
    // display
    private void drawDisplay(){
        //display.setVerticalAlignment(JLabel.TOP);
        display.setBorder(BorderFactory.createMatteBorder(2, 2, 4, 4, Color.CYAN));
        display.setFont(new Font("Italic", Font.ITALIC, 12));
        display.setPreferredSize(new DimensionUIResource(400, 75));
        display.setText("0");
        display.setHorizontalAlignment(SwingConstants.RIGHT);
        //canvas.add(display);
    }
    

    // GridBag
    private void drawBag(){
        GridBagConstraints bag = new GridBagConstraints(); // creates a gridbagconstraints object
        bag.fill = GridBagConstraints.BOTH;
        bag.gridx = 0;
        bag.gridy = 0;
        bag.weightx = 1;
        bag.weighty = 1;
        canvas.add(display, bag);
    }
    

    // keypad

    private void drawKeypad(){
        GridBagConstraints keybag = new GridBagConstraints(); // creates a gridbagconstraints object
        keybag.fill = GridBagConstraints.BOTH;
        keybag.gridx = 0;
        keybag.gridy = 1;
        keybag.weightx = 1;
        keybag.weighty = 9;
        keypad.setLayout(new GridLayout(4,4)); // 4 rows and 4 columns
        canvas.add(this.keypad, keybag);
    }
    
    
    
    // ending commands
    private void END(){
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    
    }

}