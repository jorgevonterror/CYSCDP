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
    private int idConcurso = 0, HoraLimite = 0, MinutoLimite = 0;
    private String Descripcion, Año, Mes, Dia, IDConcursoStg;

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

    public String getAño() {
        return Año;
    }

    public String getMes() {
        return Mes;
    }

    public String getDia() {
        return Dia;
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

    public void setAño(String Año) {
        this.Año = Año;
    }

    public void setMes(String Mes) {
        this.Mes = Mes;
    }

    public void setDia(String Dia) {
        this.Dia = Dia;
    }

}
