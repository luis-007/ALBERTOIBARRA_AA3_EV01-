package com.actividadspring.actividadspring.controllers;
import java.time.LocalDateTime;

public class ObtenerNombreAprendiz {

    private LocalDateTime fechaHoy;
    private String nombreAprendiz; 
    private String apellidoAprendiz;
    private int edadAprendiz;  // Cambiado a tipo int para representar la edad como un número entero
    
    public ObtenerNombreAprendiz(LocalDateTime fechaHoy, String nombreAprendiz, String apellidoAprendiz,
            int edadAprendiz) {
        this.fechaHoy = fechaHoy;
        this.nombreAprendiz = nombreAprendiz;
        this.apellidoAprendiz = apellidoAprendiz;
        this.edadAprendiz = edadAprendiz;
    }

    public ObtenerNombreAprendiz() {
    }

    public LocalDateTime getFechaHoy() {
        return fechaHoy;
    }

    public String getNombreAprendiz() {
        return nombreAprendiz;
    }

    public String getApellidoAprendiz() {
        return apellidoAprendiz;
    }

    public int getEdadAprendiz() {
        return edadAprendiz;
    }

    public void setFechaHoy(LocalDateTime fechaHoy) {
        this.fechaHoy = fechaHoy;
    }

    public void setNombreAprendiz(String nombreAprendiz) {
        this.nombreAprendiz = nombreAprendiz;
    }

    public void setApellidoAprendiz(String apellidoAprendiz) {
        this.apellidoAprendiz = apellidoAprendiz;
    }

    public void setEdadAprendiz(int edadAprendiz) {
        this.edadAprendiz = edadAprendiz;
    }

   

}
