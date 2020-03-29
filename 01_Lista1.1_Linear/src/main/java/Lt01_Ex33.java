/* Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex33 
{
     public static void main (String args [])
    {
        int num;
        double i, soma=0;
        
        num = Integer.parseInt (JOptionPane.showInputDialog ("Digite o número do denominador: "));
        
        for (i=1; i<=num; i++)
        {
            System.out.println ("1/"+i);
            soma = (1/i) + soma;
        }
        System.out.println ("A soma é: " +soma);
    }
     
}