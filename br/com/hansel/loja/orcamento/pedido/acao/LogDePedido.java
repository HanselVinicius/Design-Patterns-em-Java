package br.com.hansel.loja.orcamento.pedido.acao;

import br.com.hansel.loja.orcamento.pedido.Pedido;

public class LogDePedido implements AcoesAposGerarPedido {
    @Override
    public void executar(Pedido pedido) {
        System.out.println("Pedido foi gerado:  " +pedido);
    }
}
