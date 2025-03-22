package com.tienda.dao;

import com.tienda.domain.Categoria;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface CategoriaDao extends JpaRepository <Categoria,Long>{
    
    //Obtener cantidad de productos por categoria
    @Query("SELECT c.descripcion, COUNT(p) FROM Categoria c LEFT JOIN c.productos p GROUP BY c.descripcion")
    List<Object[]> obtenerCantidadProductosPorCategoria();
}
