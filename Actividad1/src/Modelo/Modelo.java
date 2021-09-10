package Modelo;
// se importan del controlador los elementos necesarios para este componente ademaas de los File Writer
//Y PrintWriter para poder invocar elementos para la creacion de un fichero.
import Controlador.*;
import java.io.FileWriter;
import java.io.PrintWriter;
/**

 * Esta clase  va a ser el modelo  ya que el software se implemento usando MVC en esta clase.
 * 
 * @author:Julian Peñuela, Yeison Vela, Nicolas Tellez
 * @version: 25/08/2021
 * @see <a href = "https://github.com/19julian99/PVVS--Grupo-3-Julian-Penuela-Yeison-Vela-Nicolas-Tellez" /> Git del Grupo
 * </a>

 */
public class Modelo {
/**
 * A continuacion definimos dos variables que necesitamos para realiar las operaciones las cuales van 
 * a ser usadas por los metodos establecidos segun la logica del negocio y demas.
 * la variable txt almacenara el texto recibido por el Txt.
 * La variable dir almacenara una direccion dentro del sistema para almacenar y crear el archivo txt de salida
 * del programa donde se le indique.
 */
    private static String txt = "";
    private static String dir = "";
    /**
    private Controlador micontrolador;


    /**
    * Metodo get para obtener el contenido de la variable txt
     * @return the txt
     */
    public static String getTxt() {
        return txt;
    }

    /** Metodo set  para asignar el contenido de la variable txt
     * @param aTxt the txt to set
     */
    public static void setTxt(String aTxt) {
        txt = aTxt;
    }

    /**
     *  Metodo get para obtener el contenido de la variable dir para la creacion del fichero
     * @return the dir
     */
    public static String getDir() {
        return dir;
    }

    /** Metodo get para asiganr el contenido de la variable direccion para la creacion del fichero
     * @param aDir the dir to set
     */
    public static void setDir(String aDir) {
        dir = aDir;
    }

    /**
     * El metodo validarNumeros se usa para verificar que todos los datos igrsados al sistema 
     * sean numeros , es de tipo booleano y funciona por medidio de una expresion regular que valida
     * que unicamente contenga numeros del 0 al 9 y el - en caso de los negativos, de ser true 
     * permitira en la vista leer la informacion y realizar el procedimiendo de manera normal , de lo 
     * contrario no nos dejara cargar la informacion.
     * @param datos parametro de entrada en el cual debe entrar todo el texto contenido en el fichero de entrada
     * @return 
     */
    public static boolean validarNumeros (String datos){
        
        
        return datos.matches("-?[0-9 \\s -? +]*");
        
        
    }
    //Este que metodo que utilizamos es Insertion Sort
    /**
     * Este metodo ordena los numeros que nos lleguen por medio del metodo Insertion Sort que tiene
     * una Complejidad O(n^2) , este metodo de ordenamiento se selecciono debido a que como no manejaremos 
     * un gran volumen de informacion para realziar las pruebas iniciales del software permita el funcionamiento optimo 
     * , si bien no es el metodo de ordenamiento más rapido es el que se ajusta a las necesidades del software.
     * @param aTxt parametro de entrada con el texto del fichero de entrada con números.
     */
    public static void ordenarAscendente (String aTxt){
     txt="" ;
       /**
        * Se usa un arreglo de tipo String para en el cual por medio de .split dividiremos 
        * la cadena que nos llegue como paremetro del metodo por estacion o un caracter especial para 
        * proceder a procesar los numero y ordenarlo , posteriomete despuesde tener ubicado 
        * el texto en un arreglo se procese a hacer un cast para llenar un archivo entero con los numeros
        * y asi facilitar su manipulacion.
        */
       String[] newStr = aTxt.split("\\s+");
       int[ ] numeros = new int[newStr.length];
       /**
        * ciclo For que asigna los elementos del arreglo string al arrego Int
        */
       for (int i = 0; i < numeros.length; i++) {
           numeros[i]=Integer.valueOf(newStr[i]);
       }        
       
       
       /**
        * a continuacion se tiene el metodo de ordenamiento por inserción.
        * 
        * la caracteristica del lenguaje .length nos devuelve un numero con el tamaño de un arreglo o cadena.
        */
        int x=0;
        int j;
        for (int i = 1; i < numeros.length; i++) {
            x = numeros[i];
            j=i-1;
            
            // Se realizan las comparaciones de posiciones.
            while(j>-1 &&  x < numeros[j]){
                numeros[j+1]=numeros[j];
                j=j-1;
            }
            numeros[j+1]=x;
        }
                /**
                 * En el ciclo for a continuación se vuleve a hacer un cast de entero a un arreglo String para poder
                 * devolver en pantalla el resultado del ordenamiento , tambien para asignar en la variable del metodo
                 * o variable goblar txt que describimos la informacion para facilitar la creación del fichero.
                 */ 
         for (int i = 0; i <numeros.length; i++) {
           newStr[i]=String.valueOf(numeros[i]);
        }
       
     
        
        for (String newStr1 : newStr) {
            txt=txt+"["+newStr1+"]";
            
            
        }
    }
    
    
      public static void ordenarDescendente (String aTxt){
     txt="" ;
       
     /**
      * a continuacion volvemos a implementar el algoritmo de ordenamiento por inserción 
      */
       String[] newStr = aTxt.split("\\s+");
       int[ ] numeros = new int[newStr.length];
       for (int i = 0; i < numeros.length; i++) {
           numeros[i]=Integer.valueOf(newStr[i]);
       }        
       
        int x=0;
        int j;
        for (int i = 1; i < numeros.length; i++) {
            x = numeros[i];
            j=i-1;
            
            
            while(j>-1 &&  x < numeros[j]){
                numeros[j+1]=numeros[j];
                j=j-1;
            }
            numeros[j+1]=x;
        }
            
        /**
         * en esta parte difiere el metodo descente al ascendente , tendremos una variable auxiliar que sera igual al
         * tamaño del arreglo de numeros y a continuacion definiremos un nuevo arreglo para poder llenarlo
         * a la inversa dando como salida el arreglo de manera descendente.
         */
        int auxiliar=numeros.length;
        int[] numeros2 = new int[numeros.length];
        for (int i = 0; i < numeros.length; i++) {
            numeros2[i]=numeros[auxiliar-1];
            auxiliar=auxiliar-1;
        }
        
       /**
        * se hace un for con una conversion de arreglo int a uno String 
        */     
        
         for (int i = 0; i <numeros.length; i++) {
           newStr[i]=String.valueOf(numeros2[i]);
        }
       
     
        
        for (String newStr1 : newStr) {
            txt=txt+"["+newStr1+"]";
            
            
        }
    }
    
    //En esta funcion creamos el archivo con los numeros ya previamente ordenado
    public static void crearPrint (String aTxt,String aDir){
                  
        
        // La direccion que utilizamos para guardar el archivo es la siguiente
        // Algo importante en la sintaxis de la direccion es que debe estar separada por \\
        FileWriter fichero = null;
        PrintWriter pw = null;
        try
        {
            fichero = new FileWriter(aDir);
            pw = new PrintWriter(fichero);

            
                pw.println("Numeros ordenados");
                pw.println(aTxt);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
           try {
           // Nuevamente aprovechamos el finally para 
           // asegurarnos que se cierra el fichero.
           if (null != fichero)
              fichero.close();
           } catch (Exception e2) {
              e2.printStackTrace();
           }
        }
    }

    

    
    
    
    
    
    
    
    
}
