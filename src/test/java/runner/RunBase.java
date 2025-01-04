package runner;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.util.concurrent.TimeUnit;

public class RunBase {

    static WebDriver driver;

    public static WebDriver getDriver(){
        return driver;
    }

    public static WebDriver getDriver(String browser) {

        if (driver !=  null) {
            driver.quit();
        }

        // Configuração do WebDriverManager para garantir que a versão correta do driver seja utilizada
        WebDriverManager.chromedriver().setup(); // Essa linha garante que o WebDriverManager busque o driver correto

        switch (browser) {
            case "chrome":
                driver = new ChromeDriver();
                break;

            case "chrome-ci":
                ChromeOptions chromeOptions = new ChromeOptions();
                chromeOptions.addArguments("--headless");
                driver = new ChromeDriver(chromeOptions);
                break;

            case "firefox":
                driver = new FirefoxDriver();
                break;

            case "edge":
                throw new IllegalArgumentException("Edge ainda nao suportado");

            default:
                throw new IllegalArgumentException("Navegador não encontrado! Passe um navegador existente: chrome, firefox ou edge.");
        }

        if(driver != null){
            driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        }
        return driver;
    }
}
