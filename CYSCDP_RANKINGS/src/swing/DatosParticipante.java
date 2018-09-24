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
public class DatosParticipante {
    private int idParticipante = 0, Semestre = 0, Equipos_idEquipos = 0;
    private String NombreParticipante, Carrera;

    public int getIdParticipante() {
        return idParticipante;
    }

    public int getSemestre() {
        return Semestre;
    }

    public int getEquipos_idEquipos() {
        return Equipos_idEquipos;
    }

    public String getNombreParticipante() {
        return NombreParticipante;
    }

    public String getCarrera() {
        return Carrera;
    }
    
    public void setIdParticipante(int idParticipante) {
        this.idParticipante = idParticipante;
    }

    public void setSemestre(int Semestre) {
        this.Semestre = Semestre;
    }

    public void setEquipos_idEquipos(int Equipos_idEquipos) {
        this.Equipos_idEquipos = Equipos_idEquipos;
    }

    public void setNombreParticipante(String NombreParticipante) {
        this.NombreParticipante = NombreParticipante;
    }

    public void setCarrera(String Carrera) {
        this.Carrera = Carrera;
    }
    
    
}
