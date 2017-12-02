
package firmware;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import software.BiosCheck;
/**
 *
 * @author ghoul
 */
import software.SO1;
public class SO1start {
    
    SO1 so1 = new SO1();
    
    /**
     * Método que inicia o sistema 1
     */
    public void start(){
    
        /**
         * mostra mensagem indicando que o software selecionado
         * será inicializado
         */
        JOptionPane.showMessageDialog(null, "Starting SO 1");
        
        /**
         * executa um delay de valor '1000'
         */
        try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BiosCheck.class.getName()).log(Level.SEVERE, null, ex);
            }
        
        /**
         * após o delay o 'SO1' fica visível
         */
        so1.setVisible(true);
        
    }
        
    
    
}
