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
    private int idConcurso = 0;
    private String Descripcion, Fecha, Tiempo;

    public int getIdConcurso() {
        return idConcurso;
    }

    public String getDescripcion() {
        return Descripcion;
    }


    public String getFecha() {
        return Fecha;
    }

    public String getTiempo() {
        return Tiempo;
    }

    public void setIdConcurso(int idConcurso) {
        this.idConcurso = idConcurso;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setFecha(String Fecha) {
        this.Fecha = Fecha;
    }

    public void setTiempo(String Tiempo) {
        this.Tiempo = Tiempo;
    }

}
