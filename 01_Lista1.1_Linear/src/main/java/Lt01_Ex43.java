/* Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
 *           sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

        
public class Lt01_Ex43
{
    public static void main (String args [])
    {
        double ana, maria, anos;
        
        ana = 1.1;
        maria = 1.5;
        anos = 1;
        
        while (maria >= ana)
        {
            anos = anos + 1;
            ana = 1.1 + (0.03 * anos);
            maria = 1.5 + (0.02 * anos);
        }
        
        System.out.println ("Ana sera maior que Maria em "+anos+" anos");
    }
    
}


