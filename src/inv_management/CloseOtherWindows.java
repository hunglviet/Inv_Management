/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inv_management;

import java.awt.Window;

/**
 *
 * @author lvhung
 */
public class CloseOtherWindows {

    public void closeWin() {
        Window win[] = java.awt.Window.getWindows();
        //
        for (int i = 0; i < win.length; i++) { //i=0 - dong het cac cua so dang mo; i=1 - dong các cua so dang mo, tru cua so mo dau tien
            win[i].dispose();
            win[i] = null;
        }
    
    }

}
