package com.example.selenidetest.page;

import static com.codeborne.selenide.Selenide.page;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author hiroaki0404@gmail.com
 */
public class WhetherPage {
    @FindBy(how = How.CSS, using = "#searchText")
    private SelenideElement searchField;
    
    @FindBy(how = How.CSS, using = "#yjw_button_search")
    SelenideElement searchButton;
    
    public WhetherPage setSearchField(String str) {
        searchField.setValue(str);
        return this;
    }

    public WhetherResultPage search() {
        searchButton.click();
        return page(WhetherResultPage.class);
    }
}
