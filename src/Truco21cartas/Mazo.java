/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Truco21cartas;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Esteban
 */
public class Mazo implements Serializable {

    private final List<Carta> mazoSC = new ArrayList<>();
    private final List<Carta> mazoCC = new ArrayList<>();
    
    
    private final Carta PAs = new Carta(Palo.PICA, Especial.AS, "b/p1.JPG");
    private final Carta P2 = new Carta(Palo.PICA, 2, "b/p2.JPG");
    private final Carta P3 = new Carta(Palo.PICA, 3, "b/p3.JPG");
    private final Carta P4 = new Carta(Palo.PICA, 4, "b/p4.JPG");
    private final Carta P5 = new Carta(Palo.PICA, 5, "b/p5.JPG");
    private final Carta P6 = new Carta(Palo.PICA, 6, "b/p6.JPG");
    private final Carta P7 = new Carta(Palo.PICA, 7, "b/p7.JPG");
    private final Carta P8 = new Carta(Palo.PICA, 8, "b/p8.JPG");
    private final Carta P9 = new Carta(Palo.PICA, 9, "b/p9.JPG");
    private final Carta P10 = new Carta(Palo.PICA, 10, "b/p10.JPG");
    private final Carta PPrincipe = new Carta(Palo.PICA, Especial.PRINCIPE, "b/p11.JPG");
    private final Carta PReina = new Carta(Palo.PICA, Especial.REINA, "b/p12.JPG");
    private final Carta PRey = new Carta(Palo.PICA, Especial.REY, "b/p13.JPG");

    private final Carta CAs = new Carta(Palo.CORAZON, Especial.AS, "b/c1.JPG");
    private final Carta C2 = new Carta(Palo.CORAZON, 2, "b/c2.JPG");
    private final Carta C3 = new Carta(Palo.CORAZON, 3, "b/c3.JPG");
    private final Carta C4 = new Carta(Palo.CORAZON, 4, "b/c4.JPG");
    private final Carta C5 = new Carta(Palo.CORAZON, 5, "b/c5.JPG");
    private final Carta C6 = new Carta(Palo.CORAZON, 6, "b/c6.JPG");
    private final Carta C7 = new Carta(Palo.CORAZON, 7, "b/c7.JPG");
    private final Carta C8 = new Carta(Palo.CORAZON, 8, "b/c8.JPG");
    private final Carta C9 = new Carta(Palo.CORAZON, 9, "b/c9.JPG");
    private final Carta C10 = new Carta(Palo.CORAZON, 10, "b/c10.JPG");
    private final Carta CPrincipe = new Carta(Palo.CORAZON, Especial.PRINCIPE, "b/c11.JPG");
    private final Carta CReina = new Carta(Palo.CORAZON, Especial.REINA, "b/c12.JPG");
    private final Carta CRey = new Carta(Palo.CORAZON, Especial.REY, "b/c13.JPG");

    private final Carta TAs = new Carta(Palo.TREBOL, Especial.AS, "b/t1.JPG");
    private final Carta T2 = new Carta(Palo.TREBOL, 2, "b/t2.JPG");
    private final Carta T3 = new Carta(Palo.TREBOL, 3, "b/t3.JPG");
    private final Carta T4 = new Carta(Palo.TREBOL, 4, "b/t4.JPG");
    private final Carta T5 = new Carta(Palo.TREBOL, 5, "b/t5.JPG");
    private final Carta T6 = new Carta(Palo.TREBOL, 6, "b/t6.JPG");
    private final Carta T7 = new Carta(Palo.TREBOL, 7, "b/t7.JPG");
    private final Carta T8 = new Carta(Palo.TREBOL, 8, "b/t8.JPG");
    private final Carta T9 = new Carta(Palo.TREBOL, 9, "b/t9.JPG");
    private final Carta T10 = new Carta(Palo.TREBOL, 10, "b/t10.JPG");
    private final Carta TPrincipe = new Carta(Palo.TREBOL, Especial.PRINCIPE, "b/t11.JPG");
    private final Carta TReina = new Carta(Palo.TREBOL, Especial.REINA, "b/t12.JPG");
    private final Carta TRey = new Carta(Palo.TREBOL, Especial.REY, "b/t13.JPG");

