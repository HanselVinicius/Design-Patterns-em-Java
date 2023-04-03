package br.com.hansel.loja.orcamento;

import br.com.hansel.loja.DomainException;
import br.com.hansel.loja.http.HttpAdapter;

import java.util.Map;

public class RegistraOrcamento  {


    private  HttpAdapter http;

    public RegistraOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar(Orcamento orcamento){

        if (!orcamento.isFinalizado()){
            throw  new DomainException("Orcamento não finalizado");
        }

        String url = "http://api.externa";
        Map<String, Object> dados= Map.of("valor",orcamento.getValor(),
        "quantidadeDeItens", orcamento.getQuantidadeItens());
        http.post(url,dados);

    }

}
