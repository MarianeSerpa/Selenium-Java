package support;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import runner.RunCucumber;

import java.time.Duration;
import java.util.Random;

public class Utils extends RunCucumber {

    public static void waitElementBePresent(By element, Integer tempo) {
        WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(tempo));
        wait.until(ExpectedConditions.elementToBeClickable(element));
    }

    public static String getRandomEmail() {
        String email_init = "mariane.serpa_2701";
        String email_final = "@hotmail.com";

        Random random = new Random();
        int minimo = 1;
        int maximo = 999999999;
        int resultado = random.nextInt(maximo - minimo) + minimo;

        return email_init + resultado + email_final;
    }
}
