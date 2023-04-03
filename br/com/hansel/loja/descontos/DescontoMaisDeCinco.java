package br.com.hansel.loja.descontos;

import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaisDeCinco extends Desconto {


    public DescontoMaisDeCinco(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
            return orcamento.getValor().multiply(new BigDecimal("0.1"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getQuantidadeItens() > 5;
    }
}
