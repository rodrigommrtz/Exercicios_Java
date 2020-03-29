/* Objetivo: Receba os valores em x e y. Efetua a troca de seus valores e mostre seus conteúdos
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex06 
{
    public static void main (String args [])
    {
        int X, Y, Troca;
        X = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de X"));
        Y = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de Y"));
        
        Troca = Y;
        Y = X;
        X = Troca;
                
        System.out.println ("O Novo valor de X é: " + X);               
        System.out.println ("O Novo valor de Y é: " + Y);               
    }
}
