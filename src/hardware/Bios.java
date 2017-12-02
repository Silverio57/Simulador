/**
     * Project developed by: joa
     * 11/22/2017
     */

// first class created
package hardware;
import hardware.HardDisk;

public class Bios {
    
    
    HardDisk hd = new HardDisk();
    //Create the object hd
    
    //variáveis que serão utilizadas na checagem a classe "BiosCheck" mo pacote software
    public boolean checkRam;
    public boolean checkCPU;
    public boolean checkHD;

    
    //Getters and Setters
    public HardDisk getHd() {
        return hd;
    }

    public void setHd(HardDisk hd) {
        this.hd = hd;
    }

    public boolean getCheckRam() {
        return checkRam;
    }

    public void setCheckRam(boolean checkRam) {
        this.checkRam = checkRam;
    }

    public boolean getCheckCPU() {
        return checkCPU;
    }

    public void setCheckCPU(boolean checkCPU) {
        this.checkCPU = checkCPU;
    }

    public boolean getCheckHD() {
        return checkHD;
    }

    public void setCheckHD(boolean checkHD) {
        this.checkHD = checkHD;
    }

    
   
    
    
}
