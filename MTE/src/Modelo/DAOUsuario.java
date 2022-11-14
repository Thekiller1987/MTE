/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.util.*;

/**
 *
 * @author abira
 */
public class DAOUsuario {
    
    public Usuario Insertar (String nomb1, String nomb2, String apell1, String apell2, String numcelu, String direc) {
        String transaccion = "INSERT INTO VENDEDORES VALUES('"
                + nomb1 + "', '"
                + nomb2 + "', '"
                + apell1 + "', '"
                + apell2 + "', '"
                + direc + "', '"
                + numcelu + "')";
        
        if (new DataBase().Actualizar(transaccion) > 0){
            return new Usuario(nomb1, nomb2, apell1, apell2, numcelu, direc);
        }
        return null;
  }
    public List ObtenerDatos(){
        String transaccion = "SELECT * FROM VENDEDORES";
        List<Map> registros = new DataBase().Listar(transaccion);        
        List<Usuario> usuario = new ArrayList();
        
        for (Map registro : registros) {
            Usuario usuari = new Usuario ((int)registro.get("ID_empleado"),
                    (String) registro.get("nomb1"),
                    (String) registro.get("nomb2"),
                    (String) registro.get("apell1"),
                    (String) registro.get("apell2"),
                    (String) registro.get("direc"),
                    (String) registro.get("numcelu"));
            usuario.add(usuari);
                    
        }
        return usuario;
    }
}
