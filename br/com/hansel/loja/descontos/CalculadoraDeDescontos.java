package br.com.hansel.loja.descontos;

import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos {
    //É UTILIZADO AQUI O PATTERN CHAIN OF RESPONSIBILITY que brilha quando não sabemos a regra logo de cara
    //e cria esta "recursão" de chamadas que se relacionam por uma classe abstrata para dar uma limpesa a mais para
    // nosso codigo
    public BigDecimal calcular(Orcamento orcamento){
        Desconto cadeiaDeDescontos = new DescontoMaisDeCinco(
                new DescontoMaiorQuinhentos(
                        new SemDesconto()
                )
        );

        return cadeiaDeDescontos.calcular(orcamento);
    }
}
