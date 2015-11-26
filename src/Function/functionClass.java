/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author MINHPHUONG
 */
public class functionClass {
    
    DefaultTableModel model = null;
    //ResultSet rs = null;
    String table;
    String listColDB[] = null;
    String listColTable[] = null;
    String listDBType[] = null;
    String listColCon[] = null;
    String listDataCon[] = null;
    String listDTypeCon[] = null;
    String IDinfor[] = null;
    Connection conn = null;
    QueryGeneral QG;
    Display display;
    
    public functionClass(Connection conn, String table, String listColTable[], String listColDB[], String listDBType[])
    {
        this.conn = conn;
        this.table = table;
        this.listColTable = listColTable;
        this.listColDB = listColDB;
        this.listDBType = listDBType;
        QG = new QueryGeneral(table);
        display = new Display(listColDB);
    }
    
    public ResultSet getRS()
    {
        return QG.selectQuery();
    }
    
    public void disTable(ResultSet rs)
    {
        String result[][] = null;
        //result = display.getData(rs,listDBType);
        display.displayTable(result, listColTable);
    }
    
    public void disDetail()
    {
        //
    }
    
    public void searchID(String columName, String name) throws SQLException
    {
        String stemp = null;
        stemp = QG.getID(columName, name);
        IDinfor = display.checkID(stemp);
        
    }
    
    public void updateInfor(String information[], String colCon[], String conDType[], String conInfor[])
    {
        this.listColCon = colCon;
        this.listDTypeCon = conDType;
        this.listDataCon = conInfor;
        QG.updateQuery(listColDB, listDBType, information, listColCon, listDTypeCon, listDataCon);
    }
    
    public void inserInfor(String colName[], String colDType[], String colData[])
    {
        QG.insertQuery(colName, colDType, colData);
    }
}
