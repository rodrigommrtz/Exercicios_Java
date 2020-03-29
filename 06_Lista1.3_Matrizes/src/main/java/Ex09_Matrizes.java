/* Objetivo:  Criar e carregar uma matriz [4][4] com valores aleatórios, 
 *            sendo que a diagonal principal terá seus dados carregados
 *            no programa segundo:
 *
 *            | 1 |   |   |   |
 *            |   | 4 |   |   |
 *            |   |   |16 |   |
 *            |   |   |   |64 |
 *
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex09_Matrizes 
{
    public static void main (String args[])
    {
        int matriz[][] = new int [4][4];
        int i, x, exp=0;
        
        for (i=0; i<4; i++)
        {
            for (x=0; x<4; x++)
            {
                if (i == x) 
                {
                    matriz[i][x] = (int) Math.pow (4, exp);
                    exp = exp + 1;
                }else
                {
                    matriz[i][x] = Integer.parseInt (JOptionPane.showInputDialog ("Digite o valor: ")); 
                }
            }
        }
    
    for (i=0; i<4; i++)
    {
        System.out.print ("\n");
        for (x=0; x<4; x++)
     {
         
         System.out.print (+matriz[i][x] +"  ");
     }   
    }
    
    
    
    }
}
