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
public class Wave {
    public int x,y,width,height,speed;
    private int xStart;
    public Wave(int x,int y, int w,int h,int speed,JPanel game){
        this.x=x;
        this.xStart=x;
        this.y=y;
        this.width=w;
        this.height=h;
        this.speed=speed;
        move(game);
    }
    public void move(JPanel game){
        Timer timer = new Timer(50,new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                x -= speed;
                game.repaint();
                if(x<0){
                    x=xStart;//ให้ไม่ตกขอบ
                }
            }
            
        });
        timer.start();
    }
}
