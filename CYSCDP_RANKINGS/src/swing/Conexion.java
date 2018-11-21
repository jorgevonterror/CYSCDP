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
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class Conexion {

    ArrayList mALPuertos = new ArrayList();
    //mALPuertos = mConexion.ConsultarIDPuntajes(IDConcursos2, IDEquipo2);
    
    private Connection conexion;
    ResultSet rs = null;
    Statement statement = null;
    private String Puerto = "";
    private String User = "";
    private String Pass = "";
    Home mHome = new Home();

    public boolean conectar() {
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:"+ mHome.Puerto +"/cyscdp_basededatos", ""+ mHome.User +"", ""+ mHome.Pass +""); //LA RUTA CAMBIA, YO LO HAGO EN MAC.
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
    
    public boolean conectarConPuerto(String puerto, String user, String pass) {
        Puerto = puerto;
        try {
            Class.forName("com.mysql.jdbc.Driver").newInstance();
            conexion = DriverManager.getConnection("jdbc:mysql://localhost:" + Puerto + "/cyscdp_basededatos", ""+ user +"", "" + pass + ""); //LA RUTA CAMBIA, YO LO HAGO EN MAC.
            if (conexion != null) {
                return true;
            } else {
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
            consulta.execute("insert into Concursos "
                    + "values (null,'" + mDatosConcurso.getFecha() + "',"
                    + "'" + mDatosConcurso.getDescripcion() + "',"
                    + "'" + mDatosConcurso.getTiempo() + "');");
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
            consulta.execute("delete from Concursos "
                    + " where idConcursos = " + mDatosConcurso.getIdConcurso() + ";");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean eliminarEquipo(DatosEquipo mEquipo) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from Equipos "
                    + " where idEquipos = " + mEquipo.getId() + ";");
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    public boolean eliminarParticipantes(DatosParticipante mParticipantes) {
        Statement consulta;

        try {
            consulta = conexion.createStatement();
            consulta.execute("delete from Participantes "
                    + " where idParticipantes = " + mParticipantes.getIdParticipante() + ";");
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
                    + " where idParticipantes = " + vParticipante.getIdParticipante() + ";");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
    }
    
    public boolean ModificarEquipo(DatosEquipo vEquipo, DatosEquipo nEquipo) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update Equipos set "
                    + "NombreEquipo = '" + nEquipo.getNombre() + "' "
                    + " where idEquipos = " + vEquipo.getId() + ";");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
    }
    
    public boolean ModificarConcurso(DatosConcurso mDatosConcurso, DatosConcurso nDatosConcurso) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update Concursos set "
                    + "Descripcion = '" + nDatosConcurso.getDescripcion()+ "', "
                    + "Fecha = '" + nDatosConcurso.getFecha()+ "', "
                    + "Tiempo_Limite = '" + nDatosConcurso.getTiempo()+ "' "
                    + " where idConcursos = " + mDatosConcurso.getIdConcurso()+ ";");
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
    
    public ArrayList ConsultaNombresEquiposPorConcurso(int Concurso) {
        ArrayList mListaNombreEquipo = new ArrayList();
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select NombreEquipo from Equipos,Puntajes where Puntajes.Concursos_idConcursos = '" + Concurso +"' and Puntajes.Equipos_idEquipos = Equipos.idEquipos GROUP by NombreEquipo;");
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
            resultado = consulta.executeQuery("SELECT idPuntajes, Tiempo, Complejidad FROM Puntajes WHERE Concursos_idConcursos = '" + idConcurso + "' and Equipos_idEquipos = '" + idEquipo + "' order by Complejidad ASC;");
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
    
    public ArrayList ConsultarIDPuntajes2(int idConcurso, int idEquipo) {
        ArrayList mListaPuntajes = new ArrayList();

        DatosPuntajes mDatosPuntajes = null;
        Statement consulta;
        ResultSet resultado;
        String Datos;
        int IDEquipo = 0;

        try {
            consulta = conexion.createStatement();
            //SELECT idPuntajes FROM Puntajes WHERE Concursos_idConcursos = '1' and Equipos_idEquipos = '2'
            resultado = consulta.executeQuery("SELECT Tiempo, Complejidad, NombreEquipo FROM Puntajes inner join "
                    + "Equipos ON Equipos.idEquipos = Puntajes.Equipos_idEquipos WHERE Concursos_idConcursos = '" + 
                    idConcurso + "' and Equipos_idEquipos = '" + idEquipo + "' order by Complejidad ASC;");
            while (resultado.next()) {
                Datos = "";
                Datos = resultado.getString("Tiempo") + resultado.getString("Complejidad") + resultado.getString("NombreEquipo");

                mListaPuntajes.add(Datos);
                //mListaPuntajesTiempo.add(resultado.getString("Complejidad"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaPuntajes;
    }

    public ArrayList ConsultarConcursos() {
        ArrayList mListaConcursos = new ArrayList();
        DatosConcurso mDatosConcurso = null;
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
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaConcursos;
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
            resultado = consulta.executeQuery("select * from Equipos where idEquipos = '" + ID + "';");
            while (resultado.next()) {
                Nombre = resultado.getString("NombreEquipo");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Nombre;
    }
    
    public String ConsultaNomEquipos(String nombre) {
        String Nombre = "";
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Equipos where NombreEquipo = '" + nombre + "';");
            while (resultado.next()) {
                Nombre = resultado.getString("NombreEquipo");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Nombre;
    }
    
    public String ConsultaNomConcursos(String nombre) {
        String Nombre = "";
        Statement consulta;
        ResultSet resultado;

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Concursos where Descripcion = '" + nombre + "';");
            while (resultado.next()) {
                Nombre = resultado.getString("Descripcion");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return Nombre;
    }

    public ArrayList consultarEquiposFiltro(String Busqueda) { //Se usará despues
        DatosEquipo mEquipo = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaEquipos = new ArrayList();

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Equipos where "
                    + "NombreEquipo like '%" + Busqueda + "%';");
            while (resultado.next()) {
                mEquipo = new DatosEquipo();
                mEquipo.setId(resultado.getInt("idEquipos"));
                mEquipo.setNombre(resultado.getString("NombreEquipo"));
                mListaEquipos.add(mEquipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaEquipos;
    }
    public ArrayList consultarParticipantesFiltro(String Busqueda) { //Se usará despues
        DatosParticipante mParticipante = null;

        Statement consulta;
        ResultSet resultado;
        ArrayList mListaParticipante = new ArrayList();
        ArrayList mListaEquipos = new ArrayList();

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Participantes where "
                    + "NombreParticipante like '%" + Busqueda + "%';");
            while (resultado.next()) {
                
                mParticipante = new DatosParticipante();
                mParticipante.setIdParticipante(resultado.getInt("idParticipantes"));
                mParticipante.setNombreParticipante(resultado.getString("NombreParticipante"));
                mParticipante.setCarrera(resultado.getString("Carrera"));
                mParticipante.setSemestre(resultado.getInt("Semestre"));
                mParticipante.setEquipos_idEquipos(resultado.getShort("Equipos_idEquipos"));
                mListaParticipante.add(mParticipante);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaParticipante;
    }
    public ArrayList consultarConcursoFiltro(String Busqueda) { //Se usará despues
        DatosConcurso mDatosConcurso = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaConcursos = new ArrayList();

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Concursos where "
                    + "Descripcion like '%" + Busqueda + "%';");
            while (resultado.next()) {
                mDatosConcurso = new DatosConcurso();
                mDatosConcurso.setIdConcurso(resultado.getInt("idConcursos"));
                mDatosConcurso.setDescripcion(resultado.getString("Descripcion"));
                mDatosConcurso.setFecha(resultado.getString("Fecha"));
                mDatosConcurso.setTiempo(resultado.getString("Tiempo_Limite"));
                mListaConcursos.add(mDatosConcurso);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaConcursos;
    }
    
    public ArrayList consultaEquipos() {
        DatosEquipo mEquipo = null;
        Statement consulta;
        ResultSet resultado;
        ArrayList mListaEquipos = new ArrayList();

        try {
            consulta = conexion.createStatement();
            resultado = consulta.executeQuery("select * from Equipos;");
            while (resultado.next()) {
                mEquipo = new DatosEquipo();
                mEquipo.setId(resultado.getInt("idEquipos"));
                mEquipo.setNombre(resultado.getString("NombreEquipo"));
                mListaEquipos.add(mEquipo);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaEquipos;
    }
    public boolean ModificarPauntajes(String Horas, String Minutos, String Complejidad, String idConcursos, String idEquipos, String idPuntajeM) {
        Statement consulta;
        try {
            consulta = conexion.createStatement();
            consulta.execute("update Puntajes set " +
                    "Tiempo = '" + Horas + ":" + Minutos + ":00', Complejidad = '" + Complejidad  +  "', Concursos_idConcursos = '" + idConcursos + "', Equipos_idEquipos = '"+ idEquipos + "'" + " where idPuntajes = " + idPuntajeM + ";");
            return true;
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Error " + e);
            return false;
        }
    }
    
    public ArrayList ConsultarTotalPuntajesPorConcurso(int idConcurso, int idConcurso1) {
        ArrayList mListaConcursantes = new ArrayList();

        Statement consulta;
        ResultSet resultado;
        String Datos;

        try {
            consulta = conexion.createStatement();
            //SELECT idPuntajes FROM Puntajes WHERE Concursos_idConcursos = '1' and Equipos_idEquipos = '2'
            resultado = consulta.executeQuery("SELECT Puntajes.Tiempo, Puntajes.Complejidad, Puntajes.Equipos_idEquipos from Puntajes, Concursos where Puntajes.Concursos_idConcursos = '" 
                    + idConcurso 
                    + "' and Concursos.idConcursos = '" + idConcurso1 + "';");
            while (resultado.next()) {
                Datos = "";
                Datos = resultado.getString("Tiempo") + resultado.getString("Complejidad") + resultado.getString("Equipos_idEquipos");

                mListaConcursantes.add(Datos);
                //mListaPuntajesTiempo.add(resultado.getString("Complejidad"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaConcursantes;
    }
    
    public ArrayList ConsultarIdConcursantes(int idConcurso, int idConcurso1) {
        ArrayList mListaConcursantes = new ArrayList();

        Statement consulta;
        ResultSet resultado;
        String Datos;

        try {
            consulta = conexion.createStatement();
            //SELECT idPuntajes FROM Puntajes WHERE Concursos_idConcursos = '1' and Equipos_idEquipos = '2'
            resultado = consulta.executeQuery("SELECT Puntajes.Equipos_idEquipos from Puntajes, Concursos where Puntajes.Concursos_idConcursos = '" 
                    + idConcurso 
                    + "' and Concursos.idConcursos = '" + idConcurso1 + "' GROUP by Puntajes.Equipos_idEquipos;");
            while (resultado.next()) {
                Datos = "";
                Datos = resultado.getString("Equipos_idEquipos");

                mListaConcursantes.add(Datos);
                //mListaPuntajesTiempo.add(resultado.getString("Complejidad"));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return mListaConcursantes;
    }
}