    private final Carta DAs = new Carta(Palo.DIAMANTE, Especial.AS, "b/d1.JPG");
    private final Carta D2 = new Carta(Palo.DIAMANTE, 2, "b/d2.JPG");
    private final Carta D3 = new Carta(Palo.DIAMANTE, 3, "b/d3.JPG");
    private final Carta D4 = new Carta(Palo.DIAMANTE, 4, "b/d4.JPG");
    private final Carta D5 = new Carta(Palo.DIAMANTE, 5, "b/d5.JPG");
    private final Carta D6 = new Carta(Palo.DIAMANTE, 6, "b/d6.JPG");
    private final Carta D7 = new Carta(Palo.DIAMANTE, 7, "b/d7.JPG");
    private final Carta D8 = new Carta(Palo.DIAMANTE, 8, "b/d8.JPG");
    private final Carta D9 = new Carta(Palo.DIAMANTE, 9, "b/d9.JPG");
    private final Carta D10 = new Carta(Palo.DIAMANTE, 10, "b/d10.JPG");
    private final Carta DPrincipe = new Carta(Palo.DIAMANTE, Especial.PRINCIPE, "b/d11.JPG");
    private final Carta DReina = new Carta(Palo.DIAMANTE, Especial.REINA, "b/d12.JPG");
    private final Carta DRey = new Carta(Palo.DIAMANTE, Especial.REY, "b/d13.JPG");

    private final Carta Joker1 = new Carta(Palo.JOKER);
    private final Carta Joker2 = new Carta(Palo.JOKER);
    
    public void mazoConComodin(){
        
        mazoCC.add(Joker1);
        mazoCC.add(Joker2);
        
        mazoCC.add(D2);
        mazoCC.add(D3);
        mazoCC.add(D4);
        mazoCC.add(D5);
        mazoCC.add(D6);
        mazoCC.add(D7);
        mazoCC.add(D8);
        mazoCC.add(D9);
        mazoCC.add(D10);
        mazoCC.add(DAs);
        mazoCC.add(DPrincipe);
        mazoCC.add(DReina);
        mazoCC.add(DRey);
        
        mazoCC.add(P2);
        mazoCC.add(P3);
        mazoCC.add(P4);
        mazoCC.add(P5);
        mazoCC.add(P6);
        mazoCC.add(P7);
        mazoCC.add(P8);
        mazoCC.add(P9);
        mazoCC.add(P10);
        mazoCC.add(PAs);
        mazoCC.add(PPrincipe);
        mazoCC.add(PReina);
        mazoCC.add(PRey);
        
        mazoCC.add(C2);
        mazoCC.add(C3);
        mazoCC.add(C4);
        mazoCC.add(C5);
        mazoCC.add(C6);
        mazoCC.add(C7);
        mazoCC.add(C8);
        mazoCC.add(C9);
        mazoCC.add(C10);
        mazoCC.add(CAs);
        mazoCC.add(CPrincipe);
        mazoCC.add(CReina);
        mazoCC.add(CRey);
        
        mazoCC.add(T2);
        mazoCC.add(T3);
        mazoCC.add(T4);
        mazoCC.add(T5);
        mazoCC.add(T6);
        mazoCC.add(T7);
        mazoCC.add(T8);
        mazoCC.add(T9);
        mazoCC.add(T10);
        mazoCC.add(TAs);
        mazoCC.add(TPrincipe);
        mazoCC.add(TReina);
        mazoCC.add(TRey);        
    }
    
