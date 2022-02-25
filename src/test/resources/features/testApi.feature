#language: pt
#encoding: utf-8

Funcionalidade: Serviço que faz o cadastro de uma pessoa com pouco informação
  somente com nome, idade e se existe algum risco

  @smokeTest
  Cenário: Validar que estamos cadastrando uma pessoa no sistema conforme solicitado
    Dado que eu estou com acesso a api de cadastro
    Quando envio informacoes validas para o cadastro de uma pessoa
    Então devo visualizar o status de criado com sucesso

  @Error
  Cenário: Validar que ao enviar um cadastro de uma pessoa com dados invalido
    Dado que estou com acesso a api de cadastro
    Quando envio informacoes invalidas para cadastrar uma pessoa
    Então devo visualizar o status requisicao mal sucedida