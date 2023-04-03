package br.com.hansel.loja;

import br.com.hansel.loja.http.JavaHttpClient;
import br.com.hansel.loja.orcamento.ItemOrcamento;
import br.com.hansel.loja.orcamento.Orcamento;
import br.com.hansel.loja.orcamento.RegistraOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    //este é o padrão adapter no qual é um otimo exemplo do D(dependa de abstrações não de implementações)
    // de solid, neste padrão é visto que temos que ter interfaces adaptadoras que seram definidas apartir de parametros
    //isso irá gerar menos acoplamento no nosso codigo e deixar o mesmo mais manutenivel pois ao inves de cada classe
    //ter que implementar seu proprio metodo post ela pode reaproveitar um metodo já de uma interface passando somente
    //o recurso via parametro
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento();
        orcamento.adcionarItem(new ItemOrcamento(BigDecimal.TEN));
        orcamento.aprovar();
        orcamento.finalizar();

        RegistraOrcamento registro = new RegistraOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
