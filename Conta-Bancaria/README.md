## SISTEMA DE GERENCIAMENTO DE CONTAS BANCÁRIAS

Projeto básico de como funcionaria um sistema de gerenciamento de contas bancárias, baseada em algumas regras de negócio e nos princípios da de _**"Abstração"**_ (algumas literaturas colocam abstração como sendo um conceito dentro de encapsulamento, e não um princípio em si) e _**Encapsulamento**_

#### Não há integração no banco de dados e, portanto, sua utilização será pela manipulação da memória do computador!!

Para correta compilação, é necessário uma IDE (Integrated Development Environment - Ambiente de Desenvolvimento Integrado)

> Alguns exemplos de IDE's que podem ser utilizadas:
  - NetBeans;
  - IntelliJ;
  - VsCode;

> Regras de Negócio utilizadas:
  - Só é possível fechar uma conta com saldo 0;
  - Só é possível excluir um cliente que não tenha conta em aberto;
  - Taxa de manutenção (pagarMensal):\n
      {CC (Conta Corrente): R$ 25}
  - Benefício de abertura de conta:
      {CC (Conta corrente): R$ 100}
      {CP (Conta Poupança): R$ 200}
