/* Objetivo: Receba o número da base e do expoente. Calcule e mostre o valor da potência.
 *
 * Programador: Rodrigo Martinez
 * Data: 26/Fev/2020
 */

  import javax.swing.JOptionPane;
  
public class Lt01_Ex44
{
    public static void main (String args [])
    {
        int base, exp, cont=0, potencia=0, x=1;
                
        base = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor da BASE: "));
        exp = Integer.parseInt (JOptionPane.showInputDialog("Digite o valor do EXPOENTE: "));
        
        
        if (exp == 0)
        {
            potencia = 1;
            System.out.println ("A Potência de " +base +" ^ " +exp +" é: " +potencia);
            
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
                System.out.println ("A Potência de " +base +" ^ " +exp +" é: " +potencia);
                
            } else
            {
                while (cont > exp) 
                {
                    potencia = (x * base);
                    x = potencia;
                    cont = cont - 1;
                
                }
                System.out.println ("A Potência de " +base +" ^ " +exp +" é: 1/" +potencia);
                
            }
                
        }
        
    }
        
}