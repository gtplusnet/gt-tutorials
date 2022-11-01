import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;    

public class JFrameExample
{  
    public static void main(String s[])
    {  
        JFrame frame = new JFrame("JFrame Example");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());  
        JLabel label = new JLabel("JFrame By Example");  
        JButton button = new JButton();  
        button.setText("Button");  
        panel.add(label);  
        panel.add(button);  
        frame.add(panel);  
        frame.setSize(200, 300);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  


        button.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Hello World!");
            }
        }); 
    }
}  