/* Objetivo: Receba um valor inteiro. Verifique e mostre se é divisível por 2 e 3.
 * 
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

import javax.swing.JOptionPane;


public class Ex24_Procedimento {
    
     public static void main (String args [])
    {
        int n1;
        
        n1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o Numero"));
        div2(n1);
    }
     
     
     
     public static void div2(int n1)
     {
        if (n1 % 6 == 0)
        {
            System.out.println ("O numero " +n1 +" eh divisivel por 2 e 3");
        }else
        {
            System.out.println ("O numero " +n1 +" NAO eh divisivel por 2 e 3");
        }
         
     }
    
}
