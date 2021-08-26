/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;
/**
 * se importan de las demas clases los elementos ncesarios para poder usarlos en esta clase.
 */
import Controlador.Controlador;
import Modelo.Modelo;
/**
 * se importan las librerias para el funcionamiento de la vista y algunas funciones.
 */
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**

 * Esta clase  va a ser   ya qa vista ue el software se implemento usando MVC en esta clase.
 * Esta clase extiende de javax.swing.JFrame
 * 
 * @author:Julian Peñuela, Yeison Vela, Nicolas Tellez
 * @version: 25/08/2021
 * @see <a href = "https://github.com/19julian99/PVVS--Grupo-3-Julian-Penuela-Yeison-Vela-Nicolas-Tellez" /> Git del Grupo
 * </a>

 */

public class vista extends javax.swing.JFrame {
/**
 * se define un elemento privado.
 */
    private Controlador micontrolador;
    
    /**
     * Crea un nuevo formulario de vista
     */
    public vista() {
        initComponents();
    }
/**
 *Se define un constructor  para podder invocar del modelo el metodo ge.Txt() para extraer el texto de esta variable 
 *
 */
    private void sacarTexto() {
        Modelo variableObj = new Modelo();
        JOptionPane.showMessageDialog(null, variableObj.getTxt());
    }

    /**
     * Este método se llama desde el constructor para inicializar el formulario.
     * 
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSel = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        txaArchivo = new javax.swing.JTextArea();
        ascendente = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        da = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        direccion = new javax.swing.JTextField();
        descendente = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Seleccionar archivo:");

        btnSel.setText("Cargar");
        btnSel.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSelActionPerformed(evt);
            }
        });

        txaArchivo.setColumns(20);
        txaArchivo.setRows(5);
        txaArchivo.addCaretListener(new javax.swing.event.CaretListener() {
            public void caretUpdate(javax.swing.event.CaretEvent evt) {
                txaArchivoCaretUpdate(evt);
            }
        });
        jScrollPane1.setViewportView(txaArchivo);

        ascendente.setText("Ordenar Ascendente");
        ascendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ascendenteActionPerformed(evt);
            }
        });

        da.setColumns(20);
        da.setRows(5);
        jScrollPane2.setViewportView(da);

        jLabel2.setText("Ingresa direccion de creacion de fichero:");

        direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                direccionActionPerformed(evt);
            }
        });

        descendente.setText("Ordenar Descendente");
        descendente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                descendenteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addComponent(jLabel1)
                        .addGap(18, 18, 18)
                        .addComponent(btnSel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1)
                            .addComponent(direccion)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.TRAILING)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(ascendente)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                        .addComponent(descendente)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel2)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(btnSel))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(direccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(descendente)
                    .addComponent(ascendente))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    /**
     * A continuacion tenemos el la logica del boton de seleccion el cual nos permitira 
     * abrir un contenedor en el cual podremos elegir un documen to del codigo 
     * dentro de el usamos un objeto de JFileChooser fc .
     * @param evt 
     */
    private void btnSelActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSelActionPerformed
        
          Modelo variableObj = new Modelo();  
         JFileChooser fc = new JFileChooser();
        fc.showOpenDialog(null);
        //get del archivo seleccionado 
        File archivo = fc.getSelectedFile();
/**
 * se realiza un try cath donde se crean dos objetos de los elementos de lectura y escritura de los archivs
 * se valida que lo que se lea no este vacio.
 */
        try {
            FileReader fr = new FileReader(archivo);
            BufferedReader br = new BufferedReader(fr);
            String texto = "";
            String linea = "";
            while (((linea = br.readLine())!=null)){
                texto+=linea+"\n";
            }
            
            /**
             * por medio de .setText asignamos el texto de la variable que usamos anteriomente que contenia 
             * lo que se encotraba en el fichero leido
             * 
            * txaArchivo  es el nombre del cuadro de texto.
             */
                txaArchivo.setText(texto);
                //se muestra un cuadro de dialogo dando la confirmación de valides
                JOptionPane.showMessageDialog(null, "Archivo leído correctamente");
                
                /**
                 * ahora por medio de un iff verificamos por medio del objeto de la clase modelo
                 * llamamos al metodo validar numero y se le pasa de parametro lo que tenemos
                 * en el text area principal  usando un get para poder extraer la informacion y un .trim para 
                 * eliminar los espacios al final del texto en caso de que hallan.
                 * 
                 * si es correcto nos indicara que efectivaente solo hay numero de lo contrario nos pedira ingresar
                 * un archivo nuevamente.
                 */
                if (variableObj.validarNumeros(txaArchivo.getText().trim()))
        {
            JOptionPane.showMessageDialog(rootPane, "Correcto");
        }
        else 
        {
            JOptionPane.showMessageDialog(rootPane, "Incorrecto: El archivo tiene caracteres no permitidos");
            txaArchivo.setText("");
        }
        }
            //exception
            catch (Exception e) {
}

    }//GEN-LAST:event_btnSelActionPerformed
