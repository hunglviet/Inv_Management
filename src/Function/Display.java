/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINHPHUONG
 * get data from result set pass to sData[][]
 * display data on jtable with row[][]
 * check data to display information detail
 * Create object
 *         Display obj = new Display(listCol[]);
 *          listCol[]: list column of ResultSet
 * copy data form ResultSet into sData[][]
 *          obj.getData(ResultSet rs, String dataType[]);
 *          dataType[]: list data type of ResultSet
 * display data on jtable
 *          obj.displayTable(sData[][],listCol[])
 *          lsitCol[]: list column of jtable
 * check ID of row is selected in jtable with sData to display information detail
 *          obj.checkID(ID);
 *          ID: ID get from jtable (jTable.getvalueAt(int row, int column)
 * after get data display on jpanel information detail         
 */
public class Display {
    
    //ArrayList<String> sDataRow; 
    String listCol[] = null;
    String row[][] = null;
    String sData[][];
    String inforDetail[];
   // private static ArrayList<ArrayList<String>> sData = new ArrayList<>();
  //  ArrayList<String> inforDetail = new ArrayList<>();
    
    /**
     * 
     * @param listCol list column of result set
     */
    public Display(String listCol[]){
        this.listCol = new String[2];
        this.listCol = listCol;
    }
    
    /**
     * 
     * @param rs - result set
     * @param dataType - list data type of result set
     * @return String[][]
     */
    public String[][] getData(ResultSet rs, String dataType[], int row, int col)
    {
        try {
            //String sData[][] = null;
            int i = 0;
            sData = new String[row][col];
            while(rs.next())
            {
                //sDataRow = new ArrayList<>();
                
                for (int j = 0; j < dataType.length; j++) {
                    if(dataType[j].equals("int"))
                    {
                        //sDataRow.add(""+rs.getString(""+listCol[j]));
                        
                        sData[i][j] = ""+rs.getInt(""+listCol[j]);
                    }
                    else if(dataType[j].equals("String"))
                    {
                        //sDataRow.add(""+rs.getString(""+listCol[j]));
                        sData[i][j] = ""+rs.getString(""+listCol[j]);
                    }
                    else if(dataType[j].equals("date"))
                    {
                       // sDataRow.add(""+rs.getString(""+listCol[j]));
                        sData[i][j] = ""+rs.getDate(""+listCol[j]);
                        //System.out.println(""+rs.getDate(""+listCol[j]));
                    }
                }
                //sData.add(sDataRow);
                i++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(Display.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sData;
    }
    
    /**
     * 
     * @param data - String data[][]: information (return of getData method)
     * @param listCol - list column of jtable
     * @return row[][] - display on jtable
     */
    public String[][] displayTable(String data[][],String listCol[])
    {
        int itemp[] = null;
        int flag = 0;
        
        //init itemp array value is position of list column
        for (int i = 0; i < this.listCol.length; i++) {
            if(this.listCol[i].equals(listCol[i]))
            {
                itemp[flag] = i;
                flag++;
            }
        }
        
        //init data for String[][]
        for (int i = 0; i < data.length; i++) {
            for (int j = 0; j < listCol.length; j++) {
                this.row[i][j] = data[i][itemp[j]];
            }
        }
        
        return this.row;
    }
    
    /**
     * 
     * @param ID - get from jtable
     * @return 
     */
    public String[] checkID(String ID)
    {
        int i = 0;
        for (; i < sData.length; i++) {
            if(sData[i][0].equals(ID))
            {
                break;
            }
        }
        this.inforDetail = sData[i];
        return this.inforDetail;
    }
}
