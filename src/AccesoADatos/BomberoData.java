/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Bombero;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Juan
 */
public class BomberoData {
       private Connection con = null;
    
    public BomberoData() {

        con = Conexion.getConexion();

    }
    
    public void guardarBombero(Bombero bombero){
    
    String sql = "INSERT INTO bombero(dni,nombre_ape, fecha_nac, celular, cod_brigada, grupo_sanguineo, estado) VALUES (?,?,?,?,?,?,?)";
           try {
               PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);
               // ps.setInt(1, alumno.getDni());    ps.setDate(4, Date.valueOf(alumno.getFechaNacimento()));
               //
               ps.setString(1, bombero.getDni());
               ps.setString(2, bombero.getNombreApe());
               ps.setDate(3, Date.valueOf(bombero.getFechaNac()));
               ps.setString(4, bombero.getCelular());
               ps.setInt(5, bombero.getCodBrigada());
               ps.setString(6, bombero.getGrupoSanguineo());
               ps.setBoolean(7, bombero.isEstado());
               ps.executeUpdate();
               ResultSet rs = ps.getGeneratedKeys();
               if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Bombero añadido con exito.");
            }
            ps.close();
           } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "No se pudo añadir el bombero.");
           }
    }
}
