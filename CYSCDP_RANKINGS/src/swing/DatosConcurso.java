/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author Cinthia
 */
public class DatosConcurso {
    public int idConcurso = 0, HoraLimite = 0, MinutoLimite = 0;
    public String Descripcion, Fecha;

    public int getIdConcurso() {
        return idConcurso;
    }

    public int getHoraLimite() {
        return HoraLimite;
    }

    public int getMinutoLimite() {
        return MinutoLimite;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public String getFecha() {
        return Fecha;
    }

    public void setIdConcurso(int idConcurso) {
        this.idConcurso = idConcurso;
    }

    public void setHoraLimite(int HoraLimite) {
        this.HoraLimite = HoraLimite;
    }

    public void setMinutoLimite(int MinutoLimite) {
        this.MinutoLimite = MinutoLimite;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }
    
    
}
