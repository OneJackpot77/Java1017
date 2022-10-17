/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gomb;
import java.util.Scanner;
/**
 *
 * @author user12
 */
public class Gomb {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Kérem a gömb sugarát: ");
        double sugar = Double.parseDouble(sc.nextLine());
        Gomb_osztaly g = new Gomb_osztaly(sugar);
        System.out.println("Ennyi a gömb felszine:" + g.felszin());
        System.out.println("Ennyi a gömb térfogata" + g.terfogat());
         System.out.println("Kérem a másik gömb sugarát: ");
        double sugar1 = Double.parseDouble(sc.nextLine());
        Gomb_osztaly g1 = new Gomb_osztaly(sugar1);
         System.out.println("Ennyi a gömb felszine:" + g1.felszin());
        System.out.println("Ennyi a gömb térfogata" + g1.terfogat());
     }
    
}
