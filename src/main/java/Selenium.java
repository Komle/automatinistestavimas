import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Selenium {
    static WebDriver webdriver;
    public static final String EMAIL_FIELD_BY_NAME = "e_mail4800";
    public static final String firstname_FIELD_BY_NAME = "first_name5000";
    public static final String lastname_FIELD_BY_NAME = "last_name5200";
    public static final String zipcode_FIELD_BY_NAME = "zip_code5700";
    public static final String phone_FIELD_BY_NAME = "phone5800";
    public static void main(String[] args) {
        System.out.println("Selenium");
}
    public static void setup(){
        System.setProperty("webdriver.chrome.driver",
                "ChromeDriver/chromedriver.exe");
        webdriver = new ChromeDriver();
        webdriver.get("https://www.elbowspace.com/FRHformexample9");
    }

    public static void fillPizaFormSucces(String email, String firstname, String lastname) {
        WebElement emailField = webdriver.findElement (By.name(EMAIL_FIELD_BY_NAME));
        emailField.sendKeys(email);
        WebElement first_name = webdriver.findElement(By.name(firstname_FIELD_BY_NAME));
        first_name.sendKeys(firstname);
        WebElement last_name = webdriver.findElement(By.name(lastname_FIELD_BY_NAME));
        last_name.sendKeys(lastname);
        WebElement zipcode = webdriver.findElement(By.name(zipcode_FIELD_BY_NAME));
        zipcode.sendKeys("424234");
        WebElement numeris = webdriver.findElement(By.name(phone_FIELD_BY_NAME));
        numeris.sendKeys("+370666666");

        WebElement submit = webdriver.findElement(By.id("submitBTN"));
        submit.click();
    }

    public static int searchByKeyword(String keyword) { return 1;}

    public static void close(){
        webdriver.close();
    }

}

