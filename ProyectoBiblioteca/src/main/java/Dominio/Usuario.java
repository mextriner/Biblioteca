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
public class Usuario {
    private int idusuario;
    private String nombre;
    private String clave;
    private String apellido;
    private String direccion;
    private Date fechaNac;

    public Usuario(int idusuario, String nombre, String apellido, String direccion, Date fechaNac) {
        this.idusuario = idusuario;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }

    public Usuario() {
    }

    public Usuario(String nombre, String apellido, String direccion, Date fechaNac) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }
    
    

    public int getIdusuario() {
        return idusuario;
    }

    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    @Override
    public String toString() {
        return "Usuario{" + "idusuario=" + idusuario + ", nombre=" + nombre + ", apellido=" + apellido + ", direccion=" + direccion + ", fechaNac=" + fechaNac + '}';
    }
    
    
    public String escribir() {
        return '%' + '*' + idusuario + '*' + nombre + '*' + apellido + '*' + direccion + '*' + fechaNac + '*' ;
    }
    
    
}
