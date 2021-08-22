/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto3.upb;

/**
 *
 * @author user
 */
public class Libro extends Articulo {
  private String genero;
  private String autor;
  public Libro(int id_articulo, String nombre, String color_etiqueta, String tipo_articulo, String genero, String autor){
      super(id_articulo, nombre, color_etiqueta);
      this.tipo_articulo = tipo_articulo;
      this.genero = genero;
      this.autor = autor;
  }

    public Libro(String genero, String autor) {
        this.genero = genero;
        this.autor = autor;
    }
    public Libro(){
        
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    
  
}
