/* Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex22 
{
    public static void main (String args [])
    {
        
     int N1, N2;
     
     N1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1º Numero"));
     N2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2º Numero"));
        
     if (N1 == N2)
     {
         System.out.println ("Os Numeros devem ser diferentes");
     } else
     {
         if (N1 > N2)
        {
            System.out.println (" A sequencia do maior e menor e: " + N1 + " e " + N2);
            
        } else 
        {
            System.out.println (" A sequencia do maior e menor e: " + N2 + " e " + N1);
        }
     }
        
     
       
       
    }
}

