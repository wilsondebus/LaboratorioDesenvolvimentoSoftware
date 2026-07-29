/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

/**
 *
 * @author laboratorio
 */
public class PixPagamento extends MetodoPagamento{
    
    public PixPagamento(String nomeMetodo, int idPagamento) {
        super(nomeMetodo, idPagamento);
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento no valor de "+valor+" via PIX");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Metodo de pagamento - PIX \nID pagamento - "+idPagamento);
    }
    
}
