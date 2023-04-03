package br.com.hansel.loja;

import br.com.hansel.loja.orcamento.ItemOrcamento;
import br.com.hansel.loja.orcamento.Orcamento;
import br.com.hansel.loja.orcamento.OrcamentoProxy;

import java.math.BigDecimal;

public class TestesComposicao {

    //este é o padrão de projeto COMPOSITE que tem funciona compondo um objeto com outro utilizando-se também das
    //interfaces para tornar esta composição possivel, se  parece bastante com o decorator porém: no composite
    //criamos uma hierarquia de objetos permitindo acessar o todo ou cada elemento de maneira unica
    public static void main(String[] args) {
        Orcamento antigo = new Orcamento();
        antigo.adcionarItem(new ItemOrcamento(new BigDecimal("200")));
        antigo.reprovar();

        Orcamento novo = new Orcamento();
        novo.adcionarItem(new ItemOrcamento(new BigDecimal("500")));
        novo.adcionarItem(antigo);

        OrcamentoProxy proxy = new OrcamentoProxy(novo);

        System.out.println(proxy.getValor());
        System.out.println(proxy.getValor());


    }

}
