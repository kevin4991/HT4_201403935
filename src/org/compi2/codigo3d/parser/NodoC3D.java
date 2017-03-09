package org.compi2.codigo3d.parser;

/**
 * Clase sencilla para sintetizar información entre producciones.
 * Cuenta con un único atributo de tipo String, pero pueden agregársele
 * los atributos que se consideren necesarios.
 * @author esvux
 */
public class NodoC3D {
    private String cad, ev, ef, es;
    

    public NodoC3D(String cad) {
        this.cad = cad;
    }
    
    public NodoC3D(String cad, String ev, String ef) {
        this.cad = cad;
        this.ev = ev;
        this.ef = ef;
    }
    
    public NodoC3D(String cad, String ev, String ef, String es) {
        this.cad = cad;
        this.ev = ev;
        this.ef = ef;
        this.es = es;
    }
    
    public String getCad(){
        return cad;
    }
    
    public String getEV(){
        return ev;
    }
    
    public String getEF(){
        return ef;
    }
    
    public String getES(){
        return es;
    }
        
}
