# language: pt

  @cadastro_de_usuario
  Funcionalidade: Cadastro de usuário
    Eu como usuário do sistema
    Quero me cadastrar
    Para realizar uma compra no site

    @cadastro_usuario_sucesso
    Cenário: Criação de Conta
      Dado que estou na tela de login
      E clico para preencher o e-mail para fazer uma conta
      E clico em cadastrar conta
      E preencho todos os campos obrigatórios
      Quando clico em registrar conta
      Então vejo mensagem de usuário cadastrado com sucesso
