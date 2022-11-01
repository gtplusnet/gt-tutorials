import java.awt.*;    
import java.awt.event.*;
import javax.swing.*;    

public class SimpleEvent
{  
    public static void main(String s[])
    {  
        JFrame frame = new JFrame("JFrame Example");  
        JPanel panel = new JPanel();  
        panel.setLayout(new FlowLayout());
        
        JLabel label = new JLabel("JFrame By Example");  

        JButton button_1 = new JButton();  
        button_1.setText("Ok");  

        JButton button_2 = new JButton();  
        button_2.setText("Cancel");  

        panel.add(label); 
        panel.add(button_1);  
        panel.add(button_2);  
       
        frame.add(panel);  
        frame.setSize(400, 80);  
        frame.setLocationRelativeTo(null);  
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);  
        frame.setVisible(true);  

        button_1.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Ok has been clicked.");
            }
        }); 

        button_2.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println("Cancel has been clicked.");
            }
        });
    }
}  