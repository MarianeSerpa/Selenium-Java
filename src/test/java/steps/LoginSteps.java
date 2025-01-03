package steps;

import cucumber.api.java.pt.Dado;
import cucumber.api.java.pt.Então;
import cucumber.api.java.pt.Quando;
import pages.LoginPage;
import runner.RunCucumber;

public class LoginSteps extends RunCucumber {

    LoginPage loginPage = new LoginPage();

    @Dado("^que estou na tela de login$")
    public void que_estou_na_tela_de_login() {
        loginPage.acessarAplicao();
    }

    @Quando("^preencho login \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void preencho_login_e_senha(String email, String senha) {
        loginPage.preencheEmail(email);
        loginPage.preencherSenha(senha);
    }

    @Quando("^preencho e-mail \"([^\"]*)\"$")
    public void preencho_Email(String email) {
        loginPage.preencheEmail(email);
    }

    @Quando("^clico em Login$")
    public void clico_em_Login() {
        loginPage.clicarLogin();
    }

    @Então("^vejo mensagem de login com sucesso$")
    public void vejo_mensagem_login_sucesso() {
        loginPage.verificaLoginSucesso();
    }

    @Então("^vejo mensagem \"([^\"]*)\" de login invalido$")
    public void vejo_mensagem_de_campo_não_preenchido(String message)  {
        loginPage.verificaCampoInvalido(message);
    }


    @Dado("^que estou logado na aplicação com user \"([^\"]*)\" e senha \"([^\"]*)\"$")
    public void que_estou_logado_na_aplicação_com_user_e_senha(String email, String senha)  {
        loginPage.acessarAplicao();
        loginPage.preencheEmail(email);
        loginPage.preencherSenha(senha);
        loginPage.clicarLogin();
        loginPage.verificaLoginSucesso();
    }

    @Quando("^clico em recuperar senha$")
    public void clico_em_Recuperar_senha() {
        loginPage.clicarEsqueciSenha();
    }

    @Quando("^clico em enviar senha$")
    public void clico_em_Enviar_Senha() {
        loginPage.clicarEnviarSenha();
    }

    @Então("^vejo mensagem senha enviada$")
    public void vejo_mensagem_senha_enviada() {
        loginPage.verificaSenhaSucesso();
    }

}
