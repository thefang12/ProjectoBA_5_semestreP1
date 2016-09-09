/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbasesav_p1;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AdrianPineda
 */
public class Conectar {
    Connection con=null;
    public Connection conexion(){
        
        try{
        
            Class.forName("com.mysql.jdbc.Driver");
            con= DriverManager.getConnection("jdbc:mysql:localhost://localhost/modeloott", "root", "");
           
            
        } catch (ClassNotFoundException | SQLException e){
            System.out.println("conexion establecida");
            JOptionPane.showMessageDialog(null, "error de conexion"+e);
        }
        
        return con; 
    }
    
    
    
}
