/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ceep.proyectobiblioteca;

import Dominio.Autor;
import Dominio.AutorDao;
import ManejoArchivos.ManejoDeArchivos;
import java.sql.Date;
import java.sql.SQLException;
import java.util.List;

/**
 *
 * @author Maximo
 */
public class TesrMain {

    /**
     * @param args the command line arguments
     */
    
    
    
    public static AutorDao autorDao = new AutorDao();
    
    public static List <Autor> autores(){
        List <Autor> aut = null;
        try{
            List <Autor> persona = autorDao.seleccionar();
            aut = persona;
//            personas.forEach(persona->{
//                System.out.println("persona = "+persona); 
//            });
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
        return aut;
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Date date = new Date(70,4,5);
        Autor autor = new Autor("Patrick","Rothfuss","EEUU",date);
//        
//        
//        autorDao.actualizar(autor);

        Date date1 = new Date(98,6,28);
        Autor autor1 = new Autor("Máximo","Mestriner","España",date1);
        autorDao.insertar(autor1);
        autorDao.insertar(autor);
 
        //Recorro el List de autores y añado a traves del id los autores en el archivp de texto

        for (int i = 1; i <= autores().size(); i++) {
            ManejoDeArchivos.agregarArchivo("autores.txt",autor(i).escribir());
        }

        
        
    }
    
     public static Autor autor(int id){
        Autor nAutor = null;
        List <Autor> lista = autores();
        for (int i = 0; i < lista.size(); i++) {
            if (lista.get(i).getIdautor() == id){
                nAutor = lista.get(i);
            }
        }
            
        return nAutor;
    }
    
}
