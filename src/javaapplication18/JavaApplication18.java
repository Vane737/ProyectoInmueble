/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication18;

import java.util.ArrayList;

/**
 *
 * @author DiegoAVV
 */
public class JavaApplication18 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<Integer> lista = new ArrayList();
        lista.add(65);
        lista.add(89);
        lista.add(98);
        lista.add(03);
        lista.add(69);
        cuadradosMedios(5735, 5);
        //congruenciaAditivo(lista, 100, 50);
        
        //congruencialLineal(37, 19, 33, 100, 20);
        
        //congruencialMultiplicativo(17, 21, 32, 20); // m=2^g ; a= 3+8k || a= 5+8k ; x0 impar ; g entero ; 
        //n = 2^g-2 
        
                                //x1, a,  b,  c, m,  i      
        congruencialNLCuadratico(13, 26, 27, 27, 32, 10); // m=2^g ; a par ; c impar ; g entero ; n = m
        //   (b-1) % 4 = 1 -----X
        //   (b-1) % 4 = 2 -----!
        
        //congruencialNLBlumBlum(2, 1000, 10); // x=(43)/
    }

    //------------------------------------------
    public static void congruenciaAditivo(ArrayList<Integer> xn, int m, int n) {
        ArrayList<Integer> L1 = new ArrayList();
        int periodo = 0;
        for (int i = 1; i <= n; i++) {
            int xi = xn.get(i - 1);
            int xi_n = xn.get(xn.size() - 1);
            int xi1 = (xi + xi_n) % m;
            int k = L1.indexOf(xi1);
            if (k >= 0 && periodo == 0) {
                periodo = L1.size() - k;
            }
            L1.add(xi1);
            xn.add(xi1);
        }
        System.out.println(L1);
        System.out.println("Periodo = " + periodo);
    }

    //Congruencial Lineal
    public static void congruencialLineal(int n, int a, int c, int m, int i) {
        ArrayList<Integer> L1 = new ArrayList<>();
        int periodo = 0;
        int xi;
        for (int j = 0; j < i; j++) {
            xi = (a * n + c) % m;
            n = xi;
            int k = L1.indexOf(xi);
            if (k >= 0 && periodo == 0) {
                periodo = L1.size() - k;
            }
            L1.add(xi);
        }
        System.out.println(L1);
        System.out.println("Periodo : = " + periodo);
    }

    //Congruencial Multiplicativo
    public static void congruencialMultiplicativo(int n, int a, int m, int i) {
        ArrayList<Integer> L1 = new ArrayList<>();
        int periodo = 0;
        int xi;
        if (n % 2 == 1) {
            for (int j = 0; j < i; j++) {
                xi = (a * n) % m;
                n = xi;
                int k = L1.indexOf(xi);
                if (k >= 0 && periodo == 0) {
                    periodo = L1.size() - k;
                }
                L1.add(xi);
            }
        }
        System.out.println(L1);
        System.out.println("Periodo : = " + periodo);
    }

//Algoritmo congruenciales no lineales
    public static void congruencialNLCuadratico(int xn, int a, int b, int c, int m, int i) {
        ArrayList<Integer> L1 = new ArrayList<>();
        int periodo = 0;
        int xi;
        for (int j = 0; j < i; j++) {
            xi = (a * (int) Math.pow(xn, 2) + b * xn + c) % m;
            //int ri = xi / (m-1) ;
            xn = xi;
            int k = L1.indexOf(xi);
            if (k >= 0 && periodo == 0) {
                periodo = L1.size() - k;
            }
            L1.add(xi);
        }
        System.out.println(L1);
        System.out.println("Periodo : = " + periodo);
    }

