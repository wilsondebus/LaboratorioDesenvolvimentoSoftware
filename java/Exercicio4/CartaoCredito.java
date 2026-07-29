/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

/**
 *
 * @author laboratorio
 */
public class CartaoCredito extends MetodoPagamento{
    
    public CartaoCredito(String nomeMetodo, int idPagamento) {
        super(nomeMetodo, idPagamento);
    }

    @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento no valor de "+valor+" via Cartao de Credito");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Metodo de pagamento - Cartao de Credito \nID pagamento - "+idPagamento);
    }
    
}
