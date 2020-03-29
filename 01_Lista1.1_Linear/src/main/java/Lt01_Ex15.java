/* Objetivo: Receba os valores de 2 catetos de um triângulo retângulo. Calcule e mostre a hipotenusa
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex15 
{
    public static void main (String args [])
    {
        float Hipot, Cat1, Cat2;
        Cat1 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o o 1º Cateto"));
        Cat2 = Float.parseFloat(JOptionPane.showInputDialog ("Digite o o 2º Cateto"));
        Hipot = (float) Math.sqrt((Cat1 * Cat1) + (Cat2 * Cat2));
        System.out.println ("O valor da Hipotenusa é: " + Hipot);
    }
}
