package Truco21cartas;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author Esteban
 */
public class ExTRuco {

    private static final String ARCHIVO = "./Mazo.3ds";
    Mazo mazo = new Mazo();
//    ArrayList<ArrayList<Carta>> hola;
    ArrayList<Carta> original1 = new ArrayList<>();
    ArrayList<Carta> original2 = new ArrayList<>();
    ArrayList<Carta> original3 = new ArrayList<>();

    ArrayList<Carta> modificado1 = new ArrayList<>();
    ArrayList<Carta> modificado2 = new ArrayList<>();
    ArrayList<Carta> modificado3 = new ArrayList<>();

    ArrayList<Carta> final1 = new ArrayList<>();
    ArrayList<Carta> final2 = new ArrayList<>();
    ArrayList<Carta> final3 = new ArrayList<>();

    public ExTRuco() {
//        deserializar();
    }
    public void vaciar(){
         original1 = new ArrayList<>();
     original2 = new ArrayList<>();
     original3 = new ArrayList<>();

     modificado1 = new ArrayList<>();
     modificado2 = new ArrayList<>();
     modificado3 = new ArrayList<>();

     final1 = new ArrayList<>();
     final2 = new ArrayList<>();
     final3 = new ArrayList<>();

    }
    private NumeroColumna elegirColumna() {
        String[] opciones = {"PRIMERA", "SEGUNDA", "TERCERA"};
        int opcion = JOptionPane.showOptionDialog(
                null //componente
                , "En que columna esta su carta?" // Mensaje
                , "Eleccion de cartas" // Titulo en la barra del cuadro
                , JOptionPane.DEFAULT_OPTION // Tipo de opciones
                , JOptionPane.QUESTION_MESSAGE // Tipo de mensaje (icono)
                , null // Icono (ninguno)
                , opciones // Opciones personalizadas
                , null // Opcion por defecto
        );
        switch (opcion) {
            case 0:
                return NumeroColumna.PRIMERA;
            case 1:
                return NumeroColumna.SEGUNDA;
            case 2:
                return NumeroColumna.TERCERA;
        }
        return null;
    }

    public ArrayList<ArrayList<Carta>> truco() {
        File file = new File(ARCHIVO);
//        if (!file.exists()) {
        mazo.mazoSinComodin();
        int i;
        int c = 0;

        while (c < 7) {
            i = (int) (Math.random() * 51);
            if (!original1.contains(mazo.random(i))) {
                original1.add(mazo.random(i));
                c++;
            }
        }

        c = 0;
        while (c < 7) {
            i = (int) (Math.random() * 51);
            if (!original1.contains(mazo.random(i)) && !original2.contains(mazo.random(i))) {
                original2.add(mazo.random(i));
                c++;
            }
        }

        c = 0;
        while (c < 7) {
            i = (int) (Math.random() * 51);
            if (!original1.contains(mazo.random(i)) && !original2.contains(mazo.random(i)) && !original3.contains(mazo.random(i))) {
                original3.add(mazo.random(i));
                c++;
            }
        }
//            serializar();
//        }
//        deserializar();
        meLaSuda(original1, original2, original3);
        ArrayList<ArrayList<Carta>> a=new ArrayList<ArrayList<Carta>>();
        a.add(original1);
        a.add(original2);
        a.add(original3);
        return a;
        //truco2();
        //truco3();
        //trucofinal();
        
    }

    /**
     * El metodo mas genial de todos.
     *
     * @param ori1
     * @param ori2
     * @param ori3
     */
    public void meLaSuda(ArrayList<Carta> ori1, ArrayList<Carta> ori2, ArrayList<Carta> ori3) {

        for (int i = 0; i < 7; i++) {
            ori1.get(i).mostrar();
            System.out.print("\t\t");
            ori2.get(i).mostrar();
            System.out.print("\t\t");
            ori3.get(i).mostrar();
            System.out.println("");
        }
//        for (Carta c : ori1) {
//            c.mostrar();
//        }
//        System.out.println("");
//        for (Carta c : ori2) {
//            c.mostrar();
//        }
//        System.out.println("");
//        for (Carta c : ori3) {
//            c.mostrar();
//        }
        System.out.println("");
    }

