/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberogrupo6;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import AccesoADatos.SiniestroData;
import Entidades.Brigada;
import Entidades.Siniestro;
import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;

/**
 *
 * @author Juan
 */
public class BomberoGrupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        CuartelData cd = new CuartelData();
        BrigadaData bd = new BrigadaData();
        BomberoData bomd = new BomberoData();
        SiniestroData sd= new SiniestroData();

// CREACION DE BRIGADA

//        Brigada br1 = new Brigada(1,"FUEGITOS DEL SUR", "Incendios en viviendas e industrias", true, cd.buscarCuartel(1), true);
//        Brigada br2 = new Brigada("DERRUMBES DEL SUR", "Salvamento en derrumbes", true, cd.buscarCuartel(2), true);
//        bd.modificarBrigada(br1);
//        bd.guardarBrigada(br2);

// CREACION DE BOMBEROS

//        Bombero bom1 = new Bombero("20147835", "Marcos Fernado", "Leyria", LocalDate.of(1982, Month.NOVEMBER, 1), "2612243222", bd.buscarBrigada(1), "a+", true);
//        Bombero bom2 = new Bombero("35045789", "Maria Jose", "Orellano", LocalDate.of(1992, Month.JUNE, 21), "3511478655", bd.buscarBrigada(2), "b+", true);
//        bomd.guardarBombero(bom1);
//        bomd.guardarBombero(bom2);
        
// CUARTEL LISTAR

//        for (Cuartel cuartel : (ArrayList<Cuartel>) cd.listarCuartel()) {
//            System.out.println(cuartel.toString());
//        }

// BRIGADA LISTAR

//  >>>>>>>> PRIMERO ESPANDIR LA CANTIDAD (A 100) LOS VARCHAR EN LA BACE DE DATOS <<<<<<<<<<<

//        for (Brigada brigada : (ArrayList<Brigada>) bd.listarBrigada()) {
//            System.out.println(brigada.toString());
//        }

// BOMBERO LISTAR

//      for(Bombero bombero:(ArrayList<Bombero>) bomd.listarBombero()){
//             System.out.println(bombero.toString());            
//          }

// LISTAR BOMBERO POR BRIGADA

//      for(Bombero bombero:(ArrayList<Bombero>) bomd.listarBomberosPorBrigadas(2)){
//             System.out.println(bombero.toString());            
//          }

// LISTAR BOMBERO POR CUARTEL

//      for(Bombero bombero:(ArrayList<Bombero>) bomd.listarBomberosPorCuartel(1)){
//             System.out.println(bombero.toString());            
//          }
//

// LISTAR BRIGADAS POR CUARTEL

//      for(Brigada brigada:(ArrayList<Brigada>) bd.listarBrigadasPorCuartel(2)){
//             System.out.println(brigada.toString());            
//          }
//
//GUARDAR SINIESTRO
//    Siniestro sin= new Siniestro(2,"Incendio", LocalDate.now(), Time.valueOf(LocalTime.now())
//            , 3, 3, "fefwefw", LocalDate.now(), Time.valueOf(LocalTime.now()), 8, null, true);
//    //sd.guardarSiniestro(sin);
//    sd.resolverSiniestro(sin);
// LISTAR SINIESTROS
        for(Siniestro siniestro:(ArrayList<Siniestro>) sd.listarSiniestros()){
            
            System.out.println(siniestro.toString());            
         }

 }
}


