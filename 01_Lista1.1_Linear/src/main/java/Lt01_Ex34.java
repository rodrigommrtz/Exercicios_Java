/* Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */



import javax.swing.JOptionPane;

public class Lt01_Ex34
{
    public static void main (String args [])
    {
        int num, tab, i;
        
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da tabuada (1 a 10)"));
        
        for (i=2; i<11; i++)
        {
            tab = (num * i);
            System.out.println (+num +" x " +i + " = " + tab);
            
        }
        
        
    }
    
}
    