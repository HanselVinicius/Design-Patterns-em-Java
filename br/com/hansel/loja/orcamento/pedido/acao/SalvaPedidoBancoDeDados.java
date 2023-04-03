package br.com.hansel.loja.orcamento.pedido.acao;

import br.com.hansel.loja.orcamento.pedido.Pedido;

public class SalvaPedidoBancoDeDados implements AcoesAposGerarPedido{

    public void executar(Pedido pedido){
        System.out.println("Salvando pedido no banco de dados");
    }


}
