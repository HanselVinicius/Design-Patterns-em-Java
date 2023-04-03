package br.com.hansel.loja;


import br.com.hansel.loja.descontos.CalculadoraDeDescontos;
import br.com.hansel.loja.orcamento.ItemOrcamento;
import br.com.hansel.loja.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adcionarItem(new ItemOrcamento(new BigDecimal("200")));

        Orcamento orcamento2 = new Orcamento();
        orcamento.adcionarItem(new ItemOrcamento(new BigDecimal("1000")));

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();

        System.out.println(calculadora.calcular(orcamento));
        System.out.println(calculadora.calcular(orcamento2));

    }
}
