/* Objetivo: Receba 2 números inteiros. Verifique e mostre todos os números primos existentes entre eles.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;
        
public class Lt01_Ex40
{
    public static void main (String args [])
    {
        int n1, n2, maior, menor, primo=0, cont;
        
        n1 = Integer.parseInt (JOptionPane.showInputDialog("Digite o 1o numero"));
        n2 = Integer.parseInt (JOptionPane.showInputDialog("Digite o 2o numero"));
        

        if (n1 > n2)
        {
            maior = n1;
            menor = n2;
        } else
        {
            maior = n2;
            menor = n1;
        }

        while (maior > menor)
        {
            cont = maior;
            while (cont>0)
            {
                if (maior % cont == 0)
                {
                    primo = primo + 1;
                }
            cont = cont - 1;
            }
            
            if (primo == 2)
            {
            System.out.println ("É número primo: " +maior);
            }
            
            maior = maior - 1;
            primo = 0;
        }
        
        
    }
    
}