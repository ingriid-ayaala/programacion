/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package enumeracion;

/**
 *
 * @author ingri
 */
public enum Ropa {

    Nombre(kai),
    TALLA(S),
    MATERIAL(LANA),
    CATEGORIA(ABRIGO);
    

    private final String datos;

    private Ropa(String datos) {
        this.datos = datos;
    }

    public static Ropa getNombre() {
        return Nombre;
    }

    public static Ropa getTALLA() {
        return TALLA;
    }

    public static Ropa getMATERIAL() {
        return MATERIAL;
    }

    public static Ropa getCATEGORIA() {
        return CATEGORIA;
    }

    public String getDatos() {
        return datos;
    }
        
    
    
    
    
    
    
}
