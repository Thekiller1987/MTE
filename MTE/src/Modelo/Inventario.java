/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Elieth
 */
public class Inventario {

    public Inventario(int ID_prod, String nombre, String marca, String modelo, String garant, String orig, String stock, String descrip, String precio) {
        this.ID_prod = ID_prod;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.garant = garant;
        this.orig = orig;
        this.stock = stock;
        this.descrip = descrip;
        this.precio = precio;
    }

    public Inventario(String nombre, String marca, String modelo, String garant, String orig, String stock, String descrip) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.garant = garant;
        this.orig = orig;
        this.stock = stock;
        this.descrip = descrip;
    }

    Inventario(int i, String string, String string0, String string1, String string2, String string3, String string4, String string5) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public int getID_prod() {
        return ID_prod;
    }

    public void setID_prod(int ID_prod) {
        this.ID_prod = ID_prod;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getGarant() {
        return garant;
    }

    public void setGarant(String garant) {
        this.garant = garant;
    }

    public String getOrig() {
        return orig;
    }

    public void setOrig(String orig) {
        this.orig = orig;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getPrecio() {
        return precio;
    }

    public void setPrecio(String precio) {
        this.precio = precio;
    }

    private int ID_prod;
    private String nombre;
    private String marca;
    private String modelo;
    private String garant;
    private String orig;
    private String stock;
    private String descrip;
    private String precio;
    
}