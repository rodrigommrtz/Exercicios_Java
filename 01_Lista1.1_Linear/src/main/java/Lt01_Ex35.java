/* Objetivo: Receba 2 números inteiros, verifique qual o maior entre eles.
 *           Calcule e mostre o resultado da somatória dos números ímpares entre esses valores
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex35
{
    public static void main (String args [])
    {
        int num, num2, i, soma=0;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o 1o Numero"));
        num2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o 2o Numero"));
        
        
        if (num > num2)
        {
            for (i=num2; i<num+1; i++)
            {
                if (i % 2 != 0)
                {
                    soma = soma + i;
                }
            }
        } else
        {
            for (i=num; i<num2+1; i ++)
            {
                if (i % 2 != 0)
                {
                    soma = soma + i;
                }
            } 
        }
        
        System.out.println ("A somatoria dos impares entre os numero eh: " + soma);
    }
    
}