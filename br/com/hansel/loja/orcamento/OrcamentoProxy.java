package br.com.hansel.loja.orcamento;

import java.math.BigDecimal;

public class OrcamentoProxy implements Orcavel {

    private BigDecimal valor;
    private Orcamento orcamento;


    //toda vez que precisamos fazer uma chamada que pode demorar um pouco e precisamos fazer ela varias vezes no programa
    //podemos nos utilizar do padrão proxy, muito util para criar caches,
    // que vai deixar salvo nesta camada que criamos nesta classe a ultima chamada desta valor

    public OrcamentoProxy(Orcamento orcamento) {
        this.orcamento = orcamento;
    }

    @Override
    public BigDecimal getValor() {
        if (valor == null){
            this.valor = orcamento.getValor();
        }
        return this.valor;
    }
}
