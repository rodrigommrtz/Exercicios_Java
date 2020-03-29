/* Objetivo:  Criar e carregar uma matriz [4][3] inteiro com quantidade de produtos vendidos em 4 semanas. 
 *            Calcular e exibir:
 *              a. A quantidade de cada produto vendido no mês;
 *              b. A quantidade de produtos vendidos por semana;
 *              c. O total de produtos vendidos no mês.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex08_Matrizes 
{
    public static void main (String args[])
    {
       int matriz[][] = new int [4][3];
       int sem[] = new int [4];
       int prod[] = new int [3];
       int i, x, soma=0;
       
       
       for (i=0; i<4; i++)
        {
            for (x=0; x<3; x++)
            {
                matriz[i][x] = Integer.parseInt (JOptionPane.showInputDialog ("Digite a quantidade produtos na semana " +(i+1) +" para o produto "+(x+1)));
                sem[i] = sem[i] + matriz [i][x];
                prod[x] = prod[x] + matriz [i][x];
                soma = soma + matriz[i][x];
                
            }
            
        }
        
       System.out.print ('\n');
       for (i=0; i<4; i++)
       {
           System.out.println ("Produtos vendidos na semana "+(i+1) +" : " +sem[i]);
       }
        
       System.out.print ('\n');
       for (x=0; x<3; x++)
       {
           System.out.println ("Produtos vendidos no mes "+(x+1) +" : " +prod[x]);
       }
       
       System.out.println ("\nTotal de produtos no mes: " + soma);
        
    }

    
}
