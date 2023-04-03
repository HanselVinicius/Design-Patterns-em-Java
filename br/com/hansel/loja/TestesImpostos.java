package br.com.hansel.loja;

import br.com.hansel.loja.Imposto.CalculadoraDeImpostos;
import br.com.hansel.loja.Imposto.ICMS;
import br.com.hansel.loja.Imposto.ISS;
import br.com.hansel.loja.orcamento.ItemOrcamento;
import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {

    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adcionarItem(new ItemOrcamento(new BigDecimal("100")));
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(new ICMS(null))));
    }
}
