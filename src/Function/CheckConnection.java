/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Function;

import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author MINHPHUONG
 */
public class CheckConnection {
    private Connection conn;
    private String pathxml;
    
    public CheckConnection()
    {
        this.pathxml = "connection.xml";
    }

    public Connection getConn() {
        return conn;
    }

    public String getPathxml() {
        return pathxml;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public void setPathxml(String pathxml) {
        this.pathxml = pathxml;
    }
    
    public boolean checkFile()
    {
        File file = new File(pathxml);
        if(file.exists())
        {
            return true;
        }
        else return false;
    }
    
    public void ConnectDB(String url[]) throws SQLException
    {
        String stringConnect ="jdbc:sqlserver://";
        stringConnect +=""+url[0]+":"+url[1]+";databaseName="+url[2];
        conn = DriverManager.getConnection(stringConnect,url[3],url[4]);
    }
    
    //neu nhap tu jframe su dung phuong thuc nay ket noi va ghi du lieu vao file
    public void ConnectDB(String host, String port, String DBName, String usr, String pwd) throws SQLException
    {
        try{
        String stringConnect = "jdbc:sqlserver://"+host+":"+port+";databaseName="+DBName;
        
        conn = DriverManager.getConnection(stringConnect,usr,pwd);
        
        //kiem tra ket noi
        if(conn!= null)
        {
            //ket noi thanh cong
            //luu thong tin vao file xml
            WriteXMLFile wXmlFile = new WriteXMLFile();
            
            //kiem tra file co ton tai chua
            if(checkFile())
            {
                //neu da ton tai file xml ghi thong tin moi vao file
                String[] str = new String[5];
                str[0] = host;
                str[1] = port;
                str[2] = DBName;
                str[3] = usr;
                str[4] = pwd;
                
                wXmlFile.ModifyXML(str);//ghi thong tin moi vao file xml thanh cong
            }
            else{
                //chua co file xml
                //tao file xml moi va ghi thong tin vao
                wXmlFile.WriteFile(host,port,DBName,usr,pwd);
            }
        }
        }
        catch(Exception ex){System.out.println(""+ex.toString());}
    }
}
