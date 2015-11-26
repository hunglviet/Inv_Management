/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv_management;

import javax.swing.JFrame;

/**
 *
 * @author lvhung
 */
public class Inv_Management {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        new frmSub().setVisible(true); //Goi form khoi tao du lieu
        
        //sET TITLE CHO TAT CA CAC FORM
        
        
        //Chon giao dien windows
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(frmChangePassword.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
    }
    
}
