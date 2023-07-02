# Relatório do Projeto Spring

## Introdução

O objetivo deste relatório é apresentar informações relevantes sobre o projeto desenvolvido utilizando o framework Spring para o backend e Android Nativo no front. O projeto tem como finalidade criar uma aplicação mobile no qual é um jogo de perguntas e respostas.

## Visão Geral

O projeto foi desenvolvido utilizando a linguagem de programação Java (versão 17) tanto no backend quanto no front e o framework Spring (versão 3.1.1). A aplicação web permite que os usuários criem seu player, além de visualizarem uma lista de perguntas e respostas existentes. O projeto utiliza o Spring MVC para o controle das requisições HTTP, o Spring Data JPA para a persistência dos dados e o PostgreSQL como banco de dados sql.

## Funcionalidades Implementadas

O projeto possui as seguintes funcionalidades:

1. Cadastro do usuário: os usuários podem criar seu player, informando o nome.

2. Escolha de dificuldade: os usuários podem escolher dificuldades diferentes.

3. Listagem de Perguntas: as perguntas já são préviamente cadastradas e são exibidas uma por vez para o usuário em um total de 20 escolhidas entre as 30 possiveis.

## Arquitetura do Backend

O projeto segue a arquitetura MVC (Model-View-Controller) do Spring. A estrutura de diretórios é organizada da seguinte forma:

- `src/main/java`: contém as classes Java do projeto.
  - `com.example.projeto`: pacote principal do projeto.
    - `controller`: contém as classes responsáveis por receber as requisições HTTP e controlar o fluxo da aplicação.
    - `model`: contém as classes de modelo que representam as entidades do sistema.
    - `repository`: contém as interfaces e classes de repositório que permitem o acesso aos dados.
    - `service`: contém as classes de serviço que implementam a lógica de negócio.
    - `dto`: contém as classes intermediária do banco e da aplicação.

## Informações para Execução

Para executar o projeto, é necessário ter instalado em sua máquina:

- Java Development Kit (JDK) versão 17 ou superior
- Apache Maven versão 3.6.3 ou superior
- PostgreSQL versão 15.3 ou superior

Siga as etapas abaixo para executar o projeto:

1. Clone o repositório do projeto para sua máquina local.

2. Abra o projeto no VS code e espere o java reconhecer o projeto e baixar os pacotes.

3. Clique no botão ( Run ) que aparece a cima da função main; 

4. Acesse a aplicação em seu navegador web através do seguinte URL: `http://localhost:8080`.

## Considerações Finais

O projeto Spring desenvolvido para o jogo demonstra a utilização de diversos recursos do framework, como o Spring MVC, o Spring Data JPA e o Postgres. As funcionalidades implementadas permitem aos usuários criar o seu player, além de visualizar uma lista das perguntas existentes. O projeto segue a arquitetura MVC e utiliza boas práticas de desenvolvimento.

## Próximos Passos

Algumas melhorias e funcionalidades adicionais que podem ser implementadas no projeto são:

1. Adicionar autenticação de usuários para garantir a segurança da aplicação.
2. Implementar mais perguntas e respoasta para o usuário interagir mais.
3. Adicionar filtros de busca para permitir que os usuários possa jogar sobre assuntos que dominam mais ou não.
4. Melhorar a interface de usuário com animações etc.

Essas são apenas algumas ideias para futuras melhorias no projeto, visando aprimorar ainda mais a experiência dos usuários.