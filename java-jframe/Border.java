import java.awt.*;    
import javax.swing.*;    
    
public class Border   
{    
    public static void main(String[] args)
    {    
        JFrame frame = new JFrame("JFrame Example");    
            
        // creating buttons  
        JButton b1 = new JButton("NORTH");; // the button will be labeled as NORTH   
        JButton b2 = new JButton("SOUTH");; // the button will be labeled as SOUTH  
        JButton b3 = new JButton("EAST");; // the button will be labeled as EAST  
        JButton b4 = new JButton("WEST");; // the button will be labeled as WEST  
        JButton b5 = new JButton("CENTER");; // the button will be labeled as CENTER  
            
        frame.add(b1, BorderLayout.NORTH); // b1 will be placed in the North Direction    
        frame.add(b2, BorderLayout.SOUTH);  // b2 will be placed in the South Direction    
        frame.add(b3, BorderLayout.EAST);  // b2 will be placed in the East Direction    
        frame.add(b4, BorderLayout.WEST);  // b2 will be placed in the West Direction    
        frame.add(b5, BorderLayout.CENTER);  // b2 will be placed in the Center    
            
        frame.setSize(300, 300);    
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);     
    }
}