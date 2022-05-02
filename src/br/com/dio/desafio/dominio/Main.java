package br.com.dio.desafio.dominio;

public class Main {
    public static void main(String[] args) {
        Cliente bruna = new Cliente();
        bruna.setNome("Bruna");

        Conta cc = new ContaCorrente(bruna);
        Conta cp = new ContaPoupanca(bruna);
        cc.depositar(100);
        cc.transferir(10,cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
