package br.com.hansel.loja.Imposto;

import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class InterfacesTaxTypes {

     private InterfacesTaxTypes outro;

     public InterfacesTaxTypes(InterfacesTaxTypes outro){
          this.outro = outro;
     }

     protected abstract BigDecimal realizarCalculo(Orcamento orcamento);

     public   BigDecimal calcular(Orcamento orcamento){
          BigDecimal valorImposto = realizarCalculo(orcamento);
          BigDecimal valorDoOutroImposto = BigDecimal.ZERO;
          if (outro != null){
               valorDoOutroImposto = outro.realizarCalculo(orcamento);
          }
          return valorImposto.add(valorDoOutroImposto);
     }
}
