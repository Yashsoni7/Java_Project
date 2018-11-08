/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author viram
 */
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.DriverManager;

public class javaconnect {
    private static final String USERNAME="root";
    private static final String PASSWORD="";
    private static final String CONN_STRING="jdbc:mysql://localhost:3306/application1";
    
    Connection conn;
    public static Connection ConnecrDb(){
        try{
           
            Class.forName("com.mysql.cj.jdbc.Driver").newInstance();
                Connection conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            
            System.out.println("connected");
           
            return conn;
        }catch(Exception e){
            JOptionPane.showMessageDialog(null,e);
            return null;
        }
    }
}
