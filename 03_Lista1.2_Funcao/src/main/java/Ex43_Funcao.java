/* Objetivo: Calcule e mostre quantos anos serão necessários para que Ana seja maior que Maria 
 *           sabendo que Ana tem 1,10 m e cresce 3 cm ao ano e Maria tem 1,5 m e cresce 2 cm ao ano.
 *
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

        
public class Ex43_Funcao
{
    public static void main (String args [])
    {
        int n=0;
        System.out.println ("Ana sera maior que Maria em "+funcaoAnos(n) +" anos");
    }    
    
    
    static double funcaoAnos(int n)
    {
    
    double ana=1.1, maria=1.5, anos=1;
        
        while (maria >= ana)
        {
            anos = anos + 1;
            ana = 1.1 + (0.03 * anos);
            maria = 1.5 + (0.02 * anos);
        }
        
    return anos;
    }
    
}


