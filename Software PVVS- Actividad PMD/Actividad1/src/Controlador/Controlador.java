package Controlador;

import Modelo.Modelo;
import Vista.vista;

/**

 * Esta clase  va a ser el controlador  ya que el software se implemento usando MVC en esta clase.
 * 
 * @author:Julian Peñuela, Yeison Vela, Nicolas Tellez
 * @version: 25/08/2021
 * @see <a href = "https://github.com/19julian99/PVVS--Grupo-3-Julian-Penuela-Yeison-Vela-Nicolas-Tellez" /> Git del Grupo
 * </a>

 */
public class Controlador{
/**
 * Se, crean dos variables de tipo pripado para poder usarlos para invocar a la vista o al modelo 
 */
    private Modelo mimodelo;
    private vista ventana;

    /**
     * A continuacion tenemos  un  metodo que asigna el modelo y lo invoca en las variables que 
     * mencionamos anteriormente 
     * @param mimodelo  variable que entra como parametro del metodo que se encuentra definida en la parte superior y
     * se iguala al modelo.
     */
    
    public void setModelo(Modelo mimodelo) {
        this.mimodelo = mimodelo;
    }
/**
 * A continuacion tenemos  un  metodo que asigna el modelo y lo invoca en las variables que 
     * mencionamos anteriormente 
 * @param ventana variable que entra como parametro del metodo que se encuentra definida en la parte superior y
     * se iguala a la ventana de la vista.
 */
    public void setvista(vista ventana) {
        this.ventana=ventana;
    }

    //
    //Nos pone centrado el programa
    /**
     * Esta funcion  agrega un nombre a la ventana ademas de que de manera
     * automatica se establece el programa a la mitad de la ventana para mayor comodidad.
     * dentro de el usando el objeto ventana se le asiganan por medio de set's un titulo y la posicion.
     */
    public void iniciar(){
        ventana.setTitle("Lectura de un archivo TXT");
        ventana.setLocationRelativeTo(null);
    }
   

    /**
     * entra como parametro un String el cual se le asigna a la variable mimodelo.
     * @param text 
     */
    public void ver(String text) {
        
        mimodelo.setTxt(text);
        
    }

    
    
      
    
}
