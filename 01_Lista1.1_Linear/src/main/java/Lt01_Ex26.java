/* Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex26 
{
    
    public static void main (String args [])
    {
        int n1, n2;
        
        n1 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o 1º Numero"));
        n2 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o 2º Numero"));
        
        if (n1 >= n2 && n1 % n2 ==0)
        {
            System.out.println ("Maior eh multiplo do menor");
        } else
        {
            if (n2 > n1 && n2 % n1 == 0) 
            {
                System.out.println ("Maior eh multiplo do menor");
            }else
            {
                System.out.println ("Maior NAO eh multiplo do menor");
            }
            
        }
        
    }
    
}