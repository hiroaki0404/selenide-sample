package com.example.selenidetest;

import com.codeborne.selenide.Configuration;
import static com.codeborne.selenide.Selenide.open;
import com.codeborne.selenide.WebDriverRunner;
import com.example.selenidetest.page.TopPage;
import com.example.selenidetest.page.WhetherPage;
import com.example.selenidetest.page.WhetherResultPage;
import org.junit.Assert;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/**
 *
 * @author hiroaki0404@gmail.com
 */
public class Test1 {
    private TopPage topPage;
    
    @BeforeClass
    public static void setUp() {
        // Set Browser
        Configuration.browser = WebDriverRunner.CHROME;
        System.setProperty("webdriver.chrome.driver", "/usr/local/bin/chromedriver");
    }

    @Before
    public void beforeTest() {
        topPage = open("http://www.yahoo.co.jp/", TopPage.class);
    }

    @Test
    public void searchTsu() {
        final String searchWord = "津";
        WhetherPage whetherPage = topPage.ClickWheterLink();
        WhetherResultPage resultPage = whetherPage.setSearchField(searchWord)
                                                .search();
        Assert.assertEquals(searchWord, resultPage.getSearchWord());
    }
}
