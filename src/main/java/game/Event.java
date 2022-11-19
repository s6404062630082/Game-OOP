/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package game;

import java.awt.Image;

/**
 *
 * @author lookpeartayida
 */
public class Event {
    public static boolean checkHit(GunMan gunman, Wave wave){
             //ริมขวาสุด                 
       if(gunman.x+gunman.gunmanSize > wave.x && gunman.x < wave.x){
             //ริมซ้ายสุด
          if(gunman.y+gunman.gunmanSize >= wave.y-wave.height){
              return true;
          }
       } 
       return false;
    }

    static boolean checkHit(Image gunman, Wave wave) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

   
}
