/* Objetivo: Receba 2 números inteiros. Verifique e mostre se o maior número é múltiplo do menor.
 *
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

import javax.swing.JOptionPane;


public class Ex26_Procedimento 
{

    public static void main (String args [])
    {
        int n1, n2;
        
        n1 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o 1º Numero"));
        n2 = Integer.parseInt (JOptionPane.showInputDialog ("Digite o 2º Numero"));
        
        multiplo(n1, n2);
        
    }

    
    public static void multiplo(int n1, int n2)
    {
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
