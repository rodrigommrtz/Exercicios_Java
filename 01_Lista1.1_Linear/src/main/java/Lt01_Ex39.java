/* Objetivo: Calcule a quantidade de grãos contidos em um tabuleiro de xadrez onde: 
 *           Casa: 1 2 3 4 ... 64 
 *           Qte: 1 2 4 8 ... N
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */



import javax.swing.JOptionPane;

        
public class Lt01_Ex39
{
    public static void main (String args [])
    {
                
        double num=0, calc, soma=0, casas;
        
        casas = Double.parseDouble (JOptionPane.showInputDialog ("Digite a quantidade de casas: "));
        
        
        while (num <=casas - 1)
        {
            calc = Math.pow(2, num);
            num = num + 1;
            soma = soma + calc;
      
        }

        System.out.println ("A qtde de graos eh de: " + soma);
        
    }
    
}