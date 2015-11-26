/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author MINHPHUONG
 */
public class Code {
    String ID="";
    public Code(String ID)
    {
        this.ID = ID;
    }
    
    public String createCode(String fileCode)
    {
        String temp="";
        String inputwrite="";
        
        int i,IDtemp;
        File file = new File(fileCode);
        if(!file.exists())
        {
            try {
                file.createNewFile();
                temp = "0";
            } catch (IOException ex) {
                Logger.getLogger(Code.class.getName()).log(Level.SEVERE, null, ex);
            }
            
        }
        try
        {
            FileInputStream fis =  new FileInputStream(file);
            while((i=fis.read())!=-1){
                temp += (char)i;
            }
        }
        catch(Exception ex){}
        
        for (int j = 0; j < (7-temp.length()); j++) {
            ID+="0";
        }
        
        IDtemp = Integer.parseInt(temp);
        IDtemp++;
        ID += ""+IDtemp;
        inputwrite = String.valueOf(IDtemp);
        try
        {
            FileOutputStream fos = new FileOutputStream(file);
            fos.write(inputwrite.getBytes(), 0,inputwrite.length());
        }
        catch(Exception ex){}
        return ID;
    }
    
    /**
     * 
     * @param rs is result set of count id in table
     * @param ID is first character ex: P- product, C- Customer...
     * @return new ID
     * 
     */
    public String createCode(ResultSet rs)
    {
        if(rs != null)
        {
            int itemp = 0;
            String stemp = "";
            try
            {
                while(rs.next())
                {
                    itemp = rs.getInt(1);
                    itemp+=1;
                    stemp += ""+itemp;
                    for (int i = 0; i < (7-stemp.length()); i++) {
                        ID+="0";
                    }
                    ID+=stemp;
                }

            }
            catch(Exception ex){System.out.println("create code: "+ex.toString());}
        }
        else ID+="0000001";
        return ID;
    }
}
