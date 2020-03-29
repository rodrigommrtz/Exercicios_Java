/* Objetivo:  Criar uma matriz [8][8] inteiro e o programa irá carregar segundo:
 *
 *            | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 
 *            | 1 | 2 | 2 | 2 | 2 | 2 | 2 | 1 |             
 *            | 1 | 2 | 3 | 3 | 3 | 3 | 2 | 1 | 
 *            | 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 | 
 *            | 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 |  
 *            | 1 | 2 | 3 | 4 | 4 | 3 | 2 | 1 | 
 *            | 1 | 2 | 3 | 3 | 3 | 3 | 2 | 1 | 
 *            | 1 | 2 | 2 | 2 | 2 | 2 | 2 | 1 | 
 *            | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 1 | 
 *
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Mar/2020
 */

public class Ex11_Matrizes 
{
    public static void main (String args[])
    {
        int matriz[][] = new int [8][8];
        int i, x;
        
        for (i=0; i<8; i++)
        {
            for (x=0; x<8; x++)
            {
                if (i==0 || i==7 || x==0 || x==7)
                {
                    matriz[i][x] = 1;
                }else if (i==1 || i==6 || x==1 || x==6)
                {
                    matriz[i][x]=2;
                }else if (i==2 || i==5 || x==2 || x==5)
                {
                    matriz[i][x] = 3;
                }else 
                {
                    matriz[i][x] = 4;
                }
                    
            }
        }

        for (i=0; i<8; i++)
        {
            System.out.print ("\n");
            for (x=0; x<8; x++)
            {
                System.out.print (+matriz[i][x] + " ");
            }
        }

    }
    
}



