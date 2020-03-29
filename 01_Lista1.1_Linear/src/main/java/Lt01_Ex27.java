/* Objetivo: Receba o número de voltas, a extensão do circuito (em metros) e o tempo de duração (minutos).
 *           Calcule e mostre a velocidade média em km/h.
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex27 
{
    public static void main (String args [])
    {
        float Ext, Voltas, Tempo, VelMed;        
        
        Ext = Integer.parseInt(JOptionPane.showInputDialog ("Digite a extensao do circuito"));
        Voltas = Integer.parseInt(JOptionPane.showInputDialog ("Digite a qtde de voltas do circuito"));
        Tempo = Integer.parseInt(JOptionPane.showInputDialog ("Digite o tempo da corrida"));
        
        VelMed = (float) ((float) ((Ext * Voltas) / (Tempo * Voltas * 60)) * 3.6);
        
        System.out.println ("A velocidade media eh de " + VelMed + "Km/h");
        
    }
}
