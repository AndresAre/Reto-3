/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3;


import java.time.LocalDate;
import java.time.ZoneId;
import reto3.upb.Articulo;
import reto3.upb.FacturaLibreria;
import reto3.upb.Libro;

/**
 *
 * @author user
 */
public class Reto3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro arrayArticulos[] = new Libro[3];
        LocalDate hoy = LocalDate.now();
        
        
        //date = java.util.Date.from(hoy.atStartOfDay(defaultZoneId).toInstant());
        ZoneId defaultZoneId = ZoneId.systemDefault();
        java.util.Date date = java.util.Date.from(hoy.atStartOfDay(defaultZoneId).toInstant());
        for(int i=0;i<arrayArticulos.length;i++){
            arrayArticulos[i] = new Libro(i, "ete","Roja","Libro","Comedia","Arenitas");
        }
        for(Libro arti: arrayArticulos){
            System.out.println(arti.getNombre());
            System.out.println(arti.getTipo_articulo());
            System.out.println("");
        }
        FacturaLibreria fl = new FacturaLibreria(0,arrayArticulos,date);
        double i=fl.totalLibreria();
        System.out.println("Total: "+i);
    }
    
}
