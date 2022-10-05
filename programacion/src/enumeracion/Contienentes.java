/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeracion;

/**
 *
 * @author ingri
 */
public enum Contienentes {
    AMERICA(53,33),
    ASIA(46,54),
    EUROPA(44,12),
    OCEANIA(34,58),
    AFRICA(14,47);
    
    //propiedad numero de paises de un continente
    private final int numPaises;
    private final int superficie;
    
    
    
   
    private Contienentes(int numPaises, int superficie) {
        this.numPaises = numPaises;
        this.superficie = superficie;
    }
    

    public int getNumPaises() {
        return numPaises;
    }
    
    
   
    
}