    public ArrayList<ArrayList<Carta>> truco2(NumeroColumna nc) {
        //NumeroColumna nc = elegirColumna();
        System.out.println("Cartas reordenadas por primera vez.");
        switch (nc) {
            case PRIMERA:
                for (int i = 0; i < 7; i = i + 3) {
                    modificado1.add(original2.get(i));
                    if (i < 6) {
                        modificado2.add(original2.get(i + 1));
                        modificado3.add(original2.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    modificado2.add(original1.get(i));
                    if (i < 6) {
                        modificado3.add(original1.get(i + 1));
                        modificado1.add(original1.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    modificado3.add(original3.get(i));
                    if (i < 6) {
                        modificado1.add(original3.get(i + 1));
                        modificado2.add(original3.get(i + 2));
                    }
                }
                meLaSuda(modificado1, modificado2, modificado3);
                break;

            case SEGUNDA:
                for (int i = 0; i < 7; i = i + 3) {
                    modificado1.add(original1.get(i));
                    if (i < 6) {
                        modificado2.add(original1.get(i + 1));
                        modificado3.add(original1.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    modificado2.add(original2.get(i));
                    if (i < 6) {
                        modificado3.add(original2.get(i + 1));
                        modificado1.add(original2.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    modificado3.add(original3.get(i));
                    if (i < 6) {
                        modificado1.add(original3.get(i + 1));
                        modificado2.add(original3.get(i + 2));
                    }
                }
                meLaSuda(modificado1, modificado2, modificado3);
                break;

            case TERCERA:
                for (int i = 0; i < 7; i = i + 3) {
                    modificado1.add(original1.get(i));
                    if (i < 6) {
                        modificado2.add(original1.get(i + 1));
                        modificado3.add(original1.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    modificado2.add(original3.get(i));
                    if (i < 6) {
                        modificado3.add(original3.get(i + 1));
                        modificado1.add(original3.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    modificado3.add(original2.get(i));
                    if (i < 6) {
                        modificado1.add(original2.get(i + 1));
                        modificado2.add(original2.get(i + 2));
                    }
                }
                meLaSuda(modificado1, modificado2, modificado3);
                break;
        }
    ArrayList<ArrayList<Carta>> a=new ArrayList<ArrayList<Carta>>();
        a.add(modificado1);
        a.add(modificado2);
        a.add(modificado3);
        return a;
    }

    public ArrayList<ArrayList<Carta>> truco3(NumeroColumna nc) {
        //NumeroColumna nc = elegirColumna();
        System.out.println("Cartas reordenadas por segunda vez.");
        switch (nc) {

            case PRIMERA:
                for (int i = 0; i < 7; i = i + 3) {
                    final1.add(modificado2.get(i));
                    if (i < 6) {
                        final2.add(modificado2.get(i + 1));
                        final3.add(modificado2.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    final2.add(modificado1.get(i));
                    if (i < 6) {
                        final3.add(modificado1.get(i + 1));
                        final1.add(modificado1.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    final3.add(modificado3.get(i));
                    if (i < 6) {
                        final1.add(modificado3.get(i + 1));
                        final2.add(modificado3.get(i + 2));
                    }
                }
                meLaSuda(final1, final2, final3);
                break;

            case SEGUNDA:
                for (int i = 0; i < 7; i = i + 3) {
                    final1.add(modificado1.get(i));
                    if (i < 6) {
                        final2.add(modificado1.get(i + 1));
                        final3.add(modificado1.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    final2.add(modificado2.get(i));
                    if (i < 6) {
                        final3.add(modificado2.get(i + 1));
                        final1.add(modificado2.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    final3.add(modificado3.get(i));
                    if (i < 6) {
                        final1.add(modificado3.get(i + 1));
                        final2.add(modificado3.get(i + 2));
                    }
                }
                meLaSuda(final1, final2, final3);
                break;

            case TERCERA:
                for (int i = 0; i < 7; i = i + 3) {
                    final1.add(modificado2.get(i));
                    if (i < 6) {
                        final2.add(modificado2.get(i + 1));
                        final3.add(modificado2.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    final2.add(modificado3.get(i));
                    if (i < 6) {
                        final3.add(modificado3.get(i + 1));
                        final1.add(modificado3.get(i + 2));
                    }
                }
                for (int i = 0; i < 7; i = i + 3) {
                    final3.add(modificado1.get(i));
                    if (i < 6) {
                        final1.add(modificado1.get(i + 1));
                        final2.add(modificado1.get(i + 2));
                    }
                }
                meLaSuda(final1, final2, final3);
                break;
        }
        ArrayList<ArrayList<Carta>> a=new ArrayList<ArrayList<Carta>>();
        a.add(final1);
        a.add(final2);
        a.add(final3);
        return a;
    }

    public Carta trucofinal(NumeroColumna nc) {
        Carta c=new Carta(Palo.JOKER);
        //NumeroColumna nc = elegirColumna();
        System.out.println("Esta es tu carta:");
        switch (nc) {
            case PRIMERA:
                final1.get(3).mostrar();
                c=final1.get(3);
                break;
            case SEGUNDA:
                final2.get(3).mostrar();
                c=final2.get(3);
                break;
            case TERCERA:
                final3.get(3).mostrar();
                c=final3.get(3);
                break;
            default:

        }
        System.out.println();
        return c;
    }

    private void serializar() {
        File file = new File(ARCHIVO);
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file)))) {
            oos.writeObject(original1);
            oos.writeObject(original2);
            oos.writeObject(original3);
        } catch (NotSerializableException nse) {
            System.out.println("No se puede escribir el archivo" + ARCHIVO);
        } catch (FileNotFoundException fnfe) {
            System.out.println("No se puede escribir el archivo" + ARCHIVO);
        } catch (IOException ioe) {
            System.out.println("No se puede escribir el archivo" + ARCHIVO);
        }

    }

    private void deserializar() {
        File file = new File(ARCHIVO);
        if (file.exists()) {
            try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))) {
                this.original1 = (ArrayList<Carta>) ois.readObject();
                this.original2 = (ArrayList<Carta>) ois.readObject();
                this.original3 = (ArrayList<Carta>) ois.readObject();
            } catch (ClassNotFoundException csne) {
                System.out.println("No se pudo leer el archivo" + ARCHIVO);
            } catch (FileNotFoundException fnfe) {
                System.out.println("No se pudo leer el archivo" + ARCHIVO);
            } catch (IOException ioe) {
                System.out.println("No se pudo leer el archivo" + ARCHIVO);
            }
        }

    }
}