/**
 * Tenemos un boton llamado ascendente en el cual se tiene contenidos los metodos y acciones que 
 * este realiara para la creacion del archivo y el ordenamiento.
 * @param evt 
 */
    private void ascendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ascendenteActionPerformed
/**
 * Se crea un objeto de la clase modelo que es donde tenemos los metodos principales.
 */
        Modelo variableObj = new Modelo();
/**
 * se usa el obejeto para  para llamar el metodo .setTxt el cual asigna el contenido del text area llamado
 * txaarchivo  y lo pasa como para parametro del metodo de la respectiva clase.
 * 
 * 
 * Vease la clase modelo para mayor información.
 */
        variableObj.setTxt(txaArchivo.getText());
        /**
         * se le pasa el contenido del cuadro de texto al metodo ordenarAscendente para poder ordenar los numeros
         * se le pasa este metodo como parametro el .getText del tex area.
         */
        variableObj.ordenarAscendente(txaArchivo.getText());
        
        //da es el nombre de la casilla de validación en la cual solo se muestra las salidas de los metodos anteriores
        da.setText(variableObj.getTxt());
        /**
         * ahora por medio del mismo objeto se invoca el metodo para asiganr una direccion la cual
         * nos creara el archivo en el nombre y formato deseado.
         * 
         * Vease la clase modelo para mayor información.
         */
        variableObj.setDir(direccion.getText());
        /**
         * por ultimo usamos el mismo objeto de la clase modelo y se le pasa de parametro el texto de la variable 
         * la cual ya se opero por medio de los metodos anteriores y la direccion de creacion del fichero.
         * Vease la clase modelo para mayor información.
         */
        variableObj.crearPrint(variableObj.getTxt(),variableObj.getDir());
        JOptionPane.showMessageDialog(null, "Archivo guardado correctamente en: "+ variableObj.getDir());
    }//GEN-LAST:event_ascendenteActionPerformed
/**
 * Se tiene el controlador y el objeto ventana para usar el metodo getText nativo del l enguaje para su visibilidad.
 * @param evt 
 */
    private void txaArchivoCaretUpdate(javax.swing.event.CaretEvent evt) {//GEN-FIRST:event_txaArchivoCaretUpdate
        //Modelo var = new Modelo();
        micontrolador.ver(txaArchivo.getText());
        //var.setTxt(txaArchivo.getText());
    }//GEN-LAST:event_txaArchivoCaretUpdate
/**
 * Este metodo se usa para capturar informacio por medio de un tex area asigandola a la variable goblal con
 * la cual se realziaran procesos a lo largo del software.
 * @param evt 
 */
    private void direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_direccionActionPerformed
        Modelo variableObj = new Modelo();
        variableObj.setTxt(txaArchivo.getText());
    }//GEN-LAST:event_direccionActionPerformed
/**
 * Este metodo es muy similar al metodo ascente en la parte de arriba la unica diferencia en su funcionamiento es el metodo 
 * ordenarDescendente el cual nos retorna como resultado los numero ordenados de mayor a menor.
 * tambien incluye un cuadro de dialogo que indica la creacion del archivo y captura de la direccion
 * 
 * El elemento definido como direccion es la casilla de texto donde se escribe la direccion.
 * @param evt 
 */
    private void descendenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_descendenteActionPerformed
        Modelo variableObj = new Modelo();
        variableObj.setTxt(txaArchivo.getText());
        variableObj.ordenarDescendente(txaArchivo.getText());
        da.setText(variableObj.getTxt());
        variableObj.setDir(direccion.getText());
        variableObj.crearPrint(variableObj.getTxt(),variableObj.getDir());
        JOptionPane.showMessageDialog(null, "Archivo guardado correctamente en: "+ variableObj.getDir());
    }//GEN-LAST:event_descendenteActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(vista.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */;
        /**
         * metodo para hacer visble el formulario.
         */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new vista().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton ascendente;
    public javax.swing.JButton btnSel;
    public javax.swing.JTextArea da;
    private javax.swing.JButton descendente;
    public javax.swing.JTextField direccion;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextArea txaArchivo;
    // End of variables declaration//GEN-END:variables
/**
 * Metodo para asiganr el controlador y realizzar instacias de el en la clase.
 * @param micontrolador 
 */
    public void setControlador(Controlador micontrolador) {
        this.micontrolador=micontrolador;
    }
}