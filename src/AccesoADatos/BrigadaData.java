/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Brigada;
import Entidades.Cuartel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernan
 */
public class BrigadaData {

    private Connection con = null;
    private CuartelData cd;

    public BrigadaData() {
        con = Conexion.getConexion();
        cd = new CuartelData();

    }

    public void guardarBrigada(Brigada brigada) {
        String sql = "INSERT INTO brigada(nombre_br, especialidad, libre, nro_cuartel, estado) VALUES (?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, brigada.getNombre());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCuartel().getCodigo());
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

    public Brigada buscarBrigada(int id) {
        Brigada br = new Brigada();
        Cuartel cuartel = new Cuartel();
        try {
            String query = "SELECT * FROM brigada WHERE cod_brigada=" + id;
            PreparedStatement ps = con.prepareStatement(query);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                br.setCodigo(id);
                br.setNombre(rs.getString("nombre_br"));
                br.setEspecialidad(rs.getString("especialidad"));
                br.setLibre(rs.getBoolean("libre"));
                br.setCuartel(cd.buscarCuartel(rs.getInt("nro_cuartel")));
                br.setLibre(rs.getBoolean("estado"));
            ///    JOptionPane.showMessageDialog(null, "Brigada encontrada.");
            } else {
                JOptionPane.showMessageDialog(null, "No se encontro la brigada con el id:" + id);
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al buscar la brigada.");
        }
        return br;
    }   

    public void modificarBrigada(Brigada brigada) {

        String sql = "UPDATE brigada SET nombre_br=?, especialidad=?, libre=?, nro_cuartel=?, estado=? WHERE cod_brigada=?";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, brigada.getNombre());
            ps.setString(2, brigada.getEspecialidad());
            ps.setBoolean(3, brigada.isLibre());
            ps.setInt(4, brigada.getCuartel().getCodigo());
            ps.setBoolean(5, brigada.isEstado());
            ps.setInt(6, brigada.getCodigo());
 
            int resultado = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Brigada modificado.");
            } else {
                JOptionPane.showMessageDialog(null, "La brigada no se pudo modificar.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al querer modificar la brigada");
        }
    }

    public ArrayList listarBrigada() {
        ArrayList<Brigada> brigadas = new ArrayList<>();
        try {
            String sql = "SELECT * FROM brigada";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            int cont = 0;
            while (rs.next()) {
                Brigada b = new Brigada();
                cont++;
                b.setCodigo(rs.getInt("cod_brigada"));
                b.setNombre(rs.getString("nombre_br"));
                b.setEspecialidad(rs.getString("especialidad"));
                b.setLibre(rs.getBoolean("libre"));
                b.setCuartel(cd.buscarCuartel(rs.getInt("nro_cuartel")));
                b.setEstado(rs.getBoolean("estado"));
                brigadas.add(b);
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ninguna brigada");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al querer listar las brigadas" + ex.getMessage());
        }
        return brigadas;
    }
    
    public ArrayList listarBrigadasPorCuartel(int idCuartel){
      ArrayList<Brigada> aux = listarBrigada();
       ArrayList<Brigada> brigadasPorCuartel= new ArrayList<>();
       
            for(Brigada brigada:aux){
             if (brigada.getCuartel().getCodigo()== idCuartel){
               
             brigadasPorCuartel.add(brigada);
             
             }
          }
    return  brigadasPorCuartel;
    }
    public ArrayList listarBrigadasLibres(){
      ArrayList<Brigada> aux = listarBrigada();
       ArrayList<Brigada> brigadasLibres= new ArrayList<>();
       
            for(Brigada brigada:aux){
             if (brigada.isLibre()){
               
             brigadasLibres.add(brigada);
             
             }
          }
    return  brigadasLibres;
    }
    public ArrayList listarBrigadasOcupadas(){
      ArrayList<Brigada> aux = listarBrigada();
       ArrayList<Brigada> brigadasOcupadas= new ArrayList<>();       
            for(Brigada brigada:aux){
             if (brigada.isLibre()==false){               
             brigadasOcupadas.add(brigada);             
             }
          }
    return  brigadasOcupadas;
    }
}
