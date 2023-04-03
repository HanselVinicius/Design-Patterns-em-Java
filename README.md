# Padrões de projeto

## Padrões estruturais

### Adapter

Quando temos uma conexão a uma API (a título de didática utilizaremos este exemplo) e vários recursos serão utilizados desta API - várias URLs, vários métodos HTTP, etc. - ter em cada classe uma implementação própria para fazer essa conexão se tornaria um caos. Portanto, é utilizado o padrão **Adapter**, que vai abstrair esses métodos para uma interface ou classe abstrata e isolá-los em classes específicas, fazendo com que a classe que vai realizar a "conversa" com a API não tenha conhecimento nenhum de como estes detalhes de infra funcionam.

Leitura auxiliar: [Refactoring Guru - Adapter](https://refactoring.guru/design-patterns/adapter)

### Decorator

Quando temos uma classe que queremos fazer uma mudança, digamos adicionar novos comportamentos na classe sem gerar acoplamento, podemos nos utilizar do padrão **Decorator**. Ele consiste em decorar o objeto com outro objeto, e com estes ligados por meio de herança, a ligação entre eles pode ser feita através de passagem por parâmetros.

Leitura auxiliar: [Refactoring Guru - Decorator](https://refactoring.guru/design-patterns/decorator)

### Composite

Quando queremos fazer, por exemplo, uma lista de itens de compras, porém essa lista pode ser composta por diferentes objetos, usando uma abordagem tradicional iríamos criar um código confuso e enorme. Porém, aplicando o padrão **Composite**, podemos ligar esses objetos por uma interface que permitirá compor cada objeto com outro objeto. Este padrão se parece bastante com o padrão decorator citado acima, mas este padrão cria uma árvore de objetos e nos permite acessá-los como um todo ou individualmente.

Leitura auxiliar: [Refactoring Guru - Composite](https://refactoring.guru/design-patterns/composite)

### Facade

Quando temos uma operação complexa que necessita chamar diversos métodos uns após os outros na classe cliente "main", se torna muito necessário a utilização do padrão **Facade**. Ele consiste em esconder toda essa complexidade para uma interface ou classe e trazer para a classe cliente somente o método `executar` que se encarregará de toda essa regra de negócio, deixando a classe cliente muito mais limpa.

Leitura auxiliar: [Refactoring Guru - Facade](https://refactoring.guru/design-patterns/facade)

### Proxy

Quando temos que chamar um objeto de uma API, banco ou qualquer lugar que este objeto vá demorar para chegar, podemos nos utilizar do padrão **Proxy**. Ele consiste em criar uma camada entre a API e nosso sistema que irá atuar segurando o valor já chamado dentro do mesmo, fazendo estas inúmeras chamadas receberem os dados deste proxy e não da API em si, nos dando assim uma maior performance no nosso sistema.

Leitura auxiliar: [Refactoring Guru - Proxy](https://refactoring.guru/design-patterns/proxy)

## Padrões Comportamentais
Quando temos uma estratégia do projeto em uma classe que percebemos que ela vai sempre crescer e adquirir novas estratégias sempre que um novo valor como um tipo de imposto ou tipo de cliente, utilizamos do padrão Strategy que diz que:

Devemos separar essa estratégia em classes novas para cada valor e utilizarmos de interfaces com polimorfismo e requerer no método de cálculo a interface como parâmetro para ter um código mais eficiente e mais limpo.

O padrão Strategy é utilizado sempre que temos diversos algoritmos para apenas uma ação, sendo assim mais eficiente uma abordagem utilizando interfaces e polimorfismo.

Leitura auxiliar: https://refactoring.guru/design-patterns/strategy

Quando temos várias regras e de cara não sabemos qual vamos aplicar, usamos o Chain of Responsibility, o qual cria uma cadeia de chamadas chamando classes que possuem esse método em comum e no construtor uma chamada para a próxima classe. Que pode ou resolver meu problema de cara ou chamar a outra classe que vai resolver meu problema. Se nenhuma classe tem o poder de resolver meu problema, temos alguém responsável por acabar com essa recursão.

O Chain of Responsibility pode ser confundido com o Strategy, porém, o que difere eles é o fato de não sabermos de cara a regra que vai ditar o jogo.

Leitura auxiliar: https://refactoring.guru/design-patterns/chain-of-responsibility

Quando percebemos que um código está se repetindo demais em classes filhas, podemos utilizar o padrão Template Method, que nada mais é que extrair essa regra para a classe mãe criando uma espécie de template para as classes filhas se alimentarem, reduzindo assim a repetição de código.

Leitura auxiliar: https://refactoring.guru/design-patterns/template-method

Quando temos um código que varia suas funções a partir de um estado de algum atributo e este atributo deve transitar entre os status com alguma regra, podemos aplicar o padrão State, que consiste em extrair cada estado em uma classe própria para ele, tendo uma classe mãe ou interface para conectá-los. E nesta deve se ter as bases dos métodos que vão aplicar a regra de transição entre esses estados.

Leitura auxiliar: https://refactoring.guru/design-patterns/state

Quando queremos fazer um request (seja a API, a banco de dados ou até mesmo disparar um service), em vez de replicarmos esse código de pedido todas as vezes que formos fazê-lo, fica mais limpo fazermos um objeto que atuaria como meio de campo para fazer esses pedidos. Sendo esse o padrão de projeto Command, que quando utilizado como uma interface e cada classe implementando do jeito que lhe cabe, irá gerar um desacoplamento no nosso código.

Também é importante citar que cabe separar o método dos dados para mais eficiente utilização em caso de uma aplicação voltada a web, sendo esse o Command Handler para suportar os diferentes casos que a web possui.

Leitura auxiliar: https://refactoring.guru/design-patterns/command

Quando temos uma classe que tem de disparar uma ação assim que algo acontecer e percebemos
