import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterTest;
import static com.codeborne.selenide.Selenide.*;

public class MyTest {
    @Test
    public void testEasy() {
        Selenide.open("https://ru.selenide.org/quick-start.html");
    }
    @BeforeTest
    public void beforeTest() {
    }
    @AfterTest
    public void afterTest() {
        closeWebDriver();
    }
}
