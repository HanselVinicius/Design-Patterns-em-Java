package br.com.hansel.loja;


import br.com.hansel.loja.orcamento.pedido.GeraPedido;
import br.com.hansel.loja.orcamento.pedido.GeraPedidoHandler;
import br.com.hansel.loja.orcamento.pedido.acao.EnviarEmailPedido;
import br.com.hansel.loja.orcamento.pedido.acao.LogDePedido;
import br.com.hansel.loja.orcamento.pedido.acao.SalvaPedidoBancoDeDados;

import java.math.BigDecimal;
import java.util.Arrays;

//padrão de projeto COMMAND que transforma o ato de fazer um request (seja api banco de dados enviar email etc) em um
// objeto sozinho para isto

public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Ana da Silva";
        BigDecimal valorOrcamento = new BigDecimal ("300");
        int quantidadeItens = 3;

        GeraPedido geraPedido = new GeraPedido(cliente,valorOrcamento,quantidadeItens);
        GeraPedidoHandler handler = new GeraPedidoHandler(Arrays.asList(new SalvaPedidoBancoDeDados(),
                new EnviarEmailPedido(),
                new LogDePedido())
                /*dependencias como repository, classe que envia emails..etc*/);
        handler.execute(geraPedido);
    }
}
