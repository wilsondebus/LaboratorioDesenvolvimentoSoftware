/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio3;

/**
 *
 * @author laboratorio
 */
public class Casa {
    private int tamanho; 
    private float preco;
    private int numeroQuartos; 
    
    public float calcularPreco(int tamanho){
        preco = tamanho * 40;
        return preco; 
    }
    
    public float calcularPreco(int tamanho, int numeroQuartos){
        preco = (tamanho * 40) + (100 * numeroQuartos); 
        return preco; 
    }

    public int getTamanho() {
        return tamanho;
    }

    public void setTamanho(int tamanho) {
        this.tamanho = tamanho;
    }

    public float getPreco() {
        return preco;
    }

    public void setPreco(float preco) {
        this.preco = preco;
    }

    public int getNumeroQuartos() {
        return numeroQuartos;
    }

    public void setNumeroQuartos(int numeroQuartos) {
        this.numeroQuartos = numeroQuartos;
    }
    
    
        
}
