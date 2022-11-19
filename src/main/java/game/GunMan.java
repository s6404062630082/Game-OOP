/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author lookpeartayida
 */
public class GunMan {
    public int x,y,gunmanSize,health;
    private int  jumpHigh = 200;
    
    public GunMan(int x,int y ,int gunmanSize,int health){
        this.x=x;
        this.y=y;
        this.gunmanSize= gunmanSize;
        this.health=health;
        
    }

    GunMan() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    public void jump(JPanel game){
        this.y-=jumpHigh;
        Timer timer = new Timer(450,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                y+=jumpHigh;
                game.repaint();
            }
        });
        timer.setRepeats(false);//ไม่ให้ลูป
        timer.start();
    }

    void jump() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
