/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3.upb;

import java.util.Date;


/**
 *
 * @author user
 */
public class FacturaLibreria {
    private int id_factura;
    private Date fecha_compra;
    private Articulo[] articulo;

    public FacturaLibreria(int id_factura, Articulo[] articulo, Date fecha_compra){
        this.id_factura = id_factura;
        this.articulo = articulo;
        this.fecha_compra = fecha_compra;
    }
    public double totalLibreria(){
        double suma = 0;
        Articulo xl[] =getArticulo();
        for (Articulo xl1 : xl) {
            if (xl1.tipo_articulo.equals("Libro")) {
                suma = suma+40000;
                if (xl1.getColor_etiqueta().equals("Amarilla")) {
                    suma=suma+5000;
                } else if (xl1.getColor_etiqueta().equals("Roja")) {
                    suma=suma+10000;
                }
            } else if (xl1.tipo_articulo.equals("Revista")) {
                suma = suma+20000;
                if (xl1.getColor_etiqueta().equals("Amarilla")) {
                    suma=suma+5000;
                } else if (xl1.getColor_etiqueta().equals("Roja")) {
                    suma=suma+10000;
                } 
            }
        }
        
        return suma;
    }
    public FacturaLibreria(){
        
    }

    public int getId_factura() {
        return id_factura;
    }

    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    public Date getFecha_compra() {
        return fecha_compra;
    }

    public void setFecha_compra(Date fecha_compra) {
        this.fecha_compra = fecha_compra;
    }

    private Articulo[] getArticulo() {
        return articulo;
    }

    private void setArticulo(Articulo[] articulo) {
        this.articulo = articulo;
    }

}

