/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
/**i
 *
 * @author Admin
 */
public class conexion {
    public static Connection getConexion(){
        String conexionUrl = "jdbc:sqlserver://localhost:1433;"
                +"database=DB_MTE;"
                +"user=sa;"
                +"password=1234";
        
        try{
           Connection con = DriverManager.getConnection(conexionUrl);
            return con;
        }catch(SQLException e){
            System.out.println(e.toString());
            return null; 
        }
    }
    
}
