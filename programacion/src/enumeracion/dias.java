/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeracion;

/**
 *
 * @author ingri
 */
public enum dias {
    LUNES,
    MARTES,
    MIERCOLES,
    JUEVES,
    VIERNES,
    SABADO,
    DOMINGO;
    
    
    public static void week(dias d1){
        System.out.println("el dia de la semana es : "+d1);
    }
    
}
