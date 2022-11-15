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
public class DAOInvertario {
     public Inventario Inventario(String nombre, String marca, String modelo, String garant, String orig, String stock, String descrip, String precio) {
            String transaccion = "INSERT INTO INVENTARIO VALUES('"
                + nombre + "', '"
                + marca + "', '"
                + modelo + "', '"
                + garant + "', '"
                + orig + "', '"
                + stock + "', '"
                + descrip + "', '"
                + precio + "') ";
            
        if (new DataBase().Actualizar(transaccion) > 0) {
            return Inventario(nombre, marca, modelo, garant, orig, stock, descrip, precio);
        }
        return null;
     }
     public List ObtenerDatos() {
         
         String transaccion = "SELECT *FROM PRODUCTOS";
         //Llama al metodo listar de la DataBase.java
         
         List<Map> registros = new DataBase().Listar(transaccion);
         List<Inventario> inventari = new ArrayList();
         for (Map registro : registros) {
             
             Inventario ive = new Inventario ((int) registro.get("ID_prod"),
                     (String) registro.get("nombre"),
                    (String) registro.get("marca"),
                    (String) registro.get("modelo"),
                    (String) registro.get("garant"),
                    (String) registro.get("orig"),
                    (String) registro.get("stock"),
                    (String) registro.get("direc"));
             inventari.add(ive);
         }
         return inventari;//retorna todos los productos ubicados  en la tabla de la BD
     }
}
