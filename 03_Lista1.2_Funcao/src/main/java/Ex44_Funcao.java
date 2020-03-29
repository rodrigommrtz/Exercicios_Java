/* Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 *
 * Programador: Rodrigo Martinez
 * Data: 17/Mar/2020
 */

  import javax.swing.JOptionPane;
  
public class Ex44_Funcao
{
    public static void main (String args [])
    {
        float base, exp;
                
        base = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor da BASE: "));
        exp = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor do EXPOENTE: "));
    
        if (exp >= 0)
        {
            System.out.println ("A Potência de " +base +" ^ " +exp +" é: " +funcaoPotencia(base, exp));
        }else
        {
            System.out.println ("A Potência de " +base +" ^ " +exp +" é: 1/" +funcaoPotencia(base, exp) +" (" +(1/funcaoPotencia(base, exp)) +")");
    
        }
    }
    
    
        
    static float funcaoPotencia(float base, float exp)
    {
        float cont=0, potencia=0, x=1;
    
        if (exp == 0)
        {
            potencia = 1;
                        
        } else
        {
            if (exp > 0)
            {
                while (cont < exp)
                {
                    potencia = (x * base);
                    x = potencia;
                    cont = cont + 1;
                }
                                
            } else
            {
                while (cont > exp) 
                {
                    potencia = (x * base);
                    x = potencia;
                    cont = cont - 1;
                
                }
                
                
            }
                
        }
       return potencia;
    }
        
}