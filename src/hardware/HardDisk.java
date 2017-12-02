/**
     * Project developed by: joa
     * 11/22/2017
     */

//second created
package hardware;

/**
 * Sem esta classe o sistema de bios reconhecerá esse hardware como
 * inexistente, logo seu valor não será levado até as variáveis da
 * classe "Bios" do pacote hardware que por sua vez não permitirá
 * que o sistema seja incializado.
    */
public class HardDisk {
    
    /*variável que receberá o valor incial do estado do HDD
      Na classe "BiosCheck" no pacote software
    */
    public boolean state;

    
    //Getters and Setters
    public boolean getState() {
        return state;
    }

    public void setState(boolean state) {
        this.state = state;
    }

}
