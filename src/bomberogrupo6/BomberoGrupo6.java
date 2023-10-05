/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberogrupo6;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
import AccesoADatos.CuartelData;
import Entidades.Bombero;
import Entidades.Brigada;
import Entidades.Cuartel;
import java.time.LocalDate;
import java.time.Month;

/**
 *
 * @author Juan
 */
public class BomberoGrupo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //Alumno alum1 = new Alumno(24542425,"Viltez", "Peron", LocalDate.of(2003, Month.MARCH, 21),true);
//        AlumnoData alum = new AlumnoData();
//        Alumno alum2 = new Alumno( 32422425, "veliz", "juana", LocalDate.of(2023, Month.MARCH, 23), true);
//        Alumno alum3 = new Alumno( 5353355, "Perez", "juan", LocalDate.of(2045, Month.MARCH, 12), true);
//        //alum.guardarAlumno(alum2);
    //Cuartel cuartel= new Cuartel("Cuartel 2", "Avenida2", 2, 4, "1828282", "hqwyuqh@hjauya.kkd", true);
    ///Cuartel cuartel= new Cuartel("Cuartel Los fueguitos Córdoba", "Avenida Siempre Viva", -31.31279191675567, -64.30560243068217,
     ///       "3518524568", "cuartellosfueguitos@gmail.com", true);
     Cuartel c1= new Cuartel(); 
    c1.setCodigo(1);
    CuartelData cd = new CuartelData(); 
     ///cd.guardarCuartel(cuartel);
    Brigada br=new Brigada();
    BrigadaData bd=new BrigadaData();
    //bd.guardarBrigada(br);
   ///Cuartel cuartel2= new Cuartel(1, "Cuartel Los fueguitos Córdoba", "Avenida Siempre Viva 1200", -31.31279191675567, -64.30560243068217,
      ///     "3518524569", "cuartellosfueguitos@gmail.com", true);
    br.setCodigo(2);

    
    Bombero bom = new Bombero("1233425", "Ramiros","Perezz",  LocalDate.of(2023, Month.MARCH, 23), "266425", br, "A+", true);
    
    BomberoData  bombdt = new BomberoData();
    bombdt.guardarBombero(bom);
    
    
    ///bombdt.buscarBombero(1);
    
    //bombdt.DarDeBajaBombero(4);
    //bombdt.modificarBombero(bom);
       /// System.out.println("CUARTEL: " + cd.buscarCuartel(5).toString()); 
    
    ///cd.darDeBajaCuartel(1);
    ///cd.modificarCuartel(cuartel2);
        ///System.out.println("BRIGADA: "+bd.buscarBrigada(2).toString());
      ///  System.out.println("BOMBREO: "+ );
    }   
}
