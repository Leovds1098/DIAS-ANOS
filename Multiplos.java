/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package multiplos;

import java.util.Scanner;

/**
 *
 * @author HP
 */
public class Multiplos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner sc = new Scanner (System.in);
       
       int anoIni, anoFim;
       double dias = 0;
       
       System.out.print("Ano inicial: ");
       anoIni = sc.nextInt();
       
       System.out.print("Ano final: ");
       anoFim = sc.nextInt();
       
       for (int ano = anoIni; ano <= anoFim; ano++){
           if(ano % 4 == 0){
               dias = dias +366;
           }else{
               dias = dias + 365;
           }
           System.out.println("Total de dias"+dias);
       }
    }
    
}
