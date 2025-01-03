package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumber;

public class LoginPage extends RunCucumber {

    // elementos
    private String URL = "http://automationpractice.pl/index.php?controller=authentication&back=my-account";
    private By campoEmail = By.id("email");
    private By campoSenha = By.id("passwd");
    private By botaoFazerLogin = By.id("SubmitLogin");
    private By botaoEsqueciSenha = By.cssSelector("#login_form > div > p.lost_password.form-group > a");
    private By botaoEnviarSenha = By.cssSelector("#form_forgotpassword > fieldset > p > button");


    // ações / funções / métodos
    public void acessarAplicao() {
        getDriver("chrome").get(URL);
    }


    public void preencheEmail(String email){
         getDriver().findElement(campoEmail).sendKeys(email);
    }

    public void preencherSenha(String senha){
        getDriver().findElement(campoSenha).sendKeys(senha);
    }

    public void clicarLogin(){
        getDriver().findElement(botaoFazerLogin).click();
    }

    public void clicarEsqueciSenha(){
        getDriver().findElement(botaoEsqueciSenha).click();
    }

    public void clicarEnviarSenha(){getDriver().findElement(botaoEnviarSenha).click();}


    public void verificaLoginSucesso(){
        String textoLoginSucesso = getDriver().findElement(By.className("info-account")).getText();
        Assert.assertEquals("Os textos não são iguais!", "Welcome to your account. Here you can manage all of your personal information and orders.", textoLoginSucesso);
    }

    public void verificaCampoInvalido(String message){
        String textoError = getDriver().findElement(By.cssSelector(".alert-danger li")).getText();
        Assert.assertEquals(message, textoError);
    }

    public void verificaSenhaSucesso(){
        String textoLoginSucesso = getDriver().findElement(By.cssSelector("p.alert.alert-success")).getText();
        Assert.assertEquals("Os textos não são iguais!", "A confirmation email has been sent to your address: mariane.serpa_2701@hotmail.com", textoLoginSucesso);
    }



}
