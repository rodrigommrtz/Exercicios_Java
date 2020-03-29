/* Objetivo: Calcule e mostre o quadrado dos números entre 10 e 150.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

public class Lt01_Ex31 
{
    public static void main (String args [])
    {
 
        int i, n;
        
        for (i=10; i<151; i++)
        {
            n = i * i;
            System.out.println ("O quadrado de " + i + " eh " + n);
        }
         
    }
    
}