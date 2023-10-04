/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberogrupo6;

import AccesoADatos.BomberoData;
import AccesoADatos.BrigadaData;
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
    Cuartel cuartel= new Cuartel();
    cuartel.setCodCuartel(1);
    Brigada br=new Brigada("Bravo", "incendio", true, cuartel, true);
    BrigadaData bd=new BrigadaData();
    bd.guardarBrigada(br);
    //br.setCodigo(2);
   
    //Bombero bom = new Bombero(4,"1233425", "Ramiros","Perezz",  LocalDate.of(2023, Month.MARCH, 23), "266425", br, "A+", true);
    //BomberoData  bombdt = new BomberoData();
    //bombdt.BuscarBombero(1);
    //bombdt.DarDeBajaBombero(4);
    //bombdt.modificarBombero(bom);
    }
    
}
