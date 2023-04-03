package br.com.hansel.loja.descontos;

import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo){
        this.proximo = proximo;
    }

    //template method consiste em inves de repetirmos partes iguais que são comuns entre as classes filhas
    //nos extraimos o mesmo para funcionar como um template para as mesmas evitando repetição de codigo e diminuindo
    //acoplamento
    public  BigDecimal calcular(Orcamento orcamento){
        if (deveAplicar(orcamento)){
            return efetuarCalculo(orcamento);
        }else {
           return proximo.calcular(orcamento);
        }
    }
    protected abstract BigDecimal efetuarCalculo(Orcamento orcamento);
    protected abstract Boolean deveAplicar(Orcamento orcamento);
}
