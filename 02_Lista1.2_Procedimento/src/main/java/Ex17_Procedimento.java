/* Objetivo: Calcule a quantidade de litros gastos em uma viagem, sabendo que o automóvel faz 12 km/l.
 *           Receber o tempo de percurso e a velocidade média
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */


import javax.swing.JOptionPane;

public class Ex17_Procedimento     

{
    public static void main (String args [])
    {
        float Horas, Velocidade;
                
        Horas = Float.parseFloat(JOptionPane.showInputDialog ("Digite a qtde de horas de viagem"));
        Velocidade = Float.parseFloat(JOptionPane.showInputDialog ("Digite o valor da velocidade média"));
        
       calculaLitros(Horas, Velocidade);
       
    }


public static void calculaLitros(float Horas, float Velocidade)
{
    
    //float litros;
    
    Horas = (Horas * Velocidade)/12;
    System.out.println ("O consumo de combustível é de " + Horas +" litros");
        
}

}
