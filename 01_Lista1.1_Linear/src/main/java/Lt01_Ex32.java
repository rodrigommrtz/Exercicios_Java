/* Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex32 
{
    public static void main (String args [])
    {
        int num, fatorial;
        fatorial = 1;
        
        num = Integer.parseInt (JOptionPane.showInputDialog ("Digite o numero a ser fatoriado"));
                
        if (num > 0)
        {
            for (int i = 1; i <= num; i++)
            {
                fatorial = fatorial * i;
            }
            System.out.println("O fatorial de " + num + " é: " + fatorial);
        } else 
        {
            System.out.println("Não existe fatorial de numeros menores que 1");
        }
    }
}


