/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dominio;

import java.sql.Date;
import java.sql.Timestamp;
import java.time.LocalDateTime;

/**
 *
 * @author Alumno Mañana
 */
public class Usuario {
    private String usuario;
    private String clave;
    private Timestamp fechaAlt;
    private String nombre;
    private String apellido;
    private String direccion;
    private Date fechaNac;

    public Usuario() {
    }

    public Usuario(String usuario, String clave) {
        this.usuario = usuario;
        this.clave = clave;
        this.fechaAlt = Timestamp.valueOf(LocalDateTime.now());
    }

    
    
    public Usuario(String usuario, String clave, String nombre, String apellido, String direccion, Date fechaNac) {
        
        this.usuario = usuario;
        this.clave = clave;
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
        this.fechaNac = fechaNac;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Timestamp getFechaAlt() {
        return fechaAlt;
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
        return "Usuario{" + "usuario=" + usuario + ", clave=" + clave + ", fechaAlt=" 
                + fechaAlt + ", nombre=" + nombre + ", apellido=" + apellido 
                + ", direccion=" + direccion + ", fechaNac=" + fechaNac + '}';
    }
    
    public String escribir() {
        return '%' + '*' + usuario + '*' + clave + '*' + fechaAlt + '*' + nombre
                + '*' + apellido + '*' + '*' + direccion + '*' + '*' + fechaNac + '*' ;
    }
    
    
}
