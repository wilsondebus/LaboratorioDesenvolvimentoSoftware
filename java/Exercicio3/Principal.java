/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        
        Casa casa = new Casa(); 
        
        casa.calcularPreco(70);
        System.out.println("Preco da casa 1: "+casa.getPreco());
        casa.calcularPreco(68, 3); 
        System.out.println("Preco da casa 2: "+casa.getPreco());
    }
}
