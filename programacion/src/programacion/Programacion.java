/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package programacion;

import enumeracion.Contienentes;
import enumeracion.dias;

/**
 *
 * @author ingri
 */
public class Programacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
//        System.out.println("-"+dias.DOMINGO);
        //metodod que recibe el dia estatico, imprimirDiasSemana le paso un enum
        //(que es el lunes) y esto devuelve el dia de la semana es lunes
        imprimirDiasSemana(dias.LUNES);
        //System.out.println(dias.d1);
        dias.week(dias.MARTES);
        //asignacion directa a traves de un enum
        dias miDia = dias.LUNES;
        System.out.println("miDia = " + miDia);
        
        //asignacion de un dia en base a un string a traves de un value of
        //asignacion de un dia en base a un dia a traves de value
        
        dias miSegundoDia = dias.valueOf("VIERNES");
        
        //declracion de un listado de dias 
        dias[] todosMisDias = dias.values();
        //imprimo el conbtenido de mi listado en dias
        for (dias d :todosMisDias ) {
            System.out.println("d = " +d.name());
        }
        
         //visualizando un pais 
        System.out.println("el CONTINENTE ...  : "+Contienentes.AFRICA);    
        
        System.out.println("Descripcion producto. " +Ropa.Nombre);
        
        
        
    }
    public static void diasWeek(dias dia){
        switch(dia){
            case LUNES:
                System.out.println("Un auto lleva personas.");
                break;
            case MARTES:
                System.out.println("Un camión lleva carga.");
                break;
            case MIERCOLES:
                System.out.println("Un avión vuela.");
                break;
            case JUEVES:
                System.out.println("Un tren corre sobre rieles.");
                 break;
            case VIERNES:
                System.out.println("Un barco navega en el agua.");
                break;
            default:
                throw new AssertionError();
                
        }
    }
    public static void imprimirDiasSemana(dias semana){
        
        System.out.println("el primer dia de la semana es : "+semana);
    } 
   
}
