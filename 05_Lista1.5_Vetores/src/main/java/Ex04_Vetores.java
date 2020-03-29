/* Objetivo:  Criar e coletar em um vetor [30] real e calcular e exibir:
 *              a. A média do grupo;
 *              b. A quantidade de notas acima do grupo;
 *              c. As posições dos valores abaixo da média do grupo.
 *
 *
 * Programador: Rodrigo Martinez
 * Data: 18/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex04_Vetores 
{
    public static void main (String args [])
    {
        double v[] = new double [30];
        int i, notas=0;
        double media=0;
        
        for (i=0; i<30; i++)
        {
            v[i] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota: "+(i+1) +"/30"));
            media = v[i] + media;
        }
        
        media = media/30;
                
        for (i=0; i<30; i++)
        {
            if (v[i] > media)
            {
                notas = notas + 1;
            } else
            {
                System.out.println ("Posicao "+(i+1)+" indica nota abaixo da media - Valor digitado: "+v[i]);
            }
        }
        
        System.out.println ("\nMedia dos valores digitados: " +media);
        System.out.println ("A quantidade de notas acima da media eh: " +notas);
        
    }  
}
