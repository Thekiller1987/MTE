/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Elieth
 */
public class DAODevoluciones {
    public Devolucion Insertar(int ID_devoluciones, String descrip, String fecha, int ID_prod) {
String transaccion = "INSERT INTO DEVOLUCIONES VALUES('"
        + ID_devoluciones + ", "
        + descrip + ", "
        + fecha + ", "
        + ID_prod + ", )";

if (new DataBase().Actualizar(transaccion) > 0) {
    return new Devolucion(ID_devoluciones, descrip, fecha, ID_prod);
    
}
return null;
    }
    public int Actualizar (int ID_devoluciones, String descrip, String fecha, int ID_prod) {
        String transaccion = "UPDATE DEVOLUCIONES SET descrip='"
        + descrip + "', fecha= '"  
        + fecha + "' WHERE ID_prod= "
        + ID_prod  ;
        return new DataBase().Actualizar(transaccion);
    }
    public List obtenerDatos(){
    String transaccion = "SELECT * FROM DEVOLUCIONES";
     List<Map> registros = new DataBase().Listar(transaccion);
    List<Devolucion> devol = new ArrayList();
    
    for(Map registro : registros) {
        Devolucion aut = new Devolucion ((int) registro.get("ID_devoluciones"),
        (String) registro.get("descrip"),
        (String) registro.get("fecha"),
        (int) registro.get("IDprod"));
        devol.add(aut);
    }
    return devol;
    }
    public int Eliminar(int ID_devoluciones) {
        String transaccion = "DELETE FROM DEVOLUCIONES ID_devoluciones='"+ID_devoluciones +"'";
        return new DataBase().Actualizar(transaccion);
    
    }
}
