  /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PopupMenu;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author lookpeartayida
 */
public class Game extends JPanel implements KeyListener{
    int lv=0;
    int t=0;
    GunMan gunman = new GunMan(100,300,100,500); 
    Wave[] waveSet = makeWaveSet(2);
    
    
    Image  img1 = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/bg.jpg").getImage();
    Image  gm = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/gm.PNG").getImage();
    Image  ev = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/ev.PNG").getImage();
    Image  over = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/over.PNG").getImage();
    Image  bomb = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/bomb.PNG").getImage();
    Image  bar = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/bar.PNG").getImage();
    Image  bar2 = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/bar2.PNG").getImage();
    Image  win = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/win.PNG").getImage();
    Image  gift = new ImageIcon("/Users/lookpeartayida/NetBeansProjects/Game/src/main/img/gift.PNG").getImage();
    
    public JTextField jtfScreen;
    long lastPress = 0;
    
    public Game(){
       this.setBounds(0, 0, 1000, 600);
       this.setFocusable(true);
       this.setLayout(null);
       this.addKeyListener(this);
    }
    
                
    @Override
    public void paint(Graphics g){
        
        
        super.paint(g);
        Graphics2D g2d = (Graphics2D)g;
        Graphics2D st =  (Graphics2D) g ;
        
        g.drawImage(img1,0,0,getWidth(),getHeight(),this);
        
        g.drawImage(gm,gunman.x, gunman.y, gunman.gunmanSize,200,this);
        g2d.setColor(Color.black);
        g2d.drawString("HP ", 60, 26);
        
      
        
        
        for(Wave wave : waveSet){
            //Walk
            
            if(gunman.health > 0 && lv<350){
                g.drawImage(bar,290,100,400,100,this);
                g.drawImage(ev,wave.x,300,gunman.gunmanSize,200,this);
                
                g2d.fillRect(100, 10, gunman.health, 20);
                g2d.setColor(Color.green);
                
                
            
            }
            //Win
            if(gunman.health > 0 && lv==350){
                g.drawImage(ev,0,0,0,0,this);
                g.drawImage(win,300,200,500,200,this);
                g.drawImage(gift,400,250,200,200,this);
                
            }
            
            //GameOver
            if(gunman.health <= 0){
            g.drawImage(ev,0,0,0,0,this);
            g.drawImage(over,300,200,500,200,this);
            

            }
            if(Event.checkHit(gunman, wave)){//static method
              gunman.health -=0.05;
              this.repaint();
              g2d.setColor(Color.red);
              g2d.fillRect(100, 10,gunman.health, 20);
              g2d.setColor(Color.red);
               
            
            }
            
           
        
        }
        
        g.drawImage(bar2,290+lv,100,60,60,this);  
        if(gunman.health > 0 && lv<350 && t%50==0){
                lv+=10; 
                this.repaint();
                g.drawImage(bar2,290+lv,100,60,60,this); 
        }
          t++;
        
    }
   
    
    private Wave[] makeWaveSet(int waveNumber){ //สร้างเวฟ
        if(gunman.health <= 0){
                waveNumber=0;
            }
        
        Wave[] waveSet = new Wave[waveNumber];
        int s=0;
        for(int i=0;i<waveNumber;i++){                  //ค่าสุ่ม
            double waveLocation = 1000+Math.floor(Math.random()*1000);
            s++;
            waveSet[i]= new Wave((int)waveLocation,430,gunman.gunmanSize,200,20+s,this);

        }
        
            
           
       return waveSet;
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(System.currentTimeMillis()-lastPress>400){
                System.out.println(e.getKeyCode());
            if(e.getKeyCode()==38||e.getKeyCode()==32){
                gunman.jump(this);
                this.repaint();
            
        } lastPress= System.currentTimeMillis();
        if(e.getKeyCode()==38||e.getKeyCode()==32 || gunman.health<=0){
                Game g = new Game();

            
        } 
        }
        
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    private PopupMenu ImagePanel() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private void add(ImageIcon imageIcon) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
     
    
   
    
}


    



