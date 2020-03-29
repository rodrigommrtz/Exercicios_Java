/* Objetivo:  Criar e coletar valores inteiros nos vetores VT1[3] e VT2[3]. 
 *              Concatenar esses valores em um 3º vetor (VT3[6]) e mostrar os seus dados. 
 *              Por exemplo: VT1| 1| 2| 3|         |VT2| 4| 5| 6|      |VT3| 1| 2| 3| 4| 5| 6
 *
 *
 * Programador: Rodrigo Martinez
 * Data: 18/Mar/2020
 */

import javax.swing.JOptionPane;

public class Ex03_vetores 
{
    public static void main (String args [])
    {
        int v1[] = new int [3];
        int v2[] = new int [3];
        int v3[] = new int [6];
        int i;
        
        for (i=0; i<3; i++)
        {
            v1[i] = Integer.parseInt (JOptionPane.showInputDialog("Digite o número "+(i+1)+" para o Vetor1[3]"));
            v2[i] = Integer.parseInt (JOptionPane.showInputDialog("Digite o número "+(i+1)+" para o Vetor2[3]"));
        }
        
        for (i=0; i<6; i++)
        {
            if (i<3)
            {
                v3[i] = v1[i];                
            }else
            {
                v3[i] = v2[i-3];
            }
        }
        
        for (i=0; i<6; i++)
        {
            System.out.println ("Valores na sequencia Vetor1["+(i+1)+"] + Vetor2["+(i+1)+"] -> " +v3[i]);
        }
    }
    
}
