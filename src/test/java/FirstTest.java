import com.codeborne.selenide.Condition;
import com.codeborne.selenide.Selenide;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

import static com.codeborne.selenide.Selenide.open;

public class FirstTest {
    @Test
    public void fistTest(){
        WebDriverManager.chromedriver().setup();

        Selenide.open("https://next.privat24.ua/money-transfer/card");
        Selenide.$(By.cssSelector("input[data-qa-node=\'numberdebitSource\']")).sendKeys("4552331448138217");
        Selenide.$(By.cssSelector("input[data-qa-node=\'expiredebitSource\']")).sendKeys("05/24");
        Selenide.$(By.cssSelector("input[data-qa-node=\'cvvdebitSource\']")).sendKeys("926");
        Selenide.$(By.cssSelector("input[data-qa-node=\'numberreceiver\']")).sendKeys("4004159115449003");
        Selenide.$(By.cssSelector("input[data-qa-node=\'amount\']")).sendKeys("123");
        Selenide.$(By.cssSelector("button[data-qa-node=\'currency\']")).sendKeys(Keys.ENTER);
        Selenide.$(By.cssSelector("button[data-qa-value=\'USD\']")).sendKeys(Keys.ENTER);
        Selenide.$(By.cssSelector("button[type=\'submit\']")).sendKeys(Keys.ENTER);
        Selenide.$(By.cssSelector("div[data-qa-node=\'total\']")).shouldHave(Condition.text("Разом до списання"));

























    }
}
