/* Objetivo: Receba um número N. Calcule e mostre a série 1 + 1/1! + 1/2! + ... + 1/N!.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Ex36_Funcao 
{
     public static void main (String args [])
    {
        double n;
       
        n = Double.parseDouble (JOptionPane.showInputDialog ("Digite o numero da sequencia 1/N!"));
        System.out.println ("A soma é :" + funcaoSomaFatorial(n));
        
    }
     
    static double funcaoSomaFatorial(double n)
    {
        double cont=0, fatoracao=1, soma=0;
                
        while (n>0)
        {
            cont = cont + 1;
            fatoracao = (fatoracao * cont);
            System.out.println ("1/"+fatoracao);
            n = n - 1;
            soma = soma + (1/fatoracao);
        }
    return soma;
    }
     
}
        
       