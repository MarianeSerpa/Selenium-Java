# language: pt

  @login
  Funcionalidade: Login
    Eu como usuário do sistema
    Quero fazer login
    Para fazer uma compra no site

    @login-sucesso
    Cenário: Login com sucesso
      Dado que estou na tela de login
      Quando preencho login "mariane.serpa_2701@hotmail.com" e senha "123456"
      E clico em Login
      Então vejo mensagem de login com sucesso

    @e-mail-invalido
    Cenário: Campo e-mail invalido
      Dado que estou na tela de login
      Quando preencho login "mariane.serpa@hotmail.com" e senha "123456"
      E clico em Login
      Então vejo mensagem "Authentication failed." de login invalido

    @senha-invalida
    Cenário: Campo senha invalida
      Dado que estou na tela de login
      Quando preencho login "mariane.serpa_2701@hotmail.com" e senha "123"
      E clico em Login
      Então vejo mensagem "Invalid password." de login invalido


    @e-mail-vazio
    Cenário: Campo e-mail vazio
      Dado que estou na tela de login
      Quando preencho login "" e senha "123456"
      E clico em Login
      Então vejo mensagem "An email address required.." de login invalido


    @senha-vazia
    Cenário: Campo senha vazia
      Dado que estou na tela de login
      Quando preencho login "mariane.serpa_2701@hotmail.com" e senha ""
      E clico em Login
      Então vejo mensagem "Password is required." de login invalido


      @recuperar-senha
      Cenário: Recuperação de senha
        Dado que estou na tela de login
        Quando clico em recuperar senha
        E preencho e-mail "mariane.serpa_2701@hotmail.com"
        E clico em enviar senha
        Então vejo mensagem senha enviada







