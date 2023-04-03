package br.com.hansel.loja.orcamento.pedido.acao;

import br.com.hansel.loja.orcamento.pedido.Pedido;

public interface AcoesAposGerarPedido {

    void executar(Pedido pedido);

}
