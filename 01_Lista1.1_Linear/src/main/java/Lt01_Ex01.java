/* Objetivo: Coletar o valor do lado de um quadrado, calcular sua área e apresentar o resultado
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex01 
{
    public static void main (String args [])
    {
        int Lado;
        Lado = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor do Lado do Quadrado"));
        Lado = (Lado*Lado);
        System.out.println ("A area do quadrado é: " + Lado);               
    }
}
