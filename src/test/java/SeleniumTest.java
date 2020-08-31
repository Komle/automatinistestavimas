import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class SeleniumTest {
    @Before
    public void setup(){
        Selenium.setup();
    }

    @Test
     public void fillPizzaFormSuccess(){
        Selenium.fillPizaFormSucces("alibaba@one.lt", "Ali", "Baba");
    }

    @Test
    public void fillPizzaFormFailure(){
        Selenium.fillPizaFormSucces("sagdsadg.ont.lt","sdagsadg23451","sdag213");
    }

    @After
    public void close (){
        Selenium.close();
    }
}
