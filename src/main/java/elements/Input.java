package elements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

    public class Input {
        WebDriver driver;
        String label;
        String locator = "//*[@id='%s']";

        public Input(WebDriver driver, String label) {
            this.driver = driver;
            this.label = label;
        }

        public void write(String text) {
            driver.findElement(By.xpath(String.format(locator, label))).sendKeys(text);
        }
    }
