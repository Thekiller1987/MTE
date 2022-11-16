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

    public Inventario(int ID_Prod, String nombre, String marca, String modelo, String decrip, String garant, String presio, String stock) {
        this.ID_Prod = ID_Prod;
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.decrip = decrip;
        this.garant = garant;
        this.presio = presio;
        this.stock = stock;
    }

    public Inventario(String nombre, String marca, String modelo, String decrip, String garant, String presio, String stock) {
        this.nombre = nombre;
        this.marca = marca;
        this.modelo = modelo;
        this.decrip = decrip;
        this.garant = garant;
        this.presio = presio;
        this.stock = stock;
    }

    public int getID_Prod() {
        return ID_Prod;
    }

    public void setID_Prod(int ID_Prod) {
        this.ID_Prod = ID_Prod;
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

    public String getDecrip() {
        return decrip;
    }

    public void setDecrip(String decrip) {
        this.decrip = decrip;
    }

    public String getGarant() {
        return garant;
    }

    public void setGarant(String garant) {
        this.garant = garant;
    }

    public String getPresio() {
        return presio;
    }

    public void setPresio(String presio) {
        this.presio = presio;
    }

    public String getStock() {
        return stock;
    }

    public void setStock(String stock) {
        this.stock = stock;
    }
    private int ID_Prod;
    private String nombre;
    private String marca;
        private String modelo;
        private String decrip;
        private String garant;
        private String presio;
        private String stock;
        
    
}
