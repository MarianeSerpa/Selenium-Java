package steps;

import io.cucumber.java.pt.Dado;
import io.cucumber.java.pt.Quando;
import io.cucumber.java.pt.Então;
import pages.CadastroUsuarioPage;
import pages.LoginPage;
import runner.RunCucumber;

public class CadastroUsuarioSteps extends RunCucumber {

    LoginPage loginPage = new LoginPage();
    CadastroUsuarioPage cadastroPage = new CadastroUsuarioPage();

    @Dado("^preencho todos os campos obrigatórios$")
    public void preencho_campos_obrigatorios() {
        cadastroPage.preencheEmail();
        cadastroPage.preencheTitulo();
        cadastroPage.preenchePrimeiroNome();
        cadastroPage.preencheUltimoNome();
        cadastroPage.preencherSenha("123456");
        cadastroPage.preencheDiaAniversario("10");
        cadastroPage.preencheMesAniversario("July");
        cadastroPage.preencheAnoAniversario("1990");
    }

    @Dado("^clico para preencher o e-mail para fazer uma conta")
    public void preencho_email() {
        cadastroPage.preencheEmail();
    }

    @Quando("^clico em cadastrar conta$")
    public void clico_cadastrar() {
        cadastroPage.cadastrarUsuario();
    }

    @Quando("^clico em registrar conta$")
    public void clico_registrar_conta() {
        cadastroPage.registrarConta();
    }


    @Então("^vejo mensagem de usuário cadastrado com sucesso$")
    public void vejo_mensagem_cadastro_sucesso() {
        cadastroPage.verificaCadastroSucesso();
    }
}
