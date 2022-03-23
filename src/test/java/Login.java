import org.junit.Assert;
import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.util.concurrent.TimeUnit;

    public class Login {
        protected WebDriver driver;
        public static String loginUrl = "https://github.com/";
        @Before
        public void setUp() {
            System.setProperty("webdriver.chrome.driver", "C:/Users/PC/IdeaProjects/TESTOTOMASYON/Driver/chromedriver.exe");
            driver = new ChromeDriver();
            driver.manage().window().maximize();
        }
        @Test
        public void correctLogin() throws InterruptedException {
            driver.get(loginUrl);
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("/html/body/div[1]/header/div/div[2]/div[2]/div[2]/a")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("login_field")).sendKeys("baristpz0296@gmail.com");
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.id("password")).sendKeys("32466352153Brs");
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.name("commit")).click();
            TimeUnit.SECONDS.sleep(1);
            Assert.assertEquals(driver.getTitle(), "GitHub");
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.name("q")).sendKeys("cengisan");
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"jump-to-suggestion-search-global\"]/a/div[3]")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div/div[2]/nav[1]/a[10]")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"user_search_results\"]/div/div/div[1]/a/img")).click();
            TimeUnit.SECONDS.sleep(1);
            driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/div/span/form[1]")).click();
            TimeUnit.SECONDS.sleep(2);
            driver.findElement(By.xpath("//*[@id=\"js-pjax-container\"]/div[2]/div/div[1]/div/div[2]/div[3]/div[1]/div/div/span/form[2]")).click();
            TimeUnit.SECONDS.sleep(2);
            Assert.assertEquals(driver.getTitle(), "cengisan");
            TimeUnit.SECONDS.sleep(1);


        }
        @After
        public void tearDown() {
            driver.quit();
        }
    }

