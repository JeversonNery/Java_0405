/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_0405;

import java.util.Scanner;
import java.text.NumberFormat;

/**
 *
 * @author Jeverson Nery
 */
public class Java_0405 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        NumberFormat nf = NumberFormat.getCurrencyInstance();
        
        System.out.printf("Informe o nome do vendendor: ");
        String nmvendedor = scan.nextLine();
        
        System.out.printf("Informe o total de vendas realizadas por " + nmvendedor + ": ");
        double tvendas = scan.nextDouble();
        
        System.out.printf("Informe o percentual de comissão de " + nmvendedor + ": ");
        double pcomissao = scan.nextDouble();
        
        double vcomissao = (pcomissao/100)*tvendas;
        
        System.out.println("Valor da comissão de " + nmvendedor + ": " + nf.format(vcomissao));
    }
    
}
