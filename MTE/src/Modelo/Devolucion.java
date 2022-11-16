/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author Elieth
 */
public class Devolucion {
    
private int ID_devoluciones;
    private String descrip;
    private String fecha;
    private int ID_prod;
    
    public Devolucion(int ID_devoluciones, String descrip, String fecha, int ID_prod) {
        this.ID_devoluciones = ID_devoluciones;
        this.descrip = descrip;
        this.fecha = fecha;
        this.ID_prod = ID_prod;
    }

    public Devolucion(String descrip, String fecha, int ID_prod) {
        this.descrip = descrip;
        this.fecha = fecha;
        this.ID_prod = ID_prod;
    }

    public int getID_devoluciones() {
        return ID_devoluciones;
    }

    public void setID_devoluciones(int ID_devoluciones) {
        this.ID_devoluciones = ID_devoluciones;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getID_prod() {
        return ID_prod;
    }

    public void setID_prod(int ID_prod) {
        this.ID_prod = ID_prod;
    }
    
}
