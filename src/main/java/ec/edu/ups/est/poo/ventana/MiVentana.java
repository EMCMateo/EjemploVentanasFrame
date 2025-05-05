package ec.edu.ups.est.poo.ventana;
import java.awt.Frame;

public class MiVentana extends Frame{
    public MiVentana(String titulo){
        this.setTitle(titulo);
        this.setVisible(true);
    }
    public MiVentana(String titulo, int ancho, int alto, int posX, int posY){
        this(titulo); //Llama al constructor padre, por eso setea todo lo del constructor al cquellama, el this fucniona para llamar al constructor con sus parametros
        this.setSize(ancho, alto);
        this.setLocation(posX, posY);

    }
    public MiVentana(){
        this("Mi Ventana", 600, 400, 100, 200);
    }
}