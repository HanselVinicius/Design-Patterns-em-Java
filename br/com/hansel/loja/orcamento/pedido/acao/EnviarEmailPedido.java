package br.com.hansel.loja.orcamento.pedido.acao;

import br.com.hansel.loja.orcamento.pedido.Pedido;

public class EnviarEmailPedido implements AcoesAposGerarPedido {

    public void executar(Pedido pedido){
        System.out.println("enviando email com dados do pedido");
    }


}
