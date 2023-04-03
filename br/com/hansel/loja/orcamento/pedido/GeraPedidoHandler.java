package br.com.hansel.loja.orcamento.pedido;

import br.com.hansel.loja.orcamento.ItemOrcamento;
import br.com.hansel.loja.orcamento.Orcamento;
import br.com.hansel.loja.orcamento.pedido.acao.AcoesAposGerarPedido;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    //construtor com injecao de dependencias: repository,service,etc

        private List<AcoesAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcoesAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    /** aqui também pode ser o pattern facade no qual escondemos a complexidade desta operação da classe cliente
     * deixando a mesma só conhecer o metodo execute e desconhecer toda a regra de negocio dando uma alta limpeza
     * no nosso codigo
     */

    public void execute(GeraPedido dados){
        Orcamento orcamento = new Orcamento();
        orcamento.adcionarItem(new ItemOrcamento(new BigDecimal(dados.getValorOrcamento().toString())));
        String cliente = dados.getCliente();
        /***
         * aqui é utilizado o padrão observer que nada mais é que um exemplo de inversão de controle no qual temos um observador
         * que dispara um evento e quem se inscreveu para escutar este evento vai gerar uma ação como visto abaixo aonde uma
         * lista de observers ligados por uma interface e assim que chamado o pedido os observers vão executar suas ações
         * eliminando a necessidade de chamar observer por observer nas suas classes
         */

        Pedido pedido = new Pedido(cliente, LocalDateTime.now(),orcamento);

        acoes.forEach(a -> a.executar(pedido));
    }


}
