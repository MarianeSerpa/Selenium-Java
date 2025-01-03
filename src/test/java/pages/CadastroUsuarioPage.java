package pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import runner.RunCucumber;
import com.github.javafaker.Faker;

public class CadastroUsuarioPage extends RunCucumber {

    // Elementos
    private By campoEmail = By.id("email_create");
    private By campoTitulo = By.id("id_gender1");
    private By campoPrimeiroNome = By.id("customer_firstname");
    private By campoUltimooNome = By.id("customer_lastname");
    private By campoSenha = By.id("passwd");
    private By botaoFazerCadastro = By.id("SubmitCreate");
    private By diaAniversario = By.id("days");
    private By mesAniversario = By.id("months");
    private By anoAniversario = By.id("years");
    private By botaoRegistrarUsuario = By.id("submitAccount");
    private Faker faker = new Faker();

    // Ações / Funções / Métodos
    public void preencheEmail() {
        String email = faker.internet().emailAddress();
        getDriver().findElement(campoEmail).sendKeys(email);
    }

    public void preencheTitulo() {
        getDriver().findElement(campoTitulo).click();
    }

    public void preenchePrimeiroNome() {
        String primeiroNome = faker.name().firstName();
        getDriver().findElement(campoPrimeiroNome).sendKeys(primeiroNome);
    }

    public void preencheUltimoNome() {
        String ultimoNome = faker.name().lastName();
        getDriver().findElement(campoUltimooNome).sendKeys(ultimoNome);
    }

    public void preencheDiaAniversario(String dia) {
        getDriver().findElement(diaAniversario).sendKeys(dia);
    }

    public void preencheMesAniversario(String mes) {
        getDriver().findElement(mesAniversario).sendKeys(mes);
    }

    public void preencheAnoAniversario(String ano) {
        getDriver().findElement(anoAniversario).sendKeys(ano);
    }

    public void preencherSenha(String senha) {
        getDriver().findElement(campoSenha).sendKeys(senha);
    }

    public void cadastrarUsuario() {
        getDriver().findElement(botaoFazerCadastro).click();
    }

    public void registrarConta() {
        getDriver().findElement(botaoRegistrarUsuario).click();
    }

    public void verificaCadastroSucesso() {
        String textoLoginSucesso = getDriver().findElement(By.cssSelector("p.alert.alert-success")).getText();
        Assert.assertEquals("Os textos não são iguais!", "Your account has been created.", textoLoginSucesso);
    }
}