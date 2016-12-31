package com.example.selenidetest.page;

import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 *
 * @author hiroaki0404@gmail.com
 */
public class WhetherResultPage {
    @FindBy(how = How.CSS, using = "#main > div.yjw_main_md.yjw_clr > div.serch-keyword-frame01 > div > strong")
    private SelenideElement searchWord;
    
    public String getSearchWord() {
        return searchWord.getText();
    }
}
