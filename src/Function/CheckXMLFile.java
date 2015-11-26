/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.io.File;

/**
 *
 * @author MINHPHUONG
 */
public class CheckXMLFile {
    String pathFile;
    
    public CheckXMLFile(String pathFile)
    {
        this.pathFile = pathFile;
    }
    
    public boolean CheckFile()
    {
        File file = new File(pathFile);
        if(!file.exists())
        {
            return false;
        }
        else return true;
    }
}
