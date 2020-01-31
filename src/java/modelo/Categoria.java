/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Clases;

/**
 *
 * @author Rocío del Mar Mágica
 * id_Categoria
 * nombre_categoria
 * descripcion_categoria 
 */
public class Categoria {
    
    private int id_categoria;
    private String nombre_categoria;
    private String descripcion_categoria;

    public Categoria(int id_categoria, String nombre_categoria, String descripcion_categoria) {
        this.id_categoria = id_categoria;
        this.nombre_categoria = nombre_categoria;
        this.descripcion_categoria = descripcion_categoria;
    }

    public int getId_categoria() {
        return id_categoria;
    }

    public void setId_categoria(int id_categoria) throws  Exception 
    {
        if(id_categoria != 0)
        {
            this.id_categoria = id_categoria;
        }
        else
        {
            throw new Exception ("El id no puede estar vacío");
        }
        
    }

    public String getNombre_categoria() {
        return nombre_categoria;
    }

    public void setNombre_categoria(String nombre_categoria) throws Exception
    {
        if(nombre_categoria.trim().length()!=0)
        {
            this.nombre_categoria = nombre_categoria;
        }
        else
        {
            throw new Exception ("El nombre de la categoría no puede estar vacío");
        }
        
    }

    public String getDescripcion_categoria() {
        return descripcion_categoria;
    }

    public void setDescripcion_categoria(String descripcion_categoria)throws Exception
    {
        if(descripcion_categoria.trim().length()!=0)
        {
            this.descripcion_categoria = descripcion_categoria;
        }
        else
        {
            throw new Exception ("La descripción no puede estar vacía");
        }  
    }
    
    
}
