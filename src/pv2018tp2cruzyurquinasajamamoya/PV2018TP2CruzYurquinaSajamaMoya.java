/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pv2018tp2cruzyurquinasajamamoya;

import java.util.ArrayList;
import java.util.Scanner;
import puntouno.Punto;

/**
 *
 * @author Alumno
 */
public class PV2018TP2CruzYurquinaSajamaMoya {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Punto> lista = new ArrayList<>();
        System.out.println("Ingresar punto uno: ");
        String p1 = sc.nextLine();
        System.out.println("Ingresar punto dos: ");
        String p2 = sc.nextLine();
        double distancia;
        distancia = p1.calcularDistanciaDesde(p2);
        System.out.println("La distancia del objeto 1 al objeto 2 es de: " + distancia);
        // TODO code application logic here
    }
    
}
