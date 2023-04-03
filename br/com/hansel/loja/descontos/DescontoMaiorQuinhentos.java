package br.com.hansel.loja.descontos;

import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoMaiorQuinhentos extends Desconto {

    public DescontoMaiorQuinhentos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    @Override
    public Boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }
}
