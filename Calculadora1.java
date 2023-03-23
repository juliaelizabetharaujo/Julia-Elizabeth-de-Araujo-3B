/**
 *
 * @author Andressa Andrade e Júlia Elizabeth 3°B
 */

import javax.swing.JOptionPane;
public class calculadora{
    
    public static void main( String[] args){
        
        String firstNumber = 
                JOptionPane.showInputDialog("digite um número: ");
        String secondNumber =
                JOptionPane.showInputDialog("digite um novo número: ");
        
        String operador =
                JOptionPane.showInputDialog("digite o operador \n- = subtração\n+ = soma\n/ = divisão\n* = multiplicação ");
       
        int Number1 = Integer.parseInt(firstNumber);
        int  Number2 = Integer.parseInt(secondNumber);
        int soma = Number1 + Number2;
        
       
        if(operador.equals("*")) { 
            int multipli = Number1 * Number2;
        JOptionPane.showMessageDialog(null," o valor da multiplicação é "+ multipli,
                "multiplicação dos dois inteiros",JOptionPane.INFORMATION_MESSAGE);
        }else if(operador.equals("- ")){
        int subtra = Number1 - Number2;
        JOptionPane.showMessageDialog(null," o valor da subtração é "+ subtra,
                "a subtração dos dois inteiros",JOptionPane.INFORMATION_MESSAGE);
        
        }else if(operador.equals("/ ")) { 
            int divisao = Number1 / Number2;
        JOptionPane.showMessageDialog(null," o valor da subtração é "+ divisao,
                "divisao dos dois inteiros",JOptionPane.INFORMATION_MESSAGE);
        
        }else if(operador.equals("+ ")){
            JOptionPane.showMessageDialog(null," o valor da soma é "+ soma,
                "soma dos dois inteiros",JOptionPane.INFORMATION_MESSAGE);
        }else{
            JOptionPane.showMessageDialog(null, "ERRO", "calculadora", JOptionPane.ERROR_MESSAGE);    
        }
    }
}
