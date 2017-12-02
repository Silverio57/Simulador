/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package software;
import hardware.HardDisk;
/**
 *
 * @author ghoul
 */
public class teste {
    public static void main(String[]args){
        
        HardDisk hd = new HardDisk();
        
        System.out.println(hd.getState());
        
        hd.setState(true);
        
        System.out.println(hd.getState());
           
    }
}
