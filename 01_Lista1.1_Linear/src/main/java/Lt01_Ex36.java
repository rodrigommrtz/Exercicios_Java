/* Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex36 
{
     public static void main (String args [])
    {
        
        double n, cont=0, fatoracao, soma=0;
        fatoracao = 1;

        n = Double.parseDouble (JOptionPane.showInputDialog ("Digite o numero da sequencia 1/N!"));
        
        while (n>0)
        {
            cont = cont + 1;
            fatoracao = (fatoracao * cont);
            System.out.println ("1/"+fatoracao);
            n = n - 1;
            soma = soma + (1/fatoracao);
        }
            System.out.println ("A soma é :" + soma);

    }
     
}
        
       