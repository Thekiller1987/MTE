/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Date;
import java.util.*;

/**
 *
 * @author Elieth
 */
public class DAOIventario {

    public Inventario Insertar(String nombre, String marca, String modelo, String decrip,
            String garant, String presio, String stock) {
        String transaccion = "INSERT INTO PRODUCTO VALUES('"
                + nombre + "', '"
                + marca + "', '"
                + modelo + "', '"
                + decrip + "', '"
                + garant + "', '"
                + presio + "', '"
                + stock + "') ";
        if (new DataBase().Actualizar(transaccion) > 0) {

            return new Inventario(nombre, marca, modelo, decrip, garant, presio, stock);
        }
        return null;
    }

    public List ObtenerDatos() {

        String transaccion = "SELECT * FROM PRODUCTO";
        List<Map> registros = new DataBase().Listar(transaccion);
        List<Inventario> ive = new ArrayList();
        for (Map registro : registros) {

            Inventario vn = new Inventario((int) registro.get("ID_prod"),
                    (String) registro.get("nombre"),
                    (String) registro.get("marca"),
                    (String) registro.get("modelo"), 
                    (String) registro.get("decrip"),
                    (String) registro.get("garant"), 
                    (String) registro.get("precio"),
                    (String) registro.get("stock"));
            ive.add(vn);
        }
        return ive;
    }

}
