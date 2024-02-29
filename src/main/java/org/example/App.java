package org.example;

import com.microsoft.playwright.*;

import static com.microsoft.playwright.assertions.PlaywrightAssertions.assertThat;

public class App {
    public static void main(String[] args) {
        try (Playwright playwright = Playwright.create()) {
            Browser browser = playwright.chromium().launch(new BrowserType.LaunchOptions().setHeadless(false));

            Page page = browser.newPage();

            page.navigate("https://www.saucedemo.com/v1/");

            System.out.println(page.title());

            Locator userID = page.locator("//*[@id=\"user-name\"]");
            Locator passWord = page.locator("//*[@id=\"password\"]");
            Locator loginBtn = page.locator("//*[@id=\"login-button\"]");


            userID.click();
            userID.type("standard_user");

            passWord.click();
            passWord.type("secret_sauce");

            loginBtn.click();

            assertThat(page).hasTitle("Swag Labs");

        }
    }
}
