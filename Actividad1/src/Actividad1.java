

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import Controlador.Controlador;
import Modelo.Modelo;
import Vista.vista;
import java.io.FileWriter;
import java.io.PrintWriter;

/**
 *
 * @author julia
 */
public class Actividad1 {
     /**
     * @param args the command line arguments
     * Esta es la clase principal donde se ejecuta la vista y se realiza la relación entre 
     * el controlador, la vista y el modelo
     */
    public static void main(String[] args) {
        
        
       
       Controlador micontrolador = new Controlador();
       Modelo mimodelo = new Modelo();
       vista ven= new vista();
       
       // las clases se tienen que relacionar por medio del controlador
       
      
       ven.setControlador(micontrolador);
       

       micontrolador.setModelo(mimodelo);
       micontrolador.setvista(ven);
       micontrolador.iniciar();
       ven.setVisible(true);
       
       
       
    }
    
}
