/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

/**
 *
 * @author laboratorio
 */

import java.util.Random; 

public abstract class MetodoPagamento {
    protected String nomeMetodo;
    protected int idPagamento; 

    public MetodoPagamento(String nomeMetodo, int idPagamento) {
        this.nomeMetodo = nomeMetodo;
        Random geradorNumero = new Random(); 
        this.idPagamento = geradorNumero.nextInt(800) + 200; 
    }
    
    public abstract void processaPagamento(double valor);
    public abstract void mostraDetalhesPagamento(); 
    
    
}