    public void mazoSinComodin(){
        mazoSC.add(D2);
        mazoSC.add(D3);
        mazoSC.add(D4);
        mazoSC.add(D5);
        mazoSC.add(D6);
        mazoSC.add(D7);
        mazoSC.add(D8);
        mazoSC.add(D9);
        mazoSC.add(D10);
        mazoSC.add(DAs);
        mazoSC.add(DPrincipe);
        mazoSC.add(DReina);
        mazoSC.add(DRey);
        
        mazoSC.add(P2);
        mazoSC.add(P3);
        mazoSC.add(P4);
        mazoSC.add(P5);
        mazoSC.add(P6);
        mazoSC.add(P7);
        mazoSC.add(P8);
        mazoSC.add(P9);
        mazoSC.add(P10);
        mazoSC.add(PAs);
        mazoSC.add(PPrincipe);
        mazoSC.add(PReina);
        mazoSC.add(PRey);
        
        mazoSC.add(C2);
        mazoSC.add(C3);
        mazoSC.add(C4);
        mazoSC.add(C5);
        mazoSC.add(C6);
        mazoSC.add(C7);
        mazoSC.add(C8);
        mazoSC.add(C9);
        mazoSC.add(C10);
        mazoSC.add(CAs);
        mazoSC.add(CPrincipe);
        mazoSC.add(CReina);
        mazoSC.add(CRey);
        
        mazoSC.add(T2);
        mazoSC.add(T3);
        mazoSC.add(T4);
        mazoSC.add(T5);
        mazoSC.add(T6);
        mazoSC.add(T7);
        mazoSC.add(T8);
        mazoSC.add(T9);
        mazoSC.add(T10);
        mazoSC.add(TAs);
        mazoSC.add(TPrincipe);
        mazoSC.add(TReina);
        mazoSC.add(TRey);        
    }
    
    public void mostrar(){
        for(Carta m: mazoSC){
            m.mostrar();
        }
    }
    
    public Carta random(int elemento){
       int c=0;
        for(Carta m :mazoSC){
           if(c==elemento){
               return m;
           }
           c++;
       }
        return null;
    }
    
    public List<Carta> getMazoSC() {
        return mazoSC;
    }

    public List<Carta> getMazoCC() {
        return mazoCC;
    }

    public Carta getPAs() {
        return PAs;
    }


    public Carta getP2() {
        return P2;
    }

    public Carta getP3() {
        return P3;
    }

    public Carta getP4() {
        return P4;
    }

    public Carta getP5() {
        return P5;
    }

    public Carta getP6() {
        return P6;
    }

    public Carta getP7() {
        return P7;
    }

    public Carta getP8() {
        return P8;
    }

    public Carta getP9() {
        return P9;
    }

    public Carta getP10() {
        return P10;
    }

    public Carta getPPrincipe() {
        return PPrincipe;
    }

    public Carta getPReina() {
        return PReina;
    }

    public Carta getPRey() {
        return PRey;
    }

    public Carta getCAs() {
        return CAs;
    }


    public Carta getC2() {
        return C2;
    }

    public Carta getC3() {
        return C3;
    }

    public Carta getC4() {
        return C4;
    }

    public Carta getC5() {
        return C5;
    }

    public Carta getC6() {
        return C6;
    }

    public Carta getC7() {
        return C7;
    }

    public Carta getC8() {
        return C8;
    }

    public Carta getC9() {
        return C9;
    }

    public Carta getC10() {
        return C10;
    }

    public Carta getCPrincipe() {
        return CPrincipe;
    }

    public Carta getCReina() {
        return CReina;
    }

    public Carta getCRey() {
        return CRey;
    }

    public Carta getTAs() {
        return TAs;
    }


    public Carta getT2() {
        return T2;
    }

    public Carta getT3() {
        return T3;
    }

    public Carta getT4() {
        return T4;
    }

    public Carta getT5() {
        return T5;
    }

    public Carta getT6() {
        return T6;
    }

    public Carta getT7() {
        return T7;
    }

    public Carta getT8() {
        return T8;
    }

    public Carta getT9() {
        return T9;
    }

    public Carta getT10() {
        return T10;
    }

    public Carta getTPrincipe() {
        return TPrincipe;
    }

    public Carta getTReina() {
        return TReina;
    }

    public Carta getTRey() {
        return TRey;
    }

    public Carta getDAs() {
        return DAs;
    }


    public Carta getD2() {
        return D2;
    }

    public Carta getD3() {
        return D3;
    }

    public Carta getD4() {
        return D4;
    }

    public Carta getD5() {
        return D5;
    }

    public Carta getD6() {
        return D6;
    }

    public Carta getD7() {
        return D7;
    }

    public Carta getD8() {
        return D8;
    }

    public Carta getD9() {
        return D9;
    }

    public Carta getD10() {
        return D10;
    }

    public Carta getDPrincipe() {
        return DPrincipe;
    }

    public Carta getDReina() {
        return DReina;
    }

    public Carta getDRey() {
        return DRey;
    }

}
