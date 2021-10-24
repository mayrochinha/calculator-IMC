/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculo.pkgdo.imc;

import javax.swing.JOptionPane;

/**
 *
 * @author Diego Almeida
 */
public class CalculoDoImc {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        float peso, altura, IMC;
        int categoria;
        
        
        peso = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe o seu peso:"));
        altura = Float.parseFloat(JOptionPane.showInputDialog(null, "Informe a sua altura:"));
       
        IMC = peso / (altura * altura);
        
        //JOptionPane.showMessageDialog(null, IMC);
        
        if (IMC >=40){
            JOptionPane.showMessageDialog(null,IMC + "\n Cuidado, você está no maior grau de OBESIDADE, Grau III!");
        }else if (IMC >= 35){
            JOptionPane.showMessageDialog(null,IMC + "\n Cuidado, você está no Grau II de OBESIDADE!");
        }else if (IMC >= 30){
            JOptionPane.showMessageDialog(null,IMC + "\n Cuidado, você está no Grau I de OBESIDADE!");
        }else if (IMC >= 25){
            JOptionPane.showMessageDialog(null,IMC + "\n Cuidado, você está com SOBREPESO!");
            
        }else if (IMC >= 19){
            JOptionPane.showMessageDialog(null,IMC + "\n Aêê! Você está no peso IDEAL!");
        }else{
            JOptionPane.showMessageDialog(null,IMC + "\n Vish.. Você precisa comer mais, está desnutrido(a)!");
        }              
                
                
    
    
    }

}
