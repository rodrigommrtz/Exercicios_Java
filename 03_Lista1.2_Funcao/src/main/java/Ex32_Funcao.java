/* Objetivo: Receba um número inteiro. Calcule e mostre o seu fatorial.
 *
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex32_Funcao 
{
    public static void main (String args [])
    {
        int num;
                
        num = Integer.parseInt (JOptionPane.showInputDialog ("Digite o numero a ser fatoriado"));
        System.out.println ("O fatorial de "+num + " é " + funcaoFatorial(num));        

    }



    static int funcaoFatorial(int num)
    {
        int fatorial = 1;
   
        if (num > 0)
        {
            for (int i = 1; i <= num; i++)
            {
                fatorial = fatorial * i;
            }
            
        } else 
        {
            System.out.println("Não existe fatorial de numeros menores que 1");
        }
    
        return fatorial;
    }
    
}

