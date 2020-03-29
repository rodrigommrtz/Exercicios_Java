/* Objetivo: Receba 2 valores inteiros e diferentes. Mostre seus valores em ordem crescente.
 * 
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

import javax.swing.JOptionPane;


public class Ex22_Procedimento 
{
    public static void main (String args [])
    {
        
     int N1, N2;
     
     N1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 1º Numero"));
     N2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o 2º Numero"));
        
    chamaCrescente(N1, N2);
     
    }
          
    
    public static void chamaCrescente(int N1, int N2)
    {
        if (N1 == N2)
        {
            System.out.println ("Os Numeros devem ser diferentes");
            } else
            {
                if (N1 > N2)
                {
                    System.out.println (" A sequencia do maior e menor é: " + N1 + " e " + N2);
            
                } else 
                {
                    System.out.println (" A sequencia do maior e menor é: " + N2 + " e " + N1);
                }
            }
    }
               
}
