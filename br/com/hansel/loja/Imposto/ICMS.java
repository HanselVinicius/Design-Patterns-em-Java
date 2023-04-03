package br.com.hansel.loja.Imposto;

import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class ICMS extends InterfacesTaxTypes{

    public ICMS(InterfacesTaxTypes outro) {
        super(outro);
    }

    @Override
    public BigDecimal realizarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.1"));

    }
}
