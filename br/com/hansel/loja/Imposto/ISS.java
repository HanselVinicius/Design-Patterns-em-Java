package br.com.hansel.loja.Imposto;

import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ISS extends InterfacesTaxTypes{

    public ISS(InterfacesTaxTypes outro) {
        super(outro);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }
}
