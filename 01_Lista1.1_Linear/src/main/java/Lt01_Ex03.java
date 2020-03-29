/* Objetivo: Receba a base e a altura de um triângulo. Calcule e mostre a sua área
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex03 
{
    public static void main (String args [])
    {
        int Lado, Altura;
        Lado = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor do Lado do Triângulo"));
        Altura = Integer.parseInt(JOptionPane.showInputDialog ("Digite o valor da Altura do Triângulo"));
        Lado = (Lado * Altura) / 2;
        System.out.println ("A área do Triângulo é: " + Lado);               
    }
}
