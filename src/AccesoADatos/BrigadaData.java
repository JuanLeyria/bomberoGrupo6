/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernan
 */
public class BrigadaData {    
    private Connection con = null;
    
    public BrigadaData() {
       con = Conexion.getConexion();
    }
    
    public void guardarBrigada(Brigada brigada){    
    String sql = "INSERT INTO brigada(nombre_br, especialidad, libre, nro_cuartel, estado) VALUES (?,?,?,?,?)";
           try {
               PreparedStatement ps = con.prepareStatement(sql,Statement.RETURN_GENERATED_KEYS);               
               ps.setString(1, brigada.getNombre());
               ps.setString(2, brigada.getEspecialidad());
               ps.setBoolean(3, brigada.isLibre());                
               ps.setInt(4, brigada.getCuartel().getCodCuartel());           
               ps.setBoolean(5, brigada.isEstado());
               ps.executeUpdate();
               ResultSet rs = ps.getGeneratedKeys();
               if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Brigada creada con exito.");
            }
            ps.close();
           } catch (SQLException ex) {
                 JOptionPane.showMessageDialog(null, "No se pudo crear la brigada.");
           }
    }
    
     public Brigada buscarBrigada(int id){            
            Brigada br= new Brigada();
            Cuartel cuartel =new Cuartel();
           try {               
               String query= "SELECT * FROM brigada WHERE cod_brigada=?";
               PreparedStatement ps = con.prepareStatement(query);
               ps.setInt(1, id);
               ResultSet rs= ps.executeQuery();
               if(rs.next()){                    
                   br.setCodigo(id);
                   br.setNombre(rs.getString("nombre_br"));
                   br.setEspecialidad(rs.getString("especialidad"));
                   br.setLibre(rs.getBoolean("libre"));
                   cuartel.setCodCuartel(rs.getInt("nro_cuartel"));
                   br.setCuartel(cuartel);                   
                   br.setLibre(rs.getBoolean("estado"));                       
                   JOptionPane.showMessageDialog(null, "Bombero encontrado.");
               }else{
                   JOptionPane.showMessageDialog(null, "No se encontro al bombero con el id:"+id);
                }                 
               ps.close();  
           } catch (SQLException ex) {
               JOptionPane.showMessageDialog(null, "No se encontro al bombero.");
           }
        return br;
    }
    
}
