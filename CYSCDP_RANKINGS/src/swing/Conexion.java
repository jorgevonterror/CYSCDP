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
}
