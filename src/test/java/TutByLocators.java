import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.Test;

public class TutByLocators {
    @Test
    void webElements() {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://jobs.tut.by/search/vacancy?area=1002&st=searchVacancy&text=");
        //1|Единсвенный эдемент с id на страницу
        driver.findElement(By.id("top100Counter"));
        //2|Локатор упорядачивания
        driver.findElement(By.name("order_by"));
        //3|Локатор но лого работа тут.бай"
        driver.findElement(By.className("supernova-logo-wrapper"));
        //4|Локатор на тэг <style>
        driver.findElement(By.tagName("style"));
        //5|Локатор на линку "Новости"
        driver.findElement(By.linkText("Новости"));
        //6|Локатор на линку "Хочу у вас рабоатать"
        driver.findElement(By.partialLinkText("Хочу у вас"));
        //7|ancestor
        driver.findElement(By.xpath("//*[text()='Кладовщик-комплектовщик']//ancestor::span"));
        //8|ancestor-or-self
        driver.findElement(By.xpath("//*[text()='Кладовщик-комплектовщик']//ancestor-or-self::span"));
        //9|Локатор "отклик без резюме"
        driver.findElement(By.xpath("//div[contains(@class,'vacancy-serp-item  vacancy-serp-item_premium')]/div[1]/child::span"));
        //10|  descendant Локатор названия профессии в первой записи
        driver.findElement(By.xpath("//div[contains(@class,'vacancy-serp-item  vacancy-serp-item_premium')]/descendant::a"));
        //11| descendant-or-self  Локатор названия профессии в первой записи в себе включительно
        driver.findElement(By.xpath("//div[contains(@class,'vacancy-serp-item  vacancy-serp-item_premium')]/descendant-or-self::a"));
        //12|Третия запись "Вакансии" (поиск относительно окна "Получайте новые вакансии по этому запросу")
        driver.findElement(By.xpath("//div[@class='serp-special']/following::div[4]"));
        //13|Первая запись "Вакансии" (поиск относительно окна "Получайте новые вакансии по этому запросу")
        driver.findElement(By.xpath("//div[@class='serp-special']/preceding::div[1]"));
        //14|.class
        driver.findElement(By.cssSelector(".serp-special"));
        //15|#id
        driver.findElement(By.cssSelector("#top100Counter"));
        //16 | Выбирает все элементы
        driver.findElement(By.cssSelector("*"));
        //17|.class1.class2у
        driver.findElement(By.cssSelector(" div.vacancy-serp-item__info div.g-user-content > div:nth-child(1)"));
        //18|[attribute]
        driver.findElement(By.cssSelector("[style]"));
        //19|[attribute=value] Локатор ссылки на вакансию
        driver.findElement(By.cssSelector("a[href='/employer/1810433']"));
        //20 [attribute~=value] Локатор всех записей о вакансиях
        driver.findElement(By.cssSelector("div[data-qa~='vacancy-serp__vacancy'] "));
        //21 [attribute|=value] Локатор всех <div> тегов   где аргумнет data-qa начинаеткоторые начинаются с 'vacancy-serp__'
        driver.findElements(By.cssSelector("div[data-qa|='vacancy-serp__'] "));
        //22 [attribute^=value] Локатор всех <a> тегов  которые начинаются с 'https://www.tut.by
        driver.findElement(By.cssSelector("a[href^= 'https://www.tut.by']"));
        //23 [attribute$=value] Локатор всех <a> тегов  которые заканчиваются на 'https://www.tut.by
        driver.findElement(By.cssSelector("a[href$= '_campaign=tutby_links']"));
        //24 [attribute*=value] Локатор всех <a> тегов  которые содержат 'tut.by'
        driver.findElement(By.cssSelector("a[href*= 'tut.by']"));
        //25 a:link Выбирвет  все не посещённые линки на сайте
        driver.findElement(By.cssSelector("a:link"));
        driver.quit();
    }
}
