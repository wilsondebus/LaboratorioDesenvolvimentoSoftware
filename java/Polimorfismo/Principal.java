/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Polimorfismo;

/**
 *
 * @author laboratorio
 */
public class Principal {
    public static void main(String[] args) {
        
        FormaGeometrica quadrado = new FormaGeometrica();
        quadrado.setLado(3.44f); 
        float area;
        area = quadrado.calcularArea(); 
        System.out.println("Area do quadrado: "+area);
        
        Triangulo t = new Triangulo(); 
        t.setAltura(4.5f);
        t.setBase(4.33f);
        area = t.calcularArea();
        System.out.println("Area do triangulo: "+area);
        
                
        
    }
}
