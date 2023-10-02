/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bomberogrupo6;

import AccesoADatos.BomberoData;
import Entidades.Bombero;
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

    Bombero bom = new Bombero("12345", "Ramiro Perez",  LocalDate.of(2023, Month.MARCH, 23), "266425", 1, "A+", true);
    BomberoData  bombdt = new BomberoData();
    bombdt.guardarBombero(bom);
    }
    
}
