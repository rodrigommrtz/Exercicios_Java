/* Objetivo:  A partir do exercício 6 (vetor classificado) solicitar um valor
 *            qualquer e verificar a sua existência no vetor (utilizar pesquisa binária).
 *
 * Programador: Rodrigo Martinez
 * Data: 18/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex07_Vetores 
{
    public static void main (String args[])
    {
        int v[] = new int [20];
        int i, x, j, k, aux, num;
        
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
         
        num = Integer.parseInt (JOptionPane.showInputDialog("Digite o Numero a ser pesquisado"));
        
        i=0;
        j=20;
        k=(j+1)/2;
        
        if (num < v[0] || num >v[19])
        {
            System.out.println ("Valor fora da sequencia");
        } else
        {
            while (i != j-1)
            {
                if (num == v[k])
                {
                    break;
                }else
                {
                    if (num < v[k])
                    {
                        j = k;
                        k = (j + i)/2;
                    }else
                    {
                        i = k;
                        k = (j + i) / 2;
                    }
                 
                }
            }
        }
            
        if (num == v[k])
        {
            System.out.println ("O valor "+num+" FOI encontrado");
        }else
        {
            System.out.println ("O valor "+num+" NAO FOI encontrado");
        }
    }
}
