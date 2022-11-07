/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.sql.Date;

/**
 *
 * @author Alumno Mañana
 */
public class Autor {
    private int idautor;
    private String nombre;
    private String apellido;
    private String nacionalidad;
    private Date fechaNac;

    public Autor() {
    }

    public Autor(String nombre, String apellido, String nacionalidad, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNac = fechaNac;
    }

    
    
    public Autor(int idautor, String nombre, String apellido, String nacionalidad, Date fechaNac) {
        this.idautor = idautor;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacionalidad = nacionalidad;
        this.fechaNac = fechaNac;
    }

    public int getIdautor() {
        return idautor;
    }

    public void setIdautor(int idautor) {
        this.idautor = idautor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Autor{" + "idautor=" + idautor + ", nombre=" + nombre + ", apellido=" + apellido + ", nacionalidad=" + nacionalidad + ", fechaNac=" + fechaNac + '}';
    }
    
    public String escribir() {
        return '%' + '*' + idautor + '*' + nombre + '*' + apellido + '*' + nacionalidad + '*' + fechaNac + '*' ;
    }
    
    
    
}
