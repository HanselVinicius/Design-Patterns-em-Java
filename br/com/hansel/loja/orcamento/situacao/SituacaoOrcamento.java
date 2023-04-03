package br.com.hansel.loja.orcamento.situacao;

import br.com.hansel.loja.DomainException;
import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacaoOrcamento {

    //aqui utilizamos o padrão STATE que é parecido com o STRATEGY porém cuida dos estados de um certo atributo e delega
    //as operações que devem ser feitas com base nestes estados que são classes filhas desta classe abstrata com isso temos
    //uma queda no acoplamento do codigo e redução de codigo enorme no nosso projeto, a sim e vale citar:
    //a principal diferença entre o STATE e o STRATEGY é que o STATE precisa estar ciente de cada estado e iniciar a
    //transicao com base nisto
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento)  {
        throw new DomainException("Orcamento nao pode ser aprovado");
    }

    public void reprovar(Orcamento orcamento){
        throw  new DomainException("Orcamento nao pode ser reprovado!");
    }

    public void finalizar(Orcamento orcamento){
        throw  new DomainException("Orcamento nao pode ser finalizado!");
    }

}
