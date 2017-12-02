/**
     * Project developed by: 
     * 11/22/2017
     */
package software;
import hardware.CPU;
import hardware.HardDisk;
import hardware.RAM;
import java.awt.Color;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

    /**
     * Esta é a classe incial do projeto, ou seja, é a que deve ser executada 
     * primeiro, todas as outras classes visuais poderão ser acessadas a partir
     * desta
     */
public class BiosCheck extends javax.swing.JFrame {

    /**
     * Creates new form Screen
     */
    public BiosCheck() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        PcState = new javax.swing.JTextField();
        Bturn = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        BHDon = new javax.swing.JButton();
        BHDoff = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        RAMon = new javax.swing.JButton();
        CPUon = new javax.swing.JButton();
        CPUoff = new javax.swing.JButton();
        RAMoff = new javax.swing.JButton();
        ProgressHD = new javax.swing.JProgressBar();
        ProgressRAM = new javax.swing.JProgressBar();
        ProgressCPU = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        PcState.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PcStateActionPerformed(evt);
            }
        });

        Bturn.setText("Turn ON/OFF");
        Bturn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BturnActionPerformed(evt);
            }
        });

        jLabel1.setText("Hd State:");

        BHDon.setText("ON");
        BHDon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHDonActionPerformed(evt);
            }
        });

        BHDoff.setText("OFF");
        BHDoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BHDoffActionPerformed(evt);
            }
        });

        jLabel2.setText("Ram State");

        jLabel3.setText("CPU State");

        RAMon.setText("ON");
        RAMon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAMonActionPerformed(evt);
            }
        });

        CPUon.setText("ON");
        CPUon.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPUonActionPerformed(evt);
            }
        });

        CPUoff.setText("OFF");
        CPUoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CPUoffActionPerformed(evt);
            }
        });

        RAMoff.setText("OFF");
        RAMoff.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RAMoffActionPerformed(evt);
            }
        });

        ProgressHD.setForeground(new java.awt.Color(102, 255, 102));

        ProgressRAM.setForeground(new java.awt.Color(102, 255, 102));

        ProgressCPU.setForeground(new java.awt.Color(102, 255, 102));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Bturn)
                .addGap(160, 160, 160))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(PcState, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ProgressHD, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ProgressRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(BHDon, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(BHDoff, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(RAMoff)
                                    .addComponent(RAMon, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(60, 60, 60)
                                .addComponent(jLabel2)))
                        .addGap(48, 48, 48)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel3)
                            .addComponent(CPUoff, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(CPUon, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ProgressCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BHDon)
                    .addComponent(RAMon)
                    .addComponent(CPUon))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BHDoff)
                    .addComponent(CPUoff)
                    .addComponent(RAMoff))
                .addGap(11, 11, 11)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ProgressHD, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProgressRAM, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ProgressCPU, javax.swing.GroupLayout.PREFERRED_SIZE, 19, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(PcState, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(59, 59, 59)
                .addComponent(Bturn)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    /**
     * cria obejtos das classes do pacote "hardware"
     */
    public HardDisk hd = new HardDisk();
    public RAM ram = new RAM();
    public CPU cpu = new CPU();
    
    /**
     * cria obejto da classe GRUB do pacote "software"
     */
    public GRUB grub = new GRUB();
    private void BturnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BturnActionPerformed
        
        /**
        * checa se todas as opções básicas de hardware estão 'conectadas'
        */
        boolean a = hd.getState();
        boolean set=false;
        if((hd.getState()==true)&&(ram.getState()==true)&&(cpu.getState()==true)){
            
            /**
             * mostra mensagem de 'OK' e muda o estado da variavel "set"
             */
            PcState.setText("the hardware is OK!");
            set=true;
            JOptionPane.showMessageDialog(null, "Start SO");
            /**
             * muda o estado da classe "GRUB" para visível
             */
            grub.setVisible(true);
        }else if((hd.getState()==false)||(ram.getState()==false)||(cpu.getState()==false)){
            PcState.setText("The hardware is NOT OK!");
        }
        
        /**
         * caso a variavel tenha valor verdadeiro haverá um delay de valor '1000'
         */
        if(set==true){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(BiosCheck.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            /**
             * apos o delay esta janela tera o estado de 'invisivel'
             */
            this.setVisible(false);
        
        }
        
    }//GEN-LAST:event_BturnActionPerformed

    private void PcStateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PcStateActionPerformed
        /**
         * campo que tem a utilidade de mostrar mensagens ao usuário
         */
    }//GEN-LAST:event_PcStateActionPerformed

    private void BHDonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHDonActionPerformed
        /**
         * muda o valro da variável 'state' para verdadeiro
         */
        hd.setState(true);
        
        /**
         * muda o valor da barra de progresso (apenas efeito visual)
         */
        ProgressHD.setValue(100);
    }//GEN-LAST:event_BHDonActionPerformed

    private void BHDoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BHDoffActionPerformed
        /**
         * muda o valro da variável 'state' para falso
         */
        hd.setState(false);
        
        /**
         * muda o valor da barra de progresso (apenas efeito visual)
         */
        ProgressHD.setValue(0);
    }//GEN-LAST:event_BHDoffActionPerformed

    private void RAMonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAMonActionPerformed
        /**
         * muda o valor da variável 'state' para verdadeiro
         */
        ram.setState(true);
        
        /**
         * muda o valor da barra de progresso (apenas efeito visual)
         */
        ProgressRAM.setValue(100);
    }//GEN-LAST:event_RAMonActionPerformed

    private void CPUonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPUonActionPerformed
        /**
         * muda o valro da variável 'state' para verdadeiro
         */
        cpu.setState(true);
        
        /**
         * muda o valor da barra de progresso (apenas efeito visual)
         */
        ProgressCPU.setValue(100);
    }//GEN-LAST:event_CPUonActionPerformed

    private void CPUoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CPUoffActionPerformed
        /**
         * muda o valro da variável 'state' para falso
         */
        cpu.setState(false);
        
        /**
         * muda o valor da barra de progresso (apenas efeito visual)
         */
        ProgressCPU.setValue(0);
    }//GEN-LAST:event_CPUoffActionPerformed

    private void RAMoffActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RAMoffActionPerformed
        /**
         * muda o valro da variável 'state' para falso
         */
        ram.setState(false);
        
        /**
         * muda o valor da barra de progresso (apenas efeito visual)
         */
        ProgressRAM.setValue(0);
    }//GEN-LAST:event_RAMoffActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(BiosCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(BiosCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(BiosCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(BiosCheck.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BiosCheck().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton BHDoff;
    private javax.swing.JButton BHDon;
    private javax.swing.JButton Bturn;
    private javax.swing.JButton CPUoff;
    private javax.swing.JButton CPUon;
    private javax.swing.JTextField PcState;
    private javax.swing.JProgressBar ProgressCPU;
    private javax.swing.JProgressBar ProgressHD;
    private javax.swing.JProgressBar ProgressRAM;
    private javax.swing.JButton RAMoff;
    private javax.swing.JButton RAMon;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}