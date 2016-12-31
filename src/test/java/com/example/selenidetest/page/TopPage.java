package com.example.selenidetest.page;

import static com.codeborne.selenide.Selenide.page;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import static com.codeborne.selenide.Selenide.page;

/**
 *
 * @author hiroaki0404@gmail.com
 */
public class TopPage {
    @FindBy(how = How.CSS, using = "#yahooservice > ul > li:nth-child(7) > a")
    private SelenideElement whetherLink;
    
    public WhetherPage ClickWheterLink() {
        whetherLink.click();
        return page(WhetherPage.class);
    }
}
