package Truco21cartas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.Image;
import java.io.Serializable;
import javax.swing.ImageIcon;
//import java.lang.System;


/**
 *
 * @author Esteban
 */
public class Carta implements Serializable{

    int valor = 0;
    Palo palo = null;
    Especial especial = null;
    String img;

    public Carta(Palo palo, int valor, String img) {
        this.valor = valor;
        this.palo = palo;
        this.img = img;
    }

    public Carta(Palo palo, Especial especial, String img) {
        this.palo = palo;
        this.especial = especial;
        this.img = img;
    }

    public Carta(Palo palo) {
        this.palo = palo;
    }

    public String getImg() {
        return img;
    }

    public void mostrar() {
        String corazon = "\u2665";
        String trebol = "\u2663";
        String diamante = "\u2666";
        String pica = "\u2660";
        String joker = "\u263B";

        if (especial != null) {
            switch (especial) {
                case AS:
                    System.out.print("A");
                    break;
                case PRINCIPE:
                    System.out.print("J");
                    break;
                case REINA:
                    System.out.print("Q");
                    break;
                case REY:
                    System.out.print("K");
                    break;
            }
        }

        if ((valor >= 2) && (valor <= 10)) {
            System.out.print(valor);
        }
        switch (palo) {
            case CORAZON:
                System.out.print(corazon);
                break;
            case DIAMANTE:
                System.out.print(diamante);
                break;
            case PICA:
                System.out.print(pica);
                break;
            case TREBOL:
                System.out.print(trebol);
                break;
            case JOKER:
                System.out.print(joker);
                break;
        }
//        System.out.println();
    }
    
}
//♠ U+2660;
//♦ U+2666;
//♥ U+2665;
//♣ U+2663;
//☻  U+263B
