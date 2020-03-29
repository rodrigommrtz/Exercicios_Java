/* Objetivo: Receba 100 números inteiros reais. 
             Verifique e mostre o maior e o menor valor.
             Obs.: somente valores positivos.

 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex38
{
    public static void main (String args [])
    {
        int n, maior=0, menor= 999999999, i;
        
        for (i=1; i<=100; i++)
        {
            n = Integer.parseInt (JOptionPane.showInputDialog("Digite o Numero " + i + " de 100"));
            if (n > maior)
            {
                maior = n;
            }
            
            if (n < menor)
            {
                menor = n;
            }
        }
        
        System.out.println ("O MENOR numero digitado foi: " + menor);
        System.out.println ("O MAIOR numero digitado foi: " + maior);
        
        
    }
    
}