/* Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
 *           Receber o tempo de percurso e a velocidade média
 * Programador: Rodrigo Martinez
 * Data: 07/Fev/2020
 */

import javax.swing.JOptionPane;

public class Lt01_Ex17 
{
    public static void main (String args [])
    {
        float Horas, Velocidade;
                
        Horas = Float.parseFloat(JOptionPane.showInputDialog ("Digite a qtde de horas de viagem"));
        Velocidade = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor da velocidade média"));
        
        Horas = Horas * Velocidade;
        Horas = Horas/12;
        
        System.out.println ("O consumo de combustível é de " + Horas);
    }
}