/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PruebasEstadisticas;

import java.util.*;

/**
 *
 * @author DiegoAVV
 */
public class Pruebas_Estadisticas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here        
        ArrayList<Double> L1 = new ArrayList();
        //----- Prueba Media del Aditivo
        /*
        int m= 100; int n = 40;        
        ArrayList<Integer> lista = new ArrayList();
        lista.add(65); lista.add(89); lista.add(98); lista.add(03); lista.add(69);
        
        
        estadisticoPruebaMedia(congruenciaAditivoF(lista, 100, 40), n, 1.96);
        */
        
        //PRUEBA CHI CUADRADA
        /*
        int n= 100; int m= 10;
        int FO[] = new int[m];
        ArrayList<Integer> lista = new ArrayList<>();    
        encontrarFrecuenciaObs(congruenciaAditivoF(lista, 100, n), FO, m);
        
        //Congruencial Multiplicativo, cuadratico y lineal no sigue una distribucion uniforme
        estadisticoPruebaUniformidadChiCuadrada(FO, (double)(n/m));
        */
        //------------Media----------------
/*        
        int n= 40; double z = 1.96;
        L1.add(0.0449); L1.add(0.1733); L1.add(0.5746); L1.add(0.049); L1.add(0.8406); L1.add(0.8349); L1.add(0.92); L1.add(0.2564); 
        L1.add(0.6015); L1.add(0.6694); L1.add(0.3972); L1.add(0.7025); L1.add(0.1055); L1.add(0.1247); L1.add(0.1977); L1.add(0.0125);
        L1.add(0.63); L1.add(0.2531); L1.add(0.8297); L1.add(0.6483); L1.add(0.6972); L1.add(0.9582); L1.add(0.9085); L1.add(0.8524);
        L1.add(0.5514); L1.add(0.0316); L1.add(0.3587); L1.add(0.7041); L1.add(0.5915); L1.add(0.2523); L1.add(0.2545); L1.add(0.3044);
        L1.add(0.0207); L1.add(0.1067); L1.add(0.3857); L1.add(0.1746); L1.add(0.3362); L1.add(0.1589); L1.add(0.3727); L1.add(0.4145);
        //estadisticoPruebaMedia(L1, n, z);
        
        //------------Varianza---------------
        
        double a = 58.1200541; double l_a = 23.6543003;
        estadisticoPruebaVarianza(congruencialMultiplicativoF(17, 21, 32, n), n, a, l_a);
+/         
        //-------------Uniformidad Chi-Cuadrada------------
        /*
        L1.add(0.347); L1.add(0.832); L1.add(0.966); L1.add(0.472); L1.add(0.797); L1.add(0.101); L1.add(0.696); L1.add(0.966); L1.add(0.404); L1.add(0.603);
        L1.add(0.993); L1.add(0.371); L1.add(0.729); L1.add(0.067); L1.add(0.189); L1.add(0.977); L1.add(0.843); L1.add(0.562); L1.add(0.549); L1.add(0.992); 
        L1.add(0.674); L1.add(0.628); L1.add(0.055); L1.add(0.494); L1.add(0.494); L1.add(0.235); L1.add(0.178); L1.add(0.775); L1.add(0.797); L1.add(0.252); 
        L1.add(0.426); L1.add(0.054); L1.add(0.022); L1.add(0.742); L1.add(0.674); L1.add(0.898); L1.add(0.641); L1.add(0.674); L1.add(0.821); L1.add(0.190); 
        L1.add(0.460); L1.add(0.224); L1.add(0.990); L1.add(0.786); L1.add(0.393); L1.add(0.461); L1.add(0.011); L1.add(0.977); L1.add(0.246); L1.add(0.881); 
        L1.add(0.189); L1.add(0.753); L1.add(0.730); L1.add(0.797); L1.add(0.292); L1.add(0.876); L1.add(0.707); L1.add(0.562); L1.add(0.562); L1.add(0.821); 
        L1.add(0.112); L1.add(0.191); L1.add(0.584); L1.add(0.347); L1.add(0.426); L1.add(0.057); L1.add(0.819); L1.add(0.404); L1.add(0.303); L1.add(0.640); 
        L1.add(0.370); L1.add(0.314); L1.add(0.731); L1.add(0.742); L1.add(0.213); L1.add(0.472); L1.add(0.641); L1.add(0.280); L1.add(0.944); L1.add(0.663); 
        L1.add(0.909); L1.add(0.764); L1.add(0.999); L1.add(0.303); L1.add(0.718); L1.add(0.933); L1.add(0.056); L1.add(0.819); L1.add(0.415); L1.add(0.444); 
        L1.add(0.178); L1.add(0.516); L1.add(0.437); L1.add(0.393); L1.add(0.268); L1.add(0.123); L1.add(0.945); L1.add(0.459); L1.add(0.527); L1.add(0.652); 
        */
        
        int n= 100; int m= 10;
        int FO[] = new int[m];
        ArrayList<Integer> lista = new ArrayList<>();
        lista.add(65); lista.add(89); lista.add(98); lista.add(03); lista.add(69);    
        ///encontrarFrecuenciaObs(congruenciaAditivoF(lista, 100, n), FO, m);
        
        //Congruencial Multiplicativo, cuadratico y lineal no sigue una distribucion uniforme
        estadisticoPruebaUniformidadChiCuadrada(FO, (double)(n/m));
        
        //----------------------Uniformidad Kolmogorov-Smirnov----------
        
        /*int n = 10; 
        L1.add(0.97); L1.add(0.11); L1.add(0.65); L1.add(0.26); L1.add(0.98); 
        L1.add(0.03); L1.add(0.13); L1.add(0.89); L1.add(0.21); L1.add(0.69);
        ordenarLista(L1);
        estadisticoPruebaUniformidadKolmogorovSmirnov(L1, n);
        */
        //---------------Independencia Arriba y Abajo---------
        /*
        int n = 40;
        L1.add(0.34); L1.add(0.83); L1.add(0.96); L1.add(0.47); L1.add(0.79); L1.add(0.99); L1.add(0.37); L1.add(0.72); L1.add(0.06); L1.add(0.18);  
        L1.add(0.67); L1.add(0.62); L1.add(0.05); L1.add(0.49); L1.add(0.59); L1.add(0.42); L1.add(0.05); L1.add(0.02); L1.add(0.74); L1.add(0.67);
        L1.add(0.46); L1.add(0.22); L1.add(0.99); L1.add(0.78); L1.add(0.39); L1.add(0.18); L1.add(0.75); L1.add(0.73); L1.add(0.79); L1.add(0.29);
        L1.add(0.11); L1.add(0.19); L1.add(0.58); L1.add(0.34); L1.add(0.42); L1.add(0.37); L1.add(0.31); L1.add(0.73); L1.add(0.74); L1.add(0.21);
        ArrayList<Integer> s = new ArrayList<>();
        secuenciaS(L1,s);
        estadisticoPruebaIndependienciaArribaAbajo(s, n);
         */
        //---------------Independencia Arriba y Abajo---------
        /*int n = 50;
        L1.add(0.809); L1.add(0.042); L1.add(0.432); L1.add(0.538); L1.add(0.225); L1.add(0.880); L1.add(0.688); L1.add(0.772); L1.add(0.036); L1.add(0.854);
        L1.add(0.397); L1.add(0.268); L1.add(0.821); L1.add(0.897); L1.add(0.070); L1.add(0.721); L1.add(0.087); L1.add(0.350); L1.add(0.779); L1.add(0.482);
        L1.add(0.136); L1.add(0.855); L1.add(0.453); L1.add(0.197); L1.add(0.444); L1.add(0.799); L1.add(0.809); L1.add(0.691); L1.add(0.545); L1.add(0.857);
        L1.add(0.692); L1.add(0.055); L1.add(0.348); L1.add(0.373); L1.add(0.436); L1.add(0.290); L1.add(0.015); L1.add(0.834); L1.add(0.599); L1.add(0.724);
        L1.add(0.564); L1.add(0.709); L1.add(0.946); L1.add(0.754); L1.add(0.677); L1.add(0.128); L1.add(0.012); L1.add(0.498); L1.add(0.600); L1.add(0.913); 
        ArrayList<Integer> s = new ArrayList<>();
        secuenciaSMedia(L1,s);
        estadisticoPruebaIndependienciaArribaAbajoDeLaMedia(s, n);
         */
        //------------------Independencia Serie-----
        /*
        int n = 30, m = 9; //n = cantidad de # aleatorios, m = cantidad de intervalos de clase
        int d = (int)Math.sqrt(m);
        int MFO[][] = new int[d][d];                                
        
        L1.add(0.872); L1.add(0.219); L1.add(0.570); L1.add(0.618); L1.add(0.291); L1.add(0.913);
        L1.add(0.950); L1.add(0.041); L1.add(0.842); L1.add(0.512); L1.add(0.151); L1.add(0.511);
        L1.add(0.343); L1.add(0.036); L1.add(0.706); L1.add(0.462); L1.add(0.596); L1.add(0.586);
        L1.add(0.058); L1.add(0.213); L1.add(0.809); L1.add(0.005); L1.add(0.443); L1.add(0.608);
        L1.add(0.384); L1.add(0.946); L1.add(0.300); L1.add(0.203); L1.add(0.868); L1.add(0.879); 
        
        encontrarFrecuenciaObsSerie(L1, MFO, d);
        mostrarSerie(MFO);
        //FE = Frecuencia esperada n/m
        System.out.println(pruebaDeSerie(MFO, d));
       ¨*/
        //--------------------Independencia Hueco
        double a = 0.8;
        double b = 1.0;            
        int ch = 0;
        ArrayList<Integer> s = new ArrayList<>();
        ArrayList<Double> fe = new ArrayList<>();
        ArrayList<Integer> fo = new ArrayList<>();
        fo.add(0); fo.add(0); fo.add(0); fo.add(0); fo.add(0); fo.add(0);
        L1.add(0.872); L1.add(0.950); L1.add(0.343); L1.add(0.058); L1.add(0.384);
        L1.add(0.219); L1.add(0.041); L1.add(0.036); L1.add(0.213); L1.add(0.946);
        L1.add(0.570); L1.add(0.842); L1.add(0.706); L1.add(0.809); L1.add(0.300);
        L1.add(0.618); L1.add(0.512); L1.add(0.462); L1.add(0.005); L1.add(0.203);
        L1.add(0.291); L1.add(0.151); L1.add(0.596); L1.add(0.443); L1.add(0.868);
        L1.add(0.913); L1.add(0.511); L1.add(0.586); L1.add(0.608); L1.add(0.879);
        secuenciaSHueco(L1, s, a, b);
        frecuenciaObsHuecos(s, fo);                
        ch = totalHuecos(fo);
        frecuenciaEsperadaHueco(fe, b-a, ch);
        System.out.println(fo.toString()+ "  "+fe.toString()+"   ch="+ ch);
        pruebaDeHuecos(fe, fo);
        
        //---------- Poker-------------------
        /* 
        L1.add(0.06141);    L1.add(0.72484);    L1.add(0.94107);
        L1.add(0.81792);    L1.add(0.48999);    L1.add(0.18590);
        L1.add(0.52953);    L1.add(0.50502);    L1.add(0.30444);
        L1.add(0.04127);    L1.add(0.67347);    L1.add(0.28103);
        L1.add(0.27813);    L1.add(0.62182);    L1.add(0.82578);
        
        L1.add(0.56766);    L1.add(0.14411);    L1.add(0.87648);
        L1.add(0.06060);    L1.add(0.11223);    L1.add(0.64794);
        L1.add(0.70688);    L1.add(0.25357);    L1.add(0.31555);
        L1.add(0.99367);    L1.add(0.44598);    L1.add(0.73997);
        L1.add(0.85923);    L1.add(0.51483);    L1.add(0.09099);
        ArrayList<Integer> cat = new ArrayList<>();
        int n = 30;
        cat.add(0); cat.add(0); cat.add(0); cat.add(0); cat.add(0); cat.add(0); cat.add(0);
        ArrayList<Double> fe = new ArrayList<>();
        fe.add(0.3024); fe.add(0.5040); fe.add(0.1080); fe.add(0.0090); fe.add(0.0720); fe.add(0.0045); fe.add(0.0001);
        frecuenciaEspPoker(fe, n);
        frecuenciaPoker(L1, cat);
        System.out.println(cat.toString());
        pruebaPoker(fe, cat);
        */
    }
    
        
    
    public static int totalHuecos(ArrayList<Integer> Ls){
        int c = 0;
        for (int i = 0; i < Ls.size(); i++) {
            c = c + Ls.get(i);
        }
        return c;
    }
    
    public static void frecuenciaEsperadaHueco(ArrayList<Double> LFE, double ba, int hi){
        double suma = 0;
        for (int i = 0; i < 5; i++) {            
            suma = hi * ba * Math.pow(1 - ba, i) ;
            LFE.add(suma);
        }        
        suma = hi*Math.pow(1 - ba, 5);
        LFE.add(suma);
    }
    
    public static void frecuenciaObsHuecos(ArrayList<Integer> L1, ArrayList<Integer> fo) {
        int i = 0;
        while (i < L1.size()-1) {
            int c = 0;
            if (L1.get(i) == 1 && i < L1.size() - 2) {
                if (L1.get(i + 1) == 1) {
                    fo.set(0, fo.get(0)+1);                    
                    i++;
                } else {
                    i++;
                    while (L1.get(i) == 0 && i < L1.size()) {
                        if (L1.get(i) == 0) {
                            c++;
                        }
                        i++;
                    }
                    if (c >= 5) {
                        fo.set(5, fo.get(5)+1);                        
                    } else {
                        fo.set(c, fo.get(c)+1);                        
                    }
                }                
            } else {
                while (L1.get(i) == 0 && i < L1.size()) {
                    if (L1.get(i) == 0) {
                        c++;
                    }
                    i++;
                }
                if (c >= 5) {
                    fo.set(5, fo.get(5)+1);                    
                } else {
                    fo.set(c, fo.get(c)+1);                    
                }
            }
        }
    }

    public static ArrayList<Integer> secuenciaSHueco(ArrayList<Double> L1, ArrayList<Integer> s, double a, double b) {
        for (int i = 0; i < L1.size(); i++) {
            if (L1.get(i) >= a && L1.get(i) <= b) {
                s.add(1);
            } else {
                s.add(0);
            }
        }
        return s;
    }

    public static double pruebaDeHuecos(ArrayList<Double> LFE, ArrayList<Integer> Ls){
        double suma = 0;
        for (int i = 0; i < LFE.size(); i++) {
            double valorFE = LFE.get(i);
            double valorFO = Ls.get(i);
            suma = suma + (Math.pow(valorFE - valorFO, 2)/valorFE) ;
        }
        System.out.println(suma);
        return suma;
    }
    
    
    
    
    public static double pruebaPoker(ArrayList<Double> fe, ArrayList<Integer> fo){
        double suma = 0;
        for (int i = 0; i < fo.size(); i++){
            double valor = fe.get(i) - (double) fo.get(i);
            suma = suma + Math.pow(valor, 2)/fe.get(i);
        }
        System.out.println(suma);
        return suma;
    }
    
    public static void frecuenciaEspPoker(ArrayList<Double> fe, int n){
        for (int i = 0; i < fe.size(); i++){
            fe.set(i, fe.get(i)*n);
        }
    }
    
    public static int clasificar (ArrayList<Integer> L1){                        
        if(L1.size() == 1){
            return 6;
        }
        if(L1.indexOf(4) >= 0){
            return 5;
        }
        if(L1.indexOf(3) >= 0 && L1.indexOf(2) >= 0){
            return 3;
        }
        if(L1.indexOf(3) >= 0 ){
            return 4;
        }
        if(L1.size()==3){
            return 2;
        }
        if(L1.size()==4){
            return 1;
        }        
        return 0;
    }
    
    public static void frecuenciaPoker (ArrayList<Double> L1, ArrayList<Integer> cat){                
        for (int i = 0; i < L1.size(); i++){
            
            String b = String.valueOf(L1.get(i));
            b = b.substring((b.indexOf('.') + 1), b.length());
            int n = Integer.valueOf(b);
            int aux = 0;
            ArrayList<Integer> d = new ArrayList<>();
            ArrayList<Integer> f = new ArrayList<>();
            while (aux<5){
                int r = n % 10;
                n = n / 10;
                if (d.indexOf(r)<0){
                    d.add(r);
                    f.add(1);
                }else{
                    f.set(d.indexOf(r), f.get(d.indexOf(r))+1);
                }       
                aux++;
            }
            
            cat.set(clasificar(f), cat.get(clasificar(f))+1);
        }
    }

    public static double pruebaDeSerie(int MFO[][], int FE) {
        double suma = 0;
        for (int i = 0; i < MFO.length; i++) {
            for (int j = 0; j < MFO[i].length; j++) {
                double valor = MFO[i][j] - (double) FE;
                suma = suma + valor * valor / (double) FE;
            }

        }
        return suma;
    }

    public static void mostrarSerie(int MFO[][]) {
        for (int i = 0; i < MFO.length; i++) {
            for (int j = 0; j < MFO[i].length; j++) {
                System.out.print("  " + MFO[i][j]);
            }
            System.out.println("");
        }
        System.out.println("");
    }

    public static void encontrarFrecuenciaObsSerie(ArrayList<Double> L1, int MFO[][], int m) {
        int x, y;
        for (int i = 0; i < L1.size() - 1; i++) {
            x = 1;
            y = 1;
            double n1 = L1.get(i);
            double n2 = L1.get(i + 1);
            while (n1 > (double) x / (double) m) {
                x = x + 1;
            }
            while (n2 > (double) y / (double) m) {
                y = y + 1;
            }
            MFO[x - 1][y - 1]++;
        }
    }    

    public static void estadisticoPruebaIndependienciaArribaAbajoDeLaMedia(ArrayList<Integer> s, int n) {
        int c = corridas(s);
        int n1 = cantidad_1(s);
        int n0 = n - n1;
        double u = ((double) (2 * n1 * n0) / (double) n) + 0.5;
        double a = (double) (2 * n1 * n0 * ((2 * n0 * n1) - n)) / (double) (Math.pow(n, 2) * (n - 1));
        double z = (c - u) / Math.sqrt(a);
        System.out.println("c=" + c);
        System.out.println("u=" + u);
        System.out.println("a=" + a);
        System.out.println("z=" + z);
    }

    public static ArrayList<Integer> secuenciaSMedia(ArrayList<Double> L1, ArrayList<Integer> s) {
        for (int i = 0; i < L1.size(); i++) {
            if (L1.get(i) >= 0.5) {
                s.add(1);
            } else {
                s.add(0);
            }
        }
        return s;
    }

    public static ArrayList<Integer> secuenciaS(ArrayList<Double> L1, ArrayList<Integer> s) {
        for (int i = 1; i < L1.size(); i++) {
            if (L1.get(i) > L1.get(i - 1)) {
                s.add(1);
            } else {
                s.add(0);
            }
        }
        return s;
    }

    public static int cantidad_1(ArrayList<Integer> L1) {
        int c = 0;
        for (int i = 0; i < L1.size(); i++) {
            if (L1.get(i) == 1) {
                c++;
            }
        }
        return c;
    }

    public static int corridas(ArrayList<Integer> L1) {
        int c = 0;
        int i = 0;
        while (i < L1.size() - 1) {
            c++;
            while (L1.get(i) == L1.get(i + 1) && i < L1.size() - 2) {
                i++;
            }
            i++;
        }
        if (L1.get(L1.size() - 1) != L1.get(L1.size() - 2)) {
            c++;
        }
        return c;
    }

    public static void estadisticoPruebaIndependienciaArribaAbajo(ArrayList<Integer> L1, int n) {
        int c = corridas(L1);
        double u = (double) (2 * n - 1) / (double) 3;
        double a = (double) (16 * n - 29) / (double) 90;
        double z = (c - u) / Math.sqrt(a);
        z = Math.abs(z);
        System.out.println("c=" + c);
        System.out.println("u=" + u);
        System.out.println("a=" + a);
        System.out.println("z=" + z);
    }

    public static double mayor(ArrayList<Double> L1) {
        double m = 0;
        for (int i = 0; i < L1.size(); i++) {
            if (L1.get(i) > m) {
                m = L1.get(i);
            }
        }
        return m;
    }

    public static void ordenarLista(ArrayList<Double> L1) {
        for (int i = 0; i < L1.size() - 1; i++) {
            for (int j = i + 1; j < L1.size(); j++) {
                if (L1.get(i) > L1.get(j)) {
                    double aux = L1.get(i);
                    L1.set(i, L1.get(j));
                    L1.set(j, aux);
                }
            }
        }
    }

    public static void estadisticoPruebaUniformidadKolmogorovSmirnov(ArrayList<Double> L1, int n) {
        ArrayList<Double> dpos = new ArrayList<>();
        ArrayList<Double> dneg = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            double a = (double) i / (double) n;
            double valor = a - L1.get(i - 1);
            dpos.add(valor);
        }
        for (int i = 0; i < n; i++) {
            double a = (double) i / (double) n;
            double valor = L1.get(i) - a;
            dneg.add(valor);
        }
        System.out.println("(i/n) - r= " + dpos.toString());
        System.out.println("r - (i-1)/n= " + dneg.toString());
        System.out.println("D+= " + mayor(dpos));
        System.out.println("D-= " + mayor(dneg));
        if (mayor(dpos) > mayor(dneg)) {
            System.out.println("D= " + mayor(dpos));
        } else {
            System.out.println("D= " + mayor(dneg));
        }
    }

    public static void estadisticoPruebaUniformidadChiCuadrada(int FO[], double FE) {
        double suma = 0;
        for (int i = 0; i < FO.length; i++) {
            double valor = FO[i] - FE;
            suma = suma + (Math.pow(valor, 2) / FE);
        }
        System.out.println("r= " + suma);
    }

    public static void estadisticoPruebaVarianza(ArrayList<Double> L1, int n, double a, double l_a) {
        double v;
        double suma = 0;
        double prom = 0;
        for (int i = 0; i < n; i++) {
            suma = L1.get(i) + suma;
        }
        prom = suma / 40;
        suma = 0;
        for (int i = 0; i < n; i++) {
            double aux = L1.get(i) - prom;
            suma = Math.pow(aux, 2) + suma;
        }
        v = suma / (n - 1);
        double ls = a / (12 * (n - 1));
        double li = l_a / (12 * (n - 1));
        System.out.println("r= " + v + " | LI= " + li + " | LS= " + ls);
    }

    public static void estadisticoPruebaMedia(ArrayList<Double> L1, int n, double z) {
        double r;
        double suma = 0;
        for (int i = 0; i < n; i++) {
            suma = L1.get(i) + suma;
        }
        r = suma / n;
        double a = Math.sqrt(12 * n);
        double li = 0.5 - (z / a);
        double ls = 0.5 + (z / a);
        System.out.println("r= " + r + " | LI= " + li + " | LS= " + ls);
    }

    public static void congruencialLineal(ArrayList<Double> L1, int n, int a, int c, int m, int i) {
        int periodo = 0;
        int xi;
        for (int j = 0; j < i; j++) {
            xi = (a * n + c) % m;
            n = xi;
            int k = L1.indexOf(xi);
            if (k >= 0 && periodo == 0) {
                periodo = L1.size() - k;
            }
            double r = (double) xi / (double) m - 1;
            L1.add(r);
        }
    }

    public static void mostrar(int FO[]) {
        for (int i = 0; i < FO.length; i++) {
            System.out.print("   " + FO[i]);
        }
        System.out.println("");
    }

    

    public static void generarAleatorio(ArrayList<Double> L1, int n) {
        for (int i = 1; i <= n; i++) {
            L1.add(Math.random());
        }
    }

    public static ArrayList<Double> congruencialLinealF(int n, int a, int c, int m, int i) {
        ArrayList<Double> L1 = new ArrayList<>();
        int xi;
        double r = 0.0;
        for (int j = 0; j < i; j++) {
            xi = (a * n + c) % m;
            n = xi;
            r = ((double) xi / (m - 1));
            L1.add(r);
        }
        return L1;
    }

    public static ArrayList<Double> congruenciaAditivoF(ArrayList<Integer> xn, int m, int n) {
        ArrayList<Double> L1 = new ArrayList();
        double r = 0.0;
        for (int i = 1; i <= n; i++) {
            int xi = xn.get(i - 1);
            int xi_n = xn.get(xn.size() - 1);
            int xi1 = (xi + xi_n) % m;
            r = ((double) xi1 / (m - 1));
            //int k = L1.indexOf(xi1);
            //if (k >=0 && periodo == 0) periodo = L1.size() - k;
            L1.add(r);
            xn.add(xi1);
        }
        return L1;
    }

    public static ArrayList<Double> congruencialMultiplicativoF(int n, int a, int m, int i) {
        ArrayList<Double> L1 = new ArrayList<>();
        int xi;
        if (n % 2 == 1) {
            for (int j = 0; j < i; j++) {
                xi = (a * n) % m;
                n = xi;
                double r = (double) xi / (m - 1);
                L1.add(r);
            }
        }
        return L1;
    }

    public static ArrayList<Double> congruencialNLCuadraticoF(int xn, int a, int b, int c, int m, int i) {
        ArrayList<Double> L1 = new ArrayList<>();
        int xi;
        for (int j = 0; j < i; j++) {
            xi = (a * (int) Math.pow(xn, 2) + b * xn + c) % m;

            xn = xi;
            double r = (double) xi / (m - 1);
            //System.out.print(xi + ",");
            L1.add(r);
        }
        return L1;
    }

    public static ArrayList<Double> congruencialNLBlumBlum(int xn, int m, int i) {
        ArrayList<Double> L1 = new ArrayList<>();
        int xi;
        for (int j = 0; j < i; j++) {
            xi = ((int) Math.pow(xn, 2)) % m;
            xn = xi;
            double r = (double) xi / (m - 1);
            L1.add(r);
        }
        return L1;
    }

}
