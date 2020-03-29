/* Objetivo:  Criar e coletar em um vetor [20] com números aleatórios. 
 *            Classificar este vetor em ordem crescente e mostre os dados.
 *
 * Programador: Rodrigo Martinez
 * Data: 18/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex06_Vetores 
{
    public static void main (String args[])
    {
        int v[] = new int [20];
        int i, x, aux;
        
        for (i=0; i<20; i++)
        {
            v[i] = Integer.parseInt (JOptionPane.showInputDialog ("Digite um numero: "+(i+1)+"/20"));
        }
        
        for (i=0; i<19; i++)
        {
            for (x=i+1; x<20; x++)
            {
                if (v[i] > v[x])
                {
                    aux = v[x];
                    v[x] = v[i];
                    v[i] = aux;
                }
            }
        }
         
        System.out.println ("Os numeros digitados, em sequencia sao: ");
        
        for (i=0; i<20; i++)
        {
            System.out.println ("v["+(i+1)+"] = "+v[i]);
        }
    }
}
