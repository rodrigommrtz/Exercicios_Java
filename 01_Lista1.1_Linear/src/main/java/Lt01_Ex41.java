/* Objetivo: Mostre todas as possibilidades de 2 dados de forma que a soma tenha como resultado 7.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

        
public class Lt01_Ex41
{
    public static void main (String args [])
    {

        int n1, n2;
        
        for (n1=1; n1< 6; n1++)
        {
            n2 = 7 - n1;
            System.out.println ("Para o total de 7, o dado No.1 dever ser: " + n1 + " e o Dado No2.: " + n2 );
            
        }
        
    }
    
}