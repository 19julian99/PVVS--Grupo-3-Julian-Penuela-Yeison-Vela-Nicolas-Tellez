# Descripción de métodos y Atributos de la clase controlador.
# Atributos generales:
```
private Modelo mimodelo;
private vista ventana;
```


A continuacion tenemos  un  metodo que asigna el modelo y lo invoca en las variables que  mencionamos anteriormente  @param mimodelo  variable que entra como parametro del metodo que se encuentra definida en la parte superior y se iguala al modelo.

```    
    public void setModelo(Modelo mimodelo) {
        this.mimodelo = mimodelo;
    }
```
A continuacion tenemos  un  metodo que asigna el modelo y lo invoca en las variables que  mencionamos anteriormente  @param ventana variable que entra como parametro del metodo que se encuentra definida en la parte superior y se iguala a la ventana de la vista.

```
    public void setvista(vista ventana) {
        this.ventana=ventana;
    }
```
   
Nos pone centrado el programa, esta funcion  agrega un nombre a la ventana ademas de que de manera automatica se establece el programa a la mitad de la ventana para mayor comodidad. dentro de el usando el objeto ventana se le asiganan por medio de set's un titulo y la posicion.


```
    public void iniciar(){
        ventana.setTitle("Lectura de un archivo TXT");
        ventana.setLocationRelativeTo(null);
    }
```

Entra como parametro un String el cual se le asigna a la variable mimodelo. @param text 

```
    public void ver(String text) {
        
        mimodelo.setTxt(text);
        
    }
```
    



























