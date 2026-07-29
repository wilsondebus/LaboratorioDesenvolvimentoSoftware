/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.projetoconta;

/**
 *
 * @author laboratorio
 */
public class ProjetoConta {

    public static void main(String[] args) {
        
        ContaCorrente conta = new ContaCorrente(); 
        
        conta.definirSaldoInicial(1000);
        System.out.println("Saldo atual: "+conta.getSaldo());
        
        if(conta.sacar(500)){
            System.out.println("Saque efetuado");
        } else {
            System.out.println("Saldo nao efetuado");
        }
        
        conta.depositar(50);
        
        if(conta.sacar(600)){
            System.out.println("Saque efetuado");
        } else {
            System.out.println("Saldo nao efetuado");
        }
        
        System.out.println("Saldo atual: "+conta.getSaldo());
        
    }
}
