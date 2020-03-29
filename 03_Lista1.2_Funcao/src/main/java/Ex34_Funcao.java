/* Objetivo: Receba um número. Calcule e mostre os resultados da tabuada desse número
 *
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */



import javax.swing.JOptionPane;

public class Ex34_Funcao
{
    public static void main (String args [])
    {
        int num, i;
              
        num = Integer.parseInt(JOptionPane.showInputDialog("Digite o numero da tabuada (1 a 10)"));
        
        for (i=2; i<11; i++)
        {
            System.out.println (+num +" x " +i +" = " + funcaoTabuada(num,i));
            
        }
    }
    
    static int funcaoTabuada(int num, int i)
    {
        int tab; 
        
        tab = (num * i);
        return tab;
    }

}

  
        
        
        

  