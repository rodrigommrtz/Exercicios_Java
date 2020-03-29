/* Objetivo: Receba um número. Calcule e mostre a série 1 + 1/2 + 1/3 + ... + 1/N.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Ex33_Funcao
{
     public static void main (String args [])
    {
        int num;

        num = Integer.parseInt (JOptionPane.showInputDialog ("Digite o número do denominador: "));
        System.out.println ("\nA soma é: " +funcaoSoma(num));
    }
     

     static double funcaoSoma (int num)
     {
        double i, soma=0;
        
        for (i=1; i<=num; i++)
        {
            System.out.println ("1/"+i);
            soma = (1/i) + soma;
        }
        
        return soma;
    }

}



