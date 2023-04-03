package br.com.hansel.loja.Imposto;

import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeImpostos {

    //padrão STRATEGY que visa abstrair algoritmos para outras classe
    // uma vez que ao analisar a classe e perceber o crescimento dela é infinito
    // traz consigo uma execução do O = Open closed principle e D = Dependecy inversion do SOLID
    public BigDecimal calcular(Orcamento orcamento, InterfacesTaxTypes tipoImposto){
        return tipoImposto.calcular(orcamento);
    }

}
