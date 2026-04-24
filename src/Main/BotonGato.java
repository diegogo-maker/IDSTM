package Main;

import javax.swing.JButton;
import javax.swing.JLabel;

public class BotonGato extends JButton {
    int fila;
    int col;
    String valor = ""; 

    public BotonGato(int fila, int col) {
        this.fila = fila;
        this.col = col;
    }

}