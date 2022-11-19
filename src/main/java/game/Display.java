/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;
  
import javax.swing.JFrame;
import javax.swing.JTextField;
    
/**
 *
 * @author lookpeartayida
 */      
public class Display extends JFrame {
    public Display(){            
        
        this.setSize(1000,600);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(300, 200);
        this.setVisible(true);
        this.getContentPane().setLayout(null);
        this.getContentPane().add(new Game());
        
    }
    public JTextField jtfScreen;
    
    public static void main(String[] arg){
        Display display = new Display();
    }
}
    
