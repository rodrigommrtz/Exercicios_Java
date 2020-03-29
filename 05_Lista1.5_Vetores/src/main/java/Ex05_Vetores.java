/* Objetivo:  Criar e coletar em um vetor [20] inteiro. Calcule e exiba, segundo: 
 *               10Σ   (A[1] – A[21–1]) 
 *              i = 1
 *
 *
 * Programador: Rodrigo Martinez
 * Data: 18/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex05_Vetores 
{
    public static void main (String args [])
    {
        int v[] = new int [20];
        int i, soma=0;
        
        for (i=0; i<20; i++)
        {
            v[i] = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor, da posicao: "+(i+1)+"/20"));
        }
        
        for (i=0; i<10; i++)
        {
            soma = soma + (v[i] - v[19-i]);
        }
        
        System.out.println ("A soma do valores da soma de A[i] – A[21–i], i=1 eh: " +soma);
    }  
}
