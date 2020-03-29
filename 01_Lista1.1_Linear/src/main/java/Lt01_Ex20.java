/* Objetivo: Receba 3 coeficientes A, B, e C de uma equação do 2º grau da fórmula AX²+BX+C=0.
             Verifique e mostre a existência de raízes reais e se caso exista, calcule e mostre.
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */


import javax.swing.JOptionPane;

public class Lt01_Ex20 
{
    public static void main (String args [])
    {
        int A, B, C, Delta, X1, X2;
    
        A = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de A"));
        B = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de B"));
        C = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor de C"));

        Delta = (B * B) - ((4 * A * C));
        
        if (Delta < 0){
                System.out.println ("Não há raízes reais");
        } else {
                X1 = (int) ((float) (-B) - (Math.sqrt (Delta)) / 2 * A);
                X2 = (int) ((float) (-B) + (Math.sqrt (Delta)) / 2 * A);
                    
                System.out.println ("X1 é: " + X1);        
                System.out.println ("X2 é: " + X2);        
         }
                   
    }
                
}
    