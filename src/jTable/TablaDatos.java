package jTable;

public class TablaDatos {
    
    private String[] nombresColumnas = {"Nombre", "Radio (km)", "Lunas", "Gaseoso"};
    
    private Object[][] datosFila = {
        
    	{"Mercurio", 2440.0, 0, false},
        {"Venus", 6052.0, 0, false},
        {"Tierra", 6371.0, 1, false},
        {"Marte", 3397.0, 2, false},
        {"Júpiter", 71492.0, 92, true},
        {"Saturno", 60268.0, 145, true},
        {"Urano", 25559.0, 27, true},
        {"Neptuno", 24766.0, 14, true},
        {"Plutón", 1188.0, 1, false}
        
    };

    public String[] getNombresColumnas() {
        
    	return nombresColumnas;
    	
    }

    public Object[][] getDatosFila() {
        
    	return datosFila;
    	
    }
    
}