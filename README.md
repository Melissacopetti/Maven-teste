# Maven-teste
<p align="center">
  <img width="200" height="200" src="https://lp.dio.me/wp-content/uploads/2023/05/BADGE_LUZ-4.png">
</p>
<h1 align="center">Maven-Teste</h1>

## Descrição
<p align="justify">
Este repositório foi criado como exercício dentro do Santander Bootcamp 2023 com dois objetivos: o primeiro objetivo foi criar diferentes projetos Maven usando o prompt de comando do Windows. Foram criados quatro projetos, incluindo um modelo de projeto "controller", um projeto "Core", um projeto "Parent" e um projeto principal usando o maven-archetype-quickstart.
No segundo objetivo, este repositório serviu como plataforma para a prática de testes com JUnit 5.

Este projeto teve um caráter didático e foi estruturado de acordo com os conteúdos dos módulos "Gerenciamento de Dependências e Build em Java com Maven" e "Testes Unitários com JUnit" do curso da Dio. O repositório modelo para a realização dos testes pode ser encontrado [aqui](https://github.com/willyancaetano/junit5-exemplos/tree/master).
</p>

## Estrutura do Projeto
O repositório "Maven-Teste" tem a seguinte estrutura:

* **controller:** Modelo de projeto "controller".

* **Core:** Projeto "Core".

* **Parent:** Projeto "Parent".

* **maven-archetype-quickstart:** Projeto principal usando o maven-archetype-quickstart. Este projeto contém as seguintes classes e testes:

  * **Classes:**
    * **Pessoa:** Classe que representa uma pessoa.
    * **Conta:** Classe que representa uma conta.
    * **TransferenciaEntreContas:** Classe que lida com transferências entre contas.
    * **GerenciadorDeConexaoComBancoDeDados:** Classe para gerenciar a conexão com o banco de dados.

  * **Pacote de Testes "test.java.dio.digitalinnovation":** Este pacote contém vários arquivos de teste que exploram as funcionalidades do JUnit 5. Alguns dos arquivos de teste incluem:
    * **AssertionsTeste:** Teste de afirmações.
    * **AssumptionsTeste:** Teste de pressuposições.
    * **EscolhendoAordemTest:** Teste para escolher a ordem de execução.
    * **CondicionaisTeste:** Teste para condições.
    * **ConsultarDadosDaPessoaTest:** Teste para consultar dados da pessoa.
    * **ExceptionsTeste:** Teste para exceções.
    * **PessoaTest:** Teste relacionado à classe Pessoa.

Essas classes e testes foram criadas para praticar o uso de Maven e JUnit 5 para testes unitários.


## Ambiente de Desenvolvimento
Este projeto foi desenvolvido com base na construção de projetos Maven e na realização de testes JUnit 5. Ele serviu como um exercício prático para consolidar o conhecimento adquirido nos módulos relacionados ao gerenciamento de dependências, construção de projetos com Maven e testes unitários com JUnit.

Este projeto foi desenvolvido na seguinte configuração:

* IDE: [VS Code]
* Versão Java: [Java 20.0.1]
* Sistema Operacional: [Windows 10]

<p align="center">
  <img width="300" height="100" src="https://static.wixstatic.com/media/7a378f_5140deabd7d040378d740069cb692b87~mv2.png/v1/crop/x_0,y_10,w_1334,h_493/fill/w_568,h_208,al_c,q_85,usm_0.66_1.00_0.01,enc_auto/logo%20DIO.png">
</p>
<h4 align="justify">
Este projeto é parte integrante do Santander Bootcamp 2023 da Dio e foi criado com o intuito de aplicar o conhecimento teórico adquirido nos módulos anteriores. Sinta-se à vontade para clonar este repositório, explorar os projetos Maven e praticar os testes JUnit 5 desenvolvidos. Bom aprendizado!</h4>
