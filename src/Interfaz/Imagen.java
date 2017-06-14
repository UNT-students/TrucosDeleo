package Interfaz;


import java.awt.Dimension;
import java.awt.Graphics;
import javax.swing.ImageIcon;

public class Imagen extends javax.swing.JPanel {
private String ruta;

public Imagen(String ruta, int sizeV,int sizeH) {
this.setSize(sizeH, sizeV); //se selecciona el tamaño del panel
this.setRuta(ruta);
}
public void setRuta(String ruta){
    this.ruta=ruta;
}

public String getRuta(){
    return this.ruta;
}
//Se crea un método cuyo parámetro debe ser un objeto Graphics

public void paint(Graphics grafico) {
Dimension height = getSize();

//Se selecciona la imagen que tenemos en el paquete de la //ruta del programa

ImageIcon Img = new ImageIcon(getClass().getResource(this.ruta)); 

//se dibuja la imagen que tenemos en el paquete Images //dentro de un panel

grafico.drawImage(Img.getImage(), 0, 0, height.width, height.height, null);

setOpaque(false);
super.paintComponent(grafico);
}
}