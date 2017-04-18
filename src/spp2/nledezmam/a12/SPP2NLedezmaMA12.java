/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package spp2.nledezmam.a12;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author normaledezma
 */
public class SPP2NLedezmaMA12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double estatura = solicitaDouble("Introduzca su estatura (m):");
        double peso = solicitaDouble("Introduzca su peso (kg):");
        
        double imc = peso / Math.pow(estatura,2);
        
        JOptionPane.showMessageDialog (null, "Su IMC es igual a: " + imc);
        
        if (imc > 25){
             JOptionPane.showMessageDialog (null,"Estás en sobrepeso");
        }else if (imc < 18){
             JOptionPane.showMessageDialog (null,"Estás en desnutrición");
        }else {
             JOptionPane.showMessageDialog (null,"Estás en peso normal");
        }

    }
    public static double solicitaDouble(String mensaje){
     
        double num = 0;
        boolean flag;
        do{
            try{
           String dato = JOptionPane.showInputDialog (null, mensaje);
            num = Double.parseDouble(dato);
            flag=false;
            }catch (Exception ex) {
                JOptionPane.showMessageDialog (null, "Error");
                flag=true;
                } 
        } while (flag); 
        return num;
    }
    
}
