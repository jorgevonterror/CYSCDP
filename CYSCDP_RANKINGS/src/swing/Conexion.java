/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swing;

/**
 *
 * @author eduardogarcia
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexion {

    private Connection conexion;
    ResultSet rs = null;
    Statement statement = null;

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:8889/CYSCDP_BaseDeDatos", "root", "root"); //LA RUTA CAMBIA, YO LO HAGO EN MAC.
            //conexion = DriverManager.getConnection("jdbc:mysql://localhost/bd_elsolecito", "root", "root");
            if (conexion != null) {
                //JOptionPane.showMessageDialog(null, "Conectado");
                return true;
            } else {
                //JOptionPane.showMessageDialog(null, "NO Conectado");
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void desconectar() {
        try {
            this.conexion.close();
        } catch (Exception e) {
            System.err.println(e.getMessage());
        }
    }

    public boolean AltaPuntaje(DatosPuntajes mDatosPuntajes) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into Puntajes "
                    + "values (null,'" + mDatosPuntajes.getHoras() + ":" + mDatosPuntajes.getMinutos() + ":00',"
                    + "'" + mDatosPuntajes.getComplejidad() + "',"
                    + "'" + mDatosPuntajes.getConcursos_idConcursos()
                    + "'," + "'" + mDatosPuntajes.getEquipos_idEquipos() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean AltaParticipante(DatosParticipante mDatosParticipante) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into Participantes "
                    + "values (null,'" + mDatosParticipante.getNombreParticipante() + "',"
                    + "'" + mDatosParticipante.getCarrera() + "',"
                    + "'" + mDatosParticipante.getSemestre() + "',"
                    + "'" + mDatosParticipante.getEquipos_idEquipos() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean AltaConcurso(DatosConcurso mDatosConcurso) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
<<<<<<< HEAD
            consulta.execute("insert into Concursos "
                    + "values (null,'" + mDatosConcurso.getFecha() + "',"
                    + "'" + mDatosConcurso.getDescripcion() + "',"
                    + "'" + mDatosConcurso.getHoraLimite() + ":" + mDatosConcurso.getMinutoLimite() + ":00',"
                    + "');");
=======
            consulta.execute("insert into Concursos " +
                        "values (null,'" + mDatosConcurso.getFecha()+ "'," +
                        "'" + mDatosConcurso.getDescripcion()+ "'," +
                        "'" + mDatosConcurso.getTiempo()+"');");
>>>>>>> d5d65b37d64e55a761011f743ad625169ae8d48d
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean AltaEquipos(DatosEquipo mDatosEquipo) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("insert into Equipos "
                    + "values (null,'" + mDatosEquipo.getNombre() + "');");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean EliminarPuntajes(DatosPuntajes mDatosPuntajes) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from Puntajes "
                    + " where idPuntajes = " + mDatosPuntajes.idPuntajes + ";");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean EliminarConcurso(DatosConcurso mDatosConcurso) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
<<<<<<< HEAD
            consulta.execute("delete from Concursos "
                    + " where idConcursos = " + mDatosConcurso.idConcurso + ";");
=======
            consulta.execute("delete from Concursos " +
                        " where idConcursos = " + mDatosConcurso.getIdConcurso() + ";");
>>>>>>> d5d65b37d64e55a761011f743ad625169ae8d48d
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean ModificarParticipantes(DatosParticipante vParticipante, DatosParticipante nParticipante) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update Participantes set "
                    + "NombreParticipante = '" + nParticipante.getNombreParticipante() + "'," + "Carrera = '" + nParticipante.getCarrera()
                    + "',Semestre = " + nParticipante.getSemestre() + ", Equipos_idEquipos = " + nParticipante.getEquipos_idEquipos()
                    + " where id_Participantes = " + vParticipante.getIdParticipante() + ";");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
    }

    public ArrayList ConsultaNombresConcurso() {
        ArrayList mListaNombresConcurso = new ArrayList();
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Concursos;");
            while (resultado.next()) {
                mListaNombresConcurso.add(resultado.getString("Descripcion"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaNombresConcurso;
    }

    public ArrayList ConsultaNombresEquipos() {
        ArrayList mListaNombreEquipo = new ArrayList();
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Equipos;");
            while (resultado.next()) {
                mListaNombreEquipo.add(resultado.getString("NombreEquipo"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaNombreEquipo;
    }

    public int ConsultarIDConcursos(String NombreConcurso) {
        Statement consulta;
        ResultSet resultado;
        int IDConcurso = 0;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT idConcursos from Concursos where Descripcion = '" + NombreConcurso + "';");
            while (resultado.next()) {
                IDConcurso = resultado.getInt("idConcursos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return IDConcurso;
    }

    public int ConsultarIDEquipos(String NombreEquipo) {
        Statement consulta;
        ResultSet resultado;
        int IDEquipo = 0;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("SELECT idEquipos FROM Equipos WHERE NombreEquipo = '" + NombreEquipo + "';");
            while (resultado.next()) {
                IDEquipo = resultado.getInt("idEquipos");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return IDEquipo;
    }

    public ArrayList ConsultarIDPuntajes(int idConcurso, int idEquipo) {
        ArrayList mListaPuntajes = new ArrayList();

        DatosPuntajes mDatosPuntajes = null;
        Statement consulta;
        ResultSet resultado;
        String Datos;
        int IDEquipo = 0;

        try {
            consulta = conexion.createStatement();
            //SELECT idPuntajes FROM Puntajes WHERE Concursos_idConcursos = '1' and Equipos_idEquipos = '2'
            resultado = consulta.executeQuery("SELECT idPuntajes, Tiempo, Complejidad FROM Puntajes WHERE Concursos_idConcursos = '" + idConcurso + "' and Equipos_idEquipos = '" + idEquipo + "';");
            while (resultado.next()) {
                Datos = "";
                Datos = resultado.getString("Tiempo") + resultado.getString("Complejidad") + resultado.getString("idPuntajes");

                mListaPuntajes.add(Datos);
                //mListaPuntajesTiempo.add(resultado.getString("Complejidad"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaPuntajes;
    }
    
    public ArrayList consultarParticipantes() {
        DatosParticipante mParticipante = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaParticipantes = new ArrayList();

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Participantes;");
            while (resultado.next()) {
                mParticipante = new DatosParticipante();
                mParticipante.setIdParticipante(resultado.getInt("idParticipantes"));
                mParticipante.setNombreParticipante(resultado.getString("NombreParticipante"));
                mParticipante.setCarrera(resultado.getString("Carrera"));
                mParticipante.setSemestre(resultado.getInt("Semestre"));
                mParticipante.setEquipos_idEquipos(resultado.getInt("Equipos_idEquipos"));
                mListaParticipantes.add(mParticipante);

<<<<<<< HEAD
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaParticipantes;
    }
    
    public String ConsultaNombresEquipos(int ID) {
        String Nombre = "";
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Equipos where idEquipos = '"+ ID +"';");
            while (resultado.next()) {
                Nombre = resultado.getString("NombreEquipo");
=======
    public ArrayList ConsultarConcursos(){
        ArrayList mListaConcursos = new ArrayList();
        DatosConcurso mDatosConcurso=null;
        Statement consulta;
        ResultSet resultado;
        
        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Concursos;");
            while (resultado.next()) {
                mDatosConcurso = new DatosConcurso();
                mDatosConcurso.setIdConcurso(resultado.getInt("idConcursos"));
                mDatosConcurso.setFecha(resultado.getString("Fecha"));
                mDatosConcurso.setDescripcion(resultado.getString("Descripcion"));
                mDatosConcurso.setTiempo(resultado.getString("Tiempo_Limite"));
                mListaConcursos.add(mDatosConcurso);
>>>>>>> d5d65b37d64e55a761011f743ad625169ae8d48d
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
<<<<<<< HEAD
        return Nombre;
    }
=======
        return mListaConcursos;
    }  
>>>>>>> d5d65b37d64e55a761011f743ad625169ae8d48d
}
