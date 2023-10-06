/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AccesoADatos;

import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Time;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Hernan
 */
public class SiniestroData {
    private Connection con = null;
    private BrigadaData bd;
    
    public SiniestroData() {
        con = Conexion.getConexion();
        bd= new BrigadaData();
    }
    
    public void guardarSiniestro(Siniestro siniestro){
        String sql = "INSERT INTO `siniestro`(`tipo`, `fecha_siniestro`, "
                + "`hora_siniestro`, `coord_X`, `coord_Y`, `detalles`, `fecha_resol`, `hora_resol`, "
                + "`puntuacion`, `cod_brigada`, `estado`) VALUES (?,?,?,?,?,?,?,?,?,?,?)";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, siniestro.getTipo());
            ps.setDate(2, Date.valueOf(siniestro.getFechaSiniestro()));
            ps.setTime(3, siniestro.getHoraSiniestro());
            ps.setDouble(4, siniestro.getCoordX());
            ps.setDouble(5, siniestro.getCoordY());
            ps.setString(6, siniestro.getDetalles());
            if (siniestro.getFechaResolucion()!=null) {
                ps.setDate(7, Date.valueOf(siniestro.getFechaResolucion()));
            }else{
                ps.setDate(7, null);
            }            
            ps.setTime(8, siniestro.getHoraResolucion());
            ps.setInt(9, siniestro.getPuntuacion());
            if (siniestro.getBrigada()!=null) {
                ps.setInt(10, siniestro.getBrigada().getCodigo());
            }else{
                ps.setObject(10, null);
            }       
            ps.setBoolean(11, siniestro.isEstado());
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                JOptionPane.showMessageDialog(null, "Siniestro creado con exito.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el siniestro.");
        }
    }
    
    public void resolverSiniestro(Siniestro siniestro){
        //agregar en el boton . traer el objeto y completarlo con estos datos 
        // falta probar la brigada
        String sql = "UPDATE siniestro SET fecha_resol=?, hora_resol=?, puntuacion=?, estado=? cod_brigada=? WHERE codigo=?";
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDate(1, Date.valueOf(siniestro.getFechaResolucion()));
            ps.setTime(2, siniestro.getHoraResolucion());
            ps.setInt(3, siniestro.getPuntuacion());            
            ps.setBoolean(4, siniestro.isEstado());
            if (siniestro.getBrigada()!=null) {
                ps.setInt(5, siniestro.getBrigada().getCodigo());
            }else{
                ps.setObject(5, null);
            }
            ps.setInt(6, siniestro.getCodigo()); 
            int resultado = ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            if (resultado == 1) {
                JOptionPane.showMessageDialog(null, "Siniestro resuelto");
            } else {
                JOptionPane.showMessageDialog(null, "Siniestro resuelto no cargado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al querer resolver el siniestro");
        }       
    }
    
    public ArrayList listarSiniestros(){        
        ArrayList<Siniestro> siniestros= new ArrayList();
        try {
            String sql = "SELECT * FROM siniestro";
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ResultSet rs = ps.executeQuery();
            int cont = 0;
            while (rs.next()) {
                Siniestro s = new Siniestro();
                cont++;
                s.setCodigo(rs.getInt("codigo"));
                s.setTipo(rs.getString("tipo"));
                s.setFechaSiniestro(rs.getDate("fecha_siniestro").toLocalDate());
                s.setHoraSiniestro(rs.getTime("hora_siniestro"));
                s.setCoordX(rs.getDouble("coord_X"));
                s.setCoordY(rs.getDouble("coord_Y"));
                s.setDetalles(rs.getString("detalles"));                
                 if (rs.getDate("fecha_resol")!=null) {
                    s.setFechaResolucion(rs.getDate("fecha_resol").toLocalDate());
                }else{
                    s.setFechaResolucion(null);
                }                 
                s.setHoraResolucion(rs.getTime("hora_resol"));
                s.setPuntuacion(rs.getInt("puntuacion"));
              
                if (bd.buscarBrigada(rs.getInt("cod_brigada")).getCodigo()!=0) {
                    s.setBrigada(bd.buscarBrigada(rs.getInt("cod_brigada")));
                }else {
                    s.setBrigada(null);
                } 
                s.setEstado(rs.getBoolean("estado"));
                siniestros.add(s);            
            }
            if (cont == 0) {
                JOptionPane.showMessageDialog(null, "No se encontro ningun siniestro");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al querer listar los siniestros" + ex.getMessage());
        }
        return siniestros;
    }
            
 }
        
    
    //Mostrar todos los incidentes o siniestros que han ocurrido entre ayer y hoy
//    public ArrayList mostrarIncidenteEntreAyerYHoy(){
//        LocalDate fechaActual= LocalDate.now();
//        ArrayList<Siniestro> siniestros= new ArrayList();
//        
//        
//    }

    
    

