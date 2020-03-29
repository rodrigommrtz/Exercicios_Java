/* Objetivo: Receba o ano de nascimento e o ano atual. Calcule e mostre a sua idade e quantos anos terá daqui a 17 anos.
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex12 
{
    public static void main (String args [])
    {
        int Ano1, Ano2;
        Ano1 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o ano do seu Nascimento"));
        Ano2 = Integer.parseInt(JOptionPane.showInputDialog ("Digite o ano Atual"));
        Ano1 = Ano2 - Ano1;
        Ano2 = Ano1 + 17;
        System.out.println ("Sua idade é " + Ano1);              
        System.out.println ("Sua idade em 17 anos será de " + Ano2);
    }
}
