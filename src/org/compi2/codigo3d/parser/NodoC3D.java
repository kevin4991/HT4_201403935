package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad, ETV, ETF, ETST;
    

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String cad, String ETV , String ETF) {
        this.cad = cad;
        this.ETV = ETV;
        this.ETF = ETF;
    }
    
    public NodoC3D(String cad, String ETV, String ETF, String ETST) {
        this.cad = cad;
        this.ETV = ETV;
        this.ETF = ETF;
        this.ETST = ETST;
    }
    
    public String getCad(){
        return cad;
    }
    
    public String getEV(){
        return ETV;
    }
    
    public String getEF(){
        return ETF;
    }
    
    public String getES(){
        return ETST;
    }
        
}