//Algoritmo de Blum Blum y Shub
    public static void congruencialNLBlumBlum(int xn, int m, int i) {
        ArrayList<Integer> L1 = new ArrayList<>();
        int periodo = 0;
        int xi;
        for (int j = 0; j < i; j++) {
            xi = ((int) Math.pow(xn, 2)) % m;
            xn = xi;
            int k = L1.indexOf(xi);
            if (k >= 0 && periodo == 0) {
                periodo = L1.size() - k;
            }
            L1.add(xi);
        }
        System.out.println(L1);
        System.out.println("Periodo : = " + periodo);
    }

    //-----------------------------------------
    public static void cuadradosMedios(int n, int i) {
        int y0;
        int d = (int) (Math.log10(n)) + 1;
        if (d > 3) {
            while (i > 0) {
                y0 = n * n;
                String auxY0 = String.valueOf(y0);
                if (auxY0.length() % 2 == 1) {
                    auxY0 = '0' + auxY0;
                }
                int posInicial = (auxY0.length() - d) / 2;
                String x = auxY0.substring(posInicial, (posInicial + d));
                System.out.println("r = 0." + x);
                n = Integer.valueOf(x);
                i--;
            }
        }
    }

    
    
    
    public static void productosMedios(int n1, int n2, int i) {
        int y0;
        int d1 = (int) (Math.log10(n1)) + 1;
        int d2 = (int) (Math.log10(n2)) + 1;
        if (d1 == d2 && d1 > 3) {
            while (i > 0) {
                y0 = n1 * n2;
                String auxY0 = String.valueOf(y0);
                if (auxY0.length() % 2 == 1) {
                    auxY0 = '0' + auxY0;
                }
                int posInicial = (auxY0.length() - d1) / 2;
                String x = auxY0.substring(posInicial, (posInicial + d1));
                System.out.println("r = 0." + x);
                n1 = n2;
                n2 = Integer.valueOf(x);
                i--;
            }
        }
    }

    public static void multiplicadorConstante(int n, int a, int i) {
        int y0;
        int d1 = (int) (Math.log10(n)) + 1;
        int d2 = (int) (Math.log10(a)) + 1;
        if (d1 == d2 && d1 > 3) {
            while (i > 0) {
                y0 = a * n;
                String auxY0 = String.valueOf(y0);
                if (auxY0.length() % 2 == 1) {
                    auxY0 = '0' + auxY0;
                }
                int posInicial = 0;
                String x = auxY0.substring(posInicial, (posInicial + d1));
                System.out.println("r = 0." + x);
                n = Integer.valueOf(x);
                i--;
            }
        }
    }

    //--------------------------------------
    public static void congruenciaLineal2(int x0, int a, int c, int m, int n) {
        ArrayList<Integer> L1 = new ArrayList();
        int xi = x0;
        int periodo = 0;
        for (int i = 1; i <= n; i++) {
            int xi1 = (a * xi + 1) % m;
            //System.out.println("x"+i+"="+ xi1);
            xi = xi1;
            int k = L1.indexOf(xi);
            if (k >= 0 && periodo == 0) {
                periodo = L1.size() - k;
            }
            L1.add(xi);
        }
        System.out.println(L1);
        System.out.println("Periodo = " + periodo);
    }
    
    //Prueba de huecos
    public static double pruebaHuecos(ArrayList<Double>LFE, int LFO[]){
        double sum = 0;
        for (int i = 0; i < LFE.size(); i++) {
            double valorFE = LFE.get(i);
            double valorFO = (double)LFO[i];
            sum = sum + (Math.pow(valorFE - valorFO, 2)) / valorFE;
        }
        return sum;
    }
    
    
    
    //Frecuencia Esperada
    public static void frecEspHuecos(ArrayList<Double> LFE, double ba, int hi){ //huecos i = hi
        double suma = 0;
        for (int i = 0; i < 5; i++) {            
            suma = hi * ba * Math.pow(1 - ba, i) ;
            LFE.add(suma);
        }        
        suma = hi*Math.pow(1 - ba, 5);
        LFE.add(suma);
    }
    
    //Cantidad de huecos
    public static int cantidadHuecos(int FO[]){
        int c = 0;
        for (int i = 0; i < FO.length; i++) {
            c = c + FO[i];
        }
        return c;
    }

    //Frecuencia observada
    public static void FrecObsHueco(ArrayList<Integer>Ls, int FO[]){
        for (int i = 0; i < Ls.size(); i++) { //i = 8
            int h = 0;
            if(Ls.get(i) == 1){ //29
                if(i + 1 < Ls.size()){//desbordamiento
                    if(Ls.get(i+1) == 0){
                        int j = i + 1;
                        while(Ls.get(j) == 0 && j < Ls.size()){
                            h = h + 1;
                            j++;
                        }
                        i = j - 1;
                        if( Ls.get(j) == 1){
                            if( h > 4){
                                FO[5]++; //
                            }else{
                                FO[h]++; 
                            }
                        }
              
                    }else{
                        if( h > 4){
                            FO[5]++; //
                        }else{
                            FO[h]++; 
                        }   
                    }
                }
                    
            }
                
        }
    }
    
    
    // Lista de secuencia 0 y 1
    public static void secuencia(ArrayList<Double>L1, ArrayList<Integer>Ls, double a, double b){
        for (int i = 0; i < L1.size(); i++) {
            if(L1.get(i) >= a && L1.get(i) <= b){
                Ls.add(1);
            }
            else 
                Ls.add(0);
        }
    }
}
