
package com.tienda.domain;

import jakarta.persistence.*;
import lombok.Data;
import java.io.Serializable;

@Data

@Table(Name="Categoria")
public class Categoria implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Columna(name="id_categoria")
    private long idCategoria;
    private String descripcion;
    @Columna(name="ruta_imagen")
    private String rutaImagen;
    private boolean activo;
  
    public Categoria(){
    }
    
    public Categoria(String descripcion,boolean activo){
        this.descripcion = descriipcion;
        this.activo = activo;
    }
}
