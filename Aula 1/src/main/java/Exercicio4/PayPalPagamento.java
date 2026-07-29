/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio4;

/**
 *
 * @author laboratorio
 */
public class PayPalPagamento extends MetodoPagamento{
    
    public PayPalPagamento(String nomeMetodo, int idPagamento) {
        super(nomeMetodo, idPagamento);
    }

     @Override
    public void processaPagamento(double valor) {
        System.out.println("Processando pagamento no valor de "+valor+" via Cartao de PayPal");
    }

    @Override
    public void mostraDetalhesPagamento() {
        System.out.println("Metodo de pagamento - PayPal \nID pagamento - "+idPagamento);
    }
}
