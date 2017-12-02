/**Esta parte do código funciona como uma pequena linguagem de comandos,
  *aogo não passa de pequenas comparações entre o texto inserido e
  *comandos já salvos na memória*/
        
/**Esta parte será melhor implementada em seguida, para que atenda as
  *as expectativas de funciolidade e as exigências do trabalho*/
package firmware;



/**
 *
 * @author 20131064010223
 */
public class SO1language {
    
    
    
    public String screentxt ="";

    public String getScreentxt() {
        return screentxt;
    }

    public void setScreentxt(String screentxt) {
        this.screentxt = screentxt;
    }
    /**Responsável por receber os comando digitados e retornar*
     * textos para serem exibidos na TC a fim de realizar a interação
     * entre o usuário e a máquina.**/
    public void tc(){
    
        /** Comando que incializa o sistema virtual*/
        if(screentxt.equals("start")){
        
            screentxt ="system initialized";
        
        /** Comando que desliga o sistema virtual*/
        }else if(screentxt.equals("shutdown system")){
        
            screentxt ="shutingdown";
            
        /** Comando que indica erro no sistema virtual*/
        }else{
        
            screentxt ="invalid command";
            
        }
        
        
        
    }
    
}
